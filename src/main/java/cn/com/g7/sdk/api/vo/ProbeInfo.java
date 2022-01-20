package cn.com.g7.sdk.api.vo;

import java.util.List;

/**
 * 探头信息
 * @author liwenlang
 * @version 1.0.0
 * @date 2021/11/8 17:11
 */
public class ProbeInfo {

    /**便携式 光感(单位:LUX)*/
    private Double t0Light;

    /**
     * 便携式 告警类型 报警列表：1高温预警，2高温报警，3温度传感器异常报警，4高湿度预警，5高湿度报警，6湿度传感器异常报警，7电量报警，8光感报警，
     * 9其他报警，10低温预警，11低温报警，12低湿度预警，13低湿度报警，14设备开机报警，15设备关机报警，16手动开关状态，17温度湿度预警报警总开关状态，18低功耗状态，19任务状态，20重启，21外电断开
     */
    private List<Integer> t0AlarmTypes;

    /**便携式 温度(单位:℃)*/
    private Double t0Temperature;

    /**便携式 告警状态*/
    private Double t0AlarmStatus;

    /**便携式 探头0湿度 (单位:%RH)*/
    private Double t0Humidity;

    /**固定式 温度(单位:℃)*/
    private Double t1Temperature;

    /**固定式 探头1湿度告警状态 */
    private String t1HumidityAlarmStatus;

    /**固定式 探头1湿度告警状态*/
    private Double t1TemperatureAlarmStatus;

    public Double getT0Light() {
        return t0Light;
    }

    public ProbeInfo setT0Light(Double t0Light) {
        this.t0Light = t0Light;
        return this;
    }

    public List<Integer> getT0AlarmTypes() {
        return t0AlarmTypes;
    }

    public ProbeInfo setT0AlarmTypes(List<Integer> t0AlarmTypes) {
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
