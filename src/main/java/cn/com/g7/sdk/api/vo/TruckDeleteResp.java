package cn.com.g7.sdk.api.vo;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 删除车辆 响应数据
 * @author liwenlang
 * @version 1.0.0
 * @date 2021/10/12 14:05
 */
public class TruckDeleteResp {

    /** 车牌号*/
    @JSONField(name = "carnum")
    private String carNum;

    /** 主键ID*/
    @JSONField(name = "truckid")
    private String truckId;

    /** 添加车辆的关系ID*/
    @JSONField(name = "ownid")
    private String ownId;

    /** 所属类型,1自建，2内部共享，3外部共享，4外协车*/
    @JSONField(name = "fromtype")
    private String fromType;

    /** 操作结果，true为成功，false为失败*/
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

    public TruckDeleteResp setCarNum(String carNum) {
        this.carNum = carNum;
        return this;
    }

    public String getTruckId() {
        return truckId;
    }

    public TruckDeleteResp setTruckId(String truckId) {
        this.truckId = truckId;
        return this;
    }

    public String getOwnId() {
        return ownId;
    }

    public TruckDeleteResp setOwnId(String ownId) {
        this.ownId = ownId;
        return this;
    }

    public String getFromType() {
        return fromType;
    }

    public TruckDeleteResp setFromType(String fromType) {
        this.fromType = fromType;
        return this;
    }

    public Boolean getOpResult() {
        return opResult;
    }

    public TruckDeleteResp setOpResult(Boolean opResult) {
        this.opResult = opResult;
        return this;
    }

    public String getOpMessage() {
        return opMessage;
    }

    public TruckDeleteResp setOpMessage(String opMessage) {
        this.opMessage = opMessage;
        return this;
    }

    public Integer getOpCode() {
        return opCode;
    }

    public TruckDeleteResp setOpCode(Integer opCode) {
        this.opCode = opCode;
        return this;
    }
}
