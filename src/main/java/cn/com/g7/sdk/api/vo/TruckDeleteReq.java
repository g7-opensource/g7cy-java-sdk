package cn.com.g7.sdk.api.vo;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 删除车辆
 * 删除车辆，通过车牌号和绑定关系删除车辆
 * @author liwenlang
 * @version 1.0.0
 * @date 2021/10/12 14:13
 */
public class TruckDeleteReq {

    /** 车辆关系ID，多个请用逗号隔开，最多100个*/
    @JSONField(name = "own_ids")
    private String ownIds;

    /**[必传] 机构号*/
    @JSONField(name = "orgcode_like")
    private String orgcodeLike;

    public String getOwnIds() {
        return ownIds;
    }

    public TruckDeleteReq setOwnIds(String ownIds) {
        this.ownIds = ownIds;
        return this;
    }

    public String getOrgcodeLike() {
        return orgcodeLike;
    }

    public TruckDeleteReq setOrgcodeLike(String orgcodeLike) {
        this.orgcodeLike = orgcodeLike;
        return this;
    }
}
