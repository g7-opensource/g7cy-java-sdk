package cn.com.g7.sdk.api.vo;

/**
 * 车辆状态查询 -->温度信息
 * @author liwenlang
 * @version 1.0.0
 * @date 2021/10/11 19:42
 */
public class TruckCurrentInfoCold {

    /** 最后温度数据采集时间(格式为yyyy-MM-dd HH:mm:ss，时区为GMT+8， 例如：2017-01-01 12:00:00') */
    private String time;

    /** 温度数据
     * 温度数据(json字符串，固定式冷链:{ [{num 探头编号 1-4，最多4个探头 alarmType 报警值 0-15 temperature 当前温度 单位℃
     * lowTemp 最低温度 单位℃ highTemp 最高温度 单位℃ humidity 当前湿度 %，0-100 lowHum 最低湿度 %，0-100 highHum 最高湿度 %，0-100 } ..]
     * envTemp 环境温度 单位℃ speed 速度 单位km/h door 门磁状态 0 关，1 开 compressor 压缩机状态 0 关，1 开 acc acc状态 0 关，1 开 }，
     * 和 便携式冷链 { humidity 当前湿度 temperature 当前温度度 单位℃ envTemp 环境温度 单位℃
     * alarmTypes 报警列表 "0高温预警 1高温报警 2温度传感器异常报警 3高湿度预警 4高湿度报警 5湿度传感器异常报警
     * 6电量报警 7光感报警 8其他报警 9低温预警 10低温报警 11低湿度预警 12低湿度报警 13设备开机报警 14设备关机报警 15手动开关状态
     * 16温度湿度预警报警总开关状态 17低功耗状态 18任务状态 19重启, 20外电断开" alarmStatus 报警状态 light 光感值 semaphore
     * 信号量 batteryPower 剩余电量 %，0-100 })
     * */
    private String temp;

    /** 1：老版本冷链；2：新版本冷链；3：便携式冷链*/
    private Integer type;

    /** 经度(GCJ02坐标系) */
    private String lng;

    /** 纬度(GCJ02坐标系)*/
    private String lat;

    /** 解析地址(入参addr_required为True，返回才有值)*/
    private String address;

    public String getTime() {
        return time;
    }

    public TruckCurrentInfoCold setTime(String time) {
        this.time = time;
        return this;
    }

    public String getTemp() {
        return temp;
    }

    public TruckCurrentInfoCold setTemp(String temp) {
        this.temp = temp;
        return this;
    }

    public Integer getType() {
        return type;
    }

    public TruckCurrentInfoCold setType(Integer type) {
        this.type = type;
        return this;
    }

    public String getLng() {
        return lng;
    }

    public TruckCurrentInfoCold setLng(String lng) {
        this.lng = lng;
        return this;
    }

    public String getLat() {
        return lat;
    }

    public TruckCurrentInfoCold setLat(String lat) {
        this.lat = lat;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public TruckCurrentInfoCold setAddress(String address) {
        this.address = address;
        return this;
    }
}
