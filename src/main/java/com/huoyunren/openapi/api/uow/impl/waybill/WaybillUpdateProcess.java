package com.huoyunren.openapi.api.uow.impl.waybill;

import com.huoyunren.openapi.dto.uow.order.req.UowOrderModifyReq;
import com.huoyunren.openapi.dto.uow.order.res.UowOrderModifiedRes;
import com.huoyunren.openapi.dto.uow.waybill.req.WaybillModifyReq;
import com.huoyunren.openapi.dto.uow.waybill.res.WaybillModifyRsp;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class WaybillUpdateProcess extends
    AbstractWaybillProcess<WaybillModifyReq, UowOrderModifyReq, UowOrderModifiedRes, WaybillModifyReq, WaybillModifyRsp> {

    @Override
    protected boolean validateData(WaybillModifyReq input) {
        return false;
    }

    @Override
    protected List<UowOrderModifyReq> orderAssembleData(WaybillModifyReq input) {
        return null;
    }

    @Override
    protected UowOrderModifiedRes orderHandle(List<UowOrderModifyReq> orders) {
        return null;
    }

    @Override
    protected WaybillModifyReq waybillAssembleData(WaybillModifyReq input, UowOrderModifiedRes orderRes) {
        return null;
    }

    @Override
    protected WaybillModifyRsp waybillHandle(WaybillModifyReq waybill) {
        return null;
    }
}
