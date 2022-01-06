package cn.com.g7.sdk.api.util;

import com.alibaba.fastjson.JSON;

import java.lang.reflect.Type;

/**
 * Json工具
 * @author dengfuwei
 * @version 1.0.0
 * @date 2021/9/17 2:15 下午
 */
public class JsonUtil {

    public static String toJson(Object obj) {
        return JSON.toJSONString(obj);
    }

    public static <T> T parse(String json, Class<T> clazz) {
        return JSON.parseObject(json, clazz);
    }

    public static <T> T parse(String json, Type type) {
        return JSON.parseObject(json, type);
    }
}
