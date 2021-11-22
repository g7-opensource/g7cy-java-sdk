package cn.com.g7.sdk.api.vo;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 查询车辆列表 响应信息
 * @author liwenlang
 * @version 1.0.0
 * @date 2021/10/11 14:52
 */
public class TruckListInfoResp {

    /** 主键ID*/
    @JSONField(name = "truckid")
    private String truckId;

    /** 车牌号*/
    @JSONField(name = "carnum")
    private String carNum;

    /** 设备号*/
    private String gpsno;

    /** OWN表主键ID*/
    @JSONField(name = "ownid")
    private String ownId;

    /** 所属机构*/
    private String orgcode;

    /** 来源组织机构号*/
    @JSONField(name = "fromorgcode")
    private String fromOrgcode;

    /** 所属类型,1自建，2内部共享，3外部共享，4外协车*/
    @JSONField(name = "fromtype")
    private String fromType;

    /** 是否删除*/
    private String deleted;

    /** 主驾司机ID*/
    @JSONField(name = "maindriver_id")
    private String mainDriverId;

    /** 副驾司机ID*/
    @JSONField(name = "depdriver_id")
    private String depDriverId;

    /** 更新时间*/
    @JSONField(name = "updatetime")
    private String updateTime;

    /** 车型ID*/
    @JSONField(name = "truckmodelid")
    private String truckModelId;

    public String getTruckId() {
        return truckId;
    }

    public TruckListInfoResp setTruckId(String truckId) {
        this.truckId = truckId;
        return this;
    }

    public String getCarNum() {
        return carNum;
    }

    public TruckListInfoResp setCarNum(String carNum) {
        this.carNum = carNum;
        return this;
    }

    public String getGpsno() {
        return gpsno;
    }

    public TruckListInfoResp setGpsno(String gpsno) {
        this.gpsno = gpsno;
        return this;
    }

    public String getOwnId() {
        return ownId;
    }

    public TruckListInfoResp setOwnId(String ownId) {
        this.ownId = ownId;
        return this;
    }

    public String getOrgcode() {
        return orgcode;
    }

    public TruckListInfoResp setOrgcode(String orgcode) {
        this.orgcode = orgcode;
        return this;
    }

    public String getFromOrgcode() {
        return fromOrgcode;
    }

    public TruckListInfoResp setFromOrgcode(String fromOrgcode) {
        this.fromOrgcode = fromOrgcode;
        return this;
    }

    public String getFromType() {
        return fromType;
    }

    public TruckListInfoResp setFromType(String fromType) {
        this.fromType = fromType;
        return this;
    }

    public String getDeleted() {
        return deleted;
    }

    public TruckListInfoResp setDeleted(String deleted) {
        this.deleted = deleted;
        return this;
    }

    public String getMainDriverId() {
        return mainDriverId;
    }

    public TruckListInfoResp setMainDriverId(String mainDriverId) {
        this.mainDriverId = mainDriverId;
        return this;
    }

    public String getDepDriverId() {
        return depDriverId;
    }

    public TruckListInfoResp setDepDriverId(String depDriverId) {
        this.depDriverId = depDriverId;
        return this;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public TruckListInfoResp setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    public String getTruckModelId() {
        return truckModelId;
    }

    public TruckListInfoResp setTruckModelId(String truckModelId) {
        this.truckModelId = truckModelId;
        return this;
    }
}
