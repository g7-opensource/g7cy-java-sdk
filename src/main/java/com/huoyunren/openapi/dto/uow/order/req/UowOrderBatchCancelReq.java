package com.huoyunren.openapi.dto.uow.order.req;

import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import lombok.Data;

/**
 * 批量删除订单参数
 *
 * @author dengfuwei
 * @version 1.0.0
 * @since 2024/9/27 14:28
 */
@Data
public class UowOrderBatchCancelReq {
    /**
     * 批量删除的订单信息
     */
    @NotEmpty(message = "请传入订单数据")
    @Valid
    private List<UowOrderCancelReq> orders;
}
