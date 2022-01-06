package cn.com.g7.sdk.api.enums;

/**
 * 事件类型枚举
 * @author dengfuwei
 * @version 1.0.0
 * @date 2021/12/16 4:43 下午
 */
public enum EventTypeEnum {
    /** 点熄火*/
    FIRE(1, 0, 10001, 1, "点熄火"),
    /** 平台点火*/
    FIRE_ON(1, 4, 10001, 2, "平台点火"),
    /** 平台熄火*/
    FIRE_OFF(1, 5, 10001, 3, "平台熄火"),

    /** 疲劳*/
    TIRED(15, 0, 10011, 0, "疲劳"),
    /** 平台疲劳*/
    TIRED_P(5, 0, 11006, 0, "平台疲劳"),

    /** 平台离线*/
    OFF_LINE(4, 0, 11001, 0, "平台离线"),

    /** 停留*/
    STOP(9, 0, 11000, 0, "停留"),

    /** EMS暖车怠速*/
    IDLING_SUB1(140, 0, 10007, 1, "EMS暖车怠速"),
    /** EMSPTO怠速*/
    IDLING_SUB2(115, 0, 10007, 2, "EMSPTO怠速"),
    /** ctbox PTO怠速*/
    IDLING_SUB2_2(8271, 0, 10007, 5, "ctbox PTO怠速"),
    /** EMS异常怠速*/
    IDLING_SUB3(26, 0, 10007, 3, "EMS异常怠速"),
    /** ctbox EMS 异常怠速*/
    IDLING_SUB3_3(8302, 0, 10007, 6, "ctbox EMS 异常怠速"),
    /** 通用怠速*/
    IDLING_SUB4(11, 0, 10007, 4, "通用怠速"),

    /** EMS急加速*/
    SPEED_UP_EMS(25, 0, 10019, 1, "EMS急加速"),
    /** 部标EMS急加速*/
    SPEED_UP_BB(8041, 0, 10019, 2, "部标EMS急加速"),
    /** GPS急加速*/
    SPEED_UP_GPS(54, 0, 10019, 3, "GPS急加速"),

    /** ctbox超速*/
    SPEED_FAST_EMS(8028, 0, 10008, 1, "ctbox超速"),
    /** EMS超速*/
    SPEED_FAST_BB(19, 0, 10008, 2, "EMS超速"),
    /** GPS超速*/
    SPEED_FAST_GPS(101, 0, 10008, 3, "GPS超速"),

    /** EMS左急转弯*/
    LEFT_TURN_EMS(8042, 0, 10039, 1, "EMS左急转弯"),
    /** SMART左急转弯*/
    LEFT_TURN_SMART(58, 0, 10039, 2, "SMART左急转弯"),

    /** EMS右急转弯*/
    RIGHT_TURN_EMS(8043, 0, 10040, 1, "EMS右急转弯"),
    /** SMART右急转弯*/
    RIGHT_TURN_SMART(59, 0, 10040, 2, "SMART右急转弯"),

    /** 手动打卡*/
    MANUAL_DRIVER_SIGN(50000, 0, 50000, 0, "手动打卡"),

    /** 打卡*/
    DRIVER_SIGN_ON(50001, 0, 50001, 0, "打卡"),
    /** 退卡*/
    DRIVER_SIGN_OFF(50002, 0, 50002, 0, "退卡"),

    /** 缓行*/
    SPEED_SLOW(6, 8, 11002, 0, "缓行"),

    /** 高速路超速*/
    SPEED_HIGH(6, 1, 11003, 0, "高速路超速"),
    /** 快速路超速*/
    SPEED_FAST(6, 2, 11004, 0, "快速路超速"),
    /** 普通超速*/
    SPEED_GENERAL(6, 0, 11005, 0, "普通超速"),
    /** 区域超速*/
    SPEED_AREA(6, 4, 11007, 0, "区域超速"),
    /** 弯道超速*/
    SPEED_CURVE(6, 3, 11008, 0, "弯道超速"),
    /** 危险路段超速*/
    SPEED_DANGER(6, 5, 11009, 0, "危险路段超速"),
    /** 拥堵*/
    SPEED_BLOCK(6, 9, 11010, 0, "拥堵"),

