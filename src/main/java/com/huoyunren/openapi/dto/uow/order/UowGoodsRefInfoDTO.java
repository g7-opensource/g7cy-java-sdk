package com.huoyunren.openapi.dto.uow.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class UowGoodsRefInfoDTO {

    /**
     * 货物编码
     */
    @JsonProperty(value = "goods_code")
    private String goodsCode;

    /**
     * 顶级货物编码
     */
    @JsonProperty(value = "top_side_goods_code")
    private String topSideGoodsCode;
}
