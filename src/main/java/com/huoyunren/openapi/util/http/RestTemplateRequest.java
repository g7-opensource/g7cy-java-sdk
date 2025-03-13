package com.huoyunren.openapi.util.http;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.huoyunren.openapi.constant.ApiConstants;
import com.huoyunren.openapi.enums.MethodEnum;
import com.huoyunren.openapi.exception.G7OpenapiException;
import com.huoyunren.openapi.util.JsonUtil;
import com.huoyunren.openapi.util.auth.SignUtil;
import com.huoyunren.openapi.util.auth.MessageDigestUtil;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Type;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestTemplate;

/**
 * 基于 RestTemplate 的请求实现
 *
 * @author luoyu
 * @version 1.0.0
 */
public class RestTemplateRequest implements IRequest {

    private final Logger log = LoggerFactory.getLogger(RestTemplateRequest.class);

    private final RestTemplate restTemplate;

    public RestTemplateRequest(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public <T> T request(RequestContext context, Type type) {
        long start = System.currentTimeMillis();
        if (context.getHeaders() == null) {
            context.setHeaders(new HashMap<>(1));
        }
        context.getHeaders().put(ApiConstants.HTTP_HEADER_G7_TIMESTAMP, String.valueOf(System.currentTimeMillis()));
        if (!context.getHeaders().containsKey(HttpHeaders.CONTENT_TYPE)) {
            context.getHeaders().put(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE);
        }
        if (MethodEnum.POST_BODY.equals(context.getMethod())) {
            context.getHeaders()
                .put(ApiConstants.HTTP_HEADER_CONTENT_MD5, MessageDigestUtil.base64AndMd5(context.getBody()));
        }

        context.getHeaders().put(ApiConstants.HTTP_HEADER_REQUEST_TYPE, ApiConstants.HTTP_REQUEST_SDK);
        String sign = SignUtil.sign(context.getAccessSecret(), context.getMethod().getMethod().name(), context.getUri(),
            context.getHeaders(), context.getQuery(), null);
        context.getHeaders().put(ApiConstants.X_CA_SIGNATURE,
            ApiConstants.AUTH_PREFIX + " " + context.getAccessKey() + ApiConstants.SPE2_COLON + sign);

        HttpHeaders httpHeaders = new HttpHeaders();
        for (Map.Entry<String, String> entry : context.getHeaders().entrySet()) {
            httpHeaders.set(entry.getKey(), MessageDigestUtil.utf8ToIso88591(entry.getValue()));
        }
        HttpEntity<String> request =
            new HttpEntity<>(StringUtils.isEmpty(context.getBody()) ? null : context.getBody(), httpHeaders);
        try {
            ResponseEntity<String> entity =
                restTemplate.exchange(buildUrl(context.getUrl(), context.getUri(), context.getQuery()),
                    context.getMethod().getMethod(), request, String.class);
            context.setStatus(entity.getStatusCodeValue());
            context.setResult(entity.getBody());

            JSONObject obj = JSON.parseObject(entity.getBody());
            G7OpenapiResult<T> result;
            Object data = obj.get("data");
            if (data instanceof String) {
                result = obj.toJavaObject(new TypeReference<G7OpenapiResult<String>>() {
                });
                if (StringUtils.isEmpty(result.getData())) {
                    result.setData(null);
                }
            } else {
                result = obj.toJavaObject(type);
            }
            if (result.getCode() != ApiConstants.RESULT_CODE) {
                throw new G7OpenapiException(result.getMsg());
            }
            if (result.getSubCode() != ApiConstants.RESULT_CODE) {
                throw new G7OpenapiException(result.getSubMsg());
            }

            if (log.isInfoEnabled()) {
                log.info("openapi request success,use time:{} ms,context:{}", (System.currentTimeMillis() - start),
                    JsonUtil.toJson(context));
            }

            return result.getData();
        } catch (G7OpenapiException e) {
            log.warn("openapi request failed,use time:{} ms,context:{}", (System.currentTimeMillis() - start),
                JsonUtil.toJson(context));
            throw e;
        } catch (Throwable e) {
            log.error("openapi request occurred exception,use time:{} ms,context:{}",
                (System.currentTimeMillis() - start), JsonUtil.toJson(context), e);
            throw new G7OpenapiException("request failed", e);
        }
    }

    public URI buildUrl(String url, String uri, Map<String, String> queryParams) throws URISyntaxException {
        return CollectionUtils.isEmpty(queryParams) ? new URI(url + uri)
            : new URI(url + uri + "?" + buildParam(queryParams));
    }

    public String buildParam(Map<String, String> param) {
        StringBuilder paramBuilder = new StringBuilder();
        param.forEach((key, value) -> {
            if (!StringUtils.isEmpty(value)) {
                if (paramBuilder.length() > 0) {
                    paramBuilder.append("&");
                }
                try {
                    paramBuilder.append(key).append("=").append(URLEncoder.encode(value, "UTF-8"));
                } catch (UnsupportedEncodingException e) {
                    log.error("UnsupportedEncodingException", e);
                }
            }
        });
        return paramBuilder.toString();
    }
}
