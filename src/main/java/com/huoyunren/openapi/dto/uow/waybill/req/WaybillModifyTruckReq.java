package com.huoyunren.openapi.dto.uow.waybill.req;

import com.huoyunren.openapi.dto.uow.waybill.WaybillTruckDTO;
import lombok.Data;

/**
 * 运单修改请求车辆信息
 * @author tangsiyuan
 * @date 2024/7/18
 **/
@Data
public class WaybillModifyTruckReq extends WaybillTruckDTO {

    /**
     * 车牌号
     */
//    @NotEmpty(message = "车牌号不能为空")
//    private String truckLicensePlate;

}
