package cn.com.g7.sdk.kafka.bo;

import com.alibaba.fastjson.annotation.JSONField;

import java.math.BigDecimal;

/**
 * @author dengfuwei
 * @version 1.0.0
 * @date 2021/11/9 3:32 下午
 */
public class Temperature {

    /** 探头编号，取值1-4*/
    private Integer num;

    /** 温度报警：0=正常;1=低温预警;2=低温报警;3=高温预警;4=高温报警;5=传感器初始化中;6=传感器故障*/
    @JSONField(name = "temp_alarm")
    private Integer tempAlarm;

    /** 湿度报警：0=正常;1=低湿预警;2=低湿报警;3=高湿预警;4=高湿报警;5=传感器初始化中;6=传感器故障*/
    @JSONField(name = "hum_alarm")
    private Integer humAlarm;

    /** 探头温度（数据上传时的瞬时温度）*/
    @JSONField(name = "cur_temp")
    private BigDecimal curTemp;

    /** 最低温度（如10秒上传一条数据，则此10秒内的最低温度）*/
    @JSONField(name = "low_temp")
    private BigDecimal lowTemp;

    /** 最高温度（如10秒上传一条数据，则此10秒内的最高温度）*/
    @JSONField(name = "high_temp")
    private BigDecimal highTemp;

    /** 湿度，单位：%*/
    private BigDecimal humidity;

    /** 最低湿度（如10秒上传一条数据，则此10秒内的最低湿度）*/
    @JSONField(name = "low_hum")
    private BigDecimal lowHum;

    /** 最高湿度（如10秒上传一条数据，则此10秒内的最高湿度）*/
    @JSONField(name = "high_hum")
    private BigDecimal highHum;

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getTempAlarm() {
        return tempAlarm;
    }

    public void setTempAlarm(Integer tempAlarm) {
        this.tempAlarm = tempAlarm;
    }

    public Integer getHumAlarm() {
        return humAlarm;
    }

    public void setHumAlarm(Integer humAlarm) {
        this.humAlarm = humAlarm;
    }

    public BigDecimal getCurTemp() {
        return curTemp;
    }

    public void setCurTemp(BigDecimal curTemp) {
        this.curTemp = curTemp;
    }

    public BigDecimal getLowTemp() {
        return lowTemp;
    }

    public void setLowTemp(BigDecimal lowTemp) {
        this.lowTemp = lowTemp;
    }

    public BigDecimal getHighTemp() {
        return highTemp;
    }

    public void setHighTemp(BigDecimal highTemp) {
        this.highTemp = highTemp;
    }

    public BigDecimal getHumidity() {
        return humidity;
    }

    public void setHumidity(BigDecimal humidity) {
        this.humidity = humidity;
    }

    public BigDecimal getLowHum() {
        return lowHum;
    }

    public void setLowHum(BigDecimal lowHum) {
        this.lowHum = lowHum;
    }

    public BigDecimal getHighHum() {
        return highHum;
    }

    public void setHighHum(BigDecimal highHum) {
        this.highHum = highHum;
    }
}
