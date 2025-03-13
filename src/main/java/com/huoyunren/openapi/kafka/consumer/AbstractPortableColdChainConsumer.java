package com.huoyunren.openapi.kafka.consumer;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.huoyunren.openapi.kafka.bo.KafkaData;
import com.huoyunren.openapi.kafka.bo.PortableColdChain;
import com.huoyunren.openapi.kafka.enums.DataCodeEnum;

/**
 * 便携式冷链数据处理
 * @author dengfuwei
 * @version 1.0.0
 * @date 2021/11/9 3:51 下午
 */
public abstract class AbstractPortableColdChainConsumer implements IMessageConsumer {

    @Override
    public String code() {
        return DataCodeEnum.PORTABLE_COLD_CHAIN.getCode();
    }

    @Override
    public void process(JSONObject recordObj) {
        KafkaData<PortableColdChain> kafkaData = recordObj.toJavaObject(new TypeReference<KafkaData<PortableColdChain>>() {});
        process(kafkaData);
    }

    /**
     * 处理数据
     * @param kafkaData 接收到的数据
     */
    public abstract void process(KafkaData<PortableColdChain> kafkaData);
}
