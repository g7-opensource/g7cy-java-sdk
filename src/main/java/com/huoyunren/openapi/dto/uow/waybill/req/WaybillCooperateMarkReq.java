package com.huoyunren.openapi.dto.uow.waybill.req;

import com.huoyunren.openapi.dto.uow.waybill.WaybillSysDTO;
import lombok.Data;

/**
 * @author tangsiyuan
 * @date 2024/9/13
 **/
@Data
public class WaybillCooperateMarkReq {

    /**
     * 系统信息
     */
    private WaybillSysDTO sys;

    /**
     * 运单打标标记类型
     */
    private String tagType;

    /**
     * 运单打标tagcode
     */
    private String tagCode;

    /**
     * 运单打标值
     */
    private String tagValue;

    /**
     * 平台运单编码
     */
    private String waybillCode;

}
