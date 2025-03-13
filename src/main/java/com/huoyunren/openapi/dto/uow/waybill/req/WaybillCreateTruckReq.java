package com.huoyunren.openapi.dto.uow.waybill.req;

import com.huoyunren.openapi.dto.uow.waybill.WaybillTruckDTO;
import lombok.Data;

/**
 * 运单创建请求车辆信息
 * @author tangsiyuan
 * @date 2024/7/16
 **/
@Data
public class WaybillCreateTruckReq extends WaybillTruckDTO {

    /**
     * 车牌号
     */
//    @NotEmpty(message = "车牌号不能为空")
//    private String truckLicensePlate;

    /**
     * 车辆类型枚举：1=车头、2=挂车、3=整车、4=罐车
     */
//    @NotNull(message = "车辆类型不能为空")
//    private Integer truckUnitType;

}
