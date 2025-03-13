package com.huoyunren.openapi.dto.uow.waybill;

import com.huoyunren.openapi.dto.uow.waybill.req.WaybillCreateNodesReq;
import lombok.Data;

/**
 * @author tangsiyuan
 * @date 2024/7/30
 **/
@Data
public class WaybillSaveNodesDTO extends WaybillCreateNodesReq {

    /**
     * 平台节点编码
     */
    private String nodeCode;

    /**
     * 下一个节点编码
     */
    private String nextNodeCode;

    /**
     * 上一个节点编码
     */
    private String previousNodeCode;


}
