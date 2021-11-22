package cn.com.g7.sdk.api.vo;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 增加车辆 响应数据
 * @author liwenlang
 * @version 1.0.0
 * @date 2021/10/12 14:05
 */
public class SelfTruckAddResp {

    /** 添加车牌号*/
    @JSONField(name = "carnum")
    private String carNum;

    /** 添加车辆的ID*/
    @JSONField(name = "truckid")
    private String truckId;

    /** 添加车辆的关系ID*/
    @JSONField(name = "ownid")
    private String ownId;

    /** 操作类型 add*/
    @JSONField(name = "optype")
    private String opType;

    /** 新增车辆操作结果，true为成功，false为失败*/
    @JSONField(name = "op_result")
    private Boolean opResult;

    /** 操作结果说明，失败则为失败说明*/
    @JSONField(name = "op_message")
    private String opMessage;

    /** 操作结果编码，成功为0，失败则为失败编码*/
    @JSONField(name = "op_code")
    private Integer opCode;

    public String getCarNum() {
        return carNum;
    }

    public SelfTruckAddResp setCarNum(String carNum) {
        this.carNum = carNum;
        return this;
    }

    public String getTruckId() {
        return truckId;
    }

    public SelfTruckAddResp setTruckId(String truckId) {
        this.truckId = truckId;
        return this;
    }

    public String getOwnId() {
        return ownId;
    }

    public SelfTruckAddResp setOwnId(String ownId) {
        this.ownId = ownId;
        return this;
    }

    public String getOpType() {
        return opType;
    }

    public SelfTruckAddResp setOpType(String opType) {
        this.opType = opType;
        return this;
    }

    public Boolean getOpResult() {
        return opResult;
    }

    public SelfTruckAddResp setOpResult(Boolean opResult) {
        this.opResult = opResult;
        return this;
    }

    public String getOpMessage() {
        return opMessage;
    }

    public SelfTruckAddResp setOpMessage(String opMessage) {
        this.opMessage = opMessage;
        return this;
    }

    public Integer getOpCode() {
        return opCode;
    }

    public SelfTruckAddResp setOpCode(Integer opCode) {
        this.opCode = opCode;
        return this;
    }
}
