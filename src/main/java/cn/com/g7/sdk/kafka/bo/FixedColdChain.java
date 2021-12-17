package cn.com.g7.sdk.kafka.bo;

import com.alibaba.fastjson.annotation.JSONField;

import java.math.BigDecimal;
import java.util.List;

/**
 * 固定式冷链数据
 * @author dengfuwei
 * @version 1.0.0
 * @date 2021/11/9 2:21 下午
 */
public class FixedColdChain {

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

    /** 经度,WGS84坐标系*/
    private BigDecimal lng;

    /** 维度,WGS84坐标系*/
    private BigDecimal lat;

    /** 环境温度*/
    @JSONField(name = "env_temp")
    private BigDecimal envTemp;

    /** acc状态*/
    private Integer acc;

    /** 压缩机状态*/
    private Integer compressor;

    /** 门磁状态*/
    private Integer door;

    /** 速度，单位：km/h*/
    private BigDecimal speed;

    /** 温湿度明细，每个探头一条数据*/
    private List<Temperature> temperatures;

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

    public BigDecimal getEnvTemp() {
        return envTemp;
    }

    public void setEnvTemp(BigDecimal envTemp) {
        this.envTemp = envTemp;
    }

    public Integer getAcc() {
        return acc;
    }

    public void setAcc(Integer acc) {
        this.acc = acc;
    }

    public Integer getCompressor() {
        return compressor;
    }

    public void setCompressor(Integer compressor) {
        this.compressor = compressor;
    }

    public Integer getDoor() {
        return door;
    }

    public void setDoor(Integer door) {
        this.door = door;
    }

    public BigDecimal getSpeed() {
        return speed;
    }

    public void setSpeed(BigDecimal speed) {
        this.speed = speed;
    }

    public List<Temperature> getTemperatures() {
        return temperatures;
    }

    public void setTemperatures(List<Temperature> temperatures) {
        this.temperatures = temperatures;
    }
}
