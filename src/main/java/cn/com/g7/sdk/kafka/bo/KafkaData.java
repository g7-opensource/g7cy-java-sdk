package cn.com.g7.sdk.kafka.bo;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * kafka数据
 * @author dengfuwei
 * @version 1.0.0
 * @date 2021/10/9 10:54 上午
 */
public class KafkaData<T> {

    /** 数据编号*/
    private String code;

    /** 推送处理时间戳*/
    private Long time;

    /** 跟踪ID*/
    @JSONField(name = "trace_id")
    private String traceId;

    /** 推送数据内容*/
    private T data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public String getTraceId() {
        return traceId;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
