package cn.com.g7.sdk.api.vo;

/**
 * 按机构查询指定状态设备列表  响应数据
 * @author liwenlang
 * @version 1.0.0
 * @date 2021/10/12 15:23
 */
public class GpsNoStatusListResp {

    /** 符合条件的设备gpsno列表(gpsno用’,’ 隔开)*/
    private String result;

    public String getResult() {
        return result;
    }

    public GpsNoStatusListResp setResult(String result) {
        this.result = result;
        return this;
    }
}
