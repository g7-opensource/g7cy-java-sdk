package cn.com.g7.sdk.api.vo;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

/**
 * 查询车辆详情 响应数据
 * （有自定义字段），返回所有字段
 * @author liwenlang
 * @version 1.0.0
 * @date 2021/10/11 15:59
 */
public class TruckInfoAndCustomFieldResp {
    /** 车辆信息*/
    @JSONField(name = "truckinfo")
    private List<TruckInfoResp> truckInfo;

    /** 自定义字段*/
    @JSONField(name = "customfields")
    private List<TruckCustomField> customFields;

    public List<TruckInfoResp> getTruckInfo() {
        return truckInfo;
    }

    public TruckInfoAndCustomFieldResp setTruckInfo(List<TruckInfoResp> truckInfo) {
        this.truckInfo = truckInfo;
        return this;
    }

    public List<TruckCustomField> getCustomFields() {
        return customFields;
    }

    public TruckInfoAndCustomFieldResp setCustomFields(List<TruckCustomField> customFields) {
        this.customFields = customFields;
        return this;
    }
}
