package cn.com.g7.sdk.api.vo;

/**
 * 车辆当前定位V1.0 响应参数
 * @author liwenlang
 * @version 1.0.0
 * @date 2021/11/4 11:12
 */
public class TruckCurrentLocationResp {

    /**
     * 经度(坐标系默认GCJ-02)
     */
    private String lng;

    /**
     * 纬度(坐标系默认GCJ-02)
     */
    private String lat;

    /**
     * 速度
     */
    private Integer speed;

    /**
     * 方向角(0-360) 正北为0
     */
    private Integer course;

    /**
     * 定位时间, unix timestamp, 精度毫秒ms
     */
    private String time;


    /**
     * 两个相邻经纬度点的距离|单位:厘米
     */
    private Integer distance;


    public String getLng() {
        return lng;
    }

    public TruckCurrentLocationResp setLng(String lng) {
        this.lng = lng;
        return this;
    }

    public String getLat() {
        return lat;
    }

    public TruckCurrentLocationResp setLat(String lat) {
        this.lat = lat;
        return this;
    }

    public Integer getSpeed() {
        return speed;
    }

    public TruckCurrentLocationResp setSpeed(Integer speed) {
        this.speed = speed;
        return this;
    }

    public Integer getCourse() {
        return course;
    }

    public TruckCurrentLocationResp setCourse(Integer course) {
        this.course = course;
        return this;
    }

    public String getTime() {
        return time;
    }

    public TruckCurrentLocationResp setTime(String time) {
        this.time = time;
        return this;
    }

    public Integer getDistance() {
        return distance;
    }

    public TruckCurrentLocationResp setDistance(Integer distance) {
        this.distance = distance;
        return this;
    }
}