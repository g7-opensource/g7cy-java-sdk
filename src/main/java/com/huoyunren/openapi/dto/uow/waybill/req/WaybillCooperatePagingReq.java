package com.huoyunren.openapi.dto.uow.waybill.req;

import lombok.Data;

/**
 * @author tangsiyuan
 * @date 2024/9/9
 **/
@Data
public class WaybillCooperatePagingReq{

    /**
     * 查询参数
     */
    private WaybillCooperatePagingQueryReq waybillQuery;

    /**
     * 光标
     */
    private Long cursor;

    /**
     * 每页条数
     */
    private Long pageSize;
}
