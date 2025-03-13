package com.huoyunren.openapi.dto.uow.waybill;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.huoyunren.openapi.util.LocalDateTimeToMillisDeserializer;
import com.huoyunren.openapi.util.MillisoToLocalDateTimeSerializer;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 运单返回详情基础信息
 * @author tangsiyuan
 * @date 2024/7/16
 **/
@Data
public class WaybillBaseDTO {

    /**
     * 平台运单编码
     */
    private String waybillCode;

    /**
     * 业务唯一运单标识
     */
    private String bizWaybillId;

    /**
     * 租户编码
     */
    private String tenantCode;

    /**
     * 创建用户编码
     */
    private String createUserCode;

    /**
     * 创建用户名称
     */
    private String createUserName;

    /**
     * 创建时间
     */
    @JsonSerialize(using = MillisoToLocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeToMillisDeserializer.class)
    private LocalDateTime createTime;

    /**
     * 最后修改用户编码
     */
    private String updateUserCode;

    /**
     * 最后修改用户名称
     */
    private String updateUserName;

    /**
     * 最后修改时间
     */
    @JsonSerialize(using = MillisoToLocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeToMillisDeserializer.class)
    private LocalDateTime updateTime;

    /**
     * 创建时间（业务发生时间）毫秒时间戳
     */
    @JsonSerialize(using = MillisoToLocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeToMillisDeserializer.class)
    private LocalDateTime bizCreateTime;

    /**
     * 修改时间（业务发生时间）毫秒时间戳
     */
    @JsonSerialize(using = MillisoToLocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeToMillisDeserializer.class)
    private LocalDateTime bizUpdateTime;

    /**
     * 运单状态
     */
    private Integer state;

    /**
     * 运单回单审核状态
     */
    private String receiptCheckState;

    /**
     * 下发状态
     */
    private String issueState;

    /**
     * 运单备注
     */
    private String remark;
}
