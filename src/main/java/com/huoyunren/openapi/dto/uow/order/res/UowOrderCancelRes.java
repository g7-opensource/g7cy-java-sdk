package com.huoyunren.openapi.dto.uow.order.res;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.huoyunren.openapi.dto.uow.order.UowOrderBaseDTO;
import javax.validation.constraints.NotNull;
import lombok.Data;

@Data
public class UowOrderCancelRes {



    /**
     * 订单基础信息
     */
    @NotNull
    @JsonProperty(value = "base")
    private UowOrderBaseDTO base;


}
