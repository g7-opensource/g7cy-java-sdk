package com.huoyunren.openapi.dto.uow.waybill.req;

import com.alibaba.fastjson.JSONObject;
import com.huoyunren.openapi.dto.uow.waybill.StateTypeValueDTO;
import com.huoyunren.openapi.dto.uow.waybill.TransportProcessesEventGoodDTO;
import java.util.List;
import lombok.Data;

/**
 * @author tangsiyuan
 * @date 2024/9/30
 **/
@Data
public class RoadTransportCreateReq {

    /**
     * The Event ID.
     */
//    private String eventId;

    /**
     * 已取消的领域事件 ID
     */
    private String eventIdCanceled;

    /**
     * 操作业务系统编码
     */
//    private String systemCode;

    /**
     * 状态类型
     */
    private List<String> stateType;

    /**
     * 状态类型枚举值
     */
    private  List<StateTypeValueDTO> stateTypeValue;

    /**
     * 平台运单节点编码
     */
    private String nodeCode;


    /**
     * 操作领域事件类型标识
     */
    private String eventType;

    /**
     * The Event flag.
     */
//    @JsonProperty(value = "event_flag")
//    private String eventFlag;

    /**
     * 操作时业务属性信息
     */
    private JSONObject eventProperties;

    /**
     * 操作多订单多货物货量信息
     */
    private List<TransportProcessesEventGoodDTO> eventGoods;

}
