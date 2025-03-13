package com.huoyunren.openapi.kafka.consumer;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.huoyunren.openapi.kafka.bo.IotEvent;
import com.huoyunren.openapi.kafka.bo.KafkaData;
import com.huoyunren.openapi.kafka.enums.DataCodeEnum;
import com.huoyunren.openapi.kafka.enums.DriverTiredEventEnum;

/**
 * 司机疲劳事件抽象处理,事件类型（event_type）详见{@link DriverTiredEventEnum}
 * @author dengfuwei
 * @version 1.0.0
 * @date 2021/10/8 11:14 上午
 */
public abstract class AbstractTiredDriverConsumer implements IMessageConsumer {

    @Override
    public String code() {
        return DataCodeEnum.TIRED_DRIVER.getCode();
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
