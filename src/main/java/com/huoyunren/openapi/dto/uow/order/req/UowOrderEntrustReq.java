package com.huoyunren.openapi.dto.uow.order.req;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.huoyunren.openapi.dto.uow.order.*;
import javax.validation.constraints.NotNull;
import lombok.Data;


@Data
public class UowOrderEntrustReq {

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


}
