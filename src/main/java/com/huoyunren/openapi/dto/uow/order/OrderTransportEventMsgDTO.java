package com.huoyunren.openapi.dto.uow.order;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.huoyunren.openapi.util.LocalDateTimeToMillisDeserializer;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * @author luoyu
 * @date 2024/8/1
 **/
@Data
public class OrderTransportEventMsgDTO {

    /**
     * 事件ID
     */
    private String eventId;

    /**
     * 协作中心操作记录ID
     */
    private String opId;

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
     * 事件生成时间
     */
    @JsonDeserialize(using= LocalDateTimeToMillisDeserializer.class)
    private LocalDateTime eventTime;

    /**
     * 事件对应的业务消息
     */
    private TransportProcessEventMsgDataDTO eventData;
}
