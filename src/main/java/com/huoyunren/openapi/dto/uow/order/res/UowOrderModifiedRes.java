package com.huoyunren.openapi.dto.uow.order.res;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import javax.validation.constraints.NotNull;
import lombok.Data;
import com.huoyunren.openapi.dto.uow.order.*;

@Data
public class UowOrderModifiedRes {

    /**
     * 系统信息
     */
    @NotNull
    @JsonProperty(value = "sys")
    private UowOrderSysDTO sys;

    /**
     * 订单基础信息
     */
    @NotNull
    @JsonProperty(value = "base")
    private UowOrderBaseDTO base;

    /**
     * 收入与支出运输费信息
     */
    @JsonProperty(value = "income_outgo_freight")
    private List<UowStandardFeeDTO> incomeOutgoFreight;

    /**
     * 客户信息
     */
    @JsonProperty(value = "customer")
    private UowOrderCustomerDTO customer;

    /**
     * 运输方式
     */
    @JsonProperty(value = "transport_mode")
    private UowOrderTransportModeDTO transportMode;

    /**
     * 订单运输节点信息
     */
    @JsonProperty(value = "nodes")
    private List<UowOrderNodeDTO> nodes;

    /**
     * 订单标记信息
     */
    @JsonProperty(value = "tags")
    private List<UowOrderTagDTO> tags;

    /**
     * 业务自定义扩展信息
     */
    @JsonProperty(value = "extension")
    private List<UowOrderExtensionDTO> extension;

    /**
     * 订单过程信息
     */
    @JsonProperty(value = "transport_processes")
    private UowOrderTransportProcessesForResDTO transportProcesses;
}
