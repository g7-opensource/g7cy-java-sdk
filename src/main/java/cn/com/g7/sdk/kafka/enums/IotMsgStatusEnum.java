package cn.com.g7.sdk.kafka.enums;

/**
 * IoT消息状态
 * @author dengfuwei
 * @version 1.0.0
 * @date 2022/1/6 5:30 下午
 */
public enum IotMsgStatusEnum {

    /** 下发成功 */
    SUCCESS_STATUS(1),
    /** 下发失败 */
    FAILED_STATUS(2),
    /** 下发中 */
    SENDING_STATUS(4),
    /** 下发结果未知 */
    UNKNOWN_STATUS(5),
    /** 下发之后，无需设备应答 */
    UNRELIABLE_STATUS(6);

    private Integer code;

    IotMsgStatusEnum(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }
}
