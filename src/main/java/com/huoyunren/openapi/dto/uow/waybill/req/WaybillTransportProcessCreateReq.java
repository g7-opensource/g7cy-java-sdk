package com.huoyunren.openapi.dto.uow.waybill.req;

import com.huoyunren.openapi.dto.uow.waybill.WaybillSysDTO;
import javax.validation.constraints.NotNull;
import lombok.Data;

/**
 * @author tangsiyuan
 * @date 2024/9/29
 **/
@Data
public class WaybillTransportProcessCreateReq {

    /**
     * 系统信息
     */
    @NotNull(message = "系统信息不能为空")
    private WaybillSysDTO sys;

    /**
     * 字段修改策略
     */
//    @NotNull(message = "更新策略不能为空")
//    @Valid
//    private WaybillStrategyDTO strategy;

    /**
     * 订单基础信息
     */
    private WaybillTransportProcessBaseReq base;

    /**
     * 运力信息
     */
//    private WaybillTransportCapacityDTO transportCapacity;

    /**
     * 订单过程信息
     */
    private TransportProcessesCreateReq transportProcesses;

    /**
     * 业务自定义扩展信息
     */
//    private List<WaybillExtensionDTO> extension;


}
