package cn.com.g7.sdk.api.vo;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * 批量消息下发请求参数
 *
 * @author liwenlang
 * @version 1.0.0
 * @date 2022/1/14 16:37
 */
public class MsgBatchSendVoiceReq {

    /**
     * [必传]车牌号列表，车牌号至少有一个
     */
    @JSONField(name = "plate_nums")
    private List<String> plateNums;

    /**
     * [必传]通知内容 消息长度最大1000个字符
     */
    private String txt;

    public List<String> getPlateNums() {
        return plateNums;
    }

    public MsgBatchSendVoiceReq setPlateNums(List<String> plateNums) {
        this.plateNums = plateNums;
        return this;
    }

    public String getTxt() {
        return txt;
    }

    public MsgBatchSendVoiceReq setTxt(String txt) {
        this.txt = txt;
        return this;
    }
}
