package cn.com.g7.sdk.kafka.core;

import com.alibaba.fastjson.JSON;
import org.apache.kafka.v261.clients.consumer.*;
import org.apache.kafka.v261.common.TopicPartition;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.concurrent.CustomizableThreadFactory;
import org.springframework.util.CollectionUtils;

import javax.annotation.PreDestroy;
import java.time.Duration;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Function;

/**
 * kafka消费者工厂类。用于创建和管理消费者
 * @author dengfuwei
 * @version 1.0.0
 * @date 2021/9/18 2:59 下午
 */
public class KafkaV261ConsumerFactory {

    private final Logger log = LoggerFactory.getLogger(KafkaV261ConsumerFactory.class);

    /** 数据处理Bean，key为自定义消费者唯一标识*/
    private Map<String, IKafkaMessageProcessor> processorMap = new ConcurrentHashMap<>(1);

    /** 存放消费者相关信息*/
    private Map<String, KafkaConsumerContext> kafkaConsumerContextMap = new ConcurrentHashMap<>(1);

    /** seek配置*/
    private Map<String, SeekInfo> seekInfoMap = new ConcurrentHashMap<>(1);

    /**
     * 创建消费者，如果存在则不创建
     * @param code 消费者唯一标识
     * @param mappingFunction 消费者不存在时执行
     */
    public boolean createIfAbsent(String code, Function<String, KafkaV261Properties.Consumer> mappingFunction) {
        AtomicBoolean result = new AtomicBoolean(false);
        kafkaConsumerContextMap.computeIfAbsent(code, k -> {
            KafkaV261Properties.Consumer config = mappingFunction.apply(k);
            KafkaConsumerContext context = create(code, config);
            result.set(true);
            return context;
        });
        return result.get();
    }

    /**
     * 创建消费者，如果存在则不创建
     * @param code 消费者唯一标识
     * @param config 消费者配置
     * @return true：成功；false：失败
     */
    public boolean createIfAbsent(String code, KafkaV261Properties.Consumer config) {
        AtomicBoolean result = new AtomicBoolean(false);
        // 根据唯一标识创建消费者，同样的code如果存在则不创建
        kafkaConsumerContextMap.computeIfAbsent(code, v -> {
            KafkaConsumerContext context = create(code, config);
            result.set(true);
            return context;
        });
        return result.get();
    }

    /**
     * 创建消费者
     * @param code 消费者编号
     * @param config 消费者配置
     * @return 消费者相关信息
     */
    private KafkaConsumerContext create(String code, KafkaV261Properties.Consumer config) {
        // 消费者相关的环境信息
        KafkaConsumerContext context = new KafkaConsumerContext();
        context.setCode(code);
        context.setConfig(config);
        context.setProcessedCount(new AtomicLong());
        // 内存队列，用于存放拉取的消息，避免阻塞kafka的poll方法
        BlockingDeque<Object> recordsQueue = new LinkedBlockingDeque<>();
        context.setRecordsQueue(recordsQueue);
        context.setOffsets(new ConcurrentHashMap<>(1));
        // 创建固定线程池，每个消费者对应两个线程，一个线程拉取数据，一个线程处理数据
        int threads = config.getCount() * 2;
        ThreadPoolExecutor processorExecutor = new ThreadPoolExecutor(threads, threads,
                0L, TimeUnit.SECONDS,
                new LinkedBlockingQueue<>(1),
                new CustomizableThreadFactory(code + "-"));
        context.setProcessorExecutor(processorExecutor);
        // 创建消费者
        List<KafkaConsumer<String, String>> kafkaConsumers = new ArrayList<>(config.getCount());
        for (int i = 0; i < config.getCount(); i ++) {
            // 将创建好的消费者放入map中，方便获取、关闭等操作。只有当不存在时才创建
            KafkaConsumer<String, String> kafkaConsumer = new KafkaConsumer<>(config.getProps());
            kafkaConsumers.add(kafkaConsumer);
            // 每个消费者的offset隔离记录
            Map<TopicPartition, OffsetAndMetadata> offsets = context.getOffsets().computeIfAbsent(i, e -> new ConcurrentHashMap<>(1));
            // 订阅消息
            subscribe(context, kafkaConsumer, offsets);
        }
        context.setKafkaConsumers(kafkaConsumers);
        log.info("create new kafka consumer success:{}-{}", code, config.getCount());
        return context;
    }

