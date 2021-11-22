package cn.com.g7.sdk.api.vo;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * @author liwenlang
 * @version 1.0.0
 * @date 2021/11/8 18:02
 */
public class RealTimeVideo {

    /** 摄像头id*/
    @JSONField(name = "camera_id")
    private String cameraId;

    /** 摄像头名称*/
    private String name;

    /** 播放链接失效时间|格式为 yyyy-MM-dd HH:mm:ss*/
    @JSONField(name = "expire_time")
    private String expireTime;

    /** flv播放链接地址*/
    @JSONField(name = "flv_url")
    private String flvUrl;

    /** hls播放链接地址*/
    @JSONField(name = "hls_url")
    private String hlsUrl;

    /** 通道号*/
    @JSONField(name = "channel_no")
    private Integer channelNo;

    /** 在线标识*/
    @JSONField(name = "online_flag")
    private Boolean onlineFlag;

    /** 辅助链接*/
    @JSONField(name = "help_url")
    private String helpUrl;

    public String getCameraId() {
        return cameraId;
    }

    public RealTimeVideo setCameraId(String cameraId) {
        this.cameraId = cameraId;
        return this;
    }

    public String getName() {
        return name;
    }

    public RealTimeVideo setName(String name) {
        this.name = name;
        return this;
    }

    public String getExpireTime() {
        return expireTime;
    }

    public RealTimeVideo setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    public String getFlvUrl() {
        return flvUrl;
    }

    public RealTimeVideo setFlvUrl(String flvUrl) {
        this.flvUrl = flvUrl;
        return this;
    }

    public String getHlsUrl() {
        return hlsUrl;
    }

    public RealTimeVideo setHlsUrl(String hlsUrl) {
        this.hlsUrl = hlsUrl;
        return this;
    }

    public Integer getChannelNo() {
        return channelNo;
    }

    public RealTimeVideo setChannelNo(Integer channelNo) {
        this.channelNo = channelNo;
        return this;
    }

    public Boolean getOnlineFlag() {
        return onlineFlag;
    }

    public RealTimeVideo setOnlineFlag(Boolean onlineFlag) {
        this.onlineFlag = onlineFlag;
        return this;
    }

    public String getHelpUrl() {
        return helpUrl;
    }

    public RealTimeVideo setHelpUrl(String helpUrl) {
        this.helpUrl = helpUrl;
        return this;
    }
}
