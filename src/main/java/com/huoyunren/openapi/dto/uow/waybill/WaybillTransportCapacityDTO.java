package com.huoyunren.openapi.dto.uow.waybill;

import java.util.List;
import lombok.Data;

/**
 * 运单返回详情运力信息
 * @author tangsiyuan
 * @date 2024/7/16
 **/
@Data
public class WaybillTransportCapacityDTO {

    /**
     * 车辆信息
     */
    private List<WaybillTruckDTO> truck;

    /**
     * 运输人员信息
     */
    private List<WaybillTransportStaffDTO> transportStaff;

}
