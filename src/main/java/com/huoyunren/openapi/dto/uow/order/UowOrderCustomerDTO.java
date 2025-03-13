package com.huoyunren.openapi.dto.uow.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class UowOrderCustomerDTO {

    /**
     * 客户名称
     */
    @JsonProperty(value = "customer_name")
    private String customerName;
}
