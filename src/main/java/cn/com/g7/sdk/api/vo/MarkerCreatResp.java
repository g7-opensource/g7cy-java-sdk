package cn.com.g7.sdk.api.vo;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 新建标注点 响应数据
 * @author liwenlang
 * @version 1.0.0
 * @date 2021/10/13 18:20
 */
public class MarkerCreatResp {

    /** 主键,标注ID*/
    private String id;

    /** 标注名称*/
    private String name;

    /** 顶级机构号*/
    @JSONField(name = "orgroot")
    private String orgRoot;

    /** 机构编码*/
    private String orgcode;

    /** 标注中心点所在地址*/
    private String address;

    /** 中心点经度(默认火星坐标)*/
    private String lng;

    /** 中心点纬度(默认火星坐标)*/
    private String lat;

    public String getId() {
        return id;
    }

    public MarkerCreatResp setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public MarkerCreatResp setName(String name) {
        this.name = name;
        return this;
    }

    public String getOrgRoot() {
        return orgRoot;
    }

    public MarkerCreatResp setOrgRoot(String orgRoot) {
        this.orgRoot = orgRoot;
        return this;
    }

    public String getOrgcode() {
        return orgcode;
    }

    public MarkerCreatResp setOrgcode(String orgcode) {
        this.orgcode = orgcode;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public MarkerCreatResp setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getLng() {
        return lng;
    }

    public MarkerCreatResp setLng(String lng) {
        this.lng = lng;
        return this;
    }

    public String getLat() {
        return lat;
    }

    public MarkerCreatResp setLat(String lat) {
        this.lat = lat;
        return this;
    }
}
