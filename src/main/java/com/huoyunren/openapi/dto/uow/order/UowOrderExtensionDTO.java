package com.huoyunren.openapi.dto.uow.order;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class UowOrderExtensionDTO {
    /**
     * 业务系统编码
     */
    @NotBlank(message = "业务系统编码不能为空")
    @JsonProperty(value = "biz_system")
    private String bizSystem;

    /**
     * 业务系统扩展属性信息
     */
    @JsonProperty(value = "properties")
    private JSONObject properties;
}
