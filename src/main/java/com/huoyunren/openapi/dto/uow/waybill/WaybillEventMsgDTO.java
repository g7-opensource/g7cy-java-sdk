package com.huoyunren.openapi.dto.uow.waybill;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.huoyunren.openapi.util.LocalDateTimeToMillisDeserializer;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * @author tangsiyuan
 * @date 2024/7/25
 **/
@Data
public class WaybillEventMsgDTO {

    /**
     * 事件ID
     */
    private String eventId;

    /**
     * 协作中心操作记录ID
     */
//    private String opId;

    /**
     * 业务系统编码
     */
    private String eventBizSystem;

    /**
     * 租户编码
     */
    private String tenantCode;

    /**
     * 事件类型
     */
    private String eventType;

    /**
     * 事件产生时间（时间戳毫秒）
     */
    @JsonDeserialize(
        using = LocalDateTimeToMillisDeserializer.class
    )
    private LocalDateTime eventTime;

    /**
     * 事件对应的业务消息
     */
    private WaybillEventMsgDataDTO eventData;
}
