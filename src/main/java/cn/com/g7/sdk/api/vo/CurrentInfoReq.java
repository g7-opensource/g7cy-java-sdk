package cn.com.g7.sdk.api.vo;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 车辆状态查询基类
 * @author liwenlang
 * @version 1.0.0
 * @date 2021/11/8 15:20
 */
public class CurrentInfoReq {

    /**
     * [必传] 返回附加信息，多个使用英文逗号分隔(loc:位置信息，status:状态信息，cold:冷链信息，driver:司机信息)
     * {@link cn.com.g7.sdk.api.enums.CurrentInfoEnum}
     */
    private String fields;

    /** 是否解析中文地址(不传，默认False不解析；True，解析中文地址)*/
    @JSONField(name = "addr_required")
    private Boolean addrRequired;

    public String getFields() {
        return fields;
    }

    public CurrentInfoReq setFields(String fields) {
        this.fields = fields;
        return this;
    }

    public Boolean getAddrRequired() {
        return addrRequired;
    }

    public CurrentInfoReq setAddrRequired(Boolean addrRequired) {
        this.addrRequired = addrRequired;
        return this;
    }
}
