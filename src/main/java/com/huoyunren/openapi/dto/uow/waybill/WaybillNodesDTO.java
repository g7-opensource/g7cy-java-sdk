package com.huoyunren.openapi.dto.uow.waybill;

import java.util.List;
import lombok.Data;

/**
 * 运单返回详情节点信息
 * @author tangsiyuan
 * @date 2024/7/16
 **/
@Data
public class WaybillNodesDTO {

    /**
     * 节点编码
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
     * 业务唯一节点标识
     */
    private String bizNodeId;

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
     * 节点运输状态
     */
    private String nodeTransportState;

    /**
     * 对应平台订单节点编码列表
     */
    private List<String> orderNodeCodes;

    /**
     * 节点货物信息
     */
    private List<WaybillNodeGoodDTO> nodeGoods;

    /**
     * 节点地址信息
     */
    private WaybillNodeAddrDTO nodeAddr;

    /**
     * 联系人信息
     */
    private WaybillNodeContactDTO nodeContact;

    /**
     * 计划时间
     */
    private WaybillNodePlanTimeDTO nodePlanTime;

    /**
     * 实际时间
     */
    private WaybillNodeActualTimeDTO nodeActualTime;

}
