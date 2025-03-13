package com.huoyunren.openapi.api.uow.impl.waybill;

import com.huoyunren.openapi.api.uow.waybill.WaybillService;
import com.huoyunren.openapi.dto.uow.waybill.req.WaybillCreateReq;
import com.huoyunren.openapi.dto.uow.waybill.req.WaybillDeleteReq;
import com.huoyunren.openapi.dto.uow.waybill.req.WaybillModifyReq;
import com.huoyunren.openapi.dto.uow.waybill.req.WaybillQueryReq;
import com.huoyunren.openapi.dto.uow.waybill.res.WaybillCreateRsp;
import com.huoyunren.openapi.dto.uow.waybill.res.WaybillDeleteRsp;
import com.huoyunren.openapi.dto.uow.waybill.res.WaybillModifyRsp;
import com.huoyunren.openapi.dto.uow.waybill.res.WaybillQueryRsp;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * The interface Waybill service.
 */
@Component
@Slf4j
public class WaybillServiceImpl implements WaybillService {

    @Override
    public WaybillCreateRsp createWaybillWithoutOrder(WaybillCreateReq waybillCreateApiReq) {
        return null;
    }

    @Override
    public WaybillModifyRsp updateWaybillWithoutOrder(WaybillModifyReq waybillUpdateApiReq) {
        return null;
    }

    @Override
    public WaybillDeleteReq cancelWaybillWithoutOrder(WaybillDeleteReq waybillDeleteApiReq) {
        return null;
    }

    @Override
    public WaybillCreateRsp waybillCreate(WaybillCreateReq waybillCreateReq) {
        return null;
    }

    @Override
    public WaybillModifyRsp waybillUpdate(WaybillModifyReq waybillModifyReq) {
        return null;
    }

    @Override
    public WaybillQueryRsp waybillQuery(WaybillQueryReq waybillQueryReq) {
        return null;
    }

    @Override
    public WaybillDeleteRsp waybillDelete(WaybillDeleteReq waybillDeleteReq) {
        return null;
    }
}
