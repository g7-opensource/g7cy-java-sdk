package com.huoyunren.openapi.dto.uow.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.constraints.NotNull;
import lombok.Data;

@Data
public class UowOrderModifiedStrategyDTO {
    /**
     * 字段修改方式
     */
    @NotNull(message = "修改模式不能为空")
    @JsonProperty(value = "modified_mode")
    private  Integer modifiedMode;
}
