package cn.com.g7.sdk.api.vo;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 新建司机 响应数据
 * @author liwenlang
 * @version 1.0.0
 * @date 2021/10/12 16:32
 */
public class DriverCreateResp {

    /** 主键*/
    @JSONField(name = "driverid")
    private String driverId;

    /** OWNID */
    @JSONField(name = "ownid")
    private String ownId;

    /** 操作结果，true为成功，false为失败*/
    @JSONField(name = "op_result")
    private Boolean opResult;

    /** 操作结果说明，失败则为失败说明*/
    @JSONField(name = "op_message")
    private String opMessage;

    /** 操作结果编码，成功为0，失败则为失败编码*/
    @JSONField(name = "op_code")
    private Integer opCode;

    public String getDriverId() {
        return driverId;
    }

    public DriverCreateResp setDriverId(String driverId) {
        this.driverId = driverId;
        return this;
    }

    public String getOwnId() {
        return ownId;
    }

    public DriverCreateResp setOwnId(String ownId) {
        this.ownId = ownId;
        return this;
    }

    public Boolean getOpResult() {
        return opResult;
    }

    public DriverCreateResp setOpResult(Boolean opResult) {
        this.opResult = opResult;
        return this;
    }

    public String getOpMessage() {
        return opMessage;
    }

    public DriverCreateResp setOpMessage(String opMessage) {
        this.opMessage = opMessage;
        return this;
    }

    public Integer getOpCode() {
        return opCode;
    }

    public DriverCreateResp setOpCode(Integer opCode) {
        this.opCode = opCode;
        return this;
    }
}
