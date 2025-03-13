package com.huoyunren.openapi.dto.uow.waybill;

import java.util.Map;
import lombok.Data;

/**
 * 运单返回详情收入与支出运输费信息
 * @author tangsiyuan
 * @date 2024/7/16
 **/
@Data
public class WaybillInOutFreightDTO {

    /**
     * 支出运输费信息
     */
    private Map<String, WaybillOutFreightDTO> outgoFreight;

}
