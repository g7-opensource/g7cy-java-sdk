package cn.com.g7.sdk.api.vo;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 查询车辆列表 请求参数
 * @author liwenlang
 * @version 1.0.0
 * @date 2021/10/11 14:21
 */
public class TruckListReq {

    /**  车牌号模糊匹配，左右匹配*/
    @JSONField(name = "carnum_like")
    private String carNumLike;

    /** 是否绑定设备，0未绑定，1已绑定，不传则不区分*/
    @JSONField(name = "isbind")
    private Integer isBind;

    /** [必传] 机构号，右匹配*/
    @JSONField(name = "orgcode_like")
    private String orgcodeLike;

    /** 更新时间，大于等于*/
    @JSONField(name = "updatetime_ge")
    private String updateTimeGe;

    /** 根据删除状态查询数据，0->未删除，1->已删除，2->所有*/
    private Integer deleted;

    /** 页码*/
    @JSONField(name = "page_no")
    private Integer pageNo;

    /** 每页数量*/
    @JSONField(name = "page_size")
    private Integer pageSize;

    public String getCarNumLike() {
        return carNumLike;
    }

    public TruckListReq setCarNumLike(String carNumLike) {
        this.carNumLike = carNumLike;
        return this;
    }

    public Integer getIsBind() {
        return isBind;
    }

    public TruckListReq setIsBind(Integer isBind) {
        this.isBind = isBind;
        return this;
    }

    public String getOrgcodeLike() {
        return orgcodeLike;
    }

    public TruckListReq setOrgcodeLike(String orgcodeLike) {
        this.orgcodeLike = orgcodeLike;
        return this;
    }

    public String getUpdateTimeGe() {
        return updateTimeGe;
    }

    public TruckListReq setUpdateTimeGe(String updateTimeGe) {
        this.updateTimeGe = updateTimeGe;
        return this;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public TruckListReq setDeleted(Integer deleted) {
        this.deleted = deleted;
        return this;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public TruckListReq setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public TruckListReq setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
}
