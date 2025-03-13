package com.huoyunren.openapi.enums.uow;

import com.huoyunren.openapi.enums.MethodEnum;

/**
 * api地址常量
 *
 * @version 1.0.0
 */
public enum UowApiEnum {

    /** 批量创建订单 */
    BATCH_CREATE_ORDERS("v1/openapi/order/batch_create", MethodEnum.POST_BODY),

    /** 批量更新订单 */
    BATCH_UPDATE_ORDERS("v1/openapi/order/batch_update", MethodEnum.POST_BODY),


    ;

    /** 接口地址*/
    private final String uri;

    /** 请求方式*/
    private final MethodEnum method;

    UowApiEnum(String uri, MethodEnum method) {
        this.uri = uri;
        this.method = method;
    }

    /**
     * Gets uri.
     *
     * @return the uri
     */
    public String getUri() {
        return uri;
    }

    /**
     * Gets method.
     *
     * @return the method
     */
    public MethodEnum getMethod() {
        return method;
    }
}