    /** 普通路超速预警*/
    SPEED_EARLY_GENERAL(6, 10, 11013, 0, "普通路超速预警"),
    /** 高速路超速预警*/
    SPEED_EARLY_HIGH(6, 11, 11011, 0, "高速路超速预警"),
    /** 快速路超速预警*/
    SPEED_EARLY_FAST(6, 12, 11012, 0, "快速路超速预警"),

    /** 进区域*/
    RANG_IN(10, 1, 10006, 1, "进区域"),
    /** 出区域*/
    RANG_OUT(10, 2, 10006, 2, "出区域"),

    /** 进区报警*/
    RANG_IN_ALARM(20, 0, 11018, 0, "进区报警"),
    /** 出区报警*/
    RANG_OUT_ALARM(21, 0, 11019, 0, "出区报警"),
    /** 区域停留超时报警*/
    RANGE_STAY_ALARM(22, 0, 11017, 0, "区域停留超时报警"),
    /** 停车超时报警*/
    STOP_TIMEOUT_ALARM(23, 0, 11020, 0, "停车超时报警"),
    /** 油箱盖事件*/
    LIQUID_CAP_ALARM(24, 0, 11024, 0, "油箱盖事件"),

    /** 平台怠速*/
    IDLING(3, 0, 11014, 0, "平台怠速"),

    /** 开门事件*/
    DOOR(12, 0, 11015, 0, "开门事件"),

    /** 未登签*/
    NO_SIGN(15, 0, 11016, 0, "未登签"),

    /** 加油*/
    LIQUID_PLUS(60, 0, 50200, 0, "加油"),
    /** 少油*/
    LIQUID_SUB(62, 0, 50201, 0, "少油"),
    /** 异常加油预警*/
    LIQUID_ABNORMAL(4001, 0, 50202, 0, "异常加油预警"),

    /** EMS 急减速报警*/
    SLOW_DOWN_EMS(24, 0, 10018, 1, "EMS 急减速报警"),
    /** ctbox EMS急减速*/
    SLOW_DOWN_CTBOX(8007, 0, 10018, 2, "ctbox EMS急减速"),
    /** gps 急减速报警*/
    SLOW_DOWN_GPS(53, 0, 10018, 3, "gps 急减速报警"),

    /** EMS 紧急刹车报警*/
    BRAKE_EMS(114, 0, 10091, 1, "EMS 紧急刹车报警"),
    /** ctbox EMS紧急刹车报警*/
    BRAKE_CTBOX(8301, 0, 10091, 2, "ctbox EMS紧急刹车报警"),

    /** 弯道超速报警（风险入弯*/
    CURVE_OVER_SPEED_EMS(130, 0, 10102, 1, "弯道超速报警（风险入弯）"),
    /** ctbox 弯道超速（风险入弯*/
    CURVE_OVER_SPEED_CTBOX(8045, 0, 10102, 2, "ctbox 弯道超速（风险入弯）"),

    /** EMS 车辆碰撞报警*/
    COLLISION_EMS(8055, 0, 10038, 1, "EMS 车辆碰撞报警"),
    /** SMART 车辆碰撞报警*/
    COLLISION_SMART(55, 0, 10038, 2, "SMART 车辆碰撞报警"),

    /** EMS转速过高报警*/
    ROTATION_HIGH_EMS(20, 0, 10014, 1, "EMS转速过高报警"),
    /** ctbox EMS转速过高*/
    ROTATION_HIGH_CTBOX(8006, 0, 10014, 2, "ctbox EMS转速过高"),

    /** 拆壳报警开始*/
    BOX_REMOVE_START(38, 0, 10029, 1, "拆壳报警开始"),
    /** 拆壳报警结束*/
    BOX_REMOVE_END(1038, 0, 10029, 2, "拆壳报警结束"),

