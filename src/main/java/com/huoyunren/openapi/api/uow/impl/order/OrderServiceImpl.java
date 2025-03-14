package com.huoyunren.openapi.api.uow.impl.order;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.huoyunren.openapi.api.uow.order.OrderService;
import com.huoyunren.openapi.dto.uow.order.req.UowOrderBatchCancelReq;
import com.huoyunren.openapi.dto.uow.order.req.UowOrderBatchCreateReq;
import com.huoyunren.openapi.dto.uow.order.res.UowOrderBatchCancelRes;
import com.huoyunren.openapi.dto.uow.order.res.UowOrderBatchCreateRes;
import com.huoyunren.openapi.enums.uow.UowApiEnum;
import com.huoyunren.openapi.util.http.G7OpenapiClient;
import com.huoyunren.openapi.util.http.G7OpenapiResult;
import com.huoyunren.openapi.util.http.RequestContext;
import java.lang.reflect.Type;
import javax.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class OrderServiceImpl implements OrderService {

    @Resource(name = "uowG7OpenapiClient")
    private G7OpenapiClient g7OpenapiClient;

    @Override
    public UowOrderBatchCreateRes batchCreateOrder(UowOrderBatchCreateReq orderBatchCreateReq) {

        RequestContext context = g7OpenapiClient.buildContext(UowApiEnum.BATCH_CREATE_ORDERS);
        context.setBody(JSON.toJSONString(orderBatchCreateReq));
        Type type = new TypeReference<G7OpenapiResult<UowOrderBatchCreateRes>>() {
        }.getType();
        return g7OpenapiClient.getRequest().request(context, type);
    }

    @Override
    public UowOrderBatchCancelRes batchCancelOrder(UowOrderBatchCancelReq orderBatchCancelReq) {
        return null;
    }
}
