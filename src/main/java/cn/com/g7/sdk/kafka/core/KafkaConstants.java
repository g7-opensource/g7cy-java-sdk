package cn.com.g7.sdk.kafka.core;

/**
 * 常量定义
 * @author dengfuwei
 * @version 1.0.0
 * @date 2021/9/28 9:54 上午
 */
public interface KafkaConstants {

    /** kafka认证文件启动参数key*/
    String KAFKA_CLIENT_TRUST_STORE = "KAFKA_CLIENT_TRUST_STORE";

    /** 正式环境*/
    String KAFKA_BROKER = "kafka.openapi.huoyunren.com:9001,kafka.openapi.huoyunren.com:9002,kafka.openapi.huoyunren.com:9003";

}
