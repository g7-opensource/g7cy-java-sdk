package cn.com.g7.sdk.api.vo;

import java.util.List;

/**
 * 查询机构的角色 响应参数
 * @author liwenlang
 * @version 1.0.0
 * @date 2021/10/12 18:47
 */
public class OrgRoleGetAllResp {

    /** 角色列表*/
    private List<OrgRole> roles;

    /** 0:最后一页，1:还有下一页*/
    private Integer hasMore;

    /**分页标识符*/
    private String marker;

    public List<OrgRole> getRoles() {
        return roles;
    }

    public OrgRoleGetAllResp setRoles(List<OrgRole> roles) {
        this.roles = roles;
        return this;
    }

    public Integer getHasMore() {
        return hasMore;
    }

    public OrgRoleGetAllResp setHasMore(Integer hasMore) {
        this.hasMore = hasMore;
        return this;
    }

    public String getMarker() {
        return marker;
    }

    public OrgRoleGetAllResp setMarker(String marker) {
        this.marker = marker;
        return this;
    }
}
