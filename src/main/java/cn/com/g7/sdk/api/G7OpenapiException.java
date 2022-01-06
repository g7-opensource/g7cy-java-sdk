package cn.com.g7.sdk.api;

/**
 * @author dengfuwei
 * @version 1.0.0
 * @date 2021/9/23 5:17 下午
 */
public class G7OpenapiException extends RuntimeException{

    private static final long serialVersionUID = 6618950837255925995L;

    public G7OpenapiException(String message) {
        super(message);
    }

    public G7OpenapiException(String message, Throwable cause) {
        super(message, cause);
    }
}
