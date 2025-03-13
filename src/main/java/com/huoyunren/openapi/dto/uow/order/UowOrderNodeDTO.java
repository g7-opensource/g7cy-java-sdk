package com.huoyunren.openapi.dto.uow.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.Data;

@Data
public class UowOrderNodeDTO {

    /**
     * 业务唯一订单节点标识
     */
    @JsonProperty(value = "biz_node_id")
    private String bizNodeId;

    /**
     * 订单运输节点名称
     */
    @JsonProperty(value = "node_name")
    private String nodeName;

    /**
     * 订单节点平台编码
     */
    @JsonProperty(value = "node_code")
    private String nodeCode;

    /**
     * 下一个节点平台编码
     */
    @JsonProperty(value = "next_node_code")
    private String nextNodeCode;

    /**
     * 上一个节点平台编码
     */
    @JsonProperty(value = "previous_node_code")
    private String previousNodeCode;

    /**
     * 上级或父级订单节点编码
     */
    @JsonProperty(value = "ref_order_node_code")
    private String refOrderNodeCode;



    /**
     * 订单节点类型
     */
    @JsonProperty(value = "node_type")
    private Integer nodeType;

    /**
     * 订单节点备注
     */
    @JsonProperty(value = "node_remark")
    private String nodeRemark;

    /**
     * 订单节点操作货量信息
     */
    @JsonProperty(value = "node_goods")
    private List<UowOrderNodeGoodsDTO> nodeGoods;

    /**
     * 订单节点地址信息
     */
    @JsonProperty(value = "node_addr")
    private UowOrderNodeAddrDTO nodeAddr;

    /**
     * 订单节点联系人信息
     */
    @JsonProperty(value = "node_contact")
    private UowOrderNodeContactDTO nodeContact;
}
