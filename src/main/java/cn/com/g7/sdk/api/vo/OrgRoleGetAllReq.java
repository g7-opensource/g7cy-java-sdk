package cn.com.g7.sdk.api.vo;

/**
 * 查询机构的角色 参数
 * @author liwenlang
 * @version 1.0.0
 * @date 2021/10/12 18:41
 */
public class OrgRoleGetAllReq {

    /** [必传]机构号*/
    private String orgcode;

    /** 分页标识符*/
    private String marker;

    /** 分页数，最大100，默认10*/
    private Integer limit;

    public String getOrgcode() {
        return orgcode;
    }

    public OrgRoleGetAllReq setOrgcode(String orgcode) {
        this.orgcode = orgcode;
        return this;
    }

    public String getMarker() {
        return marker;
    }

    public OrgRoleGetAllReq setMarker(String marker) {
        this.marker = marker;
        return this;
    }

    public Integer getLimit() {
        return limit;
    }

    public OrgRoleGetAllReq setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
}
