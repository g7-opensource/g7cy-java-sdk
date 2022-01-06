package cn.com.g7.sdk.api.vo;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 车辆设备解绑参数
 * @author liwenlang
 * @version 1.0.0
 * @date 2021/10/12 15:43
 */
public class DeviceUnbindReq {

    /**
     * [必传]
     * 设备与车辆ID列表，
     * 或者设备与车辆OWN ID列表，JSON格式,注意：body参数会被整体json解析，
     * 所以如果参数中的值需要传入json格式则需要反转义参数值中json的双引号，device_list为数组形式，包含字段为:truckId,gpsno,truckOwnId,
     * 例如: [{\"truckId\":\"05D0EECD846F7C1D4CFC33591CBF7360\",\"gpsno\":\"91251572\"}]
     * */
    @JSONField(name = "device_list")
    private String deviceList;

    /** [必传] 机构号*/
    private String orgcode;

    public String getDeviceList() {
        return deviceList;
    }

    public DeviceUnbindReq setDeviceList(String deviceList) {
        this.deviceList = deviceList;
        return this;
    }

    public String getOrgcode() {
        return orgcode;
    }

    public DeviceUnbindReq setOrgcode(String orgcode) {
        this.orgcode = orgcode;
        return this;
    }
}
