package com.huoyunren.openapi.dto.uow.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class UowOrderRoadTransportDTO {

    /**
     * 需求车型
     */
    @JsonProperty(value = "required_vehicle_model")
    private String requiredVehicleModel;

    /**
     * 需求车长
     */
    @JsonProperty(value = "required_vehicle_length")
    private String requiredVehicleLength;
}
