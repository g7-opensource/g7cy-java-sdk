package com.huoyunren.openapi.util.http;

import com.huoyunren.openapi.constant.ApiConstants;
import com.huoyunren.openapi.enums.uow.UowApiEnum;
import java.time.Duration;
import lombok.Getter;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.client.RestTemplate;

/**
 * 接口调用客户端
 *
 * 使用方式 1. 根据构造方法创建客户端bean：G7OpenapiClient（可以根据spring boot配置properties或自定义 new G7OpenapiClient(...))，详见README.md 2.
 * 调用接口，每个 G7OpenapiClient 方法代表一个接口
 *
 * @version 1.0.0
 */
@Getter
public class G7OpenapiClient {

    /** 开放平台host，不同环境不一样 */
    private final String url;

    /** 认证accessKey */
    private final String accessKey;

    /** 认证accessSecret */
    private final String accessSecret;

    /** 发起请求的具体实现类 */
    private final IRequest request;

    public G7OpenapiClient(String accessKey, String accessSecret) {
        this.url = ApiConstants.URL_ONLINE;
        this.accessKey = accessKey;
        this.accessSecret = accessSecret;
        RestTemplate restTemplate =
            new RestTemplateBuilder().setReadTimeout(Duration.ofSeconds(ApiConstants.READ_TIMEOUT))
                .setConnectTimeout(Duration.ofSeconds(ApiConstants.CONNECT_TIMEOUT)).build();
        this.request = new RestTemplateRequest(restTemplate);
    }

    public G7OpenapiClient(String url, String accessKey, String accessSecret) {
        this.url = url;
        this.accessKey = accessKey;
        this.accessSecret = accessSecret;
        RestTemplate restTemplate =
            new RestTemplateBuilder().setReadTimeout(Duration.ofSeconds(ApiConstants.READ_TIMEOUT))
                .setConnectTimeout(Duration.ofSeconds(ApiConstants.CONNECT_TIMEOUT)).build();
        this.request = new RestTemplateRequest(restTemplate);
    }

    public G7OpenapiClient(String accessKey, String accessSecret, Long connectTimeout, Long readTimeout) {
        this.url = ApiConstants.URL_ONLINE;
        this.accessKey = accessKey;
        this.accessSecret = accessSecret;
        RestTemplate restTemplate = new RestTemplateBuilder().setReadTimeout(Duration.ofSeconds(readTimeout))
            .setConnectTimeout(Duration.ofSeconds(connectTimeout)).build();
        this.request = new RestTemplateRequest(restTemplate);
    }

    public G7OpenapiClient(String url, String accessKey, String accessSecret, Long connectTimeout, Long readTimeout) {
        this.url = url;
        this.accessKey = accessKey;
        this.accessSecret = accessSecret;
        RestTemplate restTemplate = new RestTemplateBuilder().setReadTimeout(Duration.ofSeconds(readTimeout))
            .setConnectTimeout(Duration.ofSeconds(connectTimeout)).build();
        this.request = new RestTemplateRequest(restTemplate);
    }

    public G7OpenapiClient(String url, String accessKey, String accessSecret, IRequest request) {
        this.url = url;
        this.accessKey = accessKey;
        this.accessSecret = accessSecret;
        this.request = request;
    }

    public RequestContext buildContext(UowApiEnum api) {
        RequestContext context = new RequestContext();
        context.setUrl(url);
        context.setUri(api.getUri());
        context.setMethod(api.getMethod());
        context.setAccessKey(accessKey);
        context.setAccessSecret(accessSecret);
        return context;
    }

}
