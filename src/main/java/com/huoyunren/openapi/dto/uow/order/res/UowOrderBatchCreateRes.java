package com.huoyunren.openapi.dto.uow.order.res;

import java.util.List;
import lombok.Data;

/**
 * 批量创建订单响应结果
 *
 * @author dengfuwei
 * @version 1.0.0
 * @since 2024/9/27 14:29
 */
@Data
public class UowOrderBatchCreateRes {
    /**
     * 批量创建的订单信息。数量与传入的数量一致{@link com.huoyunren.uow.unified.order.sdk.dto.req.UowOrderBatchCreateReq}
     * 说明：如果对象中的base字段为空表示创建失败
     */
    private List<UowOrderCreateRes> orders;
}
