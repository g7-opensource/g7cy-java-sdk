package cn.com.g7.sdk.api.vo;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 车辆设备绑定  响应数据
 * @author liwenlang
 * @version 1.0.0
 * @date 2021/10/12 15:36
 */
public class DeviceBindResp {

    /** 设备基础信息 {@link GpsNoInfo}*/
    @JSONField(name = "gpsno_info")
    private GpsNoInfo gpsnoInfo;

    /** 操作结果，true为成功，false为失败*/
    @JSONField(name = "op_result")
    private Boolean opResult;

    /** 操作结果说明，失败则为失败说明*/
    @JSONField(name = "op_message")
    private String opMessage;

    /** 操作结果编码，成功为0，失败则为失败编码*/
    @JSONField(name = "op_code")
    private Integer opCode;

    public GpsNoInfo getGpsnoInfo() {
        return gpsnoInfo;
    }

    public DeviceBindResp setGpsnoInfo(GpsNoInfo gpsnoInfo) {
        this.gpsnoInfo = gpsnoInfo;
        return this;
    }

    public Boolean getOpResult() {
        return opResult;
    }

    public DeviceBindResp setOpResult(Boolean opResult) {
        this.opResult = opResult;
        return this;
    }

    public String getOpMessage() {
        return opMessage;
    }

    public DeviceBindResp setOpMessage(String opMessage) {
        this.opMessage = opMessage;
        return this;
    }

    public Integer getOpCode() {
        return opCode;
    }

    public DeviceBindResp setOpCode(Integer opCode) {
        this.opCode = opCode;
        return this;
    }
}
