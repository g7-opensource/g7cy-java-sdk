package cn.com.g7.sdk.api.vo;

import java.util.List;

/**
 * 事件类型
 * @author liwenlang
 * @version 1.0.0
 * @date 2021/11/8 14:21
 */
public class EventType {

    /** 事件类型**/
    private String eventType;

    /** 子事件类型**/
    private List<String> subTypes;

    public String getEventType() {
        return eventType;
    }

    public EventType setEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }

    public List<String> getSubTypes() {
        return subTypes;
    }

    public EventType setSubTypes(List<String> subTypes) {
        this.subTypes = subTypes;
        return this;
    }
}
