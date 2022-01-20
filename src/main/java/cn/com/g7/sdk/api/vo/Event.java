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

    public String getId() {
        return id;
    }

    public Event setId(String id) {
        this.id = id;
        return this;
    }

    public String getImei() {
        return imei;
    }

    public Event setImei(String imei) {
        this.imei = imei;
        return this;
    }

    public int getGpsno() {
        return gpsno;
    }

    public Event setGpsno(int gpsno) {
        this.gpsno = gpsno;
        return this;
    }

    public String getSysid() {
        return sysid;
    }

    public Event setSysid(String sysid) {
        this.sysid = sysid;
        return this;
    }

    public Double getLat() {
        return lat;
    }

    public Event setLat(Double lat) {
        this.lat = lat;
        return this;
    }

    public Double getLng() {
        return lng;
    }

    public Event setLng(Double lng) {
        this.lng = lng;
        return this;
    }

    public String getLoc() {
        return loc;
    }

    public Event setLoc(String loc) {
        this.loc = loc;
        return this;
    }

    public Boolean getContainsChina() {
        return containsChina;
    }

    public Event setContainsChina(Boolean containsChina) {
        this.containsChina = containsChina;
        return this;
    }

    public String getCoordinate() {
        return coordinate;
    }

    public Event setCoordinate(String coordinate) {
        this.coordinate = coordinate;
        return this;
    }

    public Boolean getEndContainsChina() {
        return endContainsChina;
    }

    public Event setEndContainsChina(Boolean endContainsChina) {
        this.endContainsChina = endContainsChina;
        return this;
    }

    public String getEndCoordinate() {
        return endCoordinate;
    }

    public Event setEndCoordinate(String endCoordinate) {
        this.endCoordinate = endCoordinate;
        return this;
    }

    public double getPrecision() {
        return precision;
    }

    public Event setPrecision(double precision) {
        this.precision = precision;
        return this;
    }

    public double getEndPrecision() {
        return endPrecision;
    }

    public Event setEndPrecision(double endPrecision) {
        this.endPrecision = endPrecision;
        return this;
    }

    public double getLatend() {
        return latend;
    }

    public Event setLatend(double latend) {
        this.latend = latend;
        return this;
    }

    public double getLngend() {
        return lngend;
    }

    public Event setLngend(double lngend) {
        this.lngend = lngend;
        return this;
    }

    public String getLocend() {
        return locend;
    }

    public Event setLocend(String locend) {
        this.locend = locend;
        return this;
    }

    public String getCarnum() {
        return carnum;
    }

    public Event setCarnum(String carnum) {
        this.carnum = carnum;
        return this;
    }

    public String getItemId() {
        return itemId;
    }

    public Event setItemId(String itemId) {
        this.itemId = itemId;
        return this;
    }

    public int getSpeed() {
        return speed;
    }

    public Event setSpeed(int speed) {
        this.speed = speed;
        return this;
    }

    public Date getStartTime() {
        return startTime;
    }

    public Event setStartTime(Date startTime) {
        this.startTime = startTime;
        return this;
    }

    public Date getEndTime() {
        return endTime;
    }

    public Event setEndTime(Date endTime) {
        this.endTime = endTime;
        return this;
    }

    public int getEventType() {
        return eventType;
    }

    public Event setEventType(int eventType) {
        this.eventType = eventType;
        return this;
    }

    public Object getAdditionalInfo() {
        return additionalInfo;
    }

    public Event setAdditionalInfo(Object additionalInfo) {
        this.additionalInfo = additionalInfo;
        return this;
    }

    public String getNotes() {
        return notes;
    }

    public Event setNotes(String notes) {
        this.notes = notes;
        return this;
    }

    public String getProperties() {
        return properties;
    }

    public Event setProperties(String properties) {
        this.properties = properties;
        return this;
    }

    public long getDifftime() {
        return difftime;
    }

    public Event setDifftime(long difftime) {
        this.difftime = difftime;
        return this;
    }

    public long getDifftimeMillis() {
        return difftimeMillis;
    }

    public Event setDifftimeMillis(long difftimeMillis) {
        this.difftimeMillis = difftimeMillis;
        return this;
    }

    public int getMaxspeed() {
        return maxspeed;
    }

    public Event setMaxspeed(int maxspeed) {
        this.maxspeed = maxspeed;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public Event setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public Event setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    public String getOriginalOrgcode() {
        return originalOrgcode;
    }

    public Event setOriginalOrgcode(String originalOrgcode) {
        this.originalOrgcode = originalOrgcode;
        return this;
    }

    public String getOrgcode() {
        return orgcode;
    }

    public Event setOrgcode(String orgcode) {
        this.orgcode = orgcode;
        return this;
    }

    public String getShareOrgcode() {
        return shareOrgcode;
    }

    public Event setShareOrgcode(String shareOrgcode) {
        this.shareOrgcode = shareOrgcode;
        return this;
    }

    public String getEventDeviceType() {
        return eventDeviceType;
    }

    public Event setEventDeviceType(String eventDeviceType) {
        this.eventDeviceType = eventDeviceType;
        return this;
    }

    public String getTruckid() {
        return truckid;
    }

    public Event setTruckid(String truckid) {
        this.truckid = truckid;
        return this;
    }

    public long getEventid() {
        return eventid;
    }

    public Event setEventid(long eventid) {
        this.eventid = eventid;
        return this;
    }

    public int getSubEventType() {
        return subEventType;
    }

    public Event setSubEventType(int subEventType) {
        this.subEventType = subEventType;
        return this;
    }

    public int getStateType() {
        return stateType;
    }

    public Event setStateType(int stateType) {
        this.stateType = stateType;
        return this;
    }

    public Map<String, Object> getCustomLabels() {
        return customLabels;
    }

    public Event setCustomLabels(Map<String, Object> customLabels) {
        this.customLabels = customLabels;
        return this;
    }

    public Integer getAlarmOrigin() {
        return alarmOrigin;
    }

    public Event setAlarmOrigin(Integer alarmOrigin) {
        this.alarmOrigin = alarmOrigin;
        return this;
    }

    public Integer getAlarmType() {
        return alarmType;
    }

    public Event setAlarmType(Integer alarmType) {
        this.alarmType = alarmType;
        return this;
    }

    public Integer getAlarmStatus() {
        return alarmStatus;
    }

    public Event setAlarmStatus(Integer alarmStatus) {
        this.alarmStatus = alarmStatus;
        return this;
    }

    public String getDriverNo() {
        return driverNo;
    }

    public Event setDriverNo(String driverNo) {
        this.driverNo = driverNo;
        return this;
    }

    public String getDriverName() {
        return driverName;
    }

    public Event setDriverName(String driverName) {
        this.driverName = driverName;
        return this;
    }

    public int getDriverType() {
        return driverType;
    }

    public Event setDriverType(int driverType) {
        this.driverType = driverType;
        return this;
    }

    public String getIcno() {
        return icno;
    }

    public Event setIcno(String icno) {
        this.icno = icno;
        return this;
    }

    public Map<String, String> getImgs() {
        return imgs;
    }

    public Event setImgs(Map<String, String> imgs) {
        this.imgs = imgs;
        return this;
    }

    public Map<String, String> getVideos() {
        return videos;
    }

    public Event setVideos(Map<String, String> videos) {
        this.videos = videos;
        return this;
    }
}
