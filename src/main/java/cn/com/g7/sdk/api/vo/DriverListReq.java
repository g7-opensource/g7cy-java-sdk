package cn.com.g7.sdk.api.vo;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 查询司机列表信息
 * @author liwenlang
 * @version 1.0.0
 * @date 2021/10/12 15:56
 */
public class DriverListReq {

    /** [必传] 机构号，右匹配*/
    @JSONField(name = "orgcode_like")
    private String orgcodeLike;

    /** 司机最后更新时间>=updatetime 例：2021-01-01 00:00:00*/
    @JSONField(name = "updatetime")
    private String updateTime;

    /** 0:未删除, 1:已删除, 2:全部， 默认:0 {@link cn.com.g7.sdk.api.enums.DataStatusEnum}*/
    private Integer deleted;

    /**页码，默认1*/
    @JSONField(name = "page_no")
    private Integer pageNo;

    /**分页量，默认100*/
    @JSONField(name = "page_size")
    private Integer pageSize;

    /**司机名称，全匹配。*/
    @JSONField(name = "driver_name")
    private String driverName;

    public String getOrgcodeLike() {
        return orgcodeLike;
    }

    public DriverListReq setOrgcodeLike(String orgcodeLike) {
        this.orgcodeLike = orgcodeLike;
        return this;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public DriverListReq setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public DriverListReq setDeleted(Integer deleted) {
        this.deleted = deleted;
        return this;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public DriverListReq setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public DriverListReq setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public String getDriverName() {
        return driverName;
    }

    public DriverListReq setDriverName(String driverName) {
        this.driverName = driverName;
        return this;
    }
}
