package com.huoyunren.openapi.util.auth;

import com.huoyunren.openapi.exception.G7OpenapiException;

/**
 * 断言工具
 *
 * @version 1.0.0
 */
public class AssertUtil {

    private AssertUtil() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * 不为空断言。如果为空，抛出统一异常进行处理
     *
     * @param obj 判断对象
     */
    public static void notNull(Object obj) {
        if (obj == null) {
            throw new G7OpenapiException("参数异常");
        }
    }

    /**
     * 不为空字符串
     *
     * @param str 判断对象
     */
    public static void notEmpty(String str) {
        if (str == null || str.length() < 1) {
            throw new G7OpenapiException("参数异常");
        }
    }

}
