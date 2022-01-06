package cn.com.g7.sdk.api.enums;

/**
 * 是否返回总条数
 * @author liwenlang
 * @version 1.0.0
 * @date 2021/10/12 16:01
 */
public enum GetCountEnum {

    /** 返回总条数  1获取*/
    OBTAIN(1);
    private final Integer code;

    GetCountEnum(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }
}
