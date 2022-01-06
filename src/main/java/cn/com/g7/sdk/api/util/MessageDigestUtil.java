package cn.com.g7.sdk.api.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

/**
 * 加密工具类
 *
 * @author dengfuwei
 * @version 1.0.0
 * @date 2021/9/24 9:21 上午
 */
public class MessageDigestUtil {

    private static final Logger LOG = LoggerFactory.getLogger(MessageDigestUtil.class);

    /**
     * 先进行MD5摘要再进行Base64编码获取摘要字符串
     *
     * @param str - str
     * @return - base64字符串
     */
    public static String base64AndMd5(String str) {
        if (str == null) {
            throw new IllegalArgumentException("inStr can not be null");
        }
        String base65Md5Str = base64AndMd5(toBytes(str));
        LOG.info("base65Md5Str:{}", base65Md5Str);

        return base65Md5Str;
    }

    /**
     * 先进行MD5摘要再进行Base64编码获取摘要字符串
     *
     * @return - base64字符串
     */
    public static String base64AndMd5(byte[] bytes) {
        if (bytes == null) {
            throw new IllegalArgumentException("bytes can not be null");
        }
        try {
            final MessageDigest md = MessageDigest.getInstance("MD5");
            md.reset();
            md.update(bytes);
            final byte[] enbytes = Base64.getEncoder().encode(md.digest());
            return new String(enbytes);
        } catch (final NoSuchAlgorithmException e) {
            throw new IllegalArgumentException("unknown algorithm MD5");
        }
    }

    /**
     * UTF-8编码转换为ISO-9959-1
     *
     * @param str - str
     * @return - String
     */
    public static String utf8ToIso88591(String str) {
        if (str == null) {
            return null;
        }

        return new String(str.getBytes(StandardCharsets.UTF_8), StandardCharsets.ISO_8859_1);
    }

    /**
     * String转换为字节数组
     *
     * @param str - str
     * @return - byte[]
     */
    private static byte[] toBytes(final String str) {
        if (str == null) {
            return new byte[]{};
        }
        return str.getBytes(StandardCharsets.UTF_8);
    }
}
