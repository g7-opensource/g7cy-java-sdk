package com.huoyunren.openapi.api.uow.impl.waybill;

import com.huoyunren.openapi.api.uow.waybill.WaybillProcessService;
import com.huoyunren.openapi.enums.uow.ErrorCode;
import com.huoyunren.openapi.exception.G7OpenapiException;
import com.huoyunren.openapi.exception.uow.BizException;
import java.util.List;
import java.util.Objects;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.CollectionUtils;

@Slf4j
public abstract class AbstractWaybillProcess<T, O, ORES, W, WRES> implements WaybillProcessService<T, WRES> {

    //数据校验
    protected abstract boolean validateData(T input);

    // 第二步：数据过滤
    protected T filterData(T input) {
        return input;
    }

    //组装订单数据
    protected abstract List<O> orderAssembleData(T input);

    //处理订单 创建 更新 删除
    protected abstract ORES orderHandle(List<O> orders);

    //组装运单数据
    protected abstract W waybillAssembleData(T input, ORES orderRes);

    //处理运单 创建 更新 删除
    protected abstract WRES waybillHandle(W waybill);

    public WRES doProcess(T input) {
        try {
            //数据校验
            if (validateData(input)) {
                //数据过滤
                T filteredData = filterData(input);
                //订单数据组装
                List<O> orderData = orderAssembleData(filteredData);
                if (CollectionUtils.isEmpty(orderData)) {

                    throw new BizException(ErrorCode.ASSEMBLY_ORDER_DATA_ERROR);
                }
                //订单处理
                ORES orderRes = orderHandle(orderData);
                //运单组装
                W waybill = waybillAssembleData(input, orderRes);
                if (Objects.isNull(waybill)) {
                    throw new BizException(ErrorCode.ASSEMBLY_WAYBILL_DATA_ERROR);
                }
                //运单处理
                return waybillHandle(waybill);
            }
        } catch (G7OpenapiException e) {
            log.error("运单处理异常", e);
            throw e;
        }
        return null;
    }

}
