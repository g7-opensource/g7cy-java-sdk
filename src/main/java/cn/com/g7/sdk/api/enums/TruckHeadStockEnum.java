package cn.com.g7.sdk.api.enums;

/**
 * 车辆是否为车头
 * @author liwenlang
 * @version 1.0.0
 * @date 2021/10/12 13:55
 */
public enum TruckHeadStockEnum {

    /** 车头*/
    HEADSTOCK("1","车头"),

    /** 挂车*/
    TRAILER("2","挂车");

    /** 编号*/
    private final String code;

    /** 名称*/
    private final String name;

    TruckHeadStockEnum(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

}