    /** 主电移除报警*/
    POWER_REMOVE(32, 0, 10023, 0, "主电移除报警"),
    /** ON线未接报警*/
    ON_LINE_REMOVE(72, 0, 10051, 0, "ON线未接报警"),

    /** GPS模块故障报警*/
    GPS_FAULT(4, 0, 10004, 0, "GPS模块故障报警"),

    /** GPS天线断开开始*/
    ANTENNA_REMOVE_START(3, 0, 10003, 1, "GPS天线断开开始"),
    /** GPS天线断开结束*/
    ANTENNA_REMOVE_END(1003, 0, 10003, 2, "GPS天线断开结束"),

    /** EMS冷却液温度过高报警*/
    HIGH_TP_EMS(21, 0, 10015, 1, "EMS冷却液温度过高报警"),
    /** ctbox冷却液温度过高*/
    HIGH_TP_CTBOX(8304, 0, 10015, 2, "ctbox冷却液温度过高"),

    /** EMS机油压过低报警*/
    LOW_OIL_EMS(22, 0, 10016, 1, "EMS机油压过低报警"),
    /** ctbox机油压过低报警*/
    LOW_OIL_CTBOX(8303, 0, 10016, 2, "ctbox机油压过低报警"),

    /** 空挡滑行*/
    EMPTY_GEAR(91, 0, 10069, 1, "空挡滑行"),
    /** ctbox空挡滑行*/
    EMPTY_GEAR_CTBOX(8030, 0, 10069, 2, "ctbox空挡滑行"),

    /** GPS信号干扰报警*/
    GPS_WEAK_SIGNAL(45, 0, 10035, 0, "GPS信号干扰报警"),

    /** 主电状态*/
    POWER_STATE(31, 0, 10022, 0, "主电状态"),

    /** 终端上电状态*/
    POWER_ON(52, 0, 10037, 0, "终端上电状态"),
    /** 内部电池电量过低*/
    POWER_LOW(68, 0, 10047, 0, "内部电池电量过低"),
    /** EBS ABS 防抱死事件*/
    EBS_ABS(120, 0, 10096, 0, "EBS ABS 防抱死事件"),
    /** EBS VDS 防侧翻事件*/
    EBS_VDS(121, 0, 10097, 0, "EBS VDS 防侧翻事件"),
    /** 轴载重超载报警事件*/
    OVERLOAD(122, 0, 10098, 0, "轴载重超载报警事件"),
    /** EBS轴载重事件*/
    EBS_LOAD(129, 0, 10101, 0, "EBS轴载重事件"),

    /** TPMS 胎压 过高报警*/
    TPMS_PRESSURE_HIGH(131, 0, 10103, 0, "TPMS 胎压 过高报警"),
    /** TPMS 胎压 过低报警*/
    TPMS_PRESSURE_LOW(132, 0, 10104, 0, "TPMS 胎压 过低报警"),
    /** TPMS 胎温过高报警*/
    TPMS_TYRE_TEMP_HIGH(133, 0, 10105, 0, "TPMS 胎温过高报警"),
    /** TPMS 轮胎 漏气报警*/
    TPMS_TYRE_LEAK(134, 0, 10106, 0, "TPMS 轮胎 漏气报警"),
    /** TPMS 信号 中断报警*/
    TPMS_NO_SIGNAL(135, 0, 10107, 0, "TPMS 信号 中断报警"),
    /** EBS 红灯报警事件*/
    TEBS_ETC_RED(137, 0, 10108, 0, "TEBS 红灯报警事件"),
    /** TEBS 黄灯报警事件*/
    TEBS_ETC_YELLOW(138, 0, 10109, 0, "TEBS 黄灯报警事件"),
    /** 挂车系统压力不足报警*/
    TRAILER_LACK_SYS_PRESSURE(153, 0, 10123, 0, "挂车系统压力不足报警"),
    /** EBS 急转弯报警事件*/
    SHARP_TURN(159, 0, 10129, 0, "EBS 急转弯报警事件"),

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

