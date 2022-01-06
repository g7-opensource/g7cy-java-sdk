package cn.com.g7.sdk.api.vo;

/**
 * 温度明细 请求参数
 * @author liwenlang
 * @version 1.0.0
 * @date 2021/11/8 16:59
 */
public class DailyTemperatureReq {

    /**车辆标示(sysid+intTruckid)*/
    private String truckNum;

    /** imei*/
    private String imei;

    /** [必传] 设备号*/
    private String gpsno;

    /** [必传] 开始时间，格式为yyyy-MM-dd HH:mm:ss，时区为GMT+8， 例如：2015-01-01 12:00:00*/
    private String from;

    /** 结束时间，格式为yyyy-MM-dd HH:mm:ss，时区为GMT+8， 例如：2015-01-01 12:00:00*/
    private String to;

    /** 是否按一分钟间隔查询数据，1：是，else：否*/
    private Integer space;

    /** 按时间间隔查询 */
    private Integer separate;

    /** 单页容量 page_size 最大10000*/
    private Integer pageSize;

    /**当前页数*/
    private Integer pageNo;

    /** 排序字段（time desc / time asc） 默认时间降序*/
    private String orderBy;

    /** 返回数据中的坐标系，是否使用火星坐标， 1：使用火星坐标 else: 原始坐标*/
    private Integer mars;

    public String getTruckNum() {
        return truckNum;
    }

    public DailyTemperatureReq setTruckNum(String truckNum) {
        this.truckNum = truckNum;
        return this;
    }

    public String getImei() {
        return imei;
    }

    public DailyTemperatureReq setImei(String imei) {
        this.imei = imei;
        return this;
    }

    public String getGpsno() {
        return gpsno;
    }

    public DailyTemperatureReq setGpsno(String gpsno) {
        this.gpsno = gpsno;
        return this;
    }

    public String getFrom() {
        return from;
    }

    public DailyTemperatureReq setFrom(String from) {
        this.from = from;
        return this;
    }

    public String getTo() {
        return to;
    }

    public DailyTemperatureReq setTo(String to) {
        this.to = to;
        return this;
    }

    public Integer getSpace() {
        return space;
    }

    public DailyTemperatureReq setSpace(Integer space) {
        this.space = space;
        return this;
    }

    public Integer getSeparate() {
        return separate;
    }

    public DailyTemperatureReq setSeparate(Integer separate) {
        this.separate = separate;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public DailyTemperatureReq setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public DailyTemperatureReq setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public DailyTemperatureReq setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    public Integer getMars() {
        return mars;
    }

    public DailyTemperatureReq setMars(Integer mars) {
        this.mars = mars;
        return this;
    }
}
