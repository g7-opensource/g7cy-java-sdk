package com.huoyunren.openapi.dto.uow.waybill;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.huoyunren.openapi.util.LocalDateTimeToMillisDeserializer;
import com.huoyunren.openapi.util.MillisoToLocalDateTimeSerializer;
import java.time.LocalDateTime;
import java.util.List;
import lombok.Data;

/**
 * @author tangsiyuan
 * @date 2024/10/3
 **/
@Data
public class RoadTransportDTO {

    /**
     * 操作端
     */
    private String operatingEnd;

    /**
     * 终端
     */
    private String terminal;

    /**
     * 操作系统
     */
    private String operatingSystem;


    /**
     * 运单领域事件 ID
     */
    private String eventId;

    /**
     * 运单领域事件时间
     */
    @JsonSerialize(using = MillisoToLocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeToMillisDeserializer.class)
    private LocalDateTime eventTime;

    /**
     * 领域事件状态标记
     */
    private String eventFlag;

    /**
     * 已取消的领域事件 ID
     */
    private String eventIdCanceled;

    /**
     * 操作业务系统编码
     */
    private String systemCode;

    /**
     * 平台运单节点编码
     */
    private String nodeCode;

    /**
     * 操作领域事件类型标识
     */
    private String eventType;

    /**
     * 操作时业务属性信息
     */
    private JSONObject eventProperties;

    /**
     * 操作多订单多货物货量信息
     */
    private List<TransportProcessesEventGoodDTO> eventGoods;

}
