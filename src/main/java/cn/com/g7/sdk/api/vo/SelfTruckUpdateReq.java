package cn.com.g7.sdk.api.vo;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 更新自有车 参数
 * @author liwenlang
 * @version 1.0.0
 * @date 2021/10/12 13:52
 */
public class SelfTruckUpdateReq {

    /** [必传] 车牌号*/
    @JSONField(name = "plate_num")
    private String plateNum;

    /** 车辆id*/
    private String id;

    /**  是否车头,1车头,2挂车,默认1 {@link cn.com.g7.sdk.api.enums.TruckHeadStockEnum}
     * todo 属性类型需要根据实际情况调整 增加车辆接口与修改接口不一致
     * */
    @JSONField(name = "isheadstock")
    private Integer isHeadStock;

    /**  所属机构号*/
    private String orgcode;

    public String getPlateNum() {
        return plateNum;
    }

    public SelfTruckUpdateReq setPlateNum(String plateNum) {
        this.plateNum = plateNum;
        return this;
    }

    public String getId() {
        return id;
    }

    public SelfTruckUpdateReq setId(String id) {
        this.id = id;
        return this;
    }

    public Integer getIsHeadStock() {
        return isHeadStock;
    }

    public SelfTruckUpdateReq setIsHeadStock(Integer isHeadStock) {
        this.isHeadStock = isHeadStock;
        return this;
    }

    public String getOrgcode() {
        return orgcode;
    }

    public SelfTruckUpdateReq setOrgcode(String orgcode) {
        this.orgcode = orgcode;
        return this;
    }
}