    //FMS
    /** 门磁事件 */
    GATE_IMPACT(250, 0, 25000, 0, "门磁事件"),
    /** FMS急减速 */
    SLOW_DOWN_FMS(251, 0, 25001, 0, "FMS急减速"),
    /** FMS紧急事件 */
    EMERGENCY_FMS(252, 0, 25002, 0, "FMS紧急事件"),
    /** FMS急加速 */
    SPEED_UP_FMS(253, 0, 25003, 0, "FMS急加速"),
    /** FMS风险入弯 */
    CURVE_OVER_SPEED_FMS(254, 0, 25004, 0, "FMS风险入弯"),
    /** FMS超速预警 */
    SPEED_EARLY_FMS(255, 0, 25005, 0, "FMS超速预警"),
    /** FMS超速报警 */
    OVER_SPEED_FMS(256, 0, 25006, 0, "FMS超速报警"),
    /** FMS行驶断电报警 */
    POWER_OFF_FMS(257, 0, 25007, 0, "FMS行驶断电报警"),
    /** FMS异常停车双闪烁报警 */
    STOP_DOUBLE_FLASH_FMS(258, 0, 25008, 0, "FMS异常停车双闪烁报警"),
    /** FMS振动报警 */
    VIBRATION_FMS(259, 0, 25009, 0, "FMS振动报警"),
    /** FMS熄火报警 */
    FIRE_OFF_FMS(260, 0, 25010, 0, "FMS熄火报警"),
    /** FMS超时疲劳驾驶 */
    OVERTIME_TIRED_FMS(261, 0, 25011, 0, "FMS超时疲劳驾驶"),
    /** FMS当日累计疲劳 */
    CUMULATIVE_TIRED_FMS(262, 0, 25012, 0, "FMS当日累计疲劳"),
    /** FMS路口超速 */
    CROSSING_HIGH_SPEED_FMS(263, 0, 25013, 0, "FMS路口超速"),
    /** FMS高速龟速行驶 */
    HIGHWAY_LOW_SPEED_FMS(264, 0, 25014, 0, "FMS高速龟速行驶"),
    /** FMS急停事件 */
    STOP_FMS(265, 0, 25015, 0, "FMS急停事件"),
    /** FMS左急转弯 */
    SHARP_LEFT_FMS(266, 0, 25016, 0, "FMS左急转弯"),
    /** FMS右急转弯 */
    SHARP_RIGHT_FMS(267, 0, 25017, 0, "FMS右急转弯"),
    /** 综合入侵事件 */
    GENERAL_INVADE_FMS(268, 0, 25018, 0, "综合入侵事件"),
    /** 人员入侵事件 */
    PERSONNEL_INVADE_FMS(269, 0, 25019, 0, "人员入侵事件"),
    /** 后翻或侧翻卸货事件 */
    BACK_OR_SIDE_ROLL_DISCHARGE(270, 0, 25020, 0, "后翻或侧翻卸货事件"),
    /** 扭转/倾斜报警事件 */
    TORSION_TILT_ALARM_EVENT(271, 0, 25021, 0, "扭转/倾斜报警事件"),
    /** 遮挡报警事件 */
    BLOCK_ALARM_EVENT(272, 0, 25022, 0, "遮挡报警事件"),
    /** 任务监控时异常拆机报警事件 */
    ABNORMAL_DISASSEMBLY_ALARM_EVENT_DURING_TASK_MONITORING(273, 0, 25023, 0, "任务监控时异常拆机报警事件"),
    /** 拆外壳报警事件 */
    DISASSEMBLE_THE_SHELL_ALARM_EVENT(274, 0, 25024, 0, "拆外壳报警事件"),
    /** 待机状态结束进入调试状态 */
    END_OF_STANDBY_STATE_AND_ENTER_DEBUGGING_STATE(275, 0, 25025, 0, "待机状态结束进入调试状态"),
    /** 结束调试状态进入任务监控状态 */
    END_DEBUGGING_STATE_AND_ENTER_TASK_MONITORING_STATE(276, 0, 25026, 0, "结束调试状态进入任务监控状态"),
    /** 任务监控状态结束进入待机状态 */
    END_OF_TASK_MONITORING_STATE_AND_ENTER_STANDBY_STATE(277, 0, 25027, 0, "任务监控状态结束进入待机状态"),
    /** 调试按键短按 */
    SHORT_PRESS_THE_DEBUG_BUTTON(278, 0, 25028, 0, "调试按键短按"),
    /** 调试按键长按1.5秒 */
    LONG_PRESS_THE_DEBUG_BUTTON_FOR_ONE_POINT_FIVE_SECONDS(279, 0, 25029, 0, "调试按键长按1.5秒"),
    /** 调试按键长按8秒 */
    LONG_PRESS_THE_DEBUG_BUTTON_FOR_EIGHT_SECONDS(280, 0, 25030, 0, "调试按键长按8秒"),
    /** 定时动作拍照 */
    TIMED_ACTION_PHOTO(281, 0, 25031, 0, "定时动作拍照"),

