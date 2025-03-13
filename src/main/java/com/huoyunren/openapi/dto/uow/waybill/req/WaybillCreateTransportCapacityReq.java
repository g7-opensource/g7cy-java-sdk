package com.huoyunren.openapi.dto.uow.waybill.req;

import java.util.List;
import lombok.Data;

/**
 * 运单创建请求运力信息
 * @author tangsiyuan
 * @date 2024/7/16
 **/
@Data
public class WaybillCreateTransportCapacityReq {

    /**
     * 车辆信息
     */
    private List<WaybillCreateTruckReq> truck;

    /**
     * 运输人员信息
     */
    private List<WaybillCreateTransportStaffReq> transportStaff;

}
