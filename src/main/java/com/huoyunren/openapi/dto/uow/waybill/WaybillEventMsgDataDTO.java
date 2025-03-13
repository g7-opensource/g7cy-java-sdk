package com.huoyunren.openapi.dto.uow.waybill;

import lombok.Data;

/**
 * @author tangsiyuan
 * @date 2024/7/25
 **/
@Data
public class WaybillEventMsgDataDTO {

    /**
     * 该业务数据之前的取值
     */
    private WaybillEventDTO oldData;


    /**
     * 该业务数据当前的取值
     */
    private WaybillEventDTO newData;

}
