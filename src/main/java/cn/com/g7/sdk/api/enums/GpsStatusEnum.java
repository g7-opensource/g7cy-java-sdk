package cn.com.g7.sdk.api.enums;

/**
 * Gps 状态
 * @author liwenlang
 * @version 1.0.0
 * @date 2021/10/12 14:36
 */
public enum GpsStatusEnum {

    /** 无法定位*/
    UNABLE_LOCATE("0","无法定位"),

    /** 信号中断*/
    SIGNAL_INTERRUPT("1","信号中断"),

    /** 未定位*/
    NOT_LOCATED("2","未定位"),

    /** 车辆静止*/
    NO_MOVEMENT("3","车辆禁止"),

    /** 车辆运动中*/
    IN_MOVEMENT("4","车辆运动中"),

    /** 未启用*/
    NOT_ENABLED("6","未启用");

    private final String code;

    private final String statusName;

    GpsStatusEnum(String code, String statusName) {
        this.code = code;
        this.statusName = statusName;
    }

    public String getCode() {
        return code;
    }

    public String getStatusName() {
        return statusName;
    }
}
