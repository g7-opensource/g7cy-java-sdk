package cn.com.g7.sdk.api.vo;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 车辆标签实体类
 *
 * @author zhaobijiang
 * @date 2021/11/16
 */
public class FaceTruckLabel {

    /**
     * 车辆编号
     */
    @JSONField(name = "plate_num")
    private String plateNum;

    /**
     * 车辆标签
     */
    private String label;

    public String getPlateNum() {
        return plateNum;
    }

    public void setPlateNum(String plateNum) {
        this.plateNum = plateNum;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
