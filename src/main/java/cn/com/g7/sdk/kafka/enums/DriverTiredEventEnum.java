package cn.com.g7.sdk.kafka.enums;

/**
 * 司机疲劳事件类型枚举
 * @author dengfuwei
 * @version 1.0.0
 * @date 2021/12/16 4:43 下午
 */
public enum DriverTiredEventEnum {

    /** 闭眼事件*/
    CLOSE_EYE(2044, 1, 41001, 0, "闭眼事件"),
    /** 打哈欠*/
    YAWN(2044, 2, 41002, 0, "打哈欠"),
    /** 姿势异常/左顾右盼*/
    STANCE_EXCEPTION(2044, 3, 41003, 0, "姿势异常/左顾右盼"),
    /** 打电话*/
    CALLING(2044, 4, 41004, 0, "打电话"),
    /** 吸烟*/
    SMOKING(2044, 5, 41005, 0, "吸烟"),
    /** 遮挡*/
    SHELTER(2044, 6, 41006, 0, "遮挡"),
    /** GPS掉线*/
    GPS_DROPPED(2044, 7, 41007, 0, "GPS掉线"),
    /** 离岗/遮蔽*/
    LEAVE_POST(2044, 8, 41008, 0, "离岗/遮蔽"),
    /** 频繁低头*/
    FREQUENT_HEAD_DOWN(2044, 9, 41009, 0, "频繁低头"),
    /** 二级闭眼*/
    SECOND_CLOSE_EYE(2044, 10, 41010, 0, "二级闭眼"),
    /** 镜头模糊*/
    BLURRY(2044, 11, 41011, 0, "镜头模糊"),
    /** 人脸识别*/
    FACE_RECOGNITION(2044, 12, 41012, 0, "人脸识别"),
    /** 酒驾*/
    DRUNK(2044, 13, 41013, 0, "酒驾"),
    /** 弯道超速*/
    CURVED_OVER_SPEED(2044, 14, 41014, 0, "弯道超速"),
    /** 凝视*/
    GAZE(2044, 15, 41015, 0, "凝视"),
    /** 长时间驾驶*/
    LONG_TIME_DRIVING(2044, 16, 41016, 0, "长时间驾驶"),
    /** 驾驶室抖动异常*/
    CAB_EXCEPTION(2044, 17, 41017, 0, "驾驶室抖动异常"),
    /** （苏标）疲劳驾驶*/
    SB_TIRED_DRIVING(2044, 18, 41018, 0, "（苏标）疲劳驾驶"),
    /** （苏标）定时拍照*/
    SB_TIMED_PHOTO(2044, 19, 41019, 0, "（苏标）定时拍照"),
    /** 红外阻断*/
    INFRARED_BLOCKING(2044, 20, 41020, 0, "红外阻断"),
    /** 摄像头角度异常*/
    ABNORMAL_CAMERA_ANGLE(2044, 21, 41021, 0, "摄像头角度异常"),
    /** 低头*/
    HEAD_DOWN(2044, 22, 41022, 0, "低头"),
    /** 看手机*/
    PLAY_PHONE(2044, 23, 41023, 0, "看手机"),
    /** 超时驾驶报警*/
    OVERTIME_DRIVING(2044, 25, 41025, 0, "超时驾驶报警"),
    /** 双手脱把报警*/
    HANDS_OFF(2044, 27, 41027, 0, "双手脱把报警"),
    /** 未系安全带报警*/
    NOT_WEAR_SEATBELT(2044, 28, 41028, 0, "未系安全带报警"),
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

    DriverTiredEventEnum(Integer alarmType, Integer subAlarmType, Integer eventType, Integer subEventType, String name) {
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
