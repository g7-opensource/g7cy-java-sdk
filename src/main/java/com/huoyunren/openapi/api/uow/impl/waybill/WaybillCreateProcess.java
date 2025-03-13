package com.huoyunren.openapi.api.uow.impl.waybill;

import com.huoyunren.openapi.dto.uow.order.req.UowOrderCreateReq;
import com.huoyunren.openapi.dto.uow.order.res.UowOrderCreateRes;
import com.huoyunren.openapi.dto.uow.waybill.req.WaybillCreateReq;
import com.huoyunren.openapi.dto.uow.waybill.res.WaybillCreateRsp;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class WaybillCreateProcess extends
    AbstractWaybillProcess<WaybillCreateReq, UowOrderCreateReq, UowOrderCreateRes, WaybillCreateReq, WaybillCreateRsp> {

    @Override
    protected boolean validateData(WaybillCreateReq input) {
        return false;
    }

    @Override
    protected List<UowOrderCreateReq> orderAssembleData(WaybillCreateReq input) {
        return null;
    }

    @Override
    protected UowOrderCreateRes orderHandle(List<UowOrderCreateReq> orders) {
        return null;
    }

    @Override
    protected WaybillCreateReq waybillAssembleData(WaybillCreateReq input, UowOrderCreateRes orderRes) {
        return null;
    }

    @Override
    protected WaybillCreateRsp waybillHandle(WaybillCreateReq waybill) {
        return null;
    }
}
