package cn.com.g7.sdk.api.enums;

/**
 * 列表查询数据状态
 * @author liwenlang
 * @version 1.0.0
 * @date 2021/10/12 16:05
 */
public enum DataStatusEnum {

    /** 0:未删除 */
    UN_DELETE(0),
    /** 1:已删除 */
    DELETED(1),
    /** 2:全部*/
    ALL(2);

    private final Integer code;

    DataStatusEnum(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }
}
