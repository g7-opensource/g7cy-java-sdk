package com.huoyunren.openapi.dto.uow.waybill.req;

import com.huoyunren.openapi.dto.uow.waybill.*;
import lombok.Data;


/**
 * 运单创建请求系统信息
 * @author tangsiyuan
 * @date 2024/7/16
 **/
@Data
public class WaybillCreateSysReq extends WaybillSysDTO {

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
