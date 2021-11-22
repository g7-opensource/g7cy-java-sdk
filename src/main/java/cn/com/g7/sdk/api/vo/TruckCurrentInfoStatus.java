package cn.com.g7.sdk.api.vo;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 车辆状态查询 -->状态信息
 * @author liwenlang
 * @version 1.0.0
 * @date 2021/10/11 19:45
 */
public class TruckCurrentInfoStatus {

    /** 电量(-1 无效，单位%，范围 0-100，便携式设备有效)*/
    private Integer battery;

    /** acc状态(-1 无效，0 acc off, 1 acc on)*/
    private Integer acc;

    /** gps定位状态(-1 无效，0 gps不定位f, 1 gps定位)*/
    private Integer gps;

    /** gprs信号量(-1 无效)*/
    private Integer gsm;

    /** private Integer 电压(-1 无效,单位0.1v)*/
    private Integer voltage;

    /** 主电电压(单位0.1v,仅smart有效，其他为-1)*/
    @JSONField(name = "main_vol")
    private Integer mainVol;

    /** 电瓶电压(单位0.1v,仅smart有效，其他为-1)*/
    @JSONField(name = "battery_vol")
    private Integer batteryVol;

    /** 状态数据,json字符串*/
    private String properties;

    public Integer getBattery() {
        return battery;
    }

    public TruckCurrentInfoStatus setBattery(Integer battery) {
        this.battery = battery;
        return this;
    }

    public Integer getAcc() {
        return acc;
    }

    public TruckCurrentInfoStatus setAcc(Integer acc) {
        this.acc = acc;
        return this;
    }

    public Integer getGps() {
        return gps;
    }

    public TruckCurrentInfoStatus setGps(Integer gps) {
        this.gps = gps;
        return this;
    }

    public Integer getGsm() {
        return gsm;
    }

    public TruckCurrentInfoStatus setGsm(Integer gsm) {
        this.gsm = gsm;
        return this;
    }

    public Integer getVoltage() {
        return voltage;
    }

    public TruckCurrentInfoStatus setVoltage(Integer voltage) {
        this.voltage = voltage;
        return this;
    }

    public Integer getMainVol() {
        return mainVol;
    }

    public TruckCurrentInfoStatus setMainVol(Integer mainVol) {
        this.mainVol = mainVol;
        return this;
    }

    public Integer getBatteryVol() {
        return batteryVol;
    }

    public TruckCurrentInfoStatus setBatteryVol(Integer batteryVol) {
        this.batteryVol = batteryVol;
        return this;
    }

    public String getProperties() {
        return properties;
    }

    public TruckCurrentInfoStatus setProperties(String properties) {
        this.properties = properties;
        return this;
    }
}
