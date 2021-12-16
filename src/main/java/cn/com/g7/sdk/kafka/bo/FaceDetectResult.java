package cn.com.g7.sdk.kafka.bo;

import com.alibaba.fastjson.annotation.JSONField;

import java.math.BigDecimal;

/**
 * 人脸识别返回结果
 *
 * @author zhaobijiang
 * @date 2021/11/18
 */
public class FaceDetectResult {

    /**
     * 机构号
     */
    private String orgcode;

    /**
     * 用户ID
     */
    @JSONField(name = "user_id")
    private String userId;

    /**
     * 扩展信息,json字符串
     */
    @JSONField(name = "ext_info")
    private String extInfo;

    /**
     * 用户的匹配得分
     */
    private BigDecimal score;

    /**
     * 设备imei
     */
    private String imei;

    /**
     * 设备号
     */
    private String gpsno;

    /**
     * 车辆ID
     */
    @JSONField(name = "truck_id")
    private String truckId;

    /**
     * 车牌号
     */
    @JSONField(name = "truck_no")
    private String truckNo;

    /**
     * 事件时间
     */
    @JSONField(name = "event_time")
    private String eventTime;

    /**
     * 1.点火拍照，3.加速拍照
     */
    @JSONField(name = "action_type")
    private Integer actionType;

    /**
     * 当前速度
     */
    private BigDecimal speed;

    /**
     * 经度
     */
    private String longitude;

    /**
     * 纬度
     */
    private String latitude;

    /**
     * 人脸照片
     */
    private String image;

    public String getOrgcode() {
        return orgcode;
    }

    public void setOrgcode(String orgcode) {
        this.orgcode = orgcode;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getExtInfo() {
        return extInfo;
    }

    public void setExtInfo(String extInfo) {
        this.extInfo = extInfo;
    }

    public BigDecimal getScore() {
        return score;
    }

    public void setScore(BigDecimal score) {
        this.score = score;
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

    public String getTruckId() {
        return truckId;
    }

    public void setTruckId(String truckId) {
        this.truckId = truckId;
    }

    public String getTruckNo() {
        return truckNo;
    }

    public void setTruckNo(String truckNo) {
        this.truckNo = truckNo;
    }

    public String getEventTime() {
        return eventTime;
    }

    public void setEventTime(String eventTime) {
        this.eventTime = eventTime;
    }

    public Integer getActionType() {
        return actionType;
    }

    public void setActionType(Integer actionType) {
        this.actionType = actionType;
    }

    public BigDecimal getSpeed() {
        return speed;
    }

    public void setSpeed(BigDecimal speed) {
        this.speed = speed;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
