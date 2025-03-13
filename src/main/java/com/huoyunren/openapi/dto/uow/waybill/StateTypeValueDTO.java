package com.huoyunren.openapi.dto.uow.waybill;

import lombok.Data;

/**
 * @author tangsiyuan
 * @date 2024/9/30
 **/
@Data
public class StateTypeValueDTO {

    /**
     * 状态机类型
     */
    private String type;

    /**
     * 状态机枚举值
     */
    private String value;

}
