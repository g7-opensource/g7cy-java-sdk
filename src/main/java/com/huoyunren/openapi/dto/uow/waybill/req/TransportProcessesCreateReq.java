package com.huoyunren.openapi.dto.uow.waybill.req;

import java.util.List;
import lombok.Data;

/**
 * @author tangsiyuan
 * @date 2024/9/30
 **/
@Data
public class TransportProcessesCreateReq {

    /**
     * 公路运输
     */
    private List<RoadTransportCreateReq> roadTransport;
}
