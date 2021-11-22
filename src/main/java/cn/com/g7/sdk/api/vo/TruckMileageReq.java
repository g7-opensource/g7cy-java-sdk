package cn.com.g7.sdk.api.vo;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 车辆GPS总里程查询 请求参数
 * @author liwenlang
 * @version 1.0.0
 * @date 2021/11/8 11:07
 */
public class TruckMileageReq {

    /** [必传] 车牌号(单次单车调用)*/
    @JSONField(name = "plate_num")
    private String plateNum;

    /** [必传] 开始时间，格式为yyyy-MM-dd HH:mm:ss，时区为GMT+8， 例如：2015-01-01 12:00:00*/
    private String from;

    /** 结束时间，格式为yyyy-MM-dd HH:mm:ss，时区为GMT+8， 例如：2015-01-01 12:00:00*/
    private String to;

    public String getPlateNum() {
        return plateNum;
    }

    public TruckMileageReq setPlateNum(String plateNum) {
        this.plateNum = plateNum;
        return this;
    }

    public String getFrom() {
        return from;
    }

    public TruckMileageReq setFrom(String from) {
        this.from = from;
        return this;
    }

    public String getTo() {
        return to;
    }

    public TruckMileageReq setTo(String to) {
        this.to = to;
        return this;
    }
}
