package cn.com.g7.sdk.api.vo;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 根据orgcode获取机构信息 响应数据
 * @author liwenlang
 * @version 1.0.0
 * @date 2021/10/12 18:15
 */
public class OrgGetByCodeResp {

    /** ID*/
    private String id;

    /** 机构编码 */
    @JSONField(name = "orgroot")
    private String orgRoot;

    /** 机构编码*/
    private String orgcode;

    /** 名称*/
    private String name;

    public String getId() {
        return id;
    }

    public OrgGetByCodeResp setId(String id) {
        this.id = id;
        return this;
    }

    public String getOrgRoot() {
        return orgRoot;
    }

    public OrgGetByCodeResp setOrgRoot(String orgRoot) {
        this.orgRoot = orgRoot;
        return this;
    }

    public String getOrgcode() {
        return orgcode;
    }

    public OrgGetByCodeResp setOrgcode(String orgcode) {
        this.orgcode = orgcode;
        return this;
    }

    public String getName() {
        return name;
    }

    public OrgGetByCodeResp setName(String name) {
        this.name = name;
        return this;
    }
}
