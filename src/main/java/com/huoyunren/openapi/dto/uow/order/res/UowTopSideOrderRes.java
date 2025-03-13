package com.huoyunren.openapi.dto.uow.order.res;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import com.huoyunren.openapi.dto.uow.order.*;

@Data
public class UowTopSideOrderRes {

    /**
     * 订单信息
     */
    @JsonProperty(value = "order")
    private UowOrderQueryRes order;

    /**
     * 订单关联信息信息
     */
    @JsonProperty(value = "ref_info")
    private UowOrderRefInfoDTO refInfo;


}
