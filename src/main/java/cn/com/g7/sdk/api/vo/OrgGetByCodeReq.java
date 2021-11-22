package cn.com.g7.sdk.api.vo;

/**
 * 根据orgcode获取机构信息 参数
 * @author liwenlang
 * @version 1.0.0
 * @date 2021/10/12 18:13
 */
public class OrgGetByCodeReq {

    /** 机构编码，多个,号隔开*/
    private String orgcode;

    public String getOrgcode() {
        return orgcode;
    }

    public OrgGetByCodeReq setOrgcode(String orgcode) {
        this.orgcode = orgcode;
        return this;
    }
}
