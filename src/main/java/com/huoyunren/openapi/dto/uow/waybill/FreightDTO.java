package com.huoyunren.openapi.dto.uow.waybill;

import java.math.BigDecimal;
import lombok.Data;

/**
 * @author tangsiyuan
 * @date 2024/7/31
 **/
@Data
public class FreightDTO {
    /**
     * 费用类型
     */
    private String type;


    /**
     * 费用项
     */
    private String item;


    /**
     * 金额
     */
    private BigDecimal amount;


    /**
     * 货币类型
     */
    private String currencyType;

}
