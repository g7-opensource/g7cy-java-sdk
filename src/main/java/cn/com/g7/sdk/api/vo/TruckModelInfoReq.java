package cn.com.g7.sdk.api.vo;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 车辆车型详情V1.0 请求参数
 * @author liwenlang
 * @version 1.0.0
 * @date 2021/10/11 16:37
 */
public class TruckModelInfoReq {

    /** [必传] 车辆ID*/
    @JSONField(name = "truck_id")
    private String truckId;

    /** [必传] 机构号 左匹配*/
    @JSONField(name = "orgcode_like")
    private String orgcodeLike;

    public String getTruckId() {
        return truckId;
    }

    public TruckModelInfoReq setTruckId(String truckId) {
        this.truckId = truckId;
        return this;
    }

    public String getOrgcodeLike() {
        return orgcodeLike;
    }

    public TruckModelInfoReq setOrgcodeLike(String orgcodeLike) {
        this.orgcodeLike = orgcodeLike;
        return this;
    }
}
