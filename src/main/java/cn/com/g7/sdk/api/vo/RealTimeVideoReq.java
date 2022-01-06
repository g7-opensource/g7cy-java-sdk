package cn.com.g7.sdk.api.vo;

/**
 * 实时视频-根据车牌获取实时视频连接 请求参数
 * @author liwenlang
 * @version 1.0.0
 * @date 2021/11/8 17:58
 */
public class RealTimeVideoReq {

    /** [必传]车牌号*/
    private String carnum;

    /** [必传]机构号*/
    private String orgcode;

    /** 是否走https,默认false*/
    private Boolean https;

    /** 通道号，默认全部通道 示例：1,2,3,4*/
    private String channelNos;

    /**是否存储:默认false*/
    private Boolean storage;

    /** 0主码流，1子码率:默认子码率*/
    private Integer streamType;

    public String getCarnum() {
        return carnum;
    }

    public RealTimeVideoReq setCarnum(String carnum) {
        this.carnum = carnum;
        return this;
    }

    public String getOrgcode() {
        return orgcode;
    }

    public RealTimeVideoReq setOrgcode(String orgcode) {
        this.orgcode = orgcode;
        return this;
    }

    public Boolean getHttps() {
        return https;
    }

    public RealTimeVideoReq setHttps(Boolean https) {
        this.https = https;
        return this;
    }

    public String getChannelNos() {
        return channelNos;
    }

    public RealTimeVideoReq setChannelNos(String channelNos) {
        this.channelNos = channelNos;
        return this;
    }

    public Boolean getStorage() {
        return storage;
    }

    public RealTimeVideoReq setStorage(Boolean storage) {
        this.storage = storage;
        return this;
    }

    public Integer getStreamType() {
        return streamType;
    }

    public RealTimeVideoReq setStreamType(Integer streamType) {
        this.streamType = streamType;
        return this;
    }
}
