package com.huoyunren.openapi.dto.uow.order.req;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.huoyunren.openapi.dto.uow.order.OrderQueryDTO;
import com.huoyunren.openapi.dto.uow.order.UowOrderSysDTO;
import java.util.List;
import javax.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class UowOrderBatchQueryReq {


    /**
     * 系统信息
     */

    @JsonProperty(value = "sys")
    private UowOrderSysDTO sys;

    /**
     * 订单查询请求体
     */
    @NotEmpty(message = "请传入订单数据")
    @JsonProperty(value = "orders")
    List<OrderQueryDTO> orders;



}
