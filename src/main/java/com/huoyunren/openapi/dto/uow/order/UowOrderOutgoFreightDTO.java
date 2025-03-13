package com.huoyunren.openapi.dto.uow.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class UowOrderOutgoFreightDTO {

    /**
     * 应付运输费合计
     */
    @JsonProperty(value = "total_freight_payable")
    private UowOrderTotalFreightPayableDTO totalFreightPayable;
}
