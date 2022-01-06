package cn.com.g7.sdk.api.vo;

import cn.com.g7.sdk.api.enums.EventTypeEnum;
import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

/**
 * 根据车辆，司机，机构查询事件 请求参数
 * @author liwenlang
 * @version 1.0.0
 * @date 2021/11/8 14:12
 */
public class EventQueryReq {

    /** 根据车辆，司机，机构查询事件 TODO 字段类型不一致*/
    private List<String> orgcodes;

    /** 设备号，以逗号分隔*/
    private String gpsnos;

    /** 事件类型 {@link EventTypeEnum}*/
    private List<String> eventTypes;

    /** 开始时间：时间戳(毫秒)*/
    private Long from;

    /** 结束时间：时间戳(毫秒)*/
    private Long to;

    /** 分页页码*/
    private String pageNo;

    /** 分页大小*/
    private String pageSize;

    /** 车牌号数组，最多50个**/
    @JSONField(name = "carnums")
    private List<String> carNums;

    /** [暂不支持]子事件类型(与eventTypes二选一) {@link EventTypeEnum}*/
    private List<EventType> eventSubTypes;

    public List<String> getOrgcodes() {
        return orgcodes;
    }

    public EventQueryReq setOrgcodes(List<String> orgcodes) {
        this.orgcodes = orgcodes;
        return this;
    }

    public String getGpsnos() {
        return gpsnos;
    }

    public EventQueryReq setGpsnos(String gpsnos) {
        this.gpsnos = gpsnos;
        return this;
    }

    public List<String> getEventTypes() {
        return eventTypes;
    }

    public EventQueryReq setEventTypes(List<String> eventTypes) {
        this.eventTypes = eventTypes;
        return this;
    }

    public Long getFrom() {
        return from;
    }

    public EventQueryReq setFrom(Long from) {
        this.from = from;
        return this;
    }

    public Long getTo() {
        return to;
    }

    public EventQueryReq setTo(Long to) {
        this.to = to;
        return this;
    }

    public String getPageNo() {
        return pageNo;
    }

    public EventQueryReq setPageNo(String pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public String getPageSize() {
        return pageSize;
    }

    public EventQueryReq setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public List<String> getCarNums() {
        return carNums;
    }

    public EventQueryReq setCarNums(List<String> carNums) {
        this.carNums = carNums;
        return this;
    }

    public List<EventType> getEventSubTypes() {
        return eventSubTypes;
    }

    public EventQueryReq setEventSubTypes(List<EventType> eventSubTypes) {
        this.eventSubTypes = eventSubTypes;
        return this;
    }
}
