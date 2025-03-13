package com.huoyunren.openapi.dto.uow.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.constraints.NotBlank;
import lombok.Data;
@Data
public class UowOrderSysDTO {

    /**
     * 来源业务系统编码
     */
    @NotBlank(message = "来源业务系统编码不能为空")
    @JsonProperty(value = "origin_biz_system")
    private String originBizSystem;
    /**
     * 上下游协作模式标记
     */
    @NotBlank(message = "上下游协作模式不能为空")
    @JsonProperty(value = "collaborative_mode")
    private String collaborativeMode;

    /**
     * 原始链路跟踪ID
     */
    @JsonProperty(value = "origin_trace_id")
    private String originTraceId;


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


}
