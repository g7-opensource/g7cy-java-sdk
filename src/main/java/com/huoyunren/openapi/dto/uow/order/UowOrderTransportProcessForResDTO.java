package com.huoyunren.openapi.dto.uow.order;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDateTime;
import java.util.List;
import javax.validation.constraints.NotBlank;
import lombok.Data;

/**
 * The type Uow order transport process dto.
 */
@Data
public class UowOrderTransportProcessForResDTO {

    /**
     * 操作端
     */
    @JsonProperty(value = "operating_end")
    private String operatingEnd;

    /**
     * 终端
     */
    @JsonProperty(value = "terminal")
    private String terminal;

    /**
     * 操作系统
     */
    @JsonProperty(value = "operating_system")
    private String operatingSystem;

    /**
     * The Event ID.
     */
    @JsonProperty(value = "event_id")
    private String eventId;

    /**
     * 事件发生时间
     */
    @JsonProperty(value = "event_time")
    private LocalDateTime eventTime;

    /**
     * 已取消的领域事件 ID
     */
    @JsonProperty(value = "event_id_canceled")
    private String eventIdCanceled;

    /**
     * 操作业务系统编码
     */
    @JsonProperty(value = "system_code")
    private String systemCode;



    /**
     * The Node code.
     */
    @JsonProperty(value = "node_code")
    private String nodeCode;



    /**
     * The Event type.
     */
    @NotBlank(message = "事件类型不能为空")
    @JsonProperty(value = "event_type")
    private String eventType;

    /**
     * The Event flag.
     */
    @JsonProperty(value = "event_flag")
    private String eventFlag;

    /**
     * The Event properties.
     */
    @JsonProperty(value = "event_properties")
    private JSONObject eventProperties;

    /**
     * The Event goods.
     */
    @JsonProperty(value = "event_goods")
    private List<UowOrderEventGoods> eventGoods;
}
