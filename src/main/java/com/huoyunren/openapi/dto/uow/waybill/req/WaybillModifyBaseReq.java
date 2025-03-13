package com.huoyunren.openapi.dto.uow.waybill.req;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.huoyunren.openapi.util.LocalDateTimeToMillisDeserializer;
import com.huoyunren.openapi.util.MillisoToLocalDateTimeSerializer;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 运单修改请求基础信息
 * @author tangsiyuan
 * @date 2024/7/18
 **/
@Data
public class WaybillModifyBaseReq{
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
     * 修改用户编码
     */
    private String updateUserCode;

    /**
     * 修改用户名称
     */
    private String updateUserName;

    /**
     * 修改时间（业务发生时间）毫秒时间戳
     */
    @JsonSerialize(using = MillisoToLocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeToMillisDeserializer.class)
    private LocalDateTime bizUpdateTime;

    /**
     * 运单备注
     */
    private String remark;
}
