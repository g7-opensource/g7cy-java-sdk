package com.huoyunren.openapi.dto.uow.waybill;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.huoyunren.openapi.util.LocalDateTimeToMillisDeserializer;
import com.huoyunren.openapi.util.MillisoToLocalDateTimeSerializer;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * @author tangsiyuan
 * @date 2024/7/25
 **/
@Data
public class WaybillOpLogDTO {

    /**
     * 日志编码
     */
    private String logCode;

    /**
     * 业务系统编码
     */
    private String systemCode;

    /**
     * 平台运单编码
     */
    private String waybillCode;

    /**
     * 租户编码
     */
    private String tenantCode;

    /**
     * 操作人编码
     */
    private String userCode;

    /**
     * 操作时间
     */
    @JsonSerialize(using = MillisoToLocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeToMillisDeserializer.class)
    private LocalDateTime opTime;

    /**
     * 操作类型
     */
    private String opType;

    /**
     * 操作前快照
     */
    private String opSnapshot;

    /**
     * 操作信息
     */
    private String opInfo;
}
