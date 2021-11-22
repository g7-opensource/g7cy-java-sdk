package cn.com.g7.sdk.api.vo;

/**
 * 根据设备查询车辆历史轨迹 请求参数
 * @author liwenlang
 * @version 1.0.0
 * @date 2021/11/8 16:14
 */
public class TruckHistoryLocationByGpsNoReq extends HistoryLocationReq{

    /** 设备号，只支持单个*/
    private Integer gpsno;

    public Integer getGpsno() {
        return gpsno;
    }

    public TruckHistoryLocationByGpsNoReq setGpsno(Integer gpsno) {
        this.gpsno = gpsno;
        return this;
    }
}
