package cn.com.g7.sdk.api.vo;

import java.util.List;

/**
 * 查询子机构 响应数据
 * @author liwenlang
 * @version 1.0.0
 * @date 2021/10/12 17:48
 */
public class SubOrgansGetAllResp {

    /** 子机构列表*/
    private List<SubOrgan> subOrgans;

    /** 0:最后一页，1:还有下一页*/
    private Integer hasMore;

    /**分页标识符*/
    private String marker;

    public List<SubOrgan> getSubOrgans() {
        return subOrgans;
    }

    public SubOrgansGetAllResp setSubOrgans(List<SubOrgan> subOrgans) {
        this.subOrgans = subOrgans;
        return this;
    }

    public Integer getHasMore() {
        return hasMore;
    }

    public SubOrgansGetAllResp setHasMore(Integer hasMore) {
        this.hasMore = hasMore;
        return this;
    }

    public String getMarker() {
        return marker;
    }

    public SubOrgansGetAllResp setMarker(String marker) {
        this.marker = marker;
        return this;
    }
}
