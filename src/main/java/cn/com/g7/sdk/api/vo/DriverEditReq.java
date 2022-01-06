package cn.com.g7.sdk.api.vo;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 编辑司机信息 请求参数
 * @author liwenlang
 * @version 1.0.0
 * @date 2021/10/12 16:52
 */
public class DriverEditReq {

    /** [必传] 司机信息id*/
    @JSONField(name = "driver_id")
    private String driverId;

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

    public String getDriverId() {
        return driverId;
    }

    public DriverEditReq setDriverId(String driverId) {
        this.driverId = driverId;
        return this;
    }

    public String getDriverName() {
        return driverName;
    }

    public DriverEditReq setDriverName(String driverName) {
        this.driverName = driverName;
        return this;
    }

    public String getOrgcode() {
        return orgcode;
    }

    public DriverEditReq setOrgcode(String orgcode) {
        this.orgcode = orgcode;
        return this;
    }

    public String getIdcard() {
        return idcard;
    }

    public DriverEditReq setIdcard(String idcard) {
        this.idcard = idcard;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public DriverEditReq setPhone(String phone) {
        this.phone = phone;
        return this;
    }
}
