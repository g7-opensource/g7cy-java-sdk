package com.huoyunren.openapi.dto.uow.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class UowOrderTransportModeDTO {

    /**
     * 公路运输信息
     */
    @JsonProperty(value = "road_transport")
    private UowOrderRoadTransportDTO roadTransport;
}
