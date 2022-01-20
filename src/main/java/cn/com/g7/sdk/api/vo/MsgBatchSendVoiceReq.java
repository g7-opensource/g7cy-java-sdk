package cn.com.g7.sdk.api.vo;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 批量消息下发请求参数
 *
 * @author liwenlang
 * @version 1.0.0
 * @date 2022/1/14 16:37
 */
public class MsgBatchSendVoiceReq {

    /**
     * [必传]车牌号列
     */
    @JSONField(name = "plate_num")
    private String plateNum;

    /**
     * [必传]通知内容 消息长度最大1000个字符
     */
    private String txt;

    /**
     * 请求方自定义内容（把它们请求过来的直接响应回去）
     */
    private String customize;

    public String getPlateNum() {
        return plateNum;
    }

    public MsgBatchSendVoiceReq setPlateNum(String plateNum) {
        this.plateNum = plateNum;
        return this;
    }

    public String getTxt() {
        return txt;
    }

    public MsgBatchSendVoiceReq setTxt(String txt) {
        this.txt = txt;
        return this;
    }

    public String getCustomize() {
        return customize;
    }

    public MsgBatchSendVoiceReq setCustomize(String customize) {
        this.customize = customize;
        return this;
    }
}
