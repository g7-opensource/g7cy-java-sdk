package com.huoyunren.openapi.kafka.consumer;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.huoyunren.openapi.kafka.bo.FaceDetectResult;
import com.huoyunren.openapi.kafka.bo.KafkaData;
import com.huoyunren.openapi.kafka.enums.DataCodeEnum;

/**
 * 人脸识别响应数据处理
 *
 * @author zhaobijiang
 * @date 2021/11/18
 */
public abstract class AbstractFaceDetectConsumer implements IMessageConsumer {

    @Override
    public String code() {
        return DataCodeEnum.FACE_DETECT_RESPONSE.getCode();
    }

    @Override
    public void process(JSONObject recordObj) {
        KafkaData<FaceDetectResult> kafkaData = recordObj.toJavaObject(new TypeReference<KafkaData<FaceDetectResult>>() {});
        process(kafkaData);
    }

    /**
     * 处理数据
     *
     * @param kafkaData 接收到的数据
     */
    public abstract void process(KafkaData<FaceDetectResult> kafkaData);
}
