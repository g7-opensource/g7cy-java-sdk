package cn.com.g7.sdk.kafka.consumer;

import cn.com.g7.sdk.kafka.bo.IotEvent;
import cn.com.g7.sdk.kafka.bo.KafkaData;
import cn.com.g7.sdk.kafka.core.IKafkaMessageProcessor;
import cn.com.g7.sdk.kafka.enums.DataCodeEnum;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import org.apache.kafka.v261.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ADAS事件抽象处理
 * @author dengfuwei
 * @version 1.0.0
 * @date 2021/10/8 11:14 上午
 */
public abstract class AbstractAdasConsumer implements IKafkaMessageProcessor {

    private final Logger log = LoggerFactory.getLogger(AbstractAdasConsumer.class);

    @Override
    public String code() {
        return DataCodeEnum.ADAS.getCode();
    }

    @Override
    public void process(String code, ConsumerRecord<String, String> record) {
        log.debug("kafka message, code:{}, topic:{}, value:{}", code, record.topic(), record.value());
        KafkaData<IotEvent> kafkaData = JSON.parseObject(record.value(), new TypeReference<KafkaData<IotEvent>>() {});
        process(kafkaData);
    }

    /**
     * 处理数据
     * @param kafkaData 接收到的数据
     */
    public abstract void process(KafkaData<IotEvent> kafkaData);
}
