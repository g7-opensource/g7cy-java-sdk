package com.huoyunren.openapi.dto.uow.order.req;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.huoyunren.openapi.dto.uow.order.UowOrderBaseDTO;
import com.huoyunren.openapi.dto.uow.order.UowOrderCustomerDTO;
import com.huoyunren.openapi.dto.uow.order.UowOrderExtensionDTO;
import com.huoyunren.openapi.dto.uow.order.UowOrderModifiedStrategyDTO;
import com.huoyunren.openapi.dto.uow.order.UowOrderNodeDTO;
import com.huoyunren.openapi.dto.uow.order.UowOrderSysDTO;
import com.huoyunren.openapi.dto.uow.order.UowOrderTagDTO;
import com.huoyunren.openapi.dto.uow.order.UowOrderTransportModeDTO;
import com.huoyunren.openapi.dto.uow.order.UowStandardFeeDTO;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import lombok.Data;
@Data
public class UowOrderModifyReq {

    /**
     * 字段修改策略
     */
    @NotNull(message = "更新策略不能为空")
    @JsonProperty(value = "strategy")
    @Valid
    private UowOrderModifiedStrategyDTO strategy;

    /**
     * 系统信息
     */
    @NotNull(message = "系统信息不能为空")
    @JsonProperty(value = "sys")
    @Valid
    private UowOrderSysDTO sys;

    /**
     * 订单基础信息
     */
    @NotNull(message = "基础信息不能为空")
    @JsonProperty(value = "base")
    @Valid
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
}
