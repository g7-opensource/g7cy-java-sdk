package cn.com.g7.sdk.kafka.bo;

import com.alibaba.fastjson.annotation.JSONField;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 定位数据
 * @author dengfuwei
 * @version 1.0.0
 * @date 2021/10/8 11:14 上午
 */
public class Location {

    /** 车牌号*/
    @JSONField(name = "plate_num")
    private String plateNum;

    /** 方向角。0-359，0表示正北方向*/
    private Integer course;

    /** 设备imei*/
    private String imei;

    /** 经度，WGS84坐标系*/
    private BigDecimal lng;

    /** 纬度，WGS84坐标系*/
    private BigDecimal lat;

    /** 速度，单位：km/h*/
    private Integer speed;

    /** 定位时间*/
    private Date time;

    /** 设备号*/
    private String gpsno;

    /** 高程/海拔，单位：米*/
    private BigDecimal altitude;

    /** 机构号*/
    private String orgcode;

    /** ACC状态：-1=无此数据,0=ACC关,1=ACC开*/
    private Integer acc;

    public String getPlateNum() {
        return plateNum;
    }

    public void setPlateNum(String plateNum) {
        this.plateNum = plateNum;
    }

    public Integer getCourse() {
        return course;
    }

    public void setCourse(Integer course) {
        this.course = course;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public BigDecimal getLng() {
        return lng;
    }

    public void setLng(BigDecimal lng) {
        this.lng = lng;
    }

    public BigDecimal getLat() {
        return lat;
    }

    public void setLat(BigDecimal lat) {
        this.lat = lat;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getGpsno() {
        return gpsno;
    }

    public void setGpsno(String gpsno) {
        this.gpsno = gpsno;
    }

    public BigDecimal getAltitude() {
        return altitude;
    }

    public void setAltitude(BigDecimal altitude) {
        this.altitude = altitude;
    }

    public String getOrgcode() {
        return orgcode;
    }

    public void setOrgcode(String orgcode) {
        this.orgcode = orgcode;
    }

    public Integer getAcc() {
        return acc;
    }

    public void setAcc(Integer acc) {
        this.acc = acc;
    }
}
