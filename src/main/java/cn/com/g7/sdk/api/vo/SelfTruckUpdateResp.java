package cn.com.g7.sdk.api.vo;

/**
 * 更新自有车接口V1.0  响应数据
 * @author liwenlang
 * @version 1.0.0
 * @date 2021/10/12 14:27
 */
public class SelfTruckUpdateResp {

    /** 执行结果 */
    private Boolean result;

    public Boolean getResult() {
        return result;
    }

    public SelfTruckUpdateResp setResult(Boolean result) {
        this.result = result;
        return this;
    }
}
