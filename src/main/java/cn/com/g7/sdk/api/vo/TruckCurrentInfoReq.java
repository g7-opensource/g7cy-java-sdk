package cn.com.g7.sdk.api.vo;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 车辆状态查询参数
 * @author liwenlang
 * @version 1.0.0
 * @date 2021/11/8 10:32
 */
public class TruckCurrentInfoReq  extends CurrentInfoReq{

    /** [必传] 车牌号(单次单车调用)*/
    @JSONField(name = "plate_num")
    private String plateNum;


    public String getPlateNum() {
        return plateNum;
    }

    public TruckCurrentInfoReq setPlateNum(String plateNum) {
        this.plateNum = plateNum;
        return this;
    }

}
