package cn.com.g7.sdk.api.vo;

/**
 * 查询司机列表记录数响应数据
 * @author liwenlang
 * @version 1.0.0
 * @date 2021/10/12 16:09
 */
public class DriverListCountResp {


    /** 只有参数设置get_count == 1时，才返回 todo 开放平台字段缺失*/
    private Integer total;

    public Integer getTotal() {
        return total;
    }

    public DriverListCountResp setTotal(Integer total) {
        this.total = total;
        return this;
    }
}
