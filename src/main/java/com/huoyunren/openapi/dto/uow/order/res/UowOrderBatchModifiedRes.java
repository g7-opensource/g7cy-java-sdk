package com.huoyunren.openapi.dto.uow.order.res;

import java.util.List;
import lombok.Data;

/**
 * 批量修改订单响应结果
 *
 * @author dengfuwei
 * @version 1.0.0
 * @since 2024/9/27 14:29
 */
@Data
public class UowOrderBatchModifiedRes {
    /**
     * 批量修改的订单信息
     * 说明：如果对象中的base字段为空表示创建失败
     */
    private List<UowOrderModifiedRes> orders;
}
