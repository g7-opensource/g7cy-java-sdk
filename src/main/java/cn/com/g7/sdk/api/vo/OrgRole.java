package cn.com.g7.sdk.api.vo;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 机构角色信息
 * @author liwenlang
 * @version 1.0.0
 * @date 2021/10/12 18:44
 */
public class OrgRole {

    /** 角色id*/
    private String id;

    /** 角色所属机构号*/
    private String orgcode;

    /** 角色名称*/
    private String name;

    /** 1:管理员角色,0:普通角色*/
    private String isManager;

    /** 角色创建时间 2015-02-13 02:19:23.534686*/
    @JSONField(name = "createtime")
    private String createTime;

    public String getId() {
        return id;
    }

    public OrgRole setId(String id) {
        this.id = id;
        return this;
    }

    public String getOrgcode() {
        return orgcode;
    }

    public OrgRole setOrgcode(String orgcode) {
        this.orgcode = orgcode;
        return this;
    }

    public String getName() {
        return name;
    }

    public OrgRole setName(String name) {
        this.name = name;
        return this;
    }

    public String getIsManager() {
        return isManager;
    }

    public OrgRole setIsManager(String isManager) {
        this.isManager = isManager;
        return this;
    }

    public String getCreateTime() {
        return createTime;
    }

    public OrgRole setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
}
