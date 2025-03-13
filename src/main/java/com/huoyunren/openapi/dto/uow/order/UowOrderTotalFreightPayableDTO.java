package com.huoyunren.openapi.dto.uow.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import lombok.Data;

@Data
public class UowOrderTotalFreightPayableDTO {

    /**
     * 应付运输费合计
     */
    @JsonProperty(value = "amount")
    private BigDecimal amount;


    /**
     * 应付运输费合计币种
     */
    @JsonProperty(value = "currency_type")
    private String currencyType;
}
