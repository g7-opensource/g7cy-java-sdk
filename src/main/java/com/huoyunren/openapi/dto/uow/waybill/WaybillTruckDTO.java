package com.huoyunren.openapi.dto.uow.waybill;

import lombok.Data;


/**
 * 运单返回详情车辆信息
 * @author tangsiyuan
 * @date 2024/7/16
 **/
@Data
public class WaybillTruckDTO {

    /**
     * 车牌号
     */
    private String truckLicensePlate;

    /**
     * 罐编码
     */
    private String truckTankCode;

    /**
     * 车辆类型枚举：1=车头、2=挂车、3=整车、4=罐车
     */
    private Integer truckUnitType;

    /**
     * 车长
     */
    private String truckLength;

    /**
     * 业务侧描述的车长
     */
    private String bizTruckLength;

    /**
     * 车牌颜色 1=黄色、2=蓝色、3=绿色
     */
    private Integer licensePlateColor;

    /**
     * 合作关系
     */
    private String cooperation;

    /**
     * 铅封号
     */
    private String leadSealNo;

}
