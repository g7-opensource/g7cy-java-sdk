package cn.com.g7.sdk.api.util;

import cn.com.g7.sdk.api.ApiConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.util.StringUtils;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Map;
import java.util.TreeMap;

/**
 * 签名工具
 *
 * @author dengfuwei
 * @version 1.0.0
 * @date 2021/9/24 9:21 上午
 */
public class SignUtil {

    private static final Logger log = LoggerFactory.getLogger(SignUtil.class);

    /**
     * 计算签名
     *
     * @param secret  APP密钥
     * @param method  HttpMethod
     * @param path    请求的uri
     * @param headers 请求头
     * @param queries 查询参数
     * @param bodies  RequestBody
     * @return 签名后的字符串
     */
    public static String sign(String secret, String method, String path,
                              Map<String, String> headers,
                              Map<String, String> queries,
                              Map<String, String> bodies) {
        try {
            Mac hmacSha256 = Mac.getInstance(ApiConstants.HMAC_SHA256);
            byte[] keyBytes = secret.getBytes(StandardCharsets.UTF_8);
            hmacSha256.init(new SecretKeySpec(keyBytes, 0, keyBytes.length, ApiConstants.HMAC_SHA256));

            String stringToSign = buildStringToSign(method, path, headers, queries, bodies);

            String sign = Base64.getEncoder().encodeToString(hmacSha256.doFinal(stringToSign.getBytes(StandardCharsets.UTF_8)));
            if (log.isDebugEnabled()) {
                log.debug("sign:{} -> {}", stringToSign, sign);
            }
            return sign;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static String buildStringToSign(String method, String path,
                                            Map<String, String> headers,
                                            Map<String, String> queries,
                                            Map<String, String> bodies) {
        StringBuilder sb = new StringBuilder();

        sb.append(method.toUpperCase()).append(ApiConstants.LF);
        if (null != headers) {

            if (null != headers.get(ApiConstants.HTTP_HEADER_CONTENT_MD5)) {
                sb.append(headers.get(ApiConstants.HTTP_HEADER_CONTENT_MD5));
            }
            sb.append(ApiConstants.LF);
            if (null != headers.get(HttpHeaders.CONTENT_TYPE)) {
                sb.append(headers.get(HttpHeaders.CONTENT_TYPE));
            }
            sb.append(ApiConstants.LF);
            if (null != headers.get(ApiConstants.HTTP_HEADER_G7_TIMESTAMP)) {
                sb.append(headers.get(ApiConstants.HTTP_HEADER_G7_TIMESTAMP));
            }
        }

        sb.append(ApiConstants.LF);
        sb.append(buildHeaders(headers));
        sb.append(buildResource(path, queries, bodies));

        return sb.toString();
    }

    /**
     * 构建待签名Path+Query+BODY
     *
     * @param path    请求的uri
     * @param queries 查询参数
     * @param bodies  RequestBody
     * @return 待签名
     */
    private static String buildResource(String path, Map<String, String> queries, Map<String, String> bodies) {
        StringBuilder sb = new StringBuilder();

        if (!StringUtils.isEmpty(path)) {
            if (path.startsWith(ApiConstants.PATH_CUSTOM)) {
                path = path.replaceFirst(ApiConstants.PATH_CUSTOM, "");
            }
            sb.append(path);
        }
        Map<String, String> sortMap = new TreeMap<>();
        if (null != queries) {
            for (Map.Entry<String, String> query : queries.entrySet()) {
                if (!StringUtils.isEmpty(query.getKey()) && !StringUtils.isEmpty(query.getValue())) {
                    sortMap.put(query.getKey(), query.getValue());
                }
            }
        }

        if (null != bodies) {
            for (Map.Entry<String, String> body : bodies.entrySet()) {
                if (!StringUtils.isEmpty(body.getKey())) {
                    sortMap.put(body.getKey(), body.getValue());
                }
            }
        }

        StringBuilder sbParam = new StringBuilder();
        for (Map.Entry<String, String> item : sortMap.entrySet()) {
            if (!StringUtils.isEmpty(item.getKey())) {
                if (0 < sbParam.length()) {
                    sbParam.append(ApiConstants.SPE3_CONNECT);
                }
                sbParam.append(item.getKey());
                if (!StringUtils.isEmpty(item.getValue())) {
                    sbParam.append(ApiConstants.SPE4_EQUAL).append(item.getValue());
                }
            }
        }
        if (0 < sbParam.length()) {
            sb.append(ApiConstants.SPE5_QUESTION);
            sb.append(sbParam);
        }

        return sb.toString();
    }

    /**
     * 构建待签名Http头
     *
     * @param headers 请求中所有的Http头
     * @return 待签名Http头
     */
    private static String buildHeaders(Map<String, String> headers) {
        StringBuilder sb = new StringBuilder();

        if (null != headers) {
            Map<String, String> sortMap = new TreeMap<>();
            //对于header头值，转成小写了之后再排序
            for (Map.Entry<String, String> header : headers.entrySet()) {
                sortMap.put(header.getKey().toLowerCase(), header.getValue());
            }


            for (Map.Entry<String, String> header : sortMap.entrySet()) {
                if (isHeaderToSignByPrefix(header.getKey())) {
                    sb.append(header.getKey());
                    sb.append(ApiConstants.SPE2_COLON);
                    if (!StringUtils.isEmpty(header.getValue())) {
                        sb.append(header.getValue());
                    }
                    sb.append(ApiConstants.LF);

                }
            }
        }

        return sb.toString();
    }

    /**
     * Http头是否参与签名 return
     */
    private static boolean isHeaderToSignByPrefix(String headerName) {
        if (StringUtils.isEmpty(headerName)) {
            return false;
        }

        return headerName.toLowerCase().startsWith(ApiConstants.CA_HEADER_TO_SIGN_PREFIX_SYSTEM.toLowerCase());
    }
}
