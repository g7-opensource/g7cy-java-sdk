package cn.com.g7.sdk.api.vo;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 设备基本信息
 * @author liwenlang
 * @version 1.0.0
 * @date 2021/10/12 15:34
 */
public class GpsNoInfo {

    /** 设备号*/
    private String gpsno;

    /** 机构号*/
    private String orgcode;

    /** 是否绑定*/
    @JSONField(name = "isbind")
    private String isBind;

    /** 产品线*/
    private String product;

    public String getGpsno() {
        return gpsno;
    }

    public GpsNoInfo setGpsno(String gpsno) {
        this.gpsno = gpsno;
        return this;
    }

    public String getOrgcode() {
        return orgcode;
    }

    public GpsNoInfo setOrgcode(String orgcode) {
        this.orgcode = orgcode;
        return this;
    }

    public String getIsBind() {
        return isBind;
    }

    public GpsNoInfo setIsBind(String isBind) {
        this.isBind = isBind;
        return this;
    }

    public String getProduct() {
        return product;
    }

    public GpsNoInfo setProduct(String product) {
        this.product = product;
        return this;
    }
}
