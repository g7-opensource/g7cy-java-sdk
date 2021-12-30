package cn.com.g7.sdk.api;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author dengfuwei
 * @version 1.0.0
 * @date 2021/12/16 6:33 下午
 */
@ConfigurationProperties(prefix = "g7.openapi")
public class OpenapiProperties {

    /** url*/
    private final String url = ApiConstants.URL_ONLINE;

    /** accessKey*/
    private String accessKey;

    /** accessSecret*/
    private String accessSecret;

    public String getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public String getAccessSecret() {
        return accessSecret;
    }

    public void setAccessSecret(String accessSecret) {
        this.accessSecret = accessSecret;
    }
}
