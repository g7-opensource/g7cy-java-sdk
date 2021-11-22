package cn.com.g7.sdk.api.vo;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 操作数据接口 公共返回操作结果值
 * @author liwenlang
 * @version 1.0.0
 * @date 2021/10/12 16:41
 */
public class OperationDefaultResult {

    /** 操作结果，true为成功，false为失败*/
    @JSONField(name = "op_result")
    private Boolean opResult;

    /** 操作结果说明，失败则为失败说明*/
    @JSONField(name = "op_message")
    private String opMessage;

    /** 操作结果编码，成功为0，失败则为失败编码*/
    @JSONField(name = "op_code")
    private Integer opCode;

    public Boolean getOpResult() {
        return opResult;
    }

    public OperationDefaultResult setOpResult(Boolean opResult) {
        this.opResult = opResult;
        return this;
    }

    public String getOpMessage() {
        return opMessage;
    }

    public OperationDefaultResult setOpMessage(String opMessage) {
        this.opMessage = opMessage;
        return this;
    }

    public Integer getOpCode() {
        return opCode;
    }

    public OperationDefaultResult setOpCode(Integer opCode) {
        this.opCode = opCode;
        return this;
    }
}
