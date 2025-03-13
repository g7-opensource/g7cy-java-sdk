package com.huoyunren.openapi.dto.uow.order;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class UowOrderEventGoods {

    /**
     * 订单编码
     */
    @JsonProperty(value = "order_code")
    private String orderCode;

    /**
     * 平台订单货物编码
     */
    @JsonProperty(value = "order_goods_code")
    private String orderGoodsCode;

    /**
     * 节点货物操作类型
     */
    @JsonProperty(value = "node_operation_type")
    private String nodeOperationType;



    /**
     * 订单货物规格
     */
    @JsonProperty(value = "goods_specs")
    private JSONObject goodsSpecs;



}
