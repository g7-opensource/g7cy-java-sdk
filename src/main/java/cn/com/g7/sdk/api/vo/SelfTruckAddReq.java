package cn.com.g7.sdk.api.vo;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 增加车辆 参数
 * @author liwenlang
 * @version 1.0.0
 * @date 2021/10/12 13:52
 */
public class SelfTruckAddReq {

    /** [必传] 车牌号,只能单个*/
    @JSONField(name = "carnum")
    private String carNum;

    /** [必传] 是否车头,1车头,2挂车,默认1 {@link cn.com.g7.sdk.api.enums.TruckHeadStockEnum}*/
    @JSONField(name = "isheadstock")
    private String isHeadStock;

    /** [必传] 所属机构号*/
    private String orgcode;

    public String getCarNum() {
        return carNum;
    }

    public SelfTruckAddReq setCarNum(String carNum) {
        this.carNum = carNum;
        return this;
    }

    public String getIsHeadStock() {
        return isHeadStock;
    }

    public SelfTruckAddReq setIsHeadStock(String isHeadStock) {
        this.isHeadStock = isHeadStock;
        return this;
    }

    public String getOrgcode() {
        return orgcode;
    }

    public SelfTruckAddReq setOrgcode(String orgcode) {
        this.orgcode = orgcode;
        return this;
    }
}
