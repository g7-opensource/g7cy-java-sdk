package com.huoyunren.openapi.dto.uow.order;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class UowOrderNodeGoodsDTO {

    /**
     * 业务唯一订单节点货物标识
     */
    @JsonProperty(value = "biz_goods_id")
    private String bizGoodsId;

    /**
     * 货物平台编码
     */
    @JsonProperty(value = "goods_code")
    private String goodsCode;

    /**
     * 订单节点货物名称
     */
    @JsonProperty(value = "goods_name")
    private String goodsName;

    /**
     * 订单节点货物企业内部货物编码
     */
    @JsonProperty(value = "customer_goods_code")
    private String customerGoodsCode;

    /**
     * 业务侧货物类型
     */
    @JsonProperty(value = "biz_goods_type")
    private String bizGoodsType;

    /**
     * 订单节点货物类型（国标）
     */
    @JsonProperty(value = "goods_classification_code")
    private String goodsClassificationCode;

    /**
     * 订单节点操作类型
     */
    @JsonProperty(value = "node_operation_type")
    private Integer nodeOperationType;

    /**
     * 订单货物规格
     */
    @JsonProperty(value = "goods_specs")
    private JSONObject goodsSpecs;

      /**
     * 上游或父级订单货物编码
     */
    @JsonProperty(value = "ref_order_goods_code")
    private String refOrderGoodsCode;


}
