package com.huoyunren.openapi.dto.uow.waybill;

import java.math.BigDecimal;
import lombok.Data;

/**
 * 运单返回详情支出运输费信息
 * @author tangsiyuan
 * @date 2024/7/16
 **/
@Data
public class WaybillOutFreightDTO {

    /**
     * 费用
     */
    private BigDecimal amount;

    /**
     * 应付运输费合计类型
     */
    private String currencyType;

}
