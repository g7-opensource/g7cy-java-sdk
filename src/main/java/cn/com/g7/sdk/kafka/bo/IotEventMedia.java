package cn.com.g7.sdk.kafka.bo;

import cn.com.g7.sdk.api.enums.EventTypeEnum;
import com.alibaba.fastjson.annotation.JSONField;

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
}
