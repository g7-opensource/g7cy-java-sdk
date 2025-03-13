package com.huoyunren.openapi.api.uow.order;

import com.huoyunren.openapi.dto.uow.order.req.UowOrderBatchCancelReq;
import com.huoyunren.openapi.dto.uow.order.req.UowOrderBatchCreateReq;
import com.huoyunren.openapi.dto.uow.order.res.UowOrderBatchCancelRes;
import com.huoyunren.openapi.dto.uow.order.res.UowOrderBatchCreateRes;

/**
 * The interface Waybill service.
 */
public interface OrderService {

    /**
     * batch create order uow order create res.
     *
     * @param orderBatchCreateReq the order batch create req
     * @return the uow order batch create res
     */
    UowOrderBatchCreateRes batchCreateOrder(UowOrderBatchCreateReq orderBatchCreateReq);

    /**
     * batch cancel order uow order cancel res.
     *
     * @param orderBatchCancelReq the order batch cancel req
     * @return the uow order batch cancel res
     */
    UowOrderBatchCancelRes batchCancelOrder(UowOrderBatchCancelReq orderBatchCancelReq);

}
