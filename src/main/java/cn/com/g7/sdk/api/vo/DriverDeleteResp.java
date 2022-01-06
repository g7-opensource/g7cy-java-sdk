package cn.com.g7.sdk.api.vo;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 删除司机 响应数据
 * @author liwenlang
 * @version 1.0.0
 * @date 2021/10/12 16:46
 */
public class DriverDeleteResp {

    /** 操作结果*/
    @JSONField(name = "ownid")
    private OperationDefaultResult ownId;

    public OperationDefaultResult getOwnId() {
        return ownId;
    }

    public DriverDeleteResp setOwnId(OperationDefaultResult ownId) {
        this.ownId = ownId;
        return this;
    }
}
