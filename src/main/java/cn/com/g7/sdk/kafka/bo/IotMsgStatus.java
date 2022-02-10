package cn.com.g7.sdk.kafka.bo;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * IoT消息中心状态
 * @author dengfuwei
 * @version 1.0.0
 * @date 2022/1/6 3:53 下午
 */
public class IotMsgStatus {

    /** 指令：{@link cn.com.g7.sdk.kafka.enums.IotMsgCmdEnum}*/
    private String cmd;

    /** 设备imei*/
    private String imei;

    /** 消息ID*/
    @JSONField(name = "message_id")
    private Long messageId;

    /** 状态：{@link cn.com.g7.sdk.kafka.enums.IotMsgStatusEnum}*/
    private Integer status;

    /** 详细状态：{@link cn.com.g7.sdk.kafka.enums.IotMsgDetailEnum}*/
    private Integer detail;

    /** 更新时间*/
    @JSONField(name = "update_time")
    private Long updateTime;

    public String getCmd() {
        return cmd;
    }

    public void setCmd(String cmd) {
        this.cmd = cmd;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public Long getMessageId() {
        return messageId;
    }

    public void setMessageId(Long messageId) {
        this.messageId = messageId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getDetail() {
        return detail;
    }

    public void setDetail(Integer detail) {
        this.detail = detail;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }
}
