package cn.com.g7.sdk.api.vo;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 车辆状态查询 -->定位信息
 * @author liwenlang
 * @version 1.0.0
 * @date 2021/10/11 19:44
 */
public class TruckCurrentInfoLoc {
    /** 经度(GCJ02坐标系) */
    private String lng;

    /** 纬度(GCJ02坐标系) */
    private String lat;

    /** 解析地址(入参addr_required为True，返回才有值)*/
    private String address;

    /** 速度(单位：km/h)*/
    private Integer speed;

    /** 方向角(°)，360度，正北为0 */
    private Integer course;

    /** gps定位时间(格式为yyyy-MM-dd HH:mm:ss，时区为GMT+8， 例如：2017-01-01 12:00:00') */
    @JSONField(name = "gps_time")
    private String gpsTime;

    /** 定位类型(0:gps定位，1：基站定位)*/
    @JSONField(name = "location_type")
    private Integer locationType;

    /** 高程，单位米*/
    private Integer altitude;

    public String getLng() {
        return lng;
    }

    public TruckCurrentInfoLoc setLng(String lng) {
        this.lng = lng;
        return this;
    }

    public String getLat() {
        return lat;
    }

    public TruckCurrentInfoLoc setLat(String lat) {
        this.lat = lat;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public TruckCurrentInfoLoc setAddress(String address) {
        this.address = address;
        return this;
    }

    public Integer getSpeed() {
        return speed;
    }

    public TruckCurrentInfoLoc setSpeed(Integer speed) {
        this.speed = speed;
        return this;
    }

    public Integer getCourse() {
        return course;
    }

    public TruckCurrentInfoLoc setCourse(Integer course) {
        this.course = course;
        return this;
    }

    public String getGpsTime() {
        return gpsTime;
    }

    public TruckCurrentInfoLoc setGpsTime(String gpsTime) {
        this.gpsTime = gpsTime;
        return this;
    }

    public Integer getLocationType() {
        return locationType;
    }

    public TruckCurrentInfoLoc setLocationType(Integer locationType) {
        this.locationType = locationType;
        return this;
    }

    public Integer getAltitude() {
        return altitude;
    }

    public TruckCurrentInfoLoc setAltitude(Integer altitude) {
        this.altitude = altitude;
        return this;
    }
}
