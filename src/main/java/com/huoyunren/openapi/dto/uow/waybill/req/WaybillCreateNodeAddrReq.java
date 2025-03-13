package com.huoyunren.openapi.dto.uow.waybill.req;

import com.huoyunren.openapi.dto.uow.waybill.WaybillNodeAddrDTO;
import lombok.Data;

/**
 * 运单创建请求节点地址信息
 * @author tangsiyuan
 * @date 2024/7/16
 **/
@Data
public class WaybillCreateNodeAddrReq extends WaybillNodeAddrDTO {

    /**
     * 详细地址
     */
    private String addr;

}
