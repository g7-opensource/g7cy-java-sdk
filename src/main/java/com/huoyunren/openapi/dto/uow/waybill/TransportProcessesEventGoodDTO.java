package com.huoyunren.openapi.dto.uow.waybill;

import com.alibaba.fastjson.JSONObject;
import lombok.Data;

/**
 * @author tangsiyuan
 * @date 2024/10/3
 **/
@Data
public class TransportProcessesEventGoodDTO {

    /**
     * 订单编码
     */
    private String orderCode;

    /**
     * 平台订单货物编码
     */
    private String orderGoodsCode;

    /**
     * 节点货物操作类型
     */
    private String nodeOperationType;

    /**
     * 订单货物规格
     */
    private JSONObject goodsSpecs;

}
