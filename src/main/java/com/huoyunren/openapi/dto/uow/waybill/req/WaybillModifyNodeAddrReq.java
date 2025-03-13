package com.huoyunren.openapi.dto.uow.waybill.req;

import com.huoyunren.openapi.dto.uow.waybill.WaybillNodeAddrDTO;
import lombok.Data;

/**
 * 运单修改请求节点地址信息
 * @author tangsiyuan
 * @date 2024/7/18
 **/
@Data
public class WaybillModifyNodeAddrReq extends WaybillNodeAddrDTO {

    /**
     * 详细地址
     */
//    @NotEmpty(message = "详细地址不能为空")
//    private String addr;
}
