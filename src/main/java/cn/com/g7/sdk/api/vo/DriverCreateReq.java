package cn.com.g7.sdk.api.vo;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 新建司机 参数
 * @author liwenlang
 * @version 1.0.0
 * @date 2021/10/12 16:26
 */
public class DriverCreateReq {

    /** [必传] 司机姓名*/
    @JSONField(name = "driver_name")
    private String driverName;

    /** [必传] 司机所属机构号*/
    private String orgcode;

    /** 身份证号*/
    @JSONField(name = "id_card")
    private String idcard;

    /** 电话号码*/
    private String phone;

    public String getDriverName() {
        return driverName;
    }

    public DriverCreateReq setDriverName(String driverName) {
        this.driverName = driverName;
        return this;
    }

    public String getOrgcode() {
        return orgcode;
    }

    public DriverCreateReq setOrgcode(String orgcode) {
        this.orgcode = orgcode;
        return this;
    }

    public String getIdcard() {
        return idcard;
    }

    public DriverCreateReq setIdcard(String idcard) {
        this.idcard = idcard;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public DriverCreateReq setPhone(String phone) {
        this.phone = phone;
        return this;
    }
}
