package com.huoyunren.openapi.dto.uow.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class UowOrderNodeAddrDTO {

    /**
     * 订单节点详细地址
     */
    @JsonProperty(value = "addr")
    private String addr;

    /**
     * 订单节点经纬度坐标
     */
    @JsonProperty(value = "lon_lat")
    private String lonLat;

    /**
     * 订单节点经纬度坐标类型
     */
    @JsonProperty(value = "lon_lat_type")
    private String lonLatType;

    /**
     * 订单节点国家名称
     */
    @JsonProperty(value = "country")
    private String country;

    /**
     * 订单节点国家代码
     */
    @JsonProperty(value = "country_code")
    private String countryCode;

    /**
     * 订单节点省份名称
     */
    @JsonProperty(value = "province")
    private String province;

    /**
     * 订单节点省份区域代码
     */
    @JsonProperty(value = "province_code")
    private String provinceCode;

    /**
     * 订单节点域名名称
     */
    @JsonProperty(value = "city")
    private String city;

    /**
     * 订单节点城市区域代码
     */
    @JsonProperty(value = "city_code")
    private String cityCode;

    /**
     * 订单节点县（区）名称
     */
    @JsonProperty(value = "area")
    private String area;

    /**
     * 订单节点县（区）区域代码
     */
    @JsonProperty(value = "area_code")
    private String areaCode;

    /**
     * 订单节点街道名称
     */
    @JsonProperty(value = "street")
    private String street;

    /**
     * 订单节点街道区域代码
     */
    @JsonProperty(value = "street_code")
    private String streetCode;
}
