package cn.com.g7.sdk.api.vo;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 查询车辆详情  -->车辆信息
 * @author liwenlang
 * @version 1.0.0
 * @date 2021/10/11 16:00
 */
public class TruckInfoResp {

    /** 主键ID*/
    @JSONField(name = "truckid")
    private String truckId;

    /** 车牌号*/
    @JSONField(name = "carnum")
    private	String carNum;

    /** 设备号*/
    private	Integer gpsno;

    /** OWN表主键ID*/
    @JSONField(name = "ownid")
    private	String ownId;

    /** 所属机构*/
    private	String orgcode;

    /** 来源组织机构号*/
    @JSONField(name = "fromorgcode")
    private	String fromOrgcode;

    /** 所属类型,1自建，2内部共享，3外部共享，4外协车*/
    @JSONField(name = "fromtype")
    private	Integer fromType;

    /** 车辆别名*/
    @JSONField(name = "aliasname")
    private	String aliasName;

    /** 主驾司机ID*/
    @JSONField(name = "maindriver_id")
    private	String mainDriverId;

    /** 副驾司机ID*/
    @JSONField(name = "depdriver_id")
    private	String depDriverId;

    /** 是否绑定ETC卡 0：未绑定 1：已绑定*/
    @JSONField(name = "lockstatus")
    private	Integer lockStatus;

    /** 车型ID*/
    @JSONField(name = "truckmodelid")
    private	String truckModelId;

    /** 更新时间 yyyy-MM-dd HH:mm:s  */
    @JSONField(name = "updatetime")
    private	String updateTime;

    /** 是否删除，1:删除，0:未删除*/
    private	Integer	deleted;

    /** 是车头还是挂车（1为车头2为挂车）*/
    @JSONField(name = "isheadstock")
    private	Integer	isHeadStock;

    /** 车辆所有人  */
    private	String owner;

    /** truck_ext的主键ID */
    @JSONField(name = "truck_ext_id")
    private	String truckExtId;

    /** 是否来自车厂数据,1:是，0:否*/
    @JSONField(name = "isfactory")
    private	Integer	isFactory;

    public String getTruckId() {
        return truckId;
    }

    public TruckInfoResp setTruckId(String truckId) {
        this.truckId = truckId;
        return this;
    }

    public String getCarNum() {
        return carNum;
    }

    public TruckInfoResp setCarNum(String carNum) {
        this.carNum = carNum;
        return this;
    }

    public Integer getGpsno() {
        return gpsno;
    }

    public TruckInfoResp setGpsno(Integer gpsno) {
        this.gpsno = gpsno;
        return this;
    }

    public String getOwnId() {
        return ownId;
    }

    public TruckInfoResp setOwnId(String ownId) {
        this.ownId = ownId;
        return this;
    }

    public String getOrgcode() {
        return orgcode;
    }

    public TruckInfoResp setOrgcode(String orgcode) {
        this.orgcode = orgcode;
        return this;
    }

    public String getFromOrgcode() {
        return fromOrgcode;
    }

    public TruckInfoResp setFromOrgcode(String fromOrgcode) {
        this.fromOrgcode = fromOrgcode;
        return this;
    }

    public Integer getFromType() {
        return fromType;
    }

    public TruckInfoResp setFromType(Integer fromType) {
        this.fromType = fromType;
        return this;
    }

    public String getAliasName() {
        return aliasName;
    }

    public TruckInfoResp setAliasName(String aliasName) {
        this.aliasName = aliasName;
        return this;
    }

    public String getMainDriverId() {
        return mainDriverId;
    }

    public TruckInfoResp setMainDriverId(String mainDriverId) {
        this.mainDriverId = mainDriverId;
        return this;
    }

    public String getDepDriverId() {
        return depDriverId;
    }

    public TruckInfoResp setDepDriverId(String depDriverId) {
        this.depDriverId = depDriverId;
        return this;
    }

    public Integer getLockStatus() {
        return lockStatus;
    }

    public TruckInfoResp setLockStatus(Integer lockStatus) {
        this.lockStatus = lockStatus;
        return this;
    }

    public String getTruckModelId() {
        return truckModelId;
    }

    public TruckInfoResp setTruckModelId(String truckModelId) {
        this.truckModelId = truckModelId;
        return this;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public TruckInfoResp setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public TruckInfoResp setDeleted(Integer deleted) {
        this.deleted = deleted;
        return this;
    }

    public Integer getIsHeadStock() {
        return isHeadStock;
    }

    public TruckInfoResp setIsHeadStock(Integer isHeadStock) {
        this.isHeadStock = isHeadStock;
        return this;
    }

    public String getOwner() {
        return owner;
    }

    public TruckInfoResp setOwner(String owner) {
        this.owner = owner;
        return this;
    }

    public String getTruckExtId() {
        return truckExtId;
    }

    public TruckInfoResp setTruckExtId(String truckExtId) {
        this.truckExtId = truckExtId;
        return this;
    }

    public Integer getIsFactory() {
        return isFactory;
    }

    public TruckInfoResp setIsFactory(Integer isFactory) {
        this.isFactory = isFactory;
        return this;
    }
}
