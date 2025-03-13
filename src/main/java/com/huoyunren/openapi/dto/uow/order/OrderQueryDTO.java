package com.huoyunren.openapi.dto.uow.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class OrderQueryDTO {


    /**
     * 业务唯一订单标识
     */
    @JsonProperty(value = "biz_order_id")
    private String bizOrderId;

    /**
     * 平台租户编码
     */
    @Valid
    @NotBlank(message = "平台租户编码不能为空")
    @JsonProperty(value = "tenant_code")
    private String tenantCode;

    /**
     * 平台订单号
     */
    @JsonProperty(value = "order_code")
    private String orderCode;
}
