package com.huoyunren.openapi.dto.uow.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class UowOrderTransportProcessesDTO {

    @NotEmpty(message = "公路运输管理过程不能为空")
    @JsonProperty(value = "road_transport")
    @Valid
    private List<UowOrderTransportProcessDTO> roadTransport;
}
