package cn.com.g7.sdk.api.vo;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 车辆状态查询 -->司机打卡信息
 * @author liwenlang
 * @version 1.0.0
 * @date 2021/10/11 19:43
 */
public class TruckCurrentInfoDriver {

    /** 打卡时间(格式为yyyy-MM-dd HH:mm:ss，时区为GMT+8， 例如：2017-01-01 12:00:00') */
    private String time;

    /** 打卡类型(on 登签，off 退签)*/
    private String type;

    /** 打卡司机ic卡号*/
    private String icno;

    /** 打卡司机编号(-1 无效，未找到ic卡绑定司机信息) */
    @JSONField(name = "driver_no")
    private String driverNo;

    /** 打卡司机姓名(-1 无效，未找到ic卡绑定司机信息)*/
    @JSONField(name = "driver_name")
    private String driverName;

    public String getTime() {
        return time;
    }

    public TruckCurrentInfoDriver setTime(String time) {
        this.time = time;
        return this;
    }

    public String getType() {
        return type;
    }

    public TruckCurrentInfoDriver setType(String type) {
        this.type = type;
        return this;
    }

    public String getIcno() {
        return icno;
    }

    public TruckCurrentInfoDriver setIcno(String icno) {
        this.icno = icno;
        return this;
    }

    public String getDriverNo() {
        return driverNo;
    }

    public TruckCurrentInfoDriver setDriverNo(String driverNo) {
        this.driverNo = driverNo;
        return this;
    }

    public String getDriverName() {
        return driverName;
    }

    public TruckCurrentInfoDriver setDriverName(String driverName) {
        this.driverName = driverName;
        return this;
    }
}
