package cn.com.g7.sdk.api.vo;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 查询所有子机构  机构信息
 * @author liwenlang
 * @version 1.0.0
 * @date 2021/10/12 17:43
 */
public class SubOrgan {

    /** 机构号*/
    private String orgcode;

    /**机构名*/
    private String name;

    /** 机构联系人*/
    private String contact;

    /** 机构联系号码*/
    private String tel;

    /**机构地址*/
    private String address;

    /** 备注*/
    private String remark;

    /** 父级机构号*/
    private String parentCode;

    /** 机构创建时间 示例：2015-01-01 01:01:01.010101 */
    @JSONField(name = "createtime")
    private String createTime;

    public String getOrgcode() {
        return orgcode;
    }

    public SubOrgan setOrgcode(String orgcode) {
        this.orgcode = orgcode;
        return this;
    }

    public String getName() {
        return name;
    }

    public SubOrgan setName(String name) {
        this.name = name;
        return this;
    }

    public String getContact() {
        return contact;
    }

    public SubOrgan setContact(String contact) {
        this.contact = contact;
        return this;
    }

    public String getTel() {
        return tel;
    }

    public SubOrgan setTel(String tel) {
        this.tel = tel;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public SubOrgan setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getRemark() {
        return remark;
    }

    public SubOrgan setRemark(String remark) {
        this.remark = remark;
        return this;
    }

    public String getParentCode() {
        return parentCode;
    }

    public SubOrgan setParentCode(String parentCode) {
        this.parentCode = parentCode;
        return this;
    }

    public String getCreateTime() {
        return createTime;
    }

    public SubOrgan setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
}
