package cn.com.g7.sdk.api.vo;

import java.util.List;

/**
 * 探头信息
 * @author liwenlang
 * @version 1.0.0
 * @date 2021/11/8 17:11
 */
public class ProbeInfo {

    /**便携式 */
    private Double t0Light;

    /**便携式 告警类型*/
    private List<Object> t0AlarmTypes;

    /**便携式 温度*/
    private Double t0Temperature;

    /**便携式 告警状态*/
    private Double t0AlarmStatus;

    /**便携式 湿度*/
    private Double t0Humidity;

    /**固定式 温度*/
    private Double t1Temperature;

    /**固定式 湿度状态*/
    private String t1HumidityAlarmStatus;

    /**固定式 温度告警状态*/
    private Double t1TemperatureAlarmStatus;

    public Double getT0Light() {
        return t0Light;
    }

    public ProbeInfo setT0Light(Double t0Light) {
        this.t0Light = t0Light;
        return this;
    }

    public List<Object> getT0AlarmTypes() {
        return t0AlarmTypes;
    }

    public ProbeInfo setT0AlarmTypes(List<Object> t0AlarmTypes) {
        this.t0AlarmTypes = t0AlarmTypes;
        return this;
    }

    public Double getT0Temperature() {
        return t0Temperature;
    }

    public ProbeInfo setT0Temperature(Double t0Temperature) {
        this.t0Temperature = t0Temperature;
        return this;
    }

    public Double getT0AlarmStatus() {
        return t0AlarmStatus;
    }

    public ProbeInfo setT0AlarmStatus(Double t0AlarmStatus) {
        this.t0AlarmStatus = t0AlarmStatus;
        return this;
    }

    public Double getT0Humidity() {
        return t0Humidity;
    }

    public ProbeInfo setT0Humidity(Double t0Humidity) {
        this.t0Humidity = t0Humidity;
        return this;
    }

    public Double getT1Temperature() {
        return t1Temperature;
    }

    public ProbeInfo setT1Temperature(Double t1Temperature) {
        this.t1Temperature = t1Temperature;
        return this;
    }

    public String getT1HumidityAlarmStatus() {
        return t1HumidityAlarmStatus;
    }

    public ProbeInfo setT1HumidityAlarmStatus(String t1HumidityAlarmStatus) {
        this.t1HumidityAlarmStatus = t1HumidityAlarmStatus;
        return this;
    }

    public Double getT1TemperatureAlarmStatus() {
        return t1TemperatureAlarmStatus;
    }

    public ProbeInfo setT1TemperatureAlarmStatus(Double t1TemperatureAlarmStatus) {
        this.t1TemperatureAlarmStatus = t1TemperatureAlarmStatus;
        return this;
    }
}
