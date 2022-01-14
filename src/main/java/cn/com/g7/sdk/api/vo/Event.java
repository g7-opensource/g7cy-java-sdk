package cn.com.g7.sdk.api.vo;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;
import java.util.Map;

/**
 * 事件信息
 * @author liwenlang
 * @version 1.0.0
 * @date 2021/11/8 15:04
 */
public class Event {

    /** 主键 */
    private String id;

    /** 设备串号 */
    private String imei;

    /** 设备号 */
    private int gpsno;

    /** 系统ID **/
    private String sysid;

    /** 纬度 */
    private Double lat;

    /** 经度 */
    private Double lng;

    /** 是否定位 */
    private String loc;

    @JSONField(name = "contains_china")
    private Boolean containsChina;

    /** 当前的地图坐标系。WGS84（标准坐标系）、GCJ02（火星坐标系）、BD09（百度坐标系）、UNKNOWN（未知坐标系）*/
    private String coordinate;

    /** 结束位置是否在国内*/
    @JSONField(name = "end_contains_china")
    private Boolean endContainsChina;

    /** 当前的地图坐标系。 WGS84（标准坐标系）、GCJ02（火星坐标系）、BD09（百度坐标系）、UNKNOWN（未知坐标系）*/
    @JSONField(name = "end_coordinate")
    private String endCoordinate;

    /**事件开始精度*/
    private double precision = -1.0d;

    /**事件结束精度*/
    @JSONField(name = "end_precision")
    private double endPrecision = -1.0d;

    /** 结束纬度 */
    private double latend;

    /** 结束经度 */
    private double lngend;

    /** 结束是否定位 */
    private String locend;

    /** 车牌号 */
    private String carnum;

    /** 类型 */
    @JSONField(name = "item_id")
    private String itemId;

    /** 速度 */
    private int speed;

    /** 报警开始时间 */
    @JSONField(name = "start_time")
    private Date startTime;

    /** 报警结束时间 */
    @JSONField(name = "end_time")
    private Date endTime;

    /** 报警类型 */
    @JSONField(name = "event_type")
    private int eventType;

    /** 附加消息体数据 */
    @JSONField(name = "additional_info")
    private Object additionalInfo;

    /** 备注信息 */
    private String notes;

    /**扩展信息*/
    private String properties;

    /**持续时间*/
    private long difftime = 0;

    /**持续时间*/
    @JSONField(name = "difftime_millis")
    private long difftimeMillis = 0;

    /**最大速度*/
    private int maxspeed = -1;

    /** 创建时间*/
    @JSONField(name = "create_time")
    private Date createTime;

    /** 更新时间*/
    @JSONField(name = "update_time")
    private Date updateTime;

    @JSONField(name = "original_orgcode")
    private String  originalOrgcode;

    /** 机构编码,平台事件机构共享机构存入*/
    private String orgcode;

    /**共享机构 多个逗号分隔*/
    @JSONField(name = "share_orgcode")
    private String shareOrgcode;

    @JSONField(name = "event_device_type")
    private String eventDeviceType;

    /**车辆ID*/
    private String truckid;

    /**事件推送ID*/
    private long eventid;

    /**子事件类型*/
    @JSONField(name = "sub_event_type")
    private int subEventType;

    /**事件状态类型ID 0:事件，1:状态,2:报警,3:单次报警*/
    @JSONField(name = "state_type")
    private int stateType;

    /**用户标记*/
    @JSONField(name = "custom_labels")
    private Map<String,Object> customLabels;

    /** 报警事件来源（0:终端，1:平台）*/
    @JSONField(name = "alarm_origin")
    private Integer alarmOrigin;

    /**老报警事件类型 */
    @JSONField(name = "alarm_type")
    private Integer alarmType;

    /** 标示事件是开始记录 还是结束记录 1-事件开始 0-事件结束 */
    @JSONField(name = "alarm_status")
    private Integer alarmStatus;

    @JSONField(name = "driver_no")
    protected String driverNo = "";

    @JSONField(name = "driver_name")
    protected String driverName = "";

    /** 司机类型:1-主驾,2-副驾,3打卡*/
    @JSONField(name = "driver_type")
    protected int driverType = -1;

    /**ic卡卡号 打卡司机卡号*/
    protected String icno;

    /**图片*/
    private Map<String,String> imgs;

    /**视频*/
    private Map<String,String> videos;
}
