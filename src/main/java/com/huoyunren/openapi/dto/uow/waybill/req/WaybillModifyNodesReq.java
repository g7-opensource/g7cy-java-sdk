package com.huoyunren.openapi.dto.uow.waybill.req;

import java.util.List;
import lombok.Data;

/**
 * 运单修改请求节点信息
 * @author tangsiyuan
 * @date 2024/7/18
 **/
@Data
public class WaybillModifyNodesReq {

    /**
     * 业务唯一节点标识
     */
    private String bizNodeId;

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

    /**
     * 节点名称
     */
    private String nodeName;

    /**
     * 节点类型，1=装货地；2=卸货地；3=装卸地；4=途经点
     */
    private Integer nodeType;

    /**
     * 节点备注
     */
    private String nodeRemark;

    /**
     * 对应平台订单节点编码列表
     */
    private List<String> orderNodeCodes;

    /**
     * 节点货物信息
     */
    private List<WaybillModifyNodeGoodReq> nodeGoods;

    /**
     * 节点地址信息
     */
    private WaybillModifyNodeAddrReq nodeAddr;

    /**
     * 联系人信息
     */
    private WaybillModifyNodeContactReq nodeContact;

    /**
     * 计划时间
     */
    private WaybillModifyNodePlanTimeReq nodePlanTime;

    /**
     * 实际时间
     */
    private WaybillModifyNodeActualTimeReq nodeActualTime;

}
