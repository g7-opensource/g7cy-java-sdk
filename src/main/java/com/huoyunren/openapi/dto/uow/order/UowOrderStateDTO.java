package com.huoyunren.openapi.dto.uow.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class UowOrderStateDTO {

    /**
     * 订单运输状态类型
     */
    @JsonProperty(value = "state_type")
    private String stateType;

    /**
     * 订单运输状态值
     */
    @JsonProperty(value = "state_type_value")
    private String stateTypeValue;


}
