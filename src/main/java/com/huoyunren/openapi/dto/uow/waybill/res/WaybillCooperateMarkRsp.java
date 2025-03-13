package com.huoyunren.openapi.dto.uow.waybill.res;

import lombok.Data;

/**
 * @author tangsiyuan
 * @date 2024/9/13
 **/
@Data
public class WaybillCooperateMarkRsp {

    /**
     * 运单打标类型
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

    /**
     * 平台租户编码
     */
    private String tenantCode;

    /**
     * 标签来源业务系统编码
     */
    private String tagSystemCode;
}
