package cn.com.g7.sdk.kafka.enums;

/**
 * IoT消息详细状态
 * @author dengfuwei
 * @version 1.0.0
 * @date 2022/1/6 5:30 下午
 */
public enum IotMsgDetailEnum {

    /** 新消息*/
    NEW(0),
    /** 重发消息准备状态*/
    MESSAGE_RETRY_READY(11),
    /** mq推送成功*/
    MQ_SEND_SUCCESS(21),
    /** 解析指令*/
    PARSE_MESSAGE(22),
    /** 下发成功*/
    SEND_MESSAGE_SUCCESS(23),
    /** 设备未在线*/
    OFFLINE(24),
    /** 已结束消息超时*/
    END_MESSAGE_TIMEOUT(80),
    /** 已结束消息超过最大发送次数*/
    END_MESSAGE_MAXIMUM(81),
    /** 解析协议内容失败*/
    END_MESSAGE_PARSE_FAILED(82),
    /** 已完成收到设备应答*/
    RECEIVED_DEVICE_RESPONSE(90),
    /** 已完成，无需设备应答*/
    RECEIVED_DEVICE_NULL_RESPONSE(91),
    ;

    private Integer code;

    IotMsgDetailEnum(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }
}
