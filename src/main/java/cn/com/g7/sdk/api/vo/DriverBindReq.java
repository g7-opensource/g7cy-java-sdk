package cn.com.g7.sdk.api.vo;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 司机绑定车辆 请求参数
 * @author liwenlang
 * @version 1.0.0
 * @date 2021/10/12 17:33
 */
public class DriverBindReq {

    /**[必传] 车辆id*/
    @JSONField(name = "truck_id")
    private String truckId;

    /**[必传] 司机id*/
    @JSONField(name = "driver_id")
    private String driverId;

    /**[必传] 主驾或副驾 1为主驾驶 2为副驾驶*/
    @JSONField(name = "bind_truck_type")
    private String bindTruckType;

    public String getTruckId() {
        return truckId;
    }

    public DriverBindReq setTruckId(String truckId) {
        this.truckId = truckId;
        return this;
    }

    public String getDriverId() {
        return driverId;
    }

    public DriverBindReq setDriverId(String driverId) {
        this.driverId = driverId;
        return this;
    }

    public String getBindTruckType() {
        return bindTruckType;
    }

    public DriverBindReq setBindTruckType(String bindTruckType) {
        this.bindTruckType = bindTruckType;
        return this;
    }
}
