package com.huoyunren.openapi.dto.uow.order;

import lombok.Data;

/**
 * @author luoyu
 * @date 2024/8/1
 **/
@Data
public class OrderEventMsgDataDTO {

    /**
     * 该业务数据之前的取值
     */
    private UowOrderEventDTO oldData;


    /**
     * 该业务数据当前的取值
     */
    private UowOrderEventDTO newData;

}
