package com.huoyunren.openapi.dto.uow.waybill.req;

import com.huoyunren.openapi.dto.uow.waybill.WaybillSysDTO;
import javax.validation.constraints.NotNull;
import lombok.Data;

/**
 * 运单查询请求
 * @author tangsiyuan
 * @date 2024/7/18
 **/
@Data
public class WaybillQueryReq {

    /**
     * 系统信息
     */
    private WaybillSysDTO sys;

    /**
     * 基础信息
     */
    @NotNull(message = "基础信息不能为空")
    private WaybillQueryBaseReq base;


}
