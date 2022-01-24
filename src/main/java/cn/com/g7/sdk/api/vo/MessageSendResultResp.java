package cn.com.g7.sdk.api.vo;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 消息下发结果查询 响应参数
 * @author liwenlang
 * @version 1.0.0
 * @date 2022/1/21 10:22
 */
public class MessageSendResultResp {

    /**
     * 消息ID
     */
    @JSONField(name = "message_id")
    private String messageId;

    /**
     * 下发状态.0 - 新消息, 11 - 重发消息准备状态, 21 - 消息到达接收机，
     * 23 -下发成功, 24 - 设备未在线, 80 - 已结束消息超时, 81 - 已结束消息超过最大发送次数,
     * 82 - 解析协议内容失败, 90 - 已完成收到设备应答, 91 - 已完成无需设备应答
     */
    private String status;

    /**
     * 下发时间，最后一次下发时间,格式为yyyy-MM-dd HH:mm:ss，时区为GMT+8， 例如：2017-01-01 12:00:00
     */
    @JSONField(name = "send_time")
    private String sendTime;

    /**
     * 设备应答结果.json 字符串，如果设备还没应答，或平台不支持解析，该值为空
     */
    private String result;

    public String getMessageId() {
        return messageId;
    }

    public MessageSendResultResp setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public MessageSendResultResp setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getSendTime() {
        return sendTime;
    }

    public MessageSendResultResp setSendTime(String sendTime) {
        this.sendTime = sendTime;
        return this;
    }

    public String getResult() {
        return result;
    }

    public MessageSendResultResp setResult(String result) {
        this.result = result;
        return this;
    }
}