    /**
     * 订阅消息
     * 出现的偶发kafka消费者暂停，重启consumer后又恢复的问题，经排查后发现因kafka0.9的consumer的心跳是在consumer.poll()或consumer.commitSync()时提交，如果因消费机或输出后端负载等原因，导致长时间没有调用这2个方法，kafka服务端认为该consumer心跳已断；经过我们内部验证，采用如下方法可避免此问题：
     * 0. 创建consumer时指定手动提交offset
     * 1. 后端积压或处理不了的时候调用consumer.pause()暂停拉取数据，但不能延迟调用consumer.poll()，待负载恢复时调用consumer.resume()恢复拉取数据
     * 2. 处理消息时每隔一定时间{ com.chinaway.starter.kafka.KafkaProperties.Consumer.getCommitInterval() }手动提交一次offset, 防止处理消息过慢造成心跳超时
     * 此处采用 0+2 方式实现
     * @param context 消费者配置参数
     * @param kafkaConsumer 消费者对象
     */
    private void subscribe(KafkaConsumerContext context, KafkaConsumer<String, String> kafkaConsumer, Map<TopicPartition, OffsetAndMetadata> offsets){
        KafkaV261Properties.Consumer config = context.getConfig();
        String topic = config.getTopic();
        kafkaConsumer.subscribe(Arrays.asList(topic), new ConsumerRebalanceListener() {
            @Override
            public void onPartitionsRevoked(Collection<TopicPartition> partitions) {
                // 停止拉取数据后执行，清空未处理的数据（避免重复消费），并且提交offsets
                log.info("{} partitions revoked:{}", context.getCode(), partitions);
                context.getRecordsQueue().clear();
                commit(context, kafkaConsumer, offsets);
                if (config.isStop()) {
                    kafkaConsumer.close();
                }
            }

            @Override
            public void onPartitionsAssigned(Collection<TopicPartition> partitions) {
                // re balance 结束，拉取数据之前，清空offsets标记
                log.info("{} partitions assigned:{}", context.getCode(), partitions);
                offsets.clear();
                if (config.isStop()) {
                    kafkaConsumer.close();
                }
            }
        });


        // 异步拉取数据，避免阻塞主线程
        context.getProcessorExecutor().execute(() -> poll(context, kafkaConsumer, offsets));
        // 异步处理数据
        context.getProcessorExecutor().execute(() -> process(context, offsets));
    }

    /**
     * 拉取消息
     * @param context 消费者信息
     * @param kafkaConsumer 消费者
     */
    private void poll(KafkaConsumerContext context, KafkaConsumer<String, String> kafkaConsumer, Map<TopicPartition, OffsetAndMetadata> offsets) {
        // 拉取数据
        long lastCommitTime = System.currentTimeMillis();
        boolean isAutoCommit = (boolean) context.getConfig().getProps().getOrDefault(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG, false);
        // 记录当前拉取数据状态，避免重复调用pause和resume
        boolean poll = true;
        // 拉取数据开关，方便自行控制拉取数据，主要用于启动后先执行一些自定义逻辑（比如加载缓存）
        if(!context.getConfig().isPoll()){
            poll(context, kafkaConsumer, false);
        }
        while (true) {
            try {
                if (context.getConfig().isStop()) {
                    stop(context, kafkaConsumer, offsets, isAutoCommit);
                    // 停止拉取线程
                    break;
                }

                // 修改偏移量的处理
                seek(context.getCode(), kafkaConsumer, offsets);

                // 拉取数据
                ConsumerRecords<String, String> records = kafkaConsumer.poll(Duration.ofMillis(context.getConfig().getTimeout()));
                if (log.isTraceEnabled()) {
                    log.trace("{} poll records:{}", context.getCode(), records.count());
                }
                if(records != null && !records.isEmpty()) {
                    // 将拉取的数据放入内存队列
                    recordsToQueue(context, records);
                }

                // 调用pause方法，poll返回会为空，但必须调用poll，否则心跳会超时导致rebalance
                if (context.getRecordsQueue().size() > context.getConfig().getMaxQueueSize() && poll) {
                    poll(context, kafkaConsumer, false);
                    poll = false;
                } else if (context.getRecordsQueue().size() < context.getConfig().getMaxQueueSize() && !poll) {
                    poll(context, kafkaConsumer, true);
                    poll = true;
                }

                if (!isAutoCommit) {
                    // 间隔指定时间 提交offsets
                    int commitRecords = context.getConfig().getCommitRecords();
                    if (commitRecords > 0 && context.getProcessedCount().intValue() > commitRecords) {
                        // 优先根据处理条数来判断是否提交offset
                        context.getProcessedCount().addAndGet(Math.negateExact(commitRecords));
                        commit(context, kafkaConsumer, offsets);
                        lastCommitTime = System.currentTimeMillis();
                    } else if (System.currentTimeMillis() - lastCommitTime > context.getConfig().getCommitInterval()) {
                        // 处理条数不满足时，根据间隔时间提交offset
                        commit(context, kafkaConsumer, offsets);
                        lastCommitTime = System.currentTimeMillis();
                    }
                }
            } catch (Throwable e) {
                log.error("{} poll data failed in loop", context.getCode(), e);
                sleep(context.getConfig().getExpInterval());
            }
        }
    }

