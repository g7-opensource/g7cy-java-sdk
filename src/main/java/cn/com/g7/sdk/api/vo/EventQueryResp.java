package cn.com.g7.sdk.api.vo;

import java.util.List;

/**
 * 根据车辆，司机，机构查询事件 响应数据
 * @author liwenlang
 * @version 1.0.0
 * @date 2021/11/8 15:06
 */
public class EventQueryResp {

    /** 第几页*/
    private Integer pageNo;

    /**每页记录数 */
    private Integer pageSize;

    /** 响应数据*/
    private List<Event> result;

    /** 总记录数*/
    private Integer totalCount;

    /**总分页数 */
    private Integer totalPage;

    public Integer getPageNo() {
        return pageNo;
    }

    public EventQueryResp setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public EventQueryResp setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public List<Event> getResult() {
        return result;
    }

    public EventQueryResp setResult(List<Event> result) {
        this.result = result;
        return this;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public EventQueryResp setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public EventQueryResp setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
}
