package com.huoyunren.openapi.dto.uow.waybill.res;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.huoyunren.openapi.util.LocalDateTimeToMillisDeserializer;
import com.huoyunren.openapi.util.MillisoToLocalDateTimeSerializer;
import java.time.LocalDateTime;
import javax.validation.constraints.NotNull;
import lombok.Data;

/**
 * 运单删除返回基础信息
 * @author tangsiyuan
 * @date 2024/7/18
 **/
@Data
public class WaybillDeleteBaseRsp {

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
    @NotNull(message = "修改时间（业务发生时间）不能为空")
    @JsonSerialize(using = MillisoToLocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeToMillisDeserializer.class)
    private LocalDateTime bizUpdateTime;

}
