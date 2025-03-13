package com.huoyunren.openapi.dto.uow.order.req;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.huoyunren.openapi.dto.uow.order.UowOrderBaseDTO;
import com.huoyunren.openapi.dto.uow.order.UowOrderExtensionDTO;
import com.huoyunren.openapi.dto.uow.order.UowOrderSysDTO;
import com.huoyunren.openapi.dto.uow.order.UowOrderTransportProcessesDTO;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import lombok.Data;


@Data
public class UowOrderTransportProcessReq {

    /**
     * 系统信息
     */
    @NotNull(message = "系统信息不能为空")
    @JsonProperty(value = "sys")
    private UowOrderSysDTO sys;

    /**
     * 订单基础信息
     */
    @NotNull(message = "订单索引信息不能为空")
    @JsonProperty(value = "base")
    private UowOrderBaseDTO base;

    /**
     * 订单过程信息
     */
    @NotNull(message = "订单过程信息不能为空")
    @JsonProperty(value = "transport_processes")
    @Valid
    private UowOrderTransportProcessesDTO transportProcesses;

    /**
     * 业务自定义扩展信息
     */
    @JsonProperty(value = "extension")
    private List<UowOrderExtensionDTO> extension;

}
