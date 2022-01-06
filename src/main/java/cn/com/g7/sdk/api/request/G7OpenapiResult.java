package cn.com.g7.sdk.api.request;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 接口返回数据
 * @author dengfuwei
 * @version 1.0.0
 * @date 2021/9/23 5:58 下午
 */
public class G7OpenapiResult<T> {

	private int code;

	private String msg;

	@JSONField(name = "sub_code")
	private int subCode;

	@JSONField(name = "sub_msg")
	private String subMsg;

	@JSONField(name = "req_id")
	private String reqId;

	private T data;

	private Throwable throwable;

	public G7OpenapiResult() {
	}

	public G7OpenapiResult(Throwable throwable) {
		this.code = -1;
		this.throwable = throwable;
	}

	public int getCode() {
		return code;
	}

	public G7OpenapiResult<T> setCode(int code) {
		this.code = code;
		return this;
	}

	public String getMsg() {
		return msg;
	}

	public G7OpenapiResult<T> setMsg(String msg) {
		this.msg = msg;
		return this;
	}

	public int getSubCode() {
		return subCode;
	}

	public G7OpenapiResult<T> setSubCode(int subCode) {
		this.subCode = subCode;
		return this;
	}

	public String getSubMsg() {
		return subMsg;
	}

	public G7OpenapiResult<T> setSubMsg(String subMsg) {
		this.subMsg = subMsg;
		return this;
	}

	public String getReqId() {
		return reqId;
	}

	public G7OpenapiResult<T> setReqId(String reqId) {
		this.reqId = reqId;
		return this;
	}

	public T getData() {
		return data;
	}

	public G7OpenapiResult<T> setData(T data) {
		this.data = data;
		return this;
	}

	public Throwable getThrowable() {
		return throwable;
	}

	public G7OpenapiResult<T> setThrowable(Throwable throwable) {
		this.throwable = throwable;
		return this;
	}
}
