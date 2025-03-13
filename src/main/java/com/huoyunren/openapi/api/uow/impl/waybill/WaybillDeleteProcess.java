package com.huoyunren.openapi.api.uow.impl.waybill;

import com.huoyunren.openapi.dto.uow.order.req.UowOrderCancelReq;
import com.huoyunren.openapi.dto.uow.order.res.UowOrderCancelRes;
import com.huoyunren.openapi.dto.uow.waybill.req.WaybillDeleteReq;
import com.huoyunren.openapi.dto.uow.waybill.res.WaybillDeleteRsp;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class WaybillDeleteProcess extends
    AbstractWaybillProcess<WaybillDeleteReq, UowOrderCancelReq, UowOrderCancelRes, WaybillDeleteReq, WaybillDeleteRsp> {

    @Override
    protected boolean validateData(WaybillDeleteReq input) {
        return false;
    }

    @Override
    protected List<UowOrderCancelReq> orderAssembleData(WaybillDeleteReq input) {
        return null;
    }

    @Override
    protected UowOrderCancelRes orderHandle(List<UowOrderCancelReq> orders) {
        return null;
    }

    @Override
    protected WaybillDeleteReq waybillAssembleData(WaybillDeleteReq input, UowOrderCancelRes orderRes) {
        return null;
    }

    @Override
    protected WaybillDeleteRsp waybillHandle(WaybillDeleteReq waybill) {
        return null;
    }
}
