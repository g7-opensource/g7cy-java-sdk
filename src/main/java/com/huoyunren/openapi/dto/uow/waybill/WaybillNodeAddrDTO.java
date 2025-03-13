package com.huoyunren.openapi.dto.uow.waybill;

import lombok.Data;


/**
 * 运单返回详情节点地址信息
 * @author tangsiyuan
 * @date 2024/7/16
 **/
@Data
public class WaybillNodeAddrDTO {

    /**
     * 详细地址
     */
    private String addr;

    /**
     * 经纬度坐标
     */
    private String lonLat;

    /**
     * 经纬度坐标类型
     */
    private String lonLatType;

    /**
     * 国家名称
     */
    private String country;

    /**
     * 国家编码
     */
    private String countryCode;

    /**
     * 省份名称
     */
    private String province;

    /**
     * 省区域代码
     */
    private String provinceCode;

    /**
     * 城市名称
     */
    private String city;

    /**
     * 城市区域代码
     */
    private String cityCode;

    /**
     * 县（区）名称
     */
    private String area;

    /**
     * 县（区）区域代码
     */
    private String areaCode;

    /**
     * 街道名称
     */
    private String street;

    /**
     * 街道区域代码
     */
    private String streetCode;

}
