package cn.com.g7.sdk.api.vo;

/**
 * 车辆列表 查询总数响应数据
 * @author liwenlang
 * @version 1.0.0
 * @date 2021/10/18 13:48
 */
public class TruckListCountResp {

    /** 只有参数设置get_count == 1时，才返回 todo 开放平台字段缺失*/
    private Integer total;

    public Integer getTotal() {
        return total;
    }

    public TruckListCountResp setTotal(Integer total) {
        this.total = total;
        return this;
    }
}
