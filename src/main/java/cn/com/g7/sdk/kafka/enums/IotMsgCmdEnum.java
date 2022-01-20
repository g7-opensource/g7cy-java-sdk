package cn.com.g7.sdk.kafka.enums;

/**
 * IoT消息指令
 * @author dengfuwei
 * @version 1.0.0
 * @date 2022/1/6 5:32 下午
 */
public enum IotMsgCmdEnum {
    /** 语音下发*/
    CMD_8300("8300");
    ;

    private String code;

    IotMsgCmdEnum(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