    /** 设备网络状态 */
    NETWORK_STATE(2, 0, 10002, 0, "设备网络状态"),
    /** 区域超速报警 */
    AREA_OVER_SPEED(304, 0, 10005, 0, "区域超速报警"),
    /** 疲劳驾驶第一次预警 */
    TIRED_EARLY_FIRST(13, 0, 10009, 0, "疲劳驾驶第一次预警"),
    /** 疲劳驾驶第二次预警 */
    TIRED_EARLY_SECOND(14, 0, 10010, 0, "疲劳驾驶第二次预警"),
    /** 遭窃车辆报警 */
    STEAL_CAR(16, 0, 10012, 0, "遭窃车辆报警"),
    /** 遭窃车辆位置更新报警 */
    STEAL_CAR_POSITION(17, 0, 10013, 0, "遭窃车辆位置更新报警"),
    /** EMSPTO状态 */
    EMS_PTO_STATE(23, 0, 10017, 0, "EMSPTO状态"),
    /** 手动报警 */
    MANUAL_ALARM(27, 0, 10020, 0, "手动报警"),
    /** DI在线状态 */
    DI_ONLINE_STATE(30, 0, 10021, 0, "DI在线状态"),
    /** 电源电压过高报警 */
    HIGH_POWER(33, 0, 10024, 0, "电源电压过高报警"),
    /** 电源电压过低报警 */
    LOW_POWER(34, 0, 10025, 0, "电源电压过低报警"),
    /** 内部电池供电状态 */
    INTERNAL_POWER_UP(35, 0, 10026, 0, "内部电池供电状态"),
    /** 内部电池充电状态 */
    INTERNAL_POWER_CHARGE(36, 0, 10027, 0, "内部电池充电状态"),
    /** 内部电池充电失败 */
    INTERNAL_POWER_CHARGE_FAIL(37, 0, 10028, 0, "内部电池充电失败"),
    /** SIM卡移除报警 */
    SIM_REMOVE(39, 0, 10030, 0, "SIM卡移除报警"),
    /** 性能及健康检测 */
    HEALTH_TEST(41, 0, 10031, 0, "性能及健康检测"),
    /** 主机温度过高报警 */
    MAIN_TMP_HIGH(42, 0, 10032, 0, "主机温度过高报警"),
    /** 主机温度过低报警 */
    MAIN_TMP_LOW(43, 0, 10033, 0, "主机温度过低报警"),

    /** 车辆侧翻报警 */
    ROLL_OVER(44, 0, 10034, 0, "车辆侧翻报警"),
    /** 门状态 */
    DOOR_STATE(50, 0, 10036, 0, "门状态"),
    /** 重要错误码 */
    ERROR_CODE(60, 0, 10041, 0, "重要错误码"),
    /** SD卡已满事件 */
    SD_FULL(61, 0, 10042, 0, "SD卡已满事件"),

