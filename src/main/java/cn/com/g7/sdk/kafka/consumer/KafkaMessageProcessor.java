package cn.com.g7.sdk.kafka.consumer;

import cn.com.g7.sdk.kafka.core.IKafkaMessageProcessor;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.kafka.g7.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author dengfuwei
 * @version 1.0.0
 * @date 2021/12/23 5:31 下午
 */
public class KafkaMessageProcessor implements IKafkaMessageProcessor {

    private final Logger log = LoggerFactory.getLogger(KafkaMessageProcessor.class);

    private final Map<String, IMessageConsumer> messageConsumerMap;

    public KafkaMessageProcessor(List<IMessageConsumer> messageConsumers) {
        messageConsumerMap = new HashMap<>(messageConsumers.size());
        messageConsumers.forEach(m -> messageConsumerMap.put(m.code(), m));
    }

    @Override
    public void process(String code, ConsumerRecord<String, String> record) {
        log.info("kafka message, topic:{}, value:{}", record.topic(), record.value());
        JSONObject recordObj = JSON.parseObject(record.value());
        String dataCode = recordObj.getString("code");
        IMessageConsumer messageConsumer = messageConsumerMap.get(dataCode);
        if (messageConsumer == null) {
            log.debug("can't process the data:{}", dataCode);
            return;
        }

        messageConsumer.process(recordObj);
    }
}
