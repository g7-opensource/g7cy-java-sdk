package com.huoyunren.openapi.dto.uow.waybill.req;

import javax.validation.constraints.NotEmpty;
import lombok.Data;

/**
 * 运单查询请求基础信息
 * @author tangsiyuan
 * @date 2024/7/18
 **/
@Data
public class WaybillQueryBaseReq {

    /**
     * 平台运单编码
     */
    private String waybillCode;

    /**
     * 业务唯一运单标识
     */
    private String bizWaybillId;

    /**
     * 租户编码
     */
    @NotEmpty(message = "租户编码不能为空")
    private String tenantCode;

}
