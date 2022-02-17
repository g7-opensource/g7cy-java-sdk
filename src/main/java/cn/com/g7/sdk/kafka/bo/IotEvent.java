package cn.com.g7.sdk.kafka.bo;

import cn.com.g7.sdk.api.enums.EventTypeEnum;
import com.alibaba.fastjson.annotation.JSONField;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Map;

/**
 * IoT事件，含终端事件和平台事件
 * @author dengfuwei
 * @version 1.0.0
 * @date 2021/12/16 9:33 上午
 */
public class IotEvent {

    /** 事件唯一ID，可用于跟事件多媒体数据关联 {@link IotEventMedia}*/
    private String id;

    /** 设备imei*/
    private String imei;

    /** 设备号*/
    private String gpsno;

    /** 机构号*/
    private String orgcode;

    /** 标示事件是开始记录 还是结束记录 1-事件开始 0-事件结束 */
    @JSONField(name = "alarm_status")
    private Integer alarmStatus;

    /** 事件类型(旧编号) {@link EventTypeEnum}*/
    @JSONField(name = "alarm_type")
    private Integer alarmType;

    /** 事件类型(新编号) {@link EventTypeEnum}*/
    @JSONField(name = "event_type")
    private Integer eventType;

    /** 事件子类型 {@link EventTypeEnum}*/
    @JSONField(name = "sub_event_type")
    private Integer subEventType;

    /** 车牌号*/
    @JSONField(name = "plate_num")
    private String plateNum;

    /** 车辆ID*/
    @JSONField(name = "truck_id")
    private String truckId;

    /** 司机名称*/
    @JSONField(name = "driver_name")
    private String driverName;

    /** 持续时间,秒*/
    private Integer seconds = 0;

    /** 司机卡号*/
    private String icno;

    /** 事件开始时间*/
    @JSONField(name = "start_time")
    private Date startTime;

    /** 事件开始经度，GCJ-02坐标系*/
    @JSONField(name = "start_lng")
    private BigDecimal startLng;

    /** 事件开始纬度，GCJ-02坐标系*/
    @JSONField(name = "start_lat")
    private BigDecimal startLat;

    /** 事件结束时间*/
    @JSONField(name = "end_time")
    private Date endTime;

    /** 事件结束经度，GCJ-02坐标系*/
    @JSONField(name = "end_lng")
    private BigDecimal endLng;

    /** 事件结束纬度，GCJ-02坐标系*/
    @JSONField(name = "end_lat")
    private BigDecimal endLat;

    /** 速度,单位：km/h*/
    private Integer speed;

    /** 附加信息*/
    @JSONField(name = "additional_info")
    private Map<String, Object> additionalInfo;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getGpsno() {
        return gpsno;
    }

    public void setGpsno(String gpsno) {
        this.gpsno = gpsno;
    }

    public String getOrgcode() {
        return orgcode;
    }

    public void setOrgcode(String orgcode) {
        this.orgcode = orgcode;
    }

    public Integer getAlarmStatus() {
        return alarmStatus;
    }

    public void setAlarmStatus(Integer alarmStatus) {
        this.alarmStatus = alarmStatus;
    }

    public Integer getAlarmType() {
        return alarmType;
    }

    public void setAlarmType(Integer alarmType) {
        this.alarmType = alarmType;
    }

    public Integer getEventType() {
        return eventType;
    }

    public void setEventType(Integer eventType) {
        this.eventType = eventType;
    }

    public Integer getSubEventType() {
        return subEventType;
    }

    public void setSubEventType(Integer subEventType) {
        this.subEventType = subEventType;
    }

    public String getPlateNum() {
        return plateNum;
    }

    public void setPlateNum(String plateNum) {
        this.plateNum = plateNum;
    }

    public String getTruckId() {
        return truckId;
    }

    public void setTruckId(String truckId) {
        this.truckId = truckId;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public Integer getSeconds() {
        return seconds;
    }

    public void setSeconds(Integer seconds) {
        this.seconds = seconds;
    }

    public String getIcno() {
        return icno;
    }

    public void setIcno(String icno) {
        this.icno = icno;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public BigDecimal getStartLng() {
        return startLng;
    }

    public void setStartLng(BigDecimal startLng) {
        this.startLng = startLng;
    }

    public BigDecimal getStartLat() {
        return startLat;
    }

    public void setStartLat(BigDecimal startLat) {
        this.startLat = startLat;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public BigDecimal getEndLng() {
        return endLng;
    }

    public void setEndLng(BigDecimal endLng) {
        this.endLng = endLng;
    }

    public BigDecimal getEndLat() {
        return endLat;
    }

    public void setEndLat(BigDecimal endLat) {
        this.endLat = endLat;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public Map<String, Object> getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(Map<String, Object> additionalInfo) {
        this.additionalInfo = additionalInfo;
    }
}
