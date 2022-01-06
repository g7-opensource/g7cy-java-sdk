package cn.com.g7.sdk.kafka.core;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.apache.kafka.v261.clients.consumer.KafkaConsumer;
import org.apache.kafka.v261.clients.consumer.OffsetAndMetadata;
import org.apache.kafka.v261.common.TopicPartition;

import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicLong;

/**
 * 消费者相关信息
 * @author dengfuwei
 * @version 1.0.0
 * @date 2021/9/18 5:01 下午
 */
public class KafkaConsumerContext {

    /** 消费者唯一标识*/
    private String code;

    /** 消费者配置*/
    private KafkaV261Properties.Consumer config;

    /** 消费者数据处理线程池，同一组消费者共用*/
    @JsonIgnore
    @JSONField(serialize = false, deserialize = false)
    private ThreadPoolExecutor processorExecutor;

    /** 消费者列表*/
    @JsonIgnore
    @JSONField(serialize = false, deserialize = false)
    private List<KafkaConsumer<String, String>> kafkaConsumers;

    /** 内存队列，用于存放拉取的消息，避免阻塞kafka的poll方法，同一组消费者共用*/
    @JsonIgnore
    @JSONField(serialize = false, deserialize = false)
    private BlockingQueue<Object> recordsQueue;

    /**
     * 消费者对应offset信息，每个消费者单独存储
     * key为消费者下标（不使用clientId是怕重复），value为对应消费者的各partition的offset数据
     */
    @JsonIgnore
    @JSONField(serialize = false, deserialize = false)
    private Map<Integer, Map<TopicPartition, OffsetAndMetadata>> offsets;

    /** 处理记录数，用于根据每处理N条数据就提交offset的场景*/
    private AtomicLong processedCount;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public KafkaV261Properties.Consumer getConfig() {
        return config;
    }

    public void setConfig(KafkaV261Properties.Consumer config) {
        this.config = config;
    }

    public ThreadPoolExecutor getProcessorExecutor() {
        return processorExecutor;
    }

    public void setProcessorExecutor(ThreadPoolExecutor processorExecutor) {
        this.processorExecutor = processorExecutor;
    }

    public List<KafkaConsumer<String, String>> getKafkaConsumers() {
        return kafkaConsumers;
    }

    public void setKafkaConsumers(List<KafkaConsumer<String, String>> kafkaConsumers) {
        this.kafkaConsumers = kafkaConsumers;
    }

    public BlockingQueue<Object> getRecordsQueue() {
        return recordsQueue;
    }

    public void setRecordsQueue(BlockingQueue<Object> recordsQueue) {
        this.recordsQueue = recordsQueue;
    }

    public Map<Integer, Map<TopicPartition, OffsetAndMetadata>> getOffsets() {
        return offsets;
    }

    public void setOffsets(Map<Integer, Map<TopicPartition, OffsetAndMetadata>> offsets) {
        this.offsets = offsets;
    }

    public AtomicLong getProcessedCount() {
        return processedCount;
    }

    public void setProcessedCount(AtomicLong processedCount) {
        this.processedCount = processedCount;
    }
}
