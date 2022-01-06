package cn.com.g7.sdk.api.vo;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 删除司机 参数
 * @author liwenlang
 * @version 1.0.0
 * @date 2021/10/12 16:39
 */
public class DriverDeleteReq {

    /** 司机ID，多个ID用,隔开，最多100个*/
    @JSONField(name = "driver_ids")
    private String driverIds;

    /** 机构号，右匹配*/
    @JSONField(name = "orgcode_like")
    private String orgcodeLike;

    public String getDriverIds() {
        return driverIds;
    }

    public DriverDeleteReq setDriverIds(String driverIds) {
        this.driverIds = driverIds;
        return this;
    }

    public String getOrgcodeLike() {
        return orgcodeLike;
    }

    public DriverDeleteReq setOrgcodeLike(String orgcodeLike) {
        this.orgcodeLike = orgcodeLike;
        return this;
    }
}