    private void stop(KafkaConsumerContext context, KafkaConsumer<String, String> kafkaConsumer,
                      Map<TopicPartition, OffsetAndMetadata> offsets, boolean isAutoCommit) {
        // 停止消费者
        log.info("poll stop:{}", context.getCode());
        try {
            // 清空未处理完的数据
            context.getRecordsQueue().clear();
            if (!isAutoCommit) {
                // 提交offset
                commit(context, kafkaConsumer, offsets);
            }
        } catch (Exception e) {
            log.error("commit failed when poll stop:{}", context.getCode(), e);
        }
        // 停止消费者
        kafkaConsumer.close();
    }

    /**
     * 将拉取记录放入内存队列
     * @param context 消费者相关信息
     * @param records 拉取的记录
     * @throws InterruptedException 放入内存队列时被中断异常
     */
    private void recordsToQueue(KafkaConsumerContext context, ConsumerRecords<String, String> records) throws InterruptedException {
        if (context.getConfig().getMaxBatchSize() <= 1) {
            records.forEach(record -> {
                try {
                    context.getRecordsQueue().put(record);
                } catch (InterruptedException e) {
                    log.warn("put to record queue failed:{}", record.value(), e);
                    Thread.currentThread().interrupt();
                }
            });
        } else {
            Map<String, List<ConsumerRecord<String, String>>> recordMap = new ConcurrentHashMap<>(1);
            // 根据topic分别批量放入内存队列Queue
            for (ConsumerRecord<String, String> record : records) {
                List<ConsumerRecord<String, String>> tempBatchRecords = recordMap.computeIfAbsent(record.topic(), v -> new ArrayList<>(context.getConfig().getMaxBatchSize()));
                tempBatchRecords.add(record);
                if (tempBatchRecords.size() % context.getConfig().getMaxBatchSize() == 0) {
                    context.getRecordsQueue().put(tempBatchRecords);
                    tempBatchRecords.clear();
                }
            }

            // 将剩余不足单次批量处理的数据放入内存队列
            for (Map.Entry<String, List<ConsumerRecord<String, String>>> entry : recordMap.entrySet()) {
                List<ConsumerRecord<String, String>> tempBatchRecords = entry.getValue();
                if (!CollectionUtils.isEmpty(tempBatchRecords)) {
                    context.getRecordsQueue().put(tempBatchRecords);
                }
            }
        }
    }

    /**
     * 处理数据
     * @param context 消费者相关信息
     */
    private void process(KafkaConsumerContext context, Map<TopicPartition, OffsetAndMetadata> offsets) {
        Object recordObj;
        ConsumerRecord<String, String> record = null;
        while (true) {
            if (context.getConfig().isStop()) {
                // 停止数据处理
                log.info("process stop:{}", context.getCode());
                break;
            }

            try {
                // 从内存队列同步取数据，根据数据类型判断是单条处理还是批量处理
                recordObj = context.getRecordsQueue().take();
                if (recordObj instanceof List) {
                    record = process(context.getCode(), (List<ConsumerRecord<String, String>>) recordObj);
                } else if (recordObj instanceof ConsumerRecord) {
                    record = (ConsumerRecord<String, String>) recordObj;
                    process(context.getCode(), record);
                }
            } catch (Throwable e) {
                log.error("handle record exception:record:" + (record == null ? "empty" : record.toString()), e);
            } finally {
                // 数据处理完后记录偏移量。处理数据异常时会丢弃，需要处理数据的地方自行处理
                if (record != null) {
                    offsets.put(new TopicPartition(record.topic(), record.partition()), new OffsetAndMetadata(record.offset() + 1));
                }
                context.getProcessedCount().incrementAndGet();
            }
        }
    }

