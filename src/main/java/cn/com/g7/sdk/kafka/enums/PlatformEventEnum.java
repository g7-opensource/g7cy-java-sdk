package cn.com.g7.sdk.kafka.enums;

/**
 * 平台事件类型枚举
 * @author dengfuwei
 * @version 1.0.0
 * @date 2022/1/12 3:39 下午
 */
public enum PlatformEventEnum {
    /** 平台疲劳*/
    TIRED_P(5, 0, 11006, 0, "平台疲劳"),
    /** 高速路超速*/
    SPEED_HIGH(6, 1, 11003, 0, "高速路超速"),
    /** 快速路超速*/
    SPEED_FAST(6, 2, 11004, 0, "快速路超速"),
    /** 普通超速*/
    SPEED_GENERAL(6, 0, 11005, 0, "普通超速"),
    ;

    /** 事件类型（旧编码）*/
    private Integer alarmType;

    /** 事件子类型（旧编码）*/
    private Integer subAlarmType;

    /** 事件类型（新编码）*/
    private Integer eventType;

    /** 事件子类型（新编码）*/
    private Integer subEventType;

    /** 事件名称*/
    private String name;

    PlatformEventEnum(Integer alarmType, Integer subAlarmType, Integer eventType, Integer subEventType, String name) {
        this.alarmType = alarmType;
        this.subAlarmType = subAlarmType;
        this.eventType = eventType;
        this.subEventType = subEventType;
        this.name = name;
    }

    public Integer getAlarmType() {
        return alarmType;
    }

    public Integer getSubAlarmType() {
        return subAlarmType;
    }

    public Integer getEventType() {
        return eventType;
    }

    public Integer getSubEventType() {
        return subEventType;
    }

    public String getName() {
        return name;
    }
}