    /** GPS定位状态 */
    GPS_LOCATION(62, 0, 10043, 0, "GPS定位状态"),
    /** RTC时间故障 */
    RTC_TIME_ERROR(63, 0, 10044, 0, "RTC时间故障"),
    /** 加速度传感器校准 */
    PLUS_SPEED_VERIFY(66, 0, 10045, 0, "加速度传感器校准"),
    /** 角速度传感器校准 */
    CORNER_SPEED_VERIFY(67, 0, 10046, 0, "角速度传感器校准"),

    /** 内部电池开关未打开 */
    POWER_NOT_OPEN(69, 0, 10048, 0, "内部电池开关未打开"),
    /** 压缩机状态 */
    COMPRESSOR_STATE(70, 0, 10049, 0, "压缩机状态"),
    /** 终端参数恢复出厂设置事件 */
    RECOVER_SETTING(71, 0, 10050, 0, "终端参数恢复出厂设置事件"),
    /** 温度探头拔除报警事件 */
    T_PROBE_OFF(73, 0, 10052, 0, "温度探头拔除报警事件"),
    /** GPS漂移 */
    GPS_DRIFT(74, 0, 10053, 0, "GPS漂移"),
    /** GPS漂移预警 */
    GPS_EARLY_DRIFT(75, 0, 10054, 0, "GPS漂移预警"),
    /** 停车未熄火报警事件 */
    STOP_NOT_TURN_OFF(76, 0, 10055, 0, "停车未熄火报警事件"),
    /** GPRS模块复位事件 */
    GPRS_RESET(77, 0, 10056, 0, "GPRS模块复位事件"),
    /** OTA备份结果事件 */
    OTA_BACKUP_RESULT(78, 0, 10057, 0, "OTA备份结果事件"),
    /** 引擎状态 */
    ENGINE_STATE(79, 0, 10058, 0, "引擎状态"),
    /** 事件管理器恢复默认事件 */
    EVENT_MANAGER_RESET(80, 0, 10059, 0, "事件管理器恢复默认事件"),
    /** 蓄电池老化事件 */
    BATTERY_AGING(82, 0, 10060, 0, "蓄电池老化事件"),
    /** EMS自动波特率检测事件 */
    EMS_BAUD_RATE_CHECK(83, 0, 10061, 0, "EMS自动波特率检测事件"),
    /** EMS行程LOG事件 */
    EMS_LOG(84, 0, 10062, 0, "EMS行程LOG事件"),
    /** SOCKET上行数据校验失败事件 */
    SOCKET_UP_FALL(85, 0, 10063, 0, "SOCKET上行数据校验失败事件"),
    /** 除霜事件 */
    DEFROST(86, 0, 10064, 0, "除霜事件"),
    /** 学习状态及GPS异常事件类 */
    GPS_ERROR(87, 0, 10065, 0, "学习状态及GPS异常事件类"),
    /** Rfid司机未打卡通知事件 */
    DRIVER_NO_SIGN(88, 0, 10066, 0, "Rfid司机未打卡通知事件"),
    /** 车辆运动状态 */
    MOVE_STATE(89, 0, 10067, 0, "车辆运动状态"),
    /** 车辆载重状态 */
    LOAD_STATE(90, 0, 10068, 0, "车辆载重状态"),

    /** EMS空滤堵塞报警 */
    EMS_AIR_FILTER_BLOCKING(93, 0, 10070, 0, "EMS空滤堵塞报警"),
    /** EMS粗滤器水位报警 */
    EMS_WATER_LEVEL_WARNING(94, 0, 10071, 0, "EMS粗滤器水位报警"),
    /** EMS左车门半锁报警 */
    EMS_LEFT_DOOR_HALF_LOCK(95, 0, 10072, 0, "EMS左车门半锁报警"),
    /** EMS右车门半锁报警 */
    EMS_RIGHT_DOOR_HALF_LOCK(96, 0, 10073, 0, "EMS右车门半锁报警"),
    /** EMS主驾驶位安全带状态 */
    EMS_MAIN_SAFETY_BELT(97, 0, 10074, 0, "EMS主驾驶位安全带状态"),
    /** EMS副驾驶位安全带状态 */
    EMS_VICE_SAFETY_BELT(98, 0, 10075, 0, "EMS副驾驶位安全带状态"),

