package cn.com.g7.sdk.api.vo;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 车辆设备绑定 请求参数
 * @author liwenlang
 * @version 1.0.0
 * @date 2021/10/12 15:31
 */
public class DeviceBindReq {

    /** 车辆id*/
    @JSONField(name = "truck_id")
    private String truckId;

    /** 车辆OWN id*/
    @JSONField(name = "truck_own_id")
    private String truckOwnId;

    /** [必传] 设备号*/
    private Integer gpsno;

    public String getTruckId() {
        return truckId;
    }

    public DeviceBindReq setTruckId(String truckId) {
        this.truckId = truckId;
        return this;
    }

    public String getTruckOwnId() {
        return truckOwnId;
    }

    public DeviceBindReq setTruckOwnId(String truckOwnId) {
        this.truckOwnId = truckOwnId;
        return this;
    }

    public Integer getGpsno() {
        return gpsno;
    }

    public DeviceBindReq setGpsno(Integer gpsno) {
        this.gpsno = gpsno;
        return this;
    }
}
