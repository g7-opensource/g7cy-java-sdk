package com.huoyunren.openapi.dto.uow.waybill.req;

import lombok.Data;

/**
 * @author tangsiyuan
 * @date 2024/9/10
 **/
@Data
public class WaybillCooperatePagingQueryReq {

    /**
     * 运单索引查询参数
     */
    private WaybillCooperatePagingQueryBaseReq base;

    /**
     * 运单运力查询参数
     */
    private WaybillCooperatePagingTransportCapacityReq transportCapacity;

    /**
     * 运单打标查询参数
     */
    private WaybillCooperatePagingQueryTagReq tag;

}
