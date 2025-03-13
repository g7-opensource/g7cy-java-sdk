package com.huoyunren.openapi.dto.uow.waybill;

import lombok.Data;

/**
 * @author tangsiyuan
 * @date 2024/9/30
 **/
@Data
public class WaybillStrategyDTO {
    /**
     * 更新模式：1=部分字段更新；2=全量字段更新；
     */
    private Integer modifiedMode;
}
