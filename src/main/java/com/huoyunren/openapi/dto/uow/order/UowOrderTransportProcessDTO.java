package com.huoyunren.openapi.dto.uow.order;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDateTime;
import java.util.List;
import lombok.Data;

/**
 * The type Uow order transport process dto.
 */
@Data
public class UowOrderTransportProcessDTO {

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
   * The State types.
   */
  @JsonProperty(value = "state_type")
  private List<String> stateType;


  /**
   * The Node code.
   */
  @JsonProperty(value = "node_code")
  private String nodeCode;


  /**
   * The State type values.
   */
  @JsonProperty(value = "state_type_value")
  private List<StateTypeValue> stateTypeValue;

  /**
   * The Event type.
   */
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
