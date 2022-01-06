package cn.com.g7.sdk.api.vo;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 车辆历史轨迹查询 请求参数
 * @author liwenlang
 * @version 1.0.0
 * @date 2021/11/8 11:07
 */
public class TruckHistoryLocationReq extends HistoryLocationReq{

    /** [必传] 车牌号(单次单车调用)*/
    @JSONField(name = "plate_num")
    private String plateNum;

    public String getPlateNum() {
        return plateNum;
    }

    public TruckHistoryLocationReq setPlateNum(String plateNum) {
        this.plateNum = plateNum;
        return this;
    }

}
