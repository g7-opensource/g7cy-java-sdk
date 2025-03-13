package com.huoyunren.openapi.dto.uow.waybill.req;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.huoyunren.openapi.util.LocalDateTimeToMillisDeserializer;
import com.huoyunren.openapi.util.MillisoToLocalDateTimeSerializer;
import java.time.LocalDateTime;
import javax.validation.constraints.NotEmpty;
import lombok.Data;

/**
 * 运单创建请求基础信息
 * @author tangsiyuan
 * @date 2024/7/16
 **/
@Data
public class WaybillCreateBaseReq {

    /**
     * 业务唯一运单标识
     */
    private String bizWaybillId;

    /**
     * 租户编码
     */
    @NotEmpty(message = "租户编码不能为空")
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
     * 创建时间（业务发生时间）毫秒时间戳
     */
    @JsonSerialize(using = MillisoToLocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeToMillisDeserializer.class)
    private LocalDateTime bizCreateTime;

    /**
     * 运单备注
     */
    private String remark;

}
