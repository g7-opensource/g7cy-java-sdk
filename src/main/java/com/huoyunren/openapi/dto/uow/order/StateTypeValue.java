package com.huoyunren.openapi.dto.uow.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class StateTypeValue {

    @JsonProperty(value = "type")
    private String type;

    @JsonProperty(value = "value")
    private String value;
}
