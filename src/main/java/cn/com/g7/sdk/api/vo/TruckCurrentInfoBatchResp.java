package cn.com.g7.sdk.api.vo;

/**
 * 批量查询车辆当前状态 响应信息
 * @author liwenlang
 * @version 1.0.0
 * @date 2021/10/12 09:41
 */
public class TruckCurrentInfoBatchResp {

    /** 状态码*/
    private String code;

    /** 状态描述*/
    private String msg;

    /** 响应实体*/
    private TruckCurrentInfoBatchDetails data;

    public String getCode() {
        return code;
    }

    public TruckCurrentInfoBatchResp setCode(String code) {
        this.code = code;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public TruckCurrentInfoBatchResp setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public TruckCurrentInfoBatchDetails getData() {
        return data;
    }

    public TruckCurrentInfoBatchResp setData(TruckCurrentInfoBatchDetails data) {
        this.data = data;
        return this;
    }
}
