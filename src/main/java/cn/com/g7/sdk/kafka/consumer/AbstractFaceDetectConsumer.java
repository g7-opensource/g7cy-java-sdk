package cn.com.g7.sdk.kafka.consumer;

import cn.com.g7.sdk.kafka.bo.FaceDetectResult;
import cn.com.g7.sdk.kafka.bo.KafkaData;
import cn.com.g7.sdk.kafka.core.IKafkaMessageProcessor;
import cn.com.g7.sdk.kafka.enums.DataCodeEnum;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import org.apache.kafka.v261.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 人脸识别响应数据处理
 *
 * @author zhaobijiang
 * @date 2021/11/18
 */
public abstract class AbstractFaceDetectConsumer implements IKafkaMessageProcessor {

    private final Logger log = LoggerFactory.getLogger(AbstractFaceDetectConsumer.class);

    @Override
    public String code() {
        return DataCodeEnum.FACE_DETECT_RESPONSE.getCode();
    }

    @Override
    public void process(String code, ConsumerRecord<String, String> record) {
        log.debug("kafka message, code:{}, topic:{}, value:{}", code, record.topic(), record.value());
        KafkaData<FaceDetectResult> kafkaData = JSON.parseObject(record.value(), new TypeReference<KafkaData<FaceDetectResult>>() {});
        process(kafkaData);
    }

    /**
     * 处理数据
     *
     * @param kafkaData 接收到的数据
     */
    public abstract void process(KafkaData<FaceDetectResult> kafkaData);
}
