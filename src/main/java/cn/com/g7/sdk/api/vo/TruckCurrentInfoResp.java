package cn.com.g7.sdk.api.vo;

/**
 *  车辆状态查询 响应的实际数据
 * @author liwenlang
 * @version 1.0.0
 * @date 2021/10/11 19:46
 */
public class TruckCurrentInfoResp {

    /** gps设备号 */
    private String gpsno;

    /** 最后一次通讯时间(格式为yyyy-MM-dd HH:mm:ss，时区为GMT+8， 例如：2017-01-01 12:00:00')*/
    private String time;

    /** 车辆GPS状态，0=无法定位；1=信号中断；2=未定位；3=车辆静止；4=车辆运动中;5=未绑定;6=未启用;8=数据上传延迟*/
    private String gpsStatus;

    /** 车辆位置信息 {@link TruckCurrentInfoLoc}*/
    private TruckCurrentInfoLoc loc;

    /** 车辆状态 {@link TruckCurrentInfoStatus}*/
    private TruckCurrentInfoStatus status;

    /** 车辆温度信息 {@link TruckCurrentInfoCold} */
    private TruckCurrentInfoCold cold;

    /** 司机打卡信息 {@link TruckCurrentInfoDriver} */
    private TruckCurrentInfoDriver driver;

    public String getGpsno() {
        return gpsno;
    }

    public TruckCurrentInfoResp setGpsno(String gpsno) {
        this.gpsno = gpsno;
        return this;
    }

    public String getTime() {
        return time;
    }

    public TruckCurrentInfoResp setTime(String time) {
        this.time = time;
        return this;
    }

    public String getGpsStatus() {
        return gpsStatus;
    }

    public TruckCurrentInfoResp setGpsStatus(String gpsStatus) {
        this.gpsStatus = gpsStatus;
        return this;
    }

    public TruckCurrentInfoLoc getLoc() {
        return loc;
    }

    public TruckCurrentInfoResp setLoc(TruckCurrentInfoLoc loc) {
        this.loc = loc;
        return this;
    }

    public TruckCurrentInfoStatus getStatus() {
        return status;
    }

    public TruckCurrentInfoResp setStatus(TruckCurrentInfoStatus status) {
        this.status = status;
        return this;
    }

    public TruckCurrentInfoCold getCold() {
        return cold;
    }

    public TruckCurrentInfoResp setCold(TruckCurrentInfoCold cold) {
        this.cold = cold;
        return this;
    }

    public TruckCurrentInfoDriver getDriver() {
        return driver;
    }

    public TruckCurrentInfoResp setDriver(TruckCurrentInfoDriver driver) {
        this.driver = driver;
        return this;
    }
}
