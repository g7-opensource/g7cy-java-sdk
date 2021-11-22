package cn.com.g7.sdk.api.vo;

/**
 * 历史轨迹查询查询
 * @author liwenlang
 * @version 1.0.0
 * @date 2021/11/8 16:13
 */
public class HistoryLocationReq {

    /** [必传] 开始时间，格式为yyyy-MM-dd HH:mm:ss，时区为GMT+8， 例如：2015-01-01 12:00:00*/
    private String from;

    /** 结束时间，格式为yyyy-MM-dd HH:mm:ss，时区为GMT+8， 例如：2015-01-01 12:00:00*/
    private String to;

    /** [必传] 坐标系类型(支持参数值:baidu.如不传该参数，则默认为火星坐标)*/
    private String map;

    /** 查询时间间隔，10,20,30s ,默认值为10s*/
    private String timeInterval;

    public String getFrom() {
        return from;
    }

    public HistoryLocationReq setFrom(String from) {
        this.from = from;
        return this;
    }

    public String getTo() {
        return to;
    }

    public HistoryLocationReq setTo(String to) {
        this.to = to;
        return this;
    }

    public String getMap() {
        return map;
    }

    public HistoryLocationReq setMap(String map) {
        this.map = map;
        return this;
    }

    public String getTimeInterval() {
        return timeInterval;
    }

    public HistoryLocationReq setTimeInterval(String timeInterval) {
        this.timeInterval = timeInterval;
        return this;
    }
}
