package cn.com.g7.sdk.api.util;

import cn.com.g7.sdk.api.G7OpenapiException;

/**
 * 断言工具
 * @author dengfuwei
 * @version 1.0.0
 * @date 2021/10/12 5:56 下午
 */
public class AssertUtil {

    private AssertUtil() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * 不为空断言。如果为空，抛出统一异常进行处理
     * @param obj 判断对象
     */
    public static void notNull(Object obj) {
        if (obj == null) {
            throw new G7OpenapiException("参数异常");
        }
    }

    /**
     * 不为空字符串
     * @param str 判断对象
     */
    public static void notEmpty(String str) {
        if (str == null || str.length() < 1) {
            throw new G7OpenapiException("参数异常");
        }
    }

}
