package cn.com.g7.sdk.kafka.consumer;

import cn.com.g7.sdk.kafka.bo.KafkaData;
import cn.com.g7.sdk.kafka.bo.PortableColdChain;
import cn.com.g7.sdk.kafka.enums.DataCodeEnum;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;

/**
 * 便携式冷链数据处理
 * @author dengfuwei
 * @version 1.0.0
 * @date 2021/11/9 3:51 下午
 */
public abstract class AbstractPortableColdChainConsumer implements IMessageConsumer {

    @Override
    public String code() {
        return DataCodeEnum.FIXED_COLD_CHAIN.getCode();
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
