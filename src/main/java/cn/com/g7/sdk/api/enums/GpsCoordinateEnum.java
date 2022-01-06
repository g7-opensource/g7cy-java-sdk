package cn.com.g7.sdk.api.enums;

/**
 * 坐标系
 * @author liwenlang
 * @version 1.0.0
 * @date 2021/10/12 09:11
 */
public enum GpsCoordinateEnum {

    /** 谷歌*/
    WGS84("google"),

    /** 百度*/
    BD09("baidu"),

    /** 火星*/
    GCJ02("mars");

    private final String  key;

    GpsCoordinateEnum(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }
}
