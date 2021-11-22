package cn.com.g7.sdk.api.vo;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 车辆设备解绑 响应数据
 * @author liwenlang
 * @version 1.0.0
 * @date 2021/10/12 15:50
 */
public class DeviceUnbindRsp {

    /** 操作结果，true为成功，false为失败*/
    @JSONField(name = "op_result")
    private Boolean opResult;

    /** 操作结果说明，失败则为失败说明*/
    @JSONField(name = "op_message")
    private String opMessage;

    /** 操作结果编码，成功为0，失败则为失败编码*/
    @JSONField(name = "op_code")
    private Integer opCode;

    public Boolean getOpResult() {
        return opResult;
    }

    public DeviceUnbindRsp setOpResult(Boolean opResult) {
        this.opResult = opResult;
        return this;
    }

    public String getOpMessage() {
        return opMessage;
    }

    public DeviceUnbindRsp setOpMessage(String opMessage) {
        this.opMessage = opMessage;
        return this;
    }

    public Integer getOpCode() {
        return opCode;
    }

    public DeviceUnbindRsp setOpCode(Integer opCode) {
        this.opCode = opCode;
        return this;
    }
}
