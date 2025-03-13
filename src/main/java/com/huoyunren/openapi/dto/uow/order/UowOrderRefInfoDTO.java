package com.huoyunren.openapi.dto.uow.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.Data;

@Data
public class UowOrderRefInfoDTO {

    /**
     * 订单编码
     */
    @JsonProperty(value = "order_code")
    private String orderCode;

    /**
     * 顶级订单编码
     */
    @JsonProperty(value = "top_side_order_code")
    private String topSideOrderCode;

    /**
     * 节点关联信息
     */
    @JsonProperty(value = "node_ref_infos")
    List<UowNodeRefInfoDTO> nodeRefInfos;

    /**
     * 货物关联信息
     */
    @JsonProperty(value = "goods_ref_infos")
    List<UowGoodsRefInfoDTO> goodsRefInfos;




}
