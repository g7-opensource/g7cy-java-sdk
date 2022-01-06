package cn.com.g7.sdk.api.vo;

/**
 * 车辆历史轨迹查询 响应数据
 * @author liwenlang
 * @version 1.0.0
 * @date 2021/11/8 11:13
 */
public class TruckHistoryLocationResp {

    /** 经度(GCJ02坐标系) */
    private String lng;

    /** 纬度(GCJ02坐标系) */
    private String lat;

    /** 距上一轨迹点的距离|单位:cm*/
    private Integer distance;

    /**速度，km/h*/
    private Integer speed;

    /** 方向角(°)，360度，正北为0 */
    private Integer course;

    /** 定位时间, unix timestamp, 精度毫秒ms */
    private Long time;

    /** 高程，单位米*/
    private Integer altitude;

    public String getLng() {
        return lng;
    }

    public TruckHistoryLocationResp setLng(String lng) {
        this.lng = lng;
        return this;
    }

    public String getLat() {
        return lat;
    }

    public TruckHistoryLocationResp setLat(String lat) {
        this.lat = lat;
        return this;
    }

    public Integer getDistance() {
        return distance;
    }

    public TruckHistoryLocationResp setDistance(Integer distance) {
        this.distance = distance;
        return this;
    }

    public Integer getSpeed() {
        return speed;
    }

    public TruckHistoryLocationResp setSpeed(Integer speed) {
        this.speed = speed;
        return this;
    }

    public Integer getCourse() {
        return course;
    }

    public TruckHistoryLocationResp setCourse(Integer course) {
        this.course = course;
        return this;
    }

    public Long getTime() {
        return time;
    }

    public TruckHistoryLocationResp setTime(Long time) {
        this.time = time;
        return this;
    }

    public Integer getAltitude() {
        return altitude;
    }

    public TruckHistoryLocationResp setAltitude(Integer altitude) {
        this.altitude = altitude;
        return this;
    }
}
