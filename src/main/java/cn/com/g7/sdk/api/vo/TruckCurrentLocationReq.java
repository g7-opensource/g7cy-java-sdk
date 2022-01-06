package cn.com.g7.sdk.api.vo;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 车辆当前定位V1.0 请求参数
 * @author liwenlang
 * @version 1.0.0
 * @date 2021/11/4 11:09
 */
public class TruckCurrentLocationReq {

    /**
     * 车牌号
     * @required
     */
    @JSONField(name = "plate_num")
    private String plateNum;

    /**
     * 坐标系类型(支持参数值:baidu.如不传该参数，则默认为火星坐标)
     */
    private String map;

    public String getPlateNum() {
        return plateNum;
    }

    public TruckCurrentLocationReq setPlateNum(String plateNum) {
        this.plateNum = plateNum;
        return this;
    }

    public String getMap() {
        return map;
    }

    public TruckCurrentLocationReq setMap(String map) {
        this.map = map;
        return this;
    }
}
