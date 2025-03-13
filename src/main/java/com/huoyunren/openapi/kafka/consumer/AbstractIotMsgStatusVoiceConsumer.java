package com.huoyunren.openapi.kafka.consumer;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.huoyunren.openapi.kafka.bo.IotMsgStatus;
import com.huoyunren.openapi.kafka.bo.KafkaData;
import com.huoyunren.openapi.kafka.enums.DataCodeEnum;

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