    /** EMS机油压力过高报警 */
    EMS_OIL_STRESS_HIGH(99, 0, 10076, 0, "EMS机油压力过高报警"),
    /** EMS燃油压力过高报警 */
    EMS_FUEL_STRESS_HIGH(100, 0, 10077, 0, "EMS燃油压力过高报警"),
    /** EMS燃油压力过低报警 */
    EMS_FUEL_STRESS_LOW(1201, 0, 10078, 0, "EMS燃油压力过低报警"),
    /** EMS ABS警告灯报警 */
    EMS_ABS_WARNING_LAMP(102, 0, 10079, 0, "EMS ABS警告灯报警"),
    /** EMS电动车单体电池最低电压过低报警事件 */
    EMS_MONOMER_LOW_BATTERY(103, 0, 10080, 0, "EMS电动车单体电池最低电压过低报警事件"),
    /** EMS电动车单体电池最高电压过高报警事件 */
    EMS_MONOMER_HIGH_BATTERY(104, 0, 10081, 0, "EMS电动车单体电池最高电压过高报警事件"),

    /** EMS电动车单体电池最高温度过高报警事件 */
    EMS_HIGH_BATTERY_T(105, 0, 10082, 0, "EMS电动车单体电池最高温度过高报警事件"),
    /** EMS电动车SOC过低预警事件 */
    EMS_SOC_EARLY_LOW(106, 0, 10083, 0, "EMS电动车SOC过低预警事件"),
    /** EMS电动车SOC过低报警事件 */
    EMS_SOC_LOW(107, 0, 10084, 0, "EMS电动车SOC过低报警事件"),
    /** EMS电动车控制器温度过高报警事件 */
    EMS_CONTROL_T_HIGH(108, 0, 10085, 0, "EMS电动车控制器温度过高报警事件"),
    /** EMS电动车驱动电机温度过高报警事件 */
    EMS_MOTOR_HIGH(109, 0, 10086, 0, "EMS电动车驱动电机温度过高报警事件"),
    /** EMS电动车电池电压过低报警事件 */
    EMS_LOW_BATTERY(110, 0, 10087, 0, "EMS电动车电池电压过低报警事件"),

    /** 485设备异常拔除或故障报警 */
    EMS_485_ERROR(111, 0, 10088, 0, "485设备异常拔除或故障报警"),
    /** 485设备在线状态 */
    EMS_485L_ONLINE_STATE(112, 0, 10089, 0, "485设备在线状态"),
    /** 主电未接报警 */
    EMS_POWER_MISSED(113, 0, 10090, 0, "主电未接报警"),

    /** 医药配送行程事件 */
    MEDICAL_DELIVERY_SCHEDULE(116, 0, 10093, 0, "医药配送行程事件"),
    /** BLUECAN_连接状态 */
    BLUE_CAN_CONNECTION_STATE(117, 0, 10094, 0, "BLUECAN_连接状态"),
    /** BLUECAN_类事件 */
    BLUE_CAN_EVENT(118, 0, 10095, 0, "BLUECAN_类事件"),
    /** BLUECAN行程强制结束事件 */
    BLUE_CAN_SCHEDULE_OVER(123, 0, 10099, 0, "BLUECAN行程强制结束事件"),
    /** BLUECAN行程强制丢弃事件 */
    BLUE_CAN_SCHEDULE_LOST(124, 0, 10100, 0, "BLUECAN行程强制丢弃事件"),
    /** EMS 行程状态事件 */
    EMS_SCHEDULE_STATE(139, 0, 10110, 0, "EMS 行程状态事件"),

