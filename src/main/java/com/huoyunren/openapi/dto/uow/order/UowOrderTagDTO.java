package com.huoyunren.openapi.dto.uow.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class UowOrderTagDTO {


    /**
     * 打标类型
     */
    @JsonProperty(value = "tag_type")
    private String tagType;


    /**
     * 标记系统编码
     */
    @JsonProperty(value = "tag_system_code")
    private  String tagSystemCode;

    /**
     * 标记编码
     */
    @JsonProperty(value = "tag_code")
    private String tagCode;


    /**
     * 标记值
     */
    @JsonProperty(value = "tag_value")
    private String tagValue;

}
