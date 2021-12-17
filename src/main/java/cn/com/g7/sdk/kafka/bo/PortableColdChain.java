package cn.com.g7.sdk.kafka.bo;

import com.alibaba.fastjson.annotation.JSONField;

import java.math.BigDecimal;
import java.util.List;

/**
 * 便携式冷链数据
 * @author dengfuwei
 * @version 1.0.0
 * @date 2021/11/9 2:13 下午
 */
public class PortableColdChain {

    /** 车牌号*/
    @JSONField(name = "plate_num")
    private String plateNum;

    /** 设备号*/
    private String gpsno;

    /** 设备imei*/
    private String imei;

    /** 数据采集时间戳*/
    private Long time;

    /** 机构号*/
    private String orgcode;

    /** 环境温度*/
    @JSONField(name = "env_temp")
    private BigDecimal envTemp;

    /** 探头温度*/
    private BigDecimal temp;

    /** 湿度，单位：%*/
    private BigDecimal humidity;

    /** 告警列表：
     * 0=高温预警;1=高温报警;2=温度传感器异常报警;3=高湿度预警;4=高湿度报警;
     * 5=湿度传感器异常报警;6=电量报警;7=光感报警;8=其他报警;9=低温预警;
     * 10=低温报警;11=低湿度预警;12=低湿度报警;13=设备开机报警;14=设备关机报警;
     * 15=手动开关状态;16=温度湿度预警报警总开关状态;17=低功耗状态;18=任务状态;19=重启;
     * 20=外电断开
     */
    @JSONField(name = "alarm_types")
    private List<Integer> alarmTypes;

    /** 报警状态*/
    @JSONField(name = "alarm_status")
    private Long alarmStatus;

    /** 光感值*/
    private Integer light;

    /** 信号量*/
    private Integer semaphore;

    /** 剩余电量，单位:%*/
    @JSONField(name = "battery_power")
    private Integer batteryPower;

    /** 经度,WGS84坐标系*/
    private BigDecimal lng;

    /** 维度,WGS84坐标系*/
    private BigDecimal lat;

    public String getPlateNum() {
        return plateNum;
    }

    public void setPlateNum(String plateNum) {
        this.plateNum = plateNum;
    }

    public String getGpsno() {
        return gpsno;
    }

    public void setGpsno(String gpsno) {
        this.gpsno = gpsno;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public String getOrgcode() {
        return orgcode;
    }

    public void setOrgcode(String orgcode) {
        this.orgcode = orgcode;
    }

    public BigDecimal getEnvTemp() {
        return envTemp;
    }

    public void setEnvTemp(BigDecimal envTemp) {
        this.envTemp = envTemp;
    }

    public BigDecimal getTemp() {
        return temp;
    }

    public void setTemp(BigDecimal temp) {
        this.temp = temp;
    }

    public BigDecimal getHumidity() {
        return humidity;
    }

    public void setHumidity(BigDecimal humidity) {
        this.humidity = humidity;
    }

    public List<Integer> getAlarmTypes() {
        return alarmTypes;
    }

    public void setAlarmTypes(List<Integer> alarmTypes) {
        this.alarmTypes = alarmTypes;
    }

    public Long getAlarmStatus() {
        return alarmStatus;
    }

    public void setAlarmStatus(Long alarmStatus) {
        this.alarmStatus = alarmStatus;
    }

    public Integer getLight() {
        return light;
    }

    public void setLight(Integer light) {
        this.light = light;
    }

    public Integer getSemaphore() {
        return semaphore;
    }

    public void setSemaphore(Integer semaphore) {
        this.semaphore = semaphore;
    }

    public Integer getBatteryPower() {
        return batteryPower;
    }

    public void setBatteryPower(Integer batteryPower) {
        this.batteryPower = batteryPower;
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
}
