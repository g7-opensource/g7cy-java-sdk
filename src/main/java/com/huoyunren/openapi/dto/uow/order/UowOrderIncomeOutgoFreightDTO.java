package com.huoyunren.openapi.dto.uow.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import lombok.Data;

@Data
public class UowOrderIncomeOutgoFreightDTO {

    /**
     * 收入运输费信息
     */
    @JsonProperty(value = "income_freight")
    private Map<String,UowStandardFeeDTO> incomeFreight;

    /**
     * 支出运输费信息
     */
    @JsonProperty(value = "outgo_freight")
    private Map<String,UowStandardFeeDTO> outgoFreight;
}
