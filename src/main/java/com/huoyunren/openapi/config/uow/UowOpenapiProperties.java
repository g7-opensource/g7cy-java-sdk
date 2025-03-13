package com.huoyunren.openapi.config.uow;

import com.huoyunren.openapi.constant.ApiConstants;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author luoyu
 * @version 1.0.0
 */
@ConfigurationProperties(prefix = "g7.openapi")
public class UowOpenapiProperties {

    /** url*/
    private String url = ApiConstants.URL_ONLINE;

    /** accessKey*/
    private String accessKey;

    /** accessSecret*/
    private String accessSecret;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

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
