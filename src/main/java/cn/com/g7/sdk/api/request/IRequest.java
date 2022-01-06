package cn.com.g7.sdk.api.request;

import java.lang.reflect.Type;

/**
 * 发起请求接口定义
 * @author dengfuwei
 * @version 1.0.0
 * @date 2021/9/17 12:47 下午
 */
public interface IRequest {

    /**
     * 发起请求
     * @param context 请求相关信息
     * @param type 数据类型
     * @return 返回数据
     */
    <T> T request(RequestContext context, Type type);
}
