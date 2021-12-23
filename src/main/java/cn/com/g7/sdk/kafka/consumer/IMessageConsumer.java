package cn.com.g7.sdk.kafka.consumer;

import com.alibaba.fastjson.JSONObject;

/**
 * @author dengfuwei
 * @version 1.0.0
 * @date 2021/12/23 5:33 下午
 */
public interface IMessageConsumer {

    /**
     * 数据类型编号{@link cn.com.g7.sdk.kafka.enums.DataCodeEnum}
     * @return 数据类型编号
     */
    String code();

    /**
     * 处理数据
     * @param recordObj kafka数据
     */
    void process(JSONObject recordObj);
}
