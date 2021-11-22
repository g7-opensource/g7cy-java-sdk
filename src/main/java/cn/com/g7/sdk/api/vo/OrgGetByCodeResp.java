package cn.com.g7.sdk.api.vo;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 根据orgcode获取机构信息 响应数据
 *  "201IHA":{
 *             "remark":"",
 *             "orgcerti_status":0,
 *             "nodenum":0,
 *             "parentid":"0",
 *             "markable":0,
 *             "loginlogoid":"D229076A755980A106CD798A8353C67A",
 *             "contact":"漯河双汇物流投资有限公司1",
 *             "tel":"13721369713",
 *             "id":"6EB68BDC7D8957B113E710FBCF1F6A16",
 *             "free":14,
 *             "createtime":"2017-11-24 16:57:43",
 *             "address":"1",
 *             "orgcode":"201IHA",
 *             "gatewaylogoid":"A90DF7C699EF7252A0C33EB0E3678F98",
 *             "gatewaybackgroundid":"847247DBBB4F525541C92784209C19BF",
 *             "createuser":"7FC61A6C6A6A4E608304F0C1BAB26BB1",
 *             "authcode":"55193",
 *             "createorgcode":"200000",
 *             "depth":0,
 *             "name":"漯河双汇物流投资有限公司1",
 *             "customerid":"",
 *             "orgroot":"201IHA",
 *             "fullname":"",
 *             "pids":"",
 *             "status":0
 *         }
 *  todo 接口响应数据结构与开放平台不一致
 * @author liwenlang
 * @version 1.0.0
 * @date 2021/10/12 18:15
 */
public class OrgGetByCodeResp {

    /** ID*/
    private String id;

    /** 机构编码 todo 父级机构编码*/
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
