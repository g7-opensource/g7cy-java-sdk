package com.huoyunren.openapi.exception.uow;

import com.huoyunren.openapi.enums.uow.ErrorCode;

public class BizException extends RuntimeException {
    // 错误码枚举
    private final ErrorCode errorCode;

    /**
     * 构造函数
     *
     * @param errorCode 错误码枚举
     */
    public BizException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }

    /**
     * 构造函数（支持异常链）
     *
     * @param errorCode 错误码枚举
     * @param cause     原始异常
     */
    public BizException(ErrorCode errorCode, Throwable cause) {
        super(errorCode.getMessage(), cause);
        this.errorCode = errorCode;
    }

    // Getter 方法
    public ErrorCode getErrorCode() {
        return errorCode;
    }

    @Override
    public String toString() {
        return "BusinessException{" + "errorCode=" + errorCode + '}';
    }
}