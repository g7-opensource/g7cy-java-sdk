package com.huoyunren.openapi.dto.uow.waybill;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.huoyunren.openapi.util.LocalDateTimeToMillisDeserializer;
import com.huoyunren.openapi.util.MillisoToLocalDateTimeSerializer;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 运单返回详情实际时间信息
 * @author tangsiyuan
 * @date 2024/9/5
 **/
@Data
public class WaybillNodeActualTimeDTO {

    /**
     * 实际发车时间（时间戳）
     */
    @JsonSerialize(using = MillisoToLocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeToMillisDeserializer.class)
    private LocalDateTime actualDepartureTime;

    /**
     * 实际到达时间（时间戳）
     */
    @JsonSerialize(using = MillisoToLocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeToMillisDeserializer.class)
    private LocalDateTime actualArrivalTime;

    /**
     * 实际装车时间（时间戳）
     */
    @JsonSerialize(using = MillisoToLocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeToMillisDeserializer.class)
    private LocalDateTime actualLoadingTime;

    /**
     * 实际卸车时间（时间戳）
     */
    @JsonSerialize(using = MillisoToLocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeToMillisDeserializer.class)
    private LocalDateTime actualUnloadingTime;

    /**
     * 实际靠台时间（时间戳）
     */
    @JsonSerialize(using = MillisoToLocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeToMillisDeserializer.class)
    private LocalDateTime actualDockingTime;

}
