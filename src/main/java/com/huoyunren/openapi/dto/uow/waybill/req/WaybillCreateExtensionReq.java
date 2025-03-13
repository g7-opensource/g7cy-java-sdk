package com.huoyunren.openapi.dto.uow.waybill.req;

import com.huoyunren.openapi.dto.uow.waybill.WaybillExtensionDTO;
import lombok.Data;

/**
 * 运单创建请求业务扩展信息
 * @author tangsiyuan
 * @date 2024/7/16
 **/
@Data
public class WaybillCreateExtensionReq extends WaybillExtensionDTO {

    /**
     * 业务系统编码
     */
//    @NotEmpty(message = "业务系统编码不能为空")
//    private String bizSystem;

    /**
     * 扩展字段信息
     */
//    @NotNull(message = "扩展字段信息不能为空")
//    private Map<String, Object> properties;

}
