package cn.com.g7.sdk.api.vo;

/**
 * 设备位置和状态查询参数
 * @author liwenlang
 * @version 1.0.0
 * @date 2021/10/11 19:23
 */
public class SimpleCurrentsGpsNoReq {

    /** [必传] 设备号(多个设备号之间以“,”号分开,单次调用设备数最多500个)*/
    private String gpsnos;

    /** 指定返回数据坐标系，不传，默认返回坐标为WGS-84。map参数（google、baidu、mars）对应坐标系：WGS-84:google；BD-02:baidu；GCJ-02:mars。
     * {@link cn.com.g7.sdk.api.enums.GpsCoordinateEnum}
     * */
    private String map;

    /** 传入该参数返回指定区域内的数据(非必填，格式为Lat,lng;lat,lng。查询区域的对角顶点坐标)*/
    private String area;

    public String getGpsnos() {
        return gpsnos;
    }

    public SimpleCurrentsGpsNoReq setGpsnos(String gpsnos) {
        this.gpsnos = gpsnos;
        return this;
    }

    public String getMap() {
        return map;
    }

    public SimpleCurrentsGpsNoReq setMap(String map) {
        this.map = map;
        return this;
    }

    public String getArea() {
        return area;
    }

    public SimpleCurrentsGpsNoReq setArea(String area) {
        this.area = area;
        return this;
    }
}
