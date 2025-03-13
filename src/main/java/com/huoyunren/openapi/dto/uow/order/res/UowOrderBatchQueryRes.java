package com.huoyunren.openapi.dto.uow.order.res;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.Data;

@Data
public class UowOrderBatchQueryRes {

    /**
     * 订单详情
     */
    @JsonProperty(value = "orders")
    List<UowOrderQueryRes> orders;
}
