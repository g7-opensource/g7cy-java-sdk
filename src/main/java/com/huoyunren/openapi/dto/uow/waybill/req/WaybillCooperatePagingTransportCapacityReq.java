package com.huoyunren.openapi.dto.uow.waybill.req;

import lombok.Data;

/**
 * @author tangsiyuan
 * @date 2024/9/10
 **/
@Data
public class WaybillCooperatePagingTransportCapacityReq {

    /**
     * 运单运力车辆查询参数
     */
    private WaybillCooperatePagingTruckReq truck;

    /**
     * 运单运力人员查询参数
     */
    private WaybillCooperatePagingTransportStaffReq transportStaff;



}
