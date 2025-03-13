package com.huoyunren.openapi.dto.uow.waybill;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.huoyunren.openapi.util.LocalDateTimeToMillisDeserializer;
import com.huoyunren.openapi.util.MillisoToLocalDateTimeSerializer;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 运单返回详情计划时间信息
 * @author tangsiyuan
 * @date 2024/7/16
 **/
@Data
public class WaybillNodePlanTimeDTO {

    /**
     * 计划发车时间（时间戳）
     */
    @JsonSerialize(using = MillisoToLocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeToMillisDeserializer.class)
    private LocalDateTime planDepartureTime;

    /**
     * 计划到达时间（时间戳）
     */
    @JsonSerialize(using = MillisoToLocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeToMillisDeserializer.class)
    private LocalDateTime planArrivalTime;

    /**
     * 计划装车时间（时间戳）
     */
    @JsonSerialize(using = MillisoToLocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeToMillisDeserializer.class)
    private LocalDateTime planLoadingTime;

    /**
     * 计划卸车时间（时间戳）
     */
    @JsonSerialize(using = MillisoToLocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeToMillisDeserializer.class)
    private LocalDateTime planUnloadingTime;

    /**
     * 计划靠台时间（时间戳）
     */
    @JsonSerialize(using = MillisoToLocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeToMillisDeserializer.class)
    private LocalDateTime planDockingTime;

}
