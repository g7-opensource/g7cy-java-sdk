package com.huoyunren.openapi.dto.uow.waybill.req;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.huoyunren.openapi.util.LocalDateTimeToMillisDeserializer;
import com.huoyunren.openapi.util.MillisoToLocalDateTimeSerializer;
import java.time.LocalDateTime;
import java.util.List;
import lombok.Data;

/**
 * @author tangsiyuan
 * @date 2024/9/10
 **/
@Data
public class WaybillCooperatePagingQueryBaseReq {

    /**
     * 运单编码
     */
    private String waybillCode;

    /**
     * 运单租户编码列表
     */
    private List<String> tenantCodes;

    /**
     * 运单业务创建时间起始值
     */
    @JsonSerialize(using = MillisoToLocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeToMillisDeserializer.class)
    private LocalDateTime bizCreateTimeStart;

    /**
     * 运单业务创建时间结束值
     */
    @JsonSerialize(using = MillisoToLocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeToMillisDeserializer.class)
    private LocalDateTime bizCreateTimeEnd;

}
