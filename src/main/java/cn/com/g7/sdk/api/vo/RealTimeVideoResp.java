package cn.com.g7.sdk.api.vo;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

/**
 * 实时视频-根据车牌获取实时视频连接  响应数据
 * @author liwenlang
 * @version 1.0.0
 * @date 2021/11/8 18:11
 */
public class RealTimeVideoResp {

    /** 设备号*/
    private String gpsno;

    /** 实时视频*/
    private List<RealTimeVideo> realTimeVideos;

    /** 车牌号*/
    private String carnum;

    /** sim卡号*/
    private String sim;

    /** 信号时间*/
    @JSONField(name = "signal_time")
    private String signalTime;

    /** 在线状态*/
    @JSONField(name = "online_flag")
    private String onlineFlag;

    /** 信号点*/
    @JSONField(name = "signal_strength")
    private String signalStrength;


    public String getGpsno() {
        return gpsno;
    }

    public RealTimeVideoResp setGpsno(String gpsno) {
        this.gpsno = gpsno;
        return this;
    }

    public List<RealTimeVideo> getRealTimeVideos() {
        return realTimeVideos;
    }

    public RealTimeVideoResp setRealTimeVideos(List<RealTimeVideo> realTimeVideos) {
        this.realTimeVideos = realTimeVideos;
        return this;
    }

    public String getCarnum() {
        return carnum;
    }

    public RealTimeVideoResp setCarnum(String carnum) {
        this.carnum = carnum;
        return this;
    }

    public String getSim() {
        return sim;
    }

    public RealTimeVideoResp setSim(String sim) {
        this.sim = sim;
        return this;
    }

    public String getSignalTime() {
        return signalTime;
    }

    public RealTimeVideoResp setSignalTime(String signalTime) {
        this.signalTime = signalTime;
        return this;
    }

    public String getOnlineFlag() {
        return onlineFlag;
    }

    public RealTimeVideoResp setOnlineFlag(String onlineFlag) {
        this.onlineFlag = onlineFlag;
        return this;
    }

    public String getSignalStrength() {
        return signalStrength;
    }

    public RealTimeVideoResp setSignalStrength(String signalStrength) {
        this.signalStrength = signalStrength;
        return this;
    }
}
