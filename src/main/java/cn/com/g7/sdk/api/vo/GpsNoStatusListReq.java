package cn.com.g7.sdk.api.vo;

import cn.com.g7.sdk.api.enums.GpsStatusEnum;

/**
 * 按机构查询指定状态设备列表 请求参数
 * @author liwenlang
 * @version 1.0.0
 * @date 2021/10/12 14:33
 */
public class GpsNoStatusListReq {

    /** [必传] 机构号(包含子机构的设备)*/
    private String orgcode;

    /** 支持多个状态，’,’ 隔开；0=无法定位；1=信号中断；2=未定位；3=车辆静止；4=车辆运动中;6=未启用
     * {@link GpsStatusEnum}
     * */
    private String status;

    public String getOrgcode() {
        return orgcode;
    }

    public GpsNoStatusListReq setOrgcode(String orgcode) {
        this.orgcode = orgcode;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public GpsNoStatusListReq setStatus(String status) {
        this.status = status;
        return this;
    }
}
