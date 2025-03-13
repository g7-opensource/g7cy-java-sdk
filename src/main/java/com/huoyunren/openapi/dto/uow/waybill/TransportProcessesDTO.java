package com.huoyunren.openapi.dto.uow.waybill;

import java.util.List;
import lombok.Data;

/**
 * @author tangsiyuan
 * @date 2024/10/3
 **/
@Data
public class TransportProcessesDTO {

    /**
     * 公路运输
     */
    private List<RoadTransportDTO> roadTransport;

}
