package com.huoyunren.openapi.dto.uow.waybill.res;

import com.huoyunren.openapi.dto.uow.waybill.WaybillSysDTO;
import lombok.Data;

/**
 * 运单删除返回
 * @author tangsiyuan
 * @date 2024/7/18
 **/
@Data
public class WaybillDeleteRsp {

    /**
     * 系统信息
     */
    private WaybillSysDTO sys;

    /**
     * 运单基础信息
     */
    private WaybillDeleteBaseRsp base;

}
