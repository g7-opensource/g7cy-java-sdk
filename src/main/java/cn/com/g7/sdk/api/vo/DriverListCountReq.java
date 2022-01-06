package cn.com.g7.sdk.api.vo;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 查询司机列表信息记录数 参数
 * @author liwenlang
 * @version 1.0.0
 * @date 2021/10/18 13:59
 */
public class DriverListCountReq extends DriverListReq{

    /** 只返回总条数 1获取。默认0 {@link cn.com.g7.sdk.api.enums.GetCountEnum}*/
    @JSONField(name = "get_count")
    private Integer getCount;

    public DriverListCountReq(Integer getCount) {
        this.getCount = getCount;
    }

    public Integer getGetCount() {
        return getCount;
    }

    public DriverListCountReq setGetCount(Integer getCount) {
        this.getCount = getCount;
        return this;
    }
}
