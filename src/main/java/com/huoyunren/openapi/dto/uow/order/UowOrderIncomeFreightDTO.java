package com.huoyunren.openapi.dto.uow.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class UowOrderIncomeFreightDTO {

    /**
     * 应收运输费合计
     */
    @JsonProperty(value = "total_freight_receivable")
    private UowStandardFeeDTO totalFreightReceivable;


}
