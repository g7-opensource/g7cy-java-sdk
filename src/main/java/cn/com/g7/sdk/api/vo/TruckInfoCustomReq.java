package cn.com.g7.sdk.api.vo;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 查询车辆详情参数
 *查询车辆详情（有自定义字段），返回所有字段
 * @author liwenlang
 * @version 1.0.0
 * @date 2021/10/11 15:47
 */
public class TruckInfoCustomReq {

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

    /** [必传] 机构号，右匹配*/
    @JSONField(name = "orgcode_like")
    private String orgcodeLike;

    /** 是否获取自定义字段值,1是0否,默认为0*/
    @JSONField(name = "get_custom_fields")
    private String getCustomFields;

    public String getTruckIds() {
        return truckIds;
    }

    public TruckInfoCustomReq setTruckIds(String truckIds) {
        this.truckIds = truckIds;
        return this;
    }

    public String getOwnIds() {
        return ownIds;
    }

    public TruckInfoCustomReq setOwnIds(String ownIds) {
        this.ownIds = ownIds;
        return this;
    }

    public String getCarNums() {
        return carNums;
    }

    public TruckInfoCustomReq setCarNums(String carNums) {
        this.carNums = carNums;
        return this;
    }

    public String getGpsnos() {
        return gpsnos;
    }

    public TruckInfoCustomReq setGpsnos(String gpsnos) {
        this.gpsnos = gpsnos;
        return this;
    }

    public String getOrgcodeLike() {
        return orgcodeLike;
    }

    public TruckInfoCustomReq setOrgcodeLike(String orgcodeLike) {
        this.orgcodeLike = orgcodeLike;
        return this;
    }

    public String getGetCustomFields() {
        return getCustomFields;
    }

    public TruckInfoCustomReq setGetCustomFields(String getCustomFields) {
        this.getCustomFields = getCustomFields;
        return this;
    }
}
