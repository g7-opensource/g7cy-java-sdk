package com.huoyunren.openapi.dto.uow.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import lombok.Data;

@Data
public class UowStandardFeeDTO {


    /**
     * 费用类型:收入运输费信息
     */
    @JsonProperty(value = "type")
    private String type;


    /**
     * 费用项：应收运输费合计
     */
    @JsonProperty(value = "item")
    private  String item;

    /**
     * 费用
     */
    @JsonProperty(value = "amount")
    private BigDecimal amount;


    /**
     * 币种
     */
    @JsonProperty(value = "currency_type")
    private String currencyType;

}
