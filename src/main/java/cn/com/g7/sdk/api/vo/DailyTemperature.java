package cn.com.g7.sdk.api.vo;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 温度明细
 * @author liwenlang
 * @version 1.0.0
 * @date 2021/11/17 11:15
 */
public class DailyTemperature {

    /** 坐标是否国内*/
    private Boolean containsChina;

    /** 坐标系*/
    private String coordinate;

    /** 创建时间*/
    @JSONField(name = "createtime")
    private String createTime;

    /** 设备号*/
    private Integer gpsno;

    /**纬度 */
    private Double lat;

    /** 经度*/
    private Double lng;

    /** 探头信息*/
    private ProbeInfo probeInfo;

    /**
     * 1.固定式 gtp:0,t1:0|26.6|23.5|27.3|70.0|63.3|80.0;t2:23|26.3|21|29|50|30|80.1,s:20,of:111,
     * + "s通道号:传感器序号|副温度传感器当前值|冷链主-副温度传感器一致性值;” gtp:设备自身温度 s:20 速度（1/10km/h 百米每小时）
     * of:111 ACC状态，压缩机状态，门开关状态（0:关；1：开；2：无法获取状态）
     * t1/t2/t3/t4:温湿度报警|温度|最低温度|最高温度|湿度|最低湿度|最低湿度; #温湿度报警 十位代表湿度报警，个位代表温度报警
     * 湿度报警值： 0：正常 1：低湿预警 2：低湿报警 3：高湿预警 4：高湿报警 5：传感器初始化中 6：传感器故障
     * 温度报警值： 0：正常 1：低温预警 2：低温报警 3：高温预警 4：高温报警 5：传感器初始化中 6：传感器故障
     * #温度（上传数据时的瞬时温度） #最低温度（10秒上传一条数据，则此10秒内的最低温度）,最高温度，最低湿度，最高湿度同理
     * 2. 便携式 {"alarmStatus":65,"humidity":52,"speed":81,"temp":"-17.2","semaphore":21,"lng":116.3405322505368,"envirtemp":"-36.0",
     * "lat":39.16061405813291,"batteryPower":18,"alarmTypes":[1,7]}",
     * alarmStatus 报警状态 humidity 当前湿度值 speed 速度 temp 当前温度值 semaphore 设备信号量
     * lng 采集经度 lat 采集纬度 batteryPower 电量 alarmTypes 报警类型
     */
    private String properties;

    /** 温度上报时间*/
    private String time;

    /**设备类型 2固定 3便携*/
    private String type;

    /**机构号*/
    private String orgcode;

    /**imei*/
    private String imei;

    /**trucknum*/
    private String trucknum;

    public Boolean getContainsChina() {
        return containsChina;
    }

    public DailyTemperature setContainsChina(Boolean containsChina) {
        this.containsChina = containsChina;
        return this;
    }

    public String getCoordinate() {
        return coordinate;
    }

    public DailyTemperature setCoordinate(String coordinate) {
        this.coordinate = coordinate;
        return this;
    }

    public String getCreateTime() {
        return createTime;
    }

    public DailyTemperature setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    public Integer getGpsno() {
        return gpsno;
    }

    public DailyTemperature setGpsno(Integer gpsno) {
        this.gpsno = gpsno;
        return this;
    }

    public Double getLat() {
        return lat;
    }

    public DailyTemperature setLat(Double lat) {
        this.lat = lat;
        return this;
    }

    public Double getLng() {
        return lng;
    }

    public DailyTemperature setLng(Double lng) {
        this.lng = lng;
        return this;
    }

    public ProbeInfo getProbeInfo() {
        return probeInfo;
    }

    public DailyTemperature setProbeInfo(ProbeInfo probeInfo) {
        this.probeInfo = probeInfo;
        return this;
    }

    public String getProperties() {
        return properties;
    }

    public DailyTemperature setProperties(String properties) {
        this.properties = properties;
        return this;
    }

    public String getTime() {
        return time;
    }

    public DailyTemperature setTime(String time) {
        this.time = time;
        return this;
    }

    public String getType() {
        return type;
    }

    public DailyTemperature setType(String type) {
        this.type = type;
        return this;
    }

    public String getOrgcode() {
        return orgcode;
    }

    public DailyTemperature setOrgcode(String orgcode) {
        this.orgcode = orgcode;
        return this;
    }

    public String getImei() {
        return imei;
    }

    public DailyTemperature setImei(String imei) {
        this.imei = imei;
        return this;
    }

    public String getTrucknum() {
        return trucknum;
    }

    public DailyTemperature setTrucknum(String trucknum) {
        this.trucknum = trucknum;
        return this;
    }
}
