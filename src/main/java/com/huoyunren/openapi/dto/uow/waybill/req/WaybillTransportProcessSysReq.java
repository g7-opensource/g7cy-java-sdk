package com.huoyunren.openapi.dto.uow.waybill.req;

import javax.validation.constraints.NotBlank;
import lombok.Data;

/**
 * @author tangsiyuan
 * @date 2024/9/29
 **/
@Data
public class WaybillTransportProcessSysReq {

    /**
     * 来源业务系统编码
     */
    @NotBlank(message = "来源业务系统编码不能为空")
    private String originBizSystem;
    /**
     * 上下游协作模式标记
     */
    @NotBlank(message = "上下游协作模式不能为空")
    private String collaborativeMode;

    /**
     * 原始链路跟踪ID
     */
    private String originTraceId;

}
