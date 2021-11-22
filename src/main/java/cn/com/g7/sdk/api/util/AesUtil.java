package cn.com.g7.sdk.api.util;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

/**
 * AES-128 ECB加密
 * 字符集:UTF-8
 * 算法模式:ECB
 * 数据块:128位
 * 补码方式:PKCS5Padding
 * 加密结果编码方式:Base64
 *
 * @author dengfuwei
 * @version 1.0.0
 * @date 2021/9/15 11:27 上午
 */
public class AesUtil {

    /** 字符集 */
    private static final String UTF8 = "UTF-8";

    /** 算法 */
    private static final String ALGORITHM = "AES";

    /** 补码方式 */
    private static final String ALGORITHM_CIPHER = "AES/ECB/PKCS5Padding";

    /** 加密密码最大长度*/
    private static final int MAX_KEY_LENGTH = 16;

    /**
     * 获取加密密码对象
     * @param key 密码
     * @return 加密密码对象
     */
    private static SecretKey getSecretKey(String key) {
        byte[] keyBytes = key.getBytes();
        if(keyBytes.length > MAX_KEY_LENGTH) {
            throw new IllegalArgumentException("key 长度必须小于等于16");
        }

        // 创建一个空的16位字节数组（默认值为0）,16byte（128bit）
        byte[] keyData = new byte[MAX_KEY_LENGTH];
        System.arraycopy(keyBytes, 0, keyData, 0, keyBytes.length);
        return new SecretKeySpec(keyData, ALGORITHM);
    }

    /**
     * 加密
     * @param target 待加密数据
     * @param key    密码
     * @return 返回加密成功后数据
     * @throws Exception
     */
    public static byte[] encrypt(byte[] target, String key) throws Exception {
        SecretKey secretKey = getSecretKey(key);
        // Cipher完成加密或解密工作类
        Cipher cipher = Cipher.getInstance(ALGORITHM_CIPHER);
        // 对Cipher初始化，解密模式
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        // 加密data
        return cipher.doFinal(target);
    }

    /**
     * 解密
     * @param target 待解密数据
     * @param key    密码
     * @return 返回解密后的数据
     * @throws Exception
     */
    public static byte[] decrypt(byte[] target, String key) throws Exception {
        SecretKey secretKey = getSecretKey(key);
        //Cipher完成加密或解密工作类
        Cipher cipher = Cipher.getInstance(ALGORITHM_CIPHER);
        //对Cipher初始化，解密模式
        cipher.init(Cipher.DECRYPT_MODE, secretKey);
        //解密data
        return cipher.doFinal(target);
    }

    /**
     * 文本加密
     *
     * @param target 明文
     * @param key    密码
     * @return 返回base64内容
     * @throws Exception
     */
    public static String encryptToBase64String(String target, String key) throws Exception {
        byte[] data = target.getBytes(UTF8);
        byte[] result = encrypt(data, key);
        return Base64.getEncoder().encodeToString(result);
    }

    /**
     * 文本解密
     *
     * @param base64String 待解密文本
     * @param key  密码
     * @return 返回明文
     * @throws Exception
     */
    public static String decryptFromBase64String(String base64String, String key) throws Exception {
        byte[] data = Base64.getDecoder().decode(base64String);
        byte[] contentData = decrypt(data, key);
        return new String(contentData, UTF8);
    }
}
