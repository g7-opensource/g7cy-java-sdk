package cn.com.g7.sdk.api.vo;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 新建标注点 请求参数
 * @author liwenlang
 * @version 1.0.0
 * @date 2021/10/13 18:15
 */
public class MarkerCreatOrUpdateReq {

    /** id*/
    private String id;

    /** [必传] 唯一标注点名称*/
    private String name;

    /** [必传] 经纬度列表*/
    @JSONField(name = "latlngs")
    private String latLngs;

    /** [必传] 圆形区域半径，多边形设置为0*/
    private String radius;

    /** [必传] 区域类型；1圆形(使用中心点加半径处理；默认)，2多边形*/
    private String graphtype;

    /** [必传] 唯一编码*/
    private String code;

    /**  颜色*/
    private String color;

    /** 是否站点(0不是，1是)*/
    private String site;

    /**  备注*/
    private String remark;

    /** [必传] 更新用户id*/
    @JSONField(name = "updateuser")
    private String updateUser;

    public String getId() {
        return id;
    }

    public MarkerCreatOrUpdateReq setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public MarkerCreatOrUpdateReq setName(String name) {
        this.name = name;
        return this;
    }

    public String getLatLngs() {
        return latLngs;
    }

    public MarkerCreatOrUpdateReq setLatLngs(String latLngs) {
        this.latLngs = latLngs;
        return this;
    }

    public String getRadius() {
        return radius;
    }

    public MarkerCreatOrUpdateReq setRadius(String radius) {
        this.radius = radius;
        return this;
    }

    public String getGraphtype() {
        return graphtype;
    }

    public MarkerCreatOrUpdateReq setGraphtype(String graphtype) {
        this.graphtype = graphtype;
        return this;
    }

    public String getCode() {
        return code;
    }

    public MarkerCreatOrUpdateReq setCode(String code) {
        this.code = code;
        return this;
    }

    public String getColor() {
        return color;
    }

    public MarkerCreatOrUpdateReq setColor(String color) {
        this.color = color;
        return this;
    }

    public String getSite() {
        return site;
    }

    public MarkerCreatOrUpdateReq setSite(String site) {
        this.site = site;
        return this;
    }

    public String getRemark() {
        return remark;
    }

    public MarkerCreatOrUpdateReq setRemark(String remark) {
        this.remark = remark;
        return this;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public MarkerCreatOrUpdateReq setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
        return this;
    }
}
