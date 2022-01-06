package cn.com.g7.sdk.api.request;

import cn.com.g7.sdk.api.enums.MethodEnum;

import java.util.Map;

/**
 * 记录请求相关数据
 * @author dengfuwei
 * @version 1.0.0
 * @date 2021/9/23 5:23 下午
 */
public class RequestContext {

    /** 开放平台地址*/
    private String url;

    /** 接口地址*/
    private String uri;

    /** 请求方式*/
    private MethodEnum method;

    /** 认证key*/
    private String accessKey;

    /** 认证secret*/
    private String accessSecret;

    /** query参数*/
    private Map<String, String> query;

    /** form参数*/
    private Map<String, String> formData;

    /** 自定义请求头*/
    private Map<String, String> headers;

    /** body参数*/
    private String body;

    /** 返回状态码*/
    private int status;

    /** 返回结果*/
    private String result;

    public String getUrl() {
        return url;
    }

    public RequestContext setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getUri() {
        return uri;
    }

    public RequestContext setUri(String uri) {
        this.uri = uri;
        return this;
    }

    public MethodEnum getMethod() {
        return method;
    }

    public RequestContext setMethod(MethodEnum method) {
        this.method = method;
        return this;
    }

    public String getAccessKey() {
        return accessKey;
    }

    public RequestContext setAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }

    public String getAccessSecret() {
        return accessSecret;
    }

    public RequestContext setAccessSecret(String accessSecret) {
        this.accessSecret = accessSecret;
        return this;
    }

    public Map<String, String> getQuery() {
        return query;
    }

    public RequestContext setQuery(Map<String, String> query) {
        this.query = query;
        return this;
    }

    public Map<String, String> getFormData() {
        return formData;
    }

    public RequestContext setFormData(Map<String, String> formData) {
        this.formData = formData;
        return this;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public RequestContext setHeaders(Map<String, String> headers) {
        this.headers = headers;
        return this;
    }

    public String getBody() {
        return body;
    }

    public RequestContext setBody(String body) {
        this.body = body;
        return this;
    }

    public int getStatus() {
        return status;
    }

    public RequestContext setStatus(int status) {
        this.status = status;
        return this;
    }

    public String getResult() {
        return result;
    }

    public RequestContext setResult(String result) {
        this.result = result;
        return this;
    }
}
