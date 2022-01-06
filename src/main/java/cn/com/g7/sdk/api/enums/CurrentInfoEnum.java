package cn.com.g7.sdk.api.enums;

/**
 *车辆状态查询 附加字段枚举常量
 * @author liwenlang
 * @version 1.0.0
 * @date 2021/10/9 15:43
 */
public enum CurrentInfoEnum {

    /** 状态信息*/
    STATUS("status"),

    /** 位置信息*/
    LOC("loc"),

    /** 司机信息*/
    DRIVER("driver"),

    /** 冷链信息*/
    COLD("cold");

    private final String  field;

    CurrentInfoEnum(String field) {
        this.field = field;
    }

    public String getField() {
        return field;
    }
}