    /**
     * 批量处理数据
     * @param code 消费者唯一标识
     * @param records 数据
     * @return 最后一条记录，用于处理后获取offset进行提交
     * @throws Exception 处理数据的异常
     */
    private ConsumerRecord<String, String> process(String code, List<ConsumerRecord<String, String>> records) throws Exception {
        String topic = records.get(0).topic();
        IKafkaMessageProcessor processor = getProcessor(topic);
        if (processor == null) {
            log.warn("can't find batch processor! topic: {}, records: {}", topic, JSON.toJSONString(records));
        } else {
            processor.process(code, records);
        }

        return records.get(records.size() - 1);
    }

    /**
     * 处理单条数据
     * @param code 消费者唯一标识
     * @param record 数据
     * @throws Exception 处理数据的异常
     */
    private void process(String code, ConsumerRecord<String, String> record) throws Exception {
        IKafkaMessageProcessor processor = getProcessor(code);
        if (processor != null) {
            processor.process(code, record);
        } else {
            log.warn("can't find processor of topic:{}, value:{}", record.topic(), record.value());
        }
    }

    /**
     * 根据topic获取数据处理器，没有则使用默认的数据处理
     * @param code 处理器编号
     * @return 处理器bean
     */
    private IKafkaMessageProcessor getProcessor(String code) {
        IKafkaMessageProcessor processor = processorMap.get(code);
        if (processor == null) {
            processor = processorMap.get(IKafkaMessageProcessor.DEFAULT);
        }
        return processor;
    }

    /**
     * 提交offset
     * @param context 消费者相关信息，包含了offset
     * @param kafkaConsumer 消费者
     */
    private void commit(KafkaConsumerContext context, KafkaConsumer<String, String> kafkaConsumer, Map<TopicPartition, OffsetAndMetadata> offsets) {
        // 实时获取当前消费者有哪些partition
        Set<TopicPartition> topicPartitionSet = kafkaConsumer.assignment();
        if (CollectionUtils.isEmpty(topicPartitionSet)) {
            log.debug("{} clear offset", context.getCode());
            offsets.clear();
            return ;
        }

        // 记录的offset如果没有在当前消费者的partition范围中，则移除，不进行提交操作
        for (Map.Entry<TopicPartition, OffsetAndMetadata> entry : offsets.entrySet()) {
            if (!topicPartitionSet.contains(entry.getKey())) {
                log.debug("{} remove:{}", context.getCode(), entry.getKey());
                offsets.remove(entry.getKey());
            }
        }

        // 如果记录的offset为空，则获取当前消费者已经提交的offset进行提交
        if (offsets.isEmpty()) {
            // 如果所有offset都没有更新，则提交全部分片的offset
            Map<TopicPartition, OffsetAndMetadata> offsetAndMetadataMap = kafkaConsumer.committed(topicPartitionSet);
            if (offsetAndMetadataMap != null && !offsetAndMetadataMap.isEmpty()) {
                offsets.putAll(offsetAndMetadataMap);
            }
        }

        if (log.isDebugEnabled() && !offsets.isEmpty()) {
            log.debug("{} execute commit offsets.assignment:{},commit:{}", context.getCode(), topicPartitionSet, offsets);
        }

        // 同步提交偏移量
        kafkaConsumer.commitSync(offsets);
    }

    /**
     * 动态修改消费者offset
     * @param code 消费者唯一标识
     * @param kafkaConsumer 消费者
     * @param offsets 要更新的offset信息
     */
    private void seek(String code, KafkaConsumer<String, String> kafkaConsumer, Map<TopicPartition, OffsetAndMetadata> offsets) {
        SeekInfo seekInfo = seekInfoMap.get(code);
        if (seekInfo == null) {
            return ;
        }
        log.info("seek offset，topic:{}-partition:{}-offset:{}", seekInfo.getTopic(), seekInfo.getPartition(), seekInfo.getOffset());
        try {
            kafkaConsumer.seek(new TopicPartition(seekInfo.getTopic(), seekInfo.getPartition()), seekInfo.getOffset());
        } catch (Exception e) {
            log.error("seek offset occurred exception:topic-{},partition-{},offset-{}", seekInfo.getTopic(), seekInfo.getPartition(), seekInfo.getOffset(), e);
        } finally {
            offsets.clear();
            // 全部清理，即一次只能操作一个。避免传入数据错误导致map中一直存在数据的情况
            seekInfoMap.clear();
        }
    }

