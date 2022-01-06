package cn.com.g7.sdk.api.vo;

/**
 * 实时视频查询 响应参数
 * @author liwenlang
 * @version 1.0.0
 * @date 2021/11/8 16:01
 */
public class VideoRealTimeUrlResp {

    /** 摄像头编号*/
    private String channel;

    /** 摄像头位置描述*/
    private String desc;

    /** http-flv格式实时视频的播放地址*/
    private String url;

    /** hls格式实时视频的播放地址*/
    private String hlsUrl;

    /** 辅助链接*/
    private String helpUrl;

    public String getChannel() {
        return channel;
    }

    public VideoRealTimeUrlResp setChannel(String channel) {
        this.channel = channel;
        return this;
    }

    public String getDesc() {
        return desc;
    }

    public VideoRealTimeUrlResp setDesc(String desc) {
        this.desc = desc;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public VideoRealTimeUrlResp setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getHlsUrl() {
        return hlsUrl;
    }

    public VideoRealTimeUrlResp setHlsUrl(String hlsUrl) {
        this.hlsUrl = hlsUrl;
        return this;
    }

    public String getHelpUrl() {
        return helpUrl;
    }

    public VideoRealTimeUrlResp setHelpUrl(String helpUrl) {
        this.helpUrl = helpUrl;
        return this;
    }
}
