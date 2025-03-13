package com.huoyunren.openapi.dto.uow.order;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.huoyunren.openapi.util.LocalDateTimeToMillisDeserializer;
import com.huoyunren.openapi.util.MillisoToLocalDateTimeSerializer;
import java.time.LocalDateTime;
import javax.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class UowOrderBaseDTO {


    /**
     * 唯一订单id
     */
    @JsonProperty(value = "id")
    private Long id;

    /**
     * 业务唯一订单标识
     */
    @JsonProperty(value = "biz_order_id")
    private String bizOrderId;

    /**
     * 平台租户编码
     */
    @NotBlank(message = "平台租户编码不能为空")
    @JsonProperty(value = "tenant_code")
    private String tenantCode;

    /**
     * 平台订单号
     */
    @JsonProperty(value = "order_code")
    private String orderCode;

    /**
     * 平台订单状态
     */
    @JsonProperty(value = "state")
    private Integer state;

    /**
     * 运输状态
     */
    @JsonProperty(value = "transport_state")
    private String transportState;

    /**
     * 订单上游委托状态
     */
    @JsonProperty(value = "up_entrust_state")
    private String upEntrustState;

    /**
     * 订单下游委托状态
     */
    @JsonProperty(value = "down_entrust_state")
    private String downEntrustState;



    /**
     * 上级订单编码
     */
    @JsonProperty(value = "parent_order_code")
    private String parentOrderCode;
    /**
     * 上游客户订单编码
     */
    @JsonProperty(value = "up_order_code")
    private String upOrderCode;

    /**
     * 下游客户订单编码
     */
    @JsonProperty(value = "down_order_code")
    private String downOrderCode;

    /**
     * 上游客户租户编码
     */
    @JsonProperty(value = "up_tenant_code")
    private String upTenantCode;

    /**
     * 下游客户租户编码
     */
    @JsonProperty(value = "down_tenant_code")
    private String downTenantCode;

    /**
     * 创建平台用户编码
     */
    @JsonProperty(value = "create_user_code")
    private String createUserCode;

    /**
     * 创建平台用户名称
     */
    @JsonProperty(value = "create_user_name")
    @JSONField(format = "millis")
    private String createUserName;

    /**
     * 业务创建时间
     */
    @JsonProperty(value = "biz_create_time")
    @JsonSerialize(using = MillisoToLocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeToMillisDeserializer.class)
    private LocalDateTime bizCreateTime;

    /**
     * 创建时间
     */
    @JsonProperty(value = "create_time")
    @JsonSerialize(using = MillisoToLocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeToMillisDeserializer.class)
    private LocalDateTime createTime;

    /**
     * 修改平台用户名称
     */
    @JsonProperty(value = "update_user_name")
    private String updateUserName;

    /**
     * 修改平台用户编码
     */
    @JsonProperty(value = "update_user_code")
    private String updateUserCode;

    /**
     * 业务修改时间
     */
    @JsonProperty(value = "biz_update_time")
    @JsonSerialize(using = MillisoToLocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeToMillisDeserializer.class)
    private LocalDateTime bizUpdateTime;

    /**
     * 修改时间
     */
    @JsonProperty(value = "update_time")
    @JsonSerialize(using = MillisoToLocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeToMillisDeserializer.class)
    private LocalDateTime updateTime;






}