    /**
     * 公用sleep方法，避免每个地方都处理异常
     * @param timeMillis 时间，毫秒
     */
    private void sleep(long timeMillis) {
        try {
            Thread.sleep(timeMillis);
        } catch (InterruptedException e) {
            log.error("sleep unknown exception", e);
            Thread.currentThread().interrupt();
        }
    }

    /**
     * 消费者拉取数据状态变更。不影响执行poll方法（不影响kafka心跳机制）
     * @param kafkaConsumer 消费者
     * @param poll 是否拉取数据：true=拉取；false=不拉取
     */
    private void poll(KafkaConsumerContext context, KafkaConsumer<String, String> kafkaConsumer, boolean poll) {
        log.debug("kafka consumer poll:{}-{}", context.getCode(), poll);
        if (poll) {
            // 恢复拉取数据
            kafkaConsumer.resume(Arrays.asList(kafkaConsumer.assignment().toArray(new TopicPartition[0])));
        } else {
            // 停止拉取数据
            kafkaConsumer.pause(Arrays.asList(kafkaConsumer.assignment().toArray(new TopicPartition[0])));
        }
    }

    /**
     * 所有消费者拉取数据状态变更
     * @param poll 是否拉取数据：true=拉取；false=不拉取
     */
    public void poll(boolean poll) {
        for(Map.Entry<String, KafkaConsumerContext> entry : kafkaConsumerContextMap.entrySet()){
            poll(entry.getValue(), poll);
        }
    }

    /**
     * 消费者拉取数据状态变更
     * @param context 消费者相关信息bean
     * @param poll 是否拉取数据：true=拉取；false=不拉取
     */
    private void poll(KafkaConsumerContext context, boolean poll) {
        if (context != null && !CollectionUtils.isEmpty(context.getKafkaConsumers())) {
            context.getKafkaConsumers().forEach(c -> poll(context, c, poll));
        }
    }

    /**
     * 根据消费者唯一标识变更数据拉取状态
     * @param code 消费者唯一标识
     * @param poll 是否拉取数据：true=拉取；false=不拉取
     */
    public void poll(String code, boolean poll) {
        KafkaConsumerContext context = kafkaConsumerContextMap.get(code);
        poll(context, poll);
    }

    /**
     * 停止所有消费者
     */
    public void stop() {
        for(Map.Entry<String, KafkaConsumerContext> entry : kafkaConsumerContextMap.entrySet()){
            KafkaConsumerContext context = entry.getValue();
            context.getConfig().setStop(true);
            context.getProcessorExecutor().shutdown();
        }
        kafkaConsumerContextMap.clear();
    }

    /**
     * 停止指定消费者
     * @param code 消费者唯一标识
     */
    public void stop(String code) {
        KafkaConsumerContext context = kafkaConsumerContextMap.get(code);
        if (context != null) {
            context.getConfig().setStop(true);
            context.getProcessorExecutor().shutdown();
            kafkaConsumerContextMap.remove(code);
        }
    }

    /**
     * 销毁对象，关闭消费者
     */
    @PreDestroy
    public void destroy() {
        stop();
    }

    public Map<String, IKafkaMessageProcessor> getProcessorMap() {
        return processorMap;
    }

    public KafkaV261ConsumerFactory setProcessorMap(Map<String, IKafkaMessageProcessor> processorMap) {
        this.processorMap = processorMap;
        return this;
    }

    public Map<String, KafkaConsumerContext> getKafkaConsumerContextMap() {
        return kafkaConsumerContextMap;
    }

    public KafkaV261ConsumerFactory setKafkaConsumerContextMap(Map<String, KafkaConsumerContext> kafkaConsumerContextMap) {
        this.kafkaConsumerContextMap = kafkaConsumerContextMap;
        return this;
    }

    public Map<String, SeekInfo> getSeekInfoMap() {
        return seekInfoMap;
    }

    public KafkaV261ConsumerFactory setSeekInfoMap(Map<String, SeekInfo> seekInfoMap) {
        this.seekInfoMap = seekInfoMap;
        return this;
    }
}
