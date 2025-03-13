package com.huoyunren.openapi.dto.uow.waybill.req;

import com.huoyunren.openapi.dto.uow.waybill.WaybillSysDTO;
import lombok.Data;

/**
 * 运单修改请求系统信息
 * @author tangsiyuan
 * @date 2024/7/18
 **/
@Data
public class WaybillModifySysReq extends WaybillSysDTO {

    /**
     * 来源业务系统编码
     */
    private String originBizSystem;

    /**
     * 上下游协作模式标记
     */
    private String collaborativeMode;

    /**
     * 原始链路跟踪ID
     */
    private String originTraceId;

}
