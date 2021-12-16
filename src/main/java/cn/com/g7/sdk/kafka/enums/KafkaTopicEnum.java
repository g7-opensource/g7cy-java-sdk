package cn.com.g7.sdk.kafka.enums;

/**
 * kafka topic数据类型枚举
 * @author dengfuwei
 * @version 1.0.0
 * @date 2021/10/8 11:20 上午
 */
public enum KafkaTopicEnum {

    /** 定位数据*/
    LOCATION("location"),
    /** 便携式冷链数据*/
    PORTABLE_COLD_CHAIN("portable_cold_chain"),
    /** 固定式冷链数据*/
    FIXED_COLD_CHAIN("fixed_cold_chain"),
    /** 司机疲劳事件*/
    TIRED_DRIVER("tired_driver"),
    /** 多媒体*/
    MEDIA("media"),
    /** ADAS事件*/
    ADAS("adas"),
    /** 人脸识别响应数据数据*/
    FACE_DETECT_RESPONSE("topic_face_detect_response"),

    ;
    /** 编号*/
    private final String code;

    KafkaTopicEnum(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
