package cn.com.g7.sdk.api.vo;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 查询车辆
 * 查询车辆详情，可以通过车牌号和绑定关系的设备号查询车辆详情
 * @author liwenlang
 * @version 1.0.0
 * @date 2021/10/11 15:47
 */
public class TruckInfoReq {

    /** 车辆ID，多个ID用逗号隔开，最多100个 (车辆ID、关系ID、车牌号、设备号4种参数方式必选一种，如果都填写，取出数据则需同时满足所有条件)*/
    @JSONField(name = "truck_ids")
    private String truckIds;

    /** 关系ID，多个ID用逗号隔开，最多100个 (车辆ID、关系ID、车牌号、设备号4种参数方式必选一种，如果都填写，取出数据则需同时满足所有条件)*/
    @JSONField(name = "own_ids")
    private String ownIds;

    /** 车牌号，多个车牌用逗号隔开，最多100个 (车辆ID、关系ID、车牌号、设备号4种参数方式必选一种，如果都填写，取出数据则需同时满足所有条件)*/
    @JSONField(name = "carnums")
    private String carNums;

    /** 设备号，多个设备用逗号隔开，最多100个 (车辆ID、关系ID、车牌号、设备号4种参数方式必选一种，如果都填写，取出数据则需同时满足所有条件)*/
    private String gpsnos;

    /** 机构号，右匹配*/
    @JSONField(name = "orgcode_like")
    private String orgcodeLike;

    public String getTruckIds() {
        return truckIds;
    }

    public TruckInfoReq setTruckIds(String truckIds) {
        this.truckIds = truckIds;
        return this;
    }

    public String getOwnIds() {
        return ownIds;
    }

    public TruckInfoReq setOwnIds(String ownIds) {
        this.ownIds = ownIds;
        return this;
    }

    public String getCarNums() {
        return carNums;
    }

    public TruckInfoReq setCarNums(String carNums) {
        this.carNums = carNums;
        return this;
    }

    public String getGpsnos() {
        return gpsnos;
    }

    public TruckInfoReq setGpsnos(String gpsnos) {
        this.gpsnos = gpsnos;
        return this;
    }

    public String getOrgcodeLike() {
        return orgcodeLike;
    }

    public TruckInfoReq setOrgcodeLike(String orgcodeLike) {
        this.orgcodeLike = orgcodeLike;
        return this;
    }
}
