package cn.com.g7.sdk.kafka.enums;

/**
 * ADAS事件类型枚举
 * @author dengfuwei
 * @version 1.0.0
 * @date 2021/12/16 4:43 下午
 */
public enum AdasEventEnum {

    /** 前车碰撞报警*/
    FCW(3000, 0, 30000, 0, "前车碰撞报警"),
    /** 低速碰撞报警 (虚拟保险杠)*/
    UFCW(3001, 0, 30001, 0, "低速碰撞报警 (虚拟保险杠)"),
    /** 左车道偏移*/
    LLDW(3002, 0, 30002, 0, "左车道偏移"),
    /** 右车道偏移*/
    RLDW(3003, 0, 30003, 0, "右车道偏移"),
    /** 行人碰撞报警*/
    PCW(3004, 0, 30004, 0, "行人碰撞报警"),
    /** 前方车距检测碰撞报警*/
    HWL(3005, 0, 30005, 0, "前方车距检测碰撞报警"),
    /** 超速报警*/
    TSR(3006, 0, 30006, 0, "超速报警"),
    /** 强制遮挡报警*/
    AT(3007, 0, 30007, 0, "强制遮挡报警"),
    /** 危险区内有行人*/
    PDZ(3008, 0, 30008, 0, "危险区内有行人"),
    /** 频繁变道报警*/
    FLDW(3009, 0, 30009, 0, "频繁变道报警"),
    /** 道路标识超限报警*/
    ISLI(3010, 0, 30010, 0, "道路标识超限报警"),
    /** 障碍物报警*/
    OAW(3011, 0, 30011, 0, "障碍物报警"),
    /** 主动抓拍事件*/
    SHOOTING(3012, 0, 30012, 0, "主动抓拍事件"),
    /** 实线变道报警*/
    SLDW(3013, 0, 30013, 0, "实线变道报警"),
    /** 车厢过道行人检测报警*/
    CPDW(3014, 0, 30014, 0, "车厢过道行人检测报警"),
    /** 右拐未停 */
    TRDW(3015, 0, 30015, 0, "右拐未停"),
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

    AdasEventEnum(Integer alarmType, Integer subAlarmType, Integer eventType, Integer subEventType, String name) {
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
