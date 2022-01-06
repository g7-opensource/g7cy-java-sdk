package cn.com.g7.sdk.kafka.consumer;

import cn.com.g7.sdk.kafka.bo.IotMsgStatus;
import cn.com.g7.sdk.kafka.bo.KafkaData;
import cn.com.g7.sdk.kafka.enums.DataCodeEnum;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;

/**
 * 语音下发状态消息抽象处理
 * @author dengfuwei
 * @version 1.0.0
 * @date 2021/10/8 11:14 上午
 */
public abstract class AbstractIotMsgStatusVoiceConsumer implements IMessageConsumer {

    @Override
    public String code() {
        return DataCodeEnum.IOT_MSG_STATUS_VOICE.getCode();
    }

    @Override
    public void process(JSONObject recordObj) {
        KafkaData<IotMsgStatus> kafkaData = recordObj.toJavaObject(new TypeReference<KafkaData<IotMsgStatus>>() {});
        process(kafkaData);
    }

    /**
     * 处理数据
     * @param kafkaData 接收到的数据
     */
    public abstract void process(KafkaData<IotMsgStatus> kafkaData);
}
