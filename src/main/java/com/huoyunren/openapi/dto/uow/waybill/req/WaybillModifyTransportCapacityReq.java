package com.huoyunren.openapi.dto.uow.waybill.req;

import java.util.List;
import lombok.Data;

/**
 * 运单修改请求运力信息
 * @author tangsiyuan
 * @date 2024/7/18
 **/
@Data
public class WaybillModifyTransportCapacityReq {

    /**
     * 车辆信息
     */
    private List<WaybillModifyTruckReq> truck;

    /**
     * 运输人员信息
     */
    private List<WaybillModifyTransportStaffReq> transportStaff;
}
