package cn.com.g7.sdk.api.vo;

/**
 * 根据设备查询车辆状态 查询参数
 * @author liwenlang
 * @version 1.0.0
 * @date 2021/11/8 15:25
 */
public class CurrentInfoByGpsNoReq extends CurrentInfoReq{

    /** 设备号(单次单设备调用)*/
    private String gpsno;

    public String getGpsno() {
        return gpsno;
    }

    public CurrentInfoByGpsNoReq setGpsno(String gpsno) {
        this.gpsno = gpsno;
        return this;
    }
}
