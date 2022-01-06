package cn.com.g7.sdk.api.vo;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 车辆GPS总里程查询 响应参数
 * @author liwenlang
 * @version 1.0.0
 * @date 2021/11/8 13:54
 */
public class TruckMileageResp {

    /** 总里程(单位:cm)*/
    @JSONField(name = "total_mileage")
    private Integer totalMileage;

    public Integer getTotalMileage() {
        return totalMileage;
    }

    public TruckMileageResp setTotalMileage(Integer totalMileage) {
        this.totalMileage = totalMileage;
        return this;
    }
}
