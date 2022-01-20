package cn.com.g7.sdk.api.vo;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 消息批量下发响应参数
 *
 * @author liwenlang
 * @version 1.0.0
 * @date 2022/1/14 16:40
 */
public class MsgCommonVoiceSendResp {

    /**
     * 设备串号
     */
    private String imei;

    /**
     * 车辆ID
     */
    private String truckid;

    /**
     * 设备号
     */
    private String gpsno;

    /**
     * 车牌号
     */
    @JSONField(name = "plate_num")
    private String plateNum;

    /**
     * 下发接口返回的消息id，用于异步关联下发结果
     */
    private String messageId;

    /**
     * 下发成功/失败code 0成功 1失败
     */
    private Integer code;

    /**
     * 下发失败原因
     */
    private String comments;

    /**
     * 发送内容
     */
    private String txt;

    /**
     * 请求方自定义内容（把它们请求过来的直接响应回去）
     */
    private String customize;

    public String getImei() {
        return imei;
    }

    public MsgCommonVoiceSendResp setImei(String imei) {
        this.imei = imei;
        return this;
    }

    public String getTruckid() {
        return truckid;
    }

    public MsgCommonVoiceSendResp setTruckid(String truckid) {
        this.truckid = truckid;
        return this;
    }

    public String getGpsno() {
        return gpsno;
    }

    public MsgCommonVoiceSendResp setGpsno(String gpsno) {
        this.gpsno = gpsno;
        return this;
    }

    public String getPlateNum() {
        return plateNum;
    }

    public MsgCommonVoiceSendResp setPlateNum(String plateNum) {
        this.plateNum = plateNum;
        return this;
    }

    public String getMessageId() {
        return messageId;
    }

    public MsgCommonVoiceSendResp setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    public Integer getCode() {
        return code;
    }

    public MsgCommonVoiceSendResp setCode(Integer code) {
        this.code = code;
        return this;
    }

    public String getComments() {
        return comments;
    }

    public MsgCommonVoiceSendResp setComments(String comments) {
        this.comments = comments;
        return this;
    }

    public String getTxt() {
        return txt;
    }

    public MsgCommonVoiceSendResp setTxt(String txt) {
        this.txt = txt;
        return this;
    }

    public String getCustomize() {
        return customize;
    }

    public MsgCommonVoiceSendResp setCustomize(String customize) {
        this.customize = customize;
        return this;
    }
}
