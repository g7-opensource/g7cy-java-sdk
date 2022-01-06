package cn.com.g7.sdk.kafka.consumer;

import cn.com.g7.sdk.kafka.bo.FaceDetectResult;
import cn.com.g7.sdk.kafka.bo.KafkaData;
import cn.com.g7.sdk.kafka.enums.DataCodeEnum;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;

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
