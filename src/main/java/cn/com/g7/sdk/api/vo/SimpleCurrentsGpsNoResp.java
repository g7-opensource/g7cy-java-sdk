package cn.com.g7.sdk.api.vo;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 设备位置和状态查询 响应参数
 * @author liwenlang
 * @version 1.0.0
 * @date 2021/10/11 19:26
 */
public class SimpleCurrentsGpsNoResp {

     /** gps设备号 */
    private String gpsno;
 
    /** 经度(坐标系默认GCJ-02) */
    private String lng;
 
    /** 纬度(坐标系默认GCJ-02) */
    private String lat;
 
    /** 方向角(0-360) */
    private Integer course;
 
    /** 最后通讯时间(格式为yyyy-MM-dd HH:mm:ss，时区为GMT+8，例如：2015-01-01 12:00:00) */
    private String time;
 
    /** 最后定位时间(格式为yyyy-MM-dd HH:mm:ss，时区为GMT+8，例如：2015-01-01 12:00:00) */
    @JSONField(name = "gps_time")
    private String gpsTime;
 
    /** 状态，同G7系统全图监控设备状态(G7自定义状态，0=无法定位（设备没有上报过数据）；1=信号中断；2=未定位；3=车辆静止；4=车辆运动中; 6=未启用) */
    private Integer status;
 
    /** 高程，单位米 */
    private Integer altitude;
 
    /** 速度 */
    private Integer speed;

    public String getGpsno() {
        return gpsno;
    }

    public SimpleCurrentsGpsNoResp setGpsno(String gpsno) {
        this.gpsno = gpsno;
        return this;
    }

    public String getLng() {
        return lng;
    }

    public SimpleCurrentsGpsNoResp setLng(String lng) {
        this.lng = lng;
        return this;
    }

    public String getLat() {
        return lat;
    }

    public SimpleCurrentsGpsNoResp setLat(String lat) {
        this.lat = lat;
        return this;
    }

    public Integer getCourse() {
        return course;
    }

    public SimpleCurrentsGpsNoResp setCourse(Integer course) {
        this.course = course;
        return this;
    }

    public String getTime() {
        return time;
    }

    public SimpleCurrentsGpsNoResp setTime(String time) {
        this.time = time;
        return this;
    }

    public String getGpsTime() {
        return gpsTime;
    }

    public SimpleCurrentsGpsNoResp setGpsTime(String gpsTime) {
        this.gpsTime = gpsTime;
        return this;
    }

    public Integer getStatus() {
        return status;
    }

    public SimpleCurrentsGpsNoResp setStatus(Integer status) {
        this.status = status;
        return this;
    }

    public Integer getAltitude() {
        return altitude;
    }

    public SimpleCurrentsGpsNoResp setAltitude(Integer altitude) {
        this.altitude = altitude;
        return this;
    }

    public Integer getSpeed() {
        return speed;
    }

    public SimpleCurrentsGpsNoResp setSpeed(Integer speed) {
        this.speed = speed;
        return this;
    }
}
