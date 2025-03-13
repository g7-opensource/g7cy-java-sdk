package com.huoyunren.openapi.dto.uow.order.req;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import lombok.Data;

/**
 * 批量修改订单参数
 *
 * @author dengfuwei
 * @version 1.0.0
 * @since 2024/9/27 14:28
 */
@Data
public class UowOrderBatchModifyReq {
    /**
     * 批量修改的订单信息
     */
    @NotEmpty(message = "请传入订单数据")
    @Valid
    private List<UowOrderModifyReq> orders;

    @JsonProperty(value = "is_test")
    private boolean isTest=false;

    @JsonProperty(value = "batch_size")
    private Integer batchSize = 100;
}
