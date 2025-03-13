package com.huoyunren.openapi.dto.uow.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class UowNodeRefInfoDTO {

    /**
     * 节点编码
     */
    @JsonProperty(value = "node_code")
    private String nodeCode;

    /**
     * 顶级节点编码
     */
    @JsonProperty(value = "top_side_node_code")
    private String topSideNodeCode;
}
