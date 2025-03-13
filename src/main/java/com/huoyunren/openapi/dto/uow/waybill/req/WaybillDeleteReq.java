package com.huoyunren.openapi.dto.uow.waybill.req;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import lombok.Data;

/**
 * 运单删除请求
 * @author tangsiyuan
 * @date 2024/7/18
 **/
@Data
public class WaybillDeleteReq {

    /**
     * 系统信息
     */
    @NotNull(message = "系统信息不能为空")
    @Valid
    private WaybillDeleteSysReq sys;

    /**
     * 基础信息
     */
    @NotNull(message = "基础信息不能为空")
    @Valid
    private WaybillDeleteBaseReq base;

}
