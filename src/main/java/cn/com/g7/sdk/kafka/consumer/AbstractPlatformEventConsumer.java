package cn.com.g7.sdk.kafka.consumer;

import cn.com.g7.sdk.kafka.bo.IotEvent;
import cn.com.g7.sdk.kafka.bo.KafkaData;
import cn.com.g7.sdk.kafka.enums.DataCodeEnum;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;

/**
 * 平台事件抽象处理,事件类型（event_type）详见{@link cn.com.g7.sdk.kafka.enums.PlatformEventEnum}
 * @author dengfuwei
 * @version 1.0.0
 * @date 2022/1/12 3:21 下午
 */
public abstract class AbstractPlatformEventConsumer implements IMessageConsumer {

    @Override
    public String code() {
        return DataCodeEnum.PLATFORM_EVENT.getCode();
    }

    @Override
    public void process(JSONObject recordObj) {
        KafkaData<IotEvent> kafkaData = recordObj.toJavaObject(new TypeReference<KafkaData<IotEvent>>() {});
        process(kafkaData);
    }

    /**
     * 处理数据
     * @param kafkaData 接收到的数据
     */
    public abstract void process(KafkaData<IotEvent> kafkaData);
}
