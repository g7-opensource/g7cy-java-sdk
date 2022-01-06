package cn.com.g7.sdk.api.vo;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * @author liwenlang
 * @version 1.0.0
 * @date 2021/10/18 13:37
 */
public class TruckListCountReq extends TruckListReq{

    /** 是否返回总数，0不返回   1 返回则返回结果只包含符合条件的总数量 {@link cn.com.g7.sdk.api.enums.GetCountEnum}*/
    @JSONField(name = "get_count")
    private Integer getCount;

    public TruckListCountReq(Integer getCount) {
        this.getCount = getCount;
    }

    public Integer getGetCount() {
        return getCount;
    }

    public TruckListCountReq setGetCount(Integer getCount) {
        this.getCount = getCount;
        return this;
    }
}
