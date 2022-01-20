package cn.com.g7.sdk.api;

/**
 * 通用常量
 * @author dengfuwei
 * @version 1.0.0
 * @date 2021/9/17 1:56 下午
 */
public final class ApiConstants {

    private ApiConstants() {
        throw new IllegalStateException("Illegal operation");
    }

    /** 线上环境开放平台接口host*/
    public static final String URL_ONLINE = "https://openapi.huoyunren.com";

    /** 沙箱环境开放平台接口host*/
    public static final String URL_SANDBOX = "https://demo.dsp.chinawayltd.com/altair/rest/";

    /** 签名算法HmacSha256 */
    public static final String HMAC_SHA256 = "HmacSHA256";

    /** 签名头的前缀*/
    public static final String AUTH_PREFIX = "g7ac";

    /** 换行符 */
    public static final String LF = "\n";

    /** 示意符 */
    public static final String SPE2_COLON = ":";

    /** 连接符 */
    public static final String SPE3_CONNECT = "&";

    /** 赋值符*/
    public static final String SPE4_EQUAL = "=";

    /** 问号符*/
    public static final String SPE5_QUESTION = "?";

    /** custom */
    public static final String PATH_CUSTOM = "/custom";

    /** 请求头，body内容MD5 有body时必传 */
    public static final String HTTP_HEADER_CONTENT_MD5 = "Content-MD5";

    /** 请求头，当前时间，必传*/
    public static final String HTTP_HEADER_G7_TIMESTAMP= "X-G7-OpenAPI-Timestamp";

    /** 请求头，请求方式，标记请求方式，方便统计*/
    public static final String HTTP_HEADER_REQUEST_TYPE= "REQUEST_TYPE";

    /** 请求头，请求方式SDK版本*/
    public static final String HTTP_REQUEST_SDK= "G7CY_SDK_v20211216-SNAPSHOT";

    /** 参与签名的系统Header前缀,只有指定前缀的Header才会参与到签名中 */
    public static final String CA_HEADER_TO_SIGN_PREFIX_SYSTEM = "X-G7-Ca-";

    /** 签名Header */
    public static final String X_CA_SIGNATURE = "Authorization";

    /** 请求响应码 */
    public static final int RESULT_CODE = 0;

    /** 响应超时 单位s*/
    public static final long READ_TIMEOUT = 15L;

    /** 连接超时 单位s*/
    public static final long CONNECT_TIMEOUT = 5L;

}
