package cn.com.g7.sdk.api.enums;

import org.springframework.http.HttpMethod;

/**
 * @author dengfuwei
 * @version 1.0.0
 * @date 2021/9/23 5:22 下午
 */
public enum MethodEnum {

    /** get请求*/
    GET(HttpMethod.GET),

    /** 参数在路径的post请求*/
    POST(HttpMethod.POST),

    /** 参数在body的post请求*/
    POST_BODY(HttpMethod.POST);

    private final HttpMethod method;

    MethodEnum(HttpMethod method) {
        this.method = method;
    }

    public HttpMethod getMethod() {
        return method;
    }
}
