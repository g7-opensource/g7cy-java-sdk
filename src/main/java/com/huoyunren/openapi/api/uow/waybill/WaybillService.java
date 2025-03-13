package com.huoyunren.openapi.api.uow.waybill;

import com.huoyunren.openapi.dto.uow.waybill.req.WaybillCreateReq;
import com.huoyunren.openapi.dto.uow.waybill.req.WaybillDeleteReq;
import com.huoyunren.openapi.dto.uow.waybill.req.WaybillModifyReq;
import com.huoyunren.openapi.dto.uow.waybill.req.WaybillQueryReq;
import com.huoyunren.openapi.dto.uow.waybill.res.WaybillCreateRsp;
import com.huoyunren.openapi.dto.uow.waybill.res.WaybillDeleteRsp;
import com.huoyunren.openapi.dto.uow.waybill.res.WaybillModifyRsp;
import com.huoyunren.openapi.dto.uow.waybill.res.WaybillQueryRsp;

/**
 * The interface Waybill service.
 */
public interface WaybillService {

    /**
     * 创建无订单的运单
     *
     * @param waybillCreateApiReq the waybill create api req
     * @return com.huoyunren.uow.unified.apis.sdk.dto.resp.WaybillCreateApiResp waybill create api resp
     */
    WaybillCreateRsp createWaybillWithoutOrder(WaybillCreateReq waybillCreateApiReq);

    /**
     * 修改无订单的运单
     *
     * @param waybillUpdateApiReq the waybill update api req
     * @return com.huoyunren.uow.unified.apis.sdk.dto.resp.WaybillUpdateApiResp waybill update api resp
     */
    WaybillModifyRsp updateWaybillWithoutOrder(WaybillModifyReq waybillUpdateApiReq);

    /**
     * 删除无订单的运单
     *
     * @param waybillDeleteApiReq the waybill delete api req
     * @return com.huoyunren.uow.unified.apis.sdk.dto.resp.WaybillDeleteApiResp waybill delete api resp
     */
    WaybillDeleteReq cancelWaybillWithoutOrder(WaybillDeleteReq waybillDeleteApiReq);

    /**
     * 运单创建
     *
     * @param waybillCreateReq
     * @return com.huoyunren.uow.unified.waybill.sdk.dto.resp.WaybillCreateRsp
     * @author tangsiyuan
     * @date 2024/7/24
     */
    WaybillCreateRsp waybillCreate(WaybillCreateReq waybillCreateReq);

    /**
     * 运单修改
     *
     * @param waybillModifyReq
     * @return com.huoyunren.uow.unified.waybill.sdk.dto.resp.WaybillModifyRsp
     * @author tangsiyuan
     * @date 2024/7/24
     */
    WaybillModifyRsp waybillUpdate(WaybillModifyReq waybillModifyReq);

    /**
     * 运单详情查询
     *
     * @param waybillQueryReq
     * @return com.huoyunren.uow.unified.waybill.sdk.dto.resp.WaybillQueryRsp
     * @author tangsiyuan
     * @date 2024/7/24
     */
    WaybillQueryRsp waybillQuery(WaybillQueryReq waybillQueryReq);

    /**
     * 运单删除
     *
     * @param waybillDeleteReq
     * @return com.huoyunren.uow.unified.waybill.sdk.dto.resp.WaybillDeleteRsp
     * @author tangsiyuan
     * @date 2024/7/24
     */
    WaybillDeleteRsp waybillDelete(WaybillDeleteReq waybillDeleteReq);

}
