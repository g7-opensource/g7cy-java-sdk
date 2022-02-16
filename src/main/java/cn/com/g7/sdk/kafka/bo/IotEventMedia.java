package cn.com.g7.sdk.kafka.bo;

import cn.com.g7.sdk.api.enums.EventTypeEnum;
import com.alibaba.fastjson.annotation.JSONField;

import java.math.BigDecimal;
import java.util.Map;

/**
 * IoT事件多媒体
 * @author dengfuwei
 * @version 1.0.0
 * @date 2021/12/16 11:10 上午
 */
public class IotEventMedia {

    /** 多媒体唯一ID，可用于跟事件数据关联 {@link IotEvent}*/
    private String id;

    /** 设备imei*/
    private String imei;

    /** 事件类型 {@link EventTypeEnum}*/
    @JSONField(name = "event_type")
    private Integer eventType;

    /** 事件子类型 {@link EventTypeEnum}*/
    @JSONField(name = "sub_event_type")
    private Integer subEventType;

    /** 视频文件，key为通道号，value为视频文件地址*/
    private Map<String, String> videos;

    /** 图片文件，key为通道号，value为图片文件地址*/
    private Map<String, String> imgs;

    /** 设备号*/
    private String gpsno;

    /** 车牌号*/
    @JSONField(name = "plate_num")
    private String plateNum;

    /** 车辆ID*/
    @JSONField(name = "truck_id")
    private String truckId;

    /** 多媒体上传成功（SUCCESS）或失败（TIMEOUT)*/
    private String status;

    /** 机构号*/
    private String orgcode;

    /** 多媒体文件路径*/
    @JSONField(name = "file_path")
    private String filePath;

    /** 拍摄时间*/
    @JSONField(name = "shoot_time")
    private Long shootTime;

    /** 照片对应的事件类型（如item：101，为 前车碰撞报警）*/
    private Integer item;

    /** 拍摄通道*/
    private Integer channel;

    /** 经度，坐标系：GCJ-02*/
    private BigDecimal lng;

    /** 纬度，坐标系：GCJ-02*/
    private BigDecimal lat;

    /** 多媒体事件类型，PLATFORM(平台下发指令);TIMER(定时动作);ROBBERY_ALARM(抢劫报警触发);CRASH_ALARM(碰撞侧翻报警触发);DOOR_OPEN(开门触发);CUSTOM_HIGH(自定义高触发);CUSTOM_LOW(自定义低触发);RESERVED(其他);TIRED(疲劳报警触发);CALLING(打手机触发);SMOKING(抽烟报警触发)*/
    @JSONField(name = "media_event_type")
    private String mediaEventType;

    /** 多媒体类型*/
    @JSONField(name = "multimedia_type")
    private String multimediaType;

    /** 创建时间*/
    @JSONField(name = "create_time")
    private Long createTime;

    /** 更新时间*/
    @JSONField(name = "update_time")
    private Long updateTime;

    /** adas事件对应的照片数据才有值*/
    @JSONField(name = "adas_file_name")
    private String adasFileName;

    /** 消息中心id，smart下发拍照才有值*/
    @JSONField(name = "message_id")
    private Long messageId;

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

    public int getEventType() {
        return eventType;
    }

    public void setEventType(int eventType) {
        this.eventType = eventType;
    }

    public Integer getSubEventType() {
        return subEventType;
    }

    public void setSubEventType(Integer subEventType) {
        this.subEventType = subEventType;
    }

    public Map<String, String> getVideos() {
        return videos;
    }

    public void setVideos(Map<String, String> videos) {
        this.videos = videos;
    }

    public Map<String, String> getImgs() {
        return imgs;
    }

    public void setImgs(Map<String, String> imgs) {
        this.imgs = imgs;
    }

    public void setEventType(Integer eventType) {
        this.eventType = eventType;
    }

    public String getGpsno() {
        return gpsno;
    }

    public void setGpsno(String gpsno) {
        this.gpsno = gpsno;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOrgcode() {
        return orgcode;
    }

    public void setOrgcode(String orgcode) {
        this.orgcode = orgcode;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public Long getShootTime() {
        return shootTime;
    }

    public void setShootTime(Long shootTime) {
        this.shootTime = shootTime;
    }

    public Integer getItem() {
        return item;
    }

    public void setItem(Integer item) {
        this.item = item;
    }

    public Integer getChannel() {
        return channel;
    }

    public void setChannel(Integer channel) {
        this.channel = channel;
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

    public String getMediaEventType() {
        return mediaEventType;
    }

    public void setMediaEventType(String mediaEventType) {
        this.mediaEventType = mediaEventType;
    }

    public String getMultimediaType() {
        return multimediaType;
    }

    public void setMultimediaType(String multimediaType) {
        this.multimediaType = multimediaType;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public String getAdasFileName() {
        return adasFileName;
    }

    public void setAdasFileName(String adasFileName) {
        this.adasFileName = adasFileName;
    }

    public Long getMessageId() {
        return messageId;
    }

    public void setMessageId(Long messageId) {
        this.messageId = messageId;
    }
}
