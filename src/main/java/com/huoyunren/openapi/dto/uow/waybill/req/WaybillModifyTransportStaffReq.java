package com.huoyunren.openapi.dto.uow.waybill.req;

import com.huoyunren.openapi.dto.uow.waybill.WaybillTransportStaffDTO;
import lombok.Data;

/**
 * 运单修改请求运输人员信息
 * @author tangsiyuan
 * @date 2024/7/18
 **/
@Data
public class WaybillModifyTransportStaffReq extends WaybillTransportStaffDTO {

    /**
     * 运输人员姓名
     */
//    @NotEmpty(message = "运输人员姓名不能为空")
//    private String transportStaffName;

    /**
     * 运输操作人员类型：1=主驾司机；2=副驾司机；3=押运员；
     */
//    @NotEmpty(message = "运输操作人员类型不能为空")
//    private Integer transportStaffType;

}
