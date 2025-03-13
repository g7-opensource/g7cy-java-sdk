package com.huoyunren.openapi.dto.uow.waybill.req;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.huoyunren.openapi.util.LocalDateTimeToMillisDeserializer;
import com.huoyunren.openapi.util.MillisoToLocalDateTimeSerializer;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * @author tangsiyuan
 * @date 2024/9/10
 **/
@Data
public class WaybillCooperatePagingQueryTagReq {

    /**
     * 运单打标创建时间起始值
     */
    @JsonSerialize(using = MillisoToLocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeToMillisDeserializer.class)
    private LocalDateTime tagCreateTimeStart;

    /**
     * 运单打标创建时间结束值
     */
    @JsonSerialize(using = MillisoToLocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeToMillisDeserializer.class)
    private LocalDateTime tagCreateTimeEnd;
}
