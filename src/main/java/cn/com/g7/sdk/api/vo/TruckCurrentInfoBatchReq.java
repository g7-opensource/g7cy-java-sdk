package cn.com.g7.sdk.api.vo;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

/**
 * 批量车辆状态查询 参数
 * @author liwenlang
 * @version 1.0.0
 * @date 2021/10/11 19:38
 */
public class TruckCurrentInfoBatchReq {

    /** [必传] 车牌列表，最多100个*/
    @JSONField(name = "plate_nums")
    private List<String> plateNums;

    /** [必传] 需要返回的数据类型(loc:位置信息，status:状态信息，cold:冷链信息，driver:司机信息) {@link cn.com.g7.sdk.api.enums.CurrentInfoEnum}*/
    private List<String> fields;

    /** 是否解析中文地址(不传，默认False不解析；True，解析中文地址)*/
    @JSONField(name = "addr_required")
    private Boolean addrRequired;

    public List<String> getPlateNums() {
        return plateNums;
    }

    public TruckCurrentInfoBatchReq setPlateNums(List<String> plateNums) {
        this.plateNums = plateNums;
        return this;
    }

    public List<String> getFields() {
        return fields;
    }

    public TruckCurrentInfoBatchReq setFields(List<String> fields) {
        this.fields = fields;
        return this;
    }

    public Boolean getAddrRequired() {
        return addrRequired;
    }

    public TruckCurrentInfoBatchReq setAddrRequired(Boolean addrRequired) {
        this.addrRequired = addrRequired;
        return this;
    }
}
