package cn.com.g7.sdk.api.vo;

import java.util.List;

/**
 * 温度明细 响应数据
 * @author liwenlang
 * @version 1.0.0
 * @date 2021/11/8 17:14
 */
public class DailyTemperatureResp {

    /** 温度明细 */
    private List<DailyTemperature> result;

    /** 页码 */
    private Integer pageNo;

    /** 页面大小 */
    private Integer pageSize;

    /** 总数 */
    private Integer totalCount;

    public List<DailyTemperature> getResult() {
        return result;
    }

    public DailyTemperatureResp setResult(List<DailyTemperature> result) {
        this.result = result;
        return this;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public DailyTemperatureResp setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public DailyTemperatureResp setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public DailyTemperatureResp setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
}