    /** 电动车充电事件 */
    ELECTRIC_CAR_CHARGING(141, 0, 10111, 0, "电动车充电事件"),
    /** 电动车放电事件 */
    ELECTRIC_CAR_DISCHARGING(142, 0, 10112, 0, "电动车放电事件"),
    /** 冷藏室回气温度传感器故障 */
    TEMPERATURE_SENSOR_ERROR(143, 0, 10113, 0, "冷藏室回气温度传感器故障"),
    /** 冷藏室盘管温度传感器故障 */
    REFRIGERATOR_COIL_TEMPERATURE_SENSOR_ERROR(144, 0, 10114, 0, "冷藏室盘管温度传感器故障"),

    /** 保险丝断开故障 */
    FUSE_OPEN_ERROR(145, 0, 10115, 0, "保险丝断开故障"),

    /** 备电压缩机过载故障 */
    BACKUP_COMPRESSOR_OVERLOAD_ERROR(146, 0, 10116, 0, "备电压缩机过载故障"),
    /** 备电频繁开关机故障 */
    BACKUP_POWER_SWITCH_ERROR(147, 0, 10117, 0, "备电频繁开关机故障"),
    /** 交流电输入故障 */
    AC_INPUT_ERROR(148, 0, 10118, 0, "交流电输入故障"),
    /** 备电压缩机过载或压缩机机内保护故障 */
    BACKUP_POWER_COMPRESSOR_OVERLOAD(149, 0, 10119, 0, "备电压缩机过载或压缩机机内保护故障"),
    /** 高低压故障 */
    HIGH_LOW_VOLTAGE_ERROR(150, 0, 10120, 0, "高低压故障"),

    /** 备电初始值d15 设置错误故障 */
    BACKUP_POWER_SETTING_ERROR(151, 0, 10121, 0, "备电初始值d15 设置错误故障"),
    /** 市电接入状态 */
    MAINS_ACCESS_STATUS(152, 0, 10122, 0, "市电接入状态"),

    /** EBS 紧急制动报警事件 */
    EBS_EMERGENCY_BRAKE(156, 0, 10126, 0, "EBS 紧急制动报警事件"),
    /** EBS 防侧翻保护报警事件 */
    EBS_ROLL_PROTECTION(157, 0, 10127, 0, "EBS 防侧翻保护报警事件"),
    /** BS 偏航控制激活报警 */
    EBS_YAW_CONTROL_ACTIVATION(158, 0, 10128, 0, "EBS 偏航控制激活报警"),
    /** 车辆颠簸报警事件 */
    CAR_BUMPS(160, 0, 10130, 0, "车辆颠簸报警事件"),
    /** 设备线束拔出报警事件 */
    WIRE_PULL_OUT(161, 0, 10131, 0, "设备线束拔出报警事件"),
    /** 设备朝向报警事件 */
    CAR_ORIENTATION(162, 0, 10132, 0, "设备朝向报警事件"),

    /** 部标GPS超速预警 */
    BUBIAO_OVER_SPEED_WARNING(6013, 0, 10133, 0, "部标GPS超速预警"),
    /** 部标GPS疲劳驾驶预警 */
    BUBIAO_FATIGUE_DRIVING_WARNING(6014, 0, 10134, 0, "部标GPS疲劳驾驶预警"),

    /** 货船开仓 */
    SHIP_DOOR_OPEN(290, 0, 60290, 0, "货船开仓"),
    /** 货船闭仓 */
    SHIP_DOOR_CLOSE(291, 0, 60291, 0, "货船闭仓"),

    /** FS01硬盘锁打开报警 */
    DISK_OPEN(100, 0, 11100, 0, "FS01硬盘锁打开报警"),
    /** SD卡不存在 */
    SD_NOT_EXISTED(101, 0, 11101, 0, "SD卡不存在"),
    /** SD卡无法存储或读取 */
    SD_NOT_STORAGE_OR_READ(102, 0, 11102, 0, "SD卡无法存储或读取"),
    /** SD频繁格式化 */
    SD_FORMAT_TOO_FREQUENTLY(103, 0, 11103, 0, "SD频繁格式化"),
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

    EventTypeEnum(Integer alarmType, Integer subAlarmType, Integer eventType, Integer subEventType, String name) {
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
