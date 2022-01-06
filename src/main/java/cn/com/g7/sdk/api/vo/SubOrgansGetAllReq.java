package cn.com.g7.sdk.api.vo;

/**
 * 查询子机构 参数
 * @author liwenlang
 * @version 1.0.0
 * @date 2021/10/12 17:42
 */
public class SubOrgansGetAllReq {

    /** [必传]父级机构号*/
    private String parent;

    /** 分页标识符*/
    private String marker;

    /** 分页数，最大100，默认10*/
    private Integer limit = 10;

    public String getParent() {
        return parent;
    }

    public SubOrgansGetAllReq setParent(String parent) {
        this.parent = parent;
        return this;
    }

    public String getMarker() {
        return marker;
    }

    public SubOrgansGetAllReq setMarker(String marker) {
        this.marker = marker;
        return this;
    }

    public Integer getLimit() {
        return limit;
    }

    public SubOrgansGetAllReq setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
}