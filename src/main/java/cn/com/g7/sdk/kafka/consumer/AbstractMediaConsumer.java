package cn.com.g7.sdk.kafka.consumer;

import cn.com.g7.sdk.kafka.bo.IotEventMedia;
import cn.com.g7.sdk.kafka.bo.KafkaData;
import cn.com.g7.sdk.kafka.enums.DataCodeEnum;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;

/**
 * 多媒体数据抽象处理
 * @author dengfuwei
 * @version 1.0.0
 * @date 2021/10/8 11:14 上午
 */
public abstract class AbstractMediaConsumer implements IMessageConsumer {

    @Override
    public String code() {
        return DataCodeEnum.MEDIA.getCode();
    }

    @Override
    public void process(JSONObject recordObj) {
        KafkaData<IotEventMedia> kafkaData = recordObj.toJavaObject(new TypeReference<KafkaData<IotEventMedia>>() {});
        process(kafkaData);
    }

    /**
     * 处理数据
     * @param kafkaData 接收到的数据
     */
    public abstract void process(KafkaData<IotEventMedia> kafkaData);
}
