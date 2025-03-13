package com.huoyunren.openapi.dto.uow.waybill;

import lombok.Data;

/**
 * @author tangsiyuan
 * @date 2024/9/28
 **/
@Data
public class WaybillTagsDTO {

    /**
     * 标记类型
     */
    private String tagType;

    /**
     * 标记系统编码
     */
    private String tagSystemCode;

    /**
     * 标记编码
     */
    private String tagCode;

    /**
     * 标记值
     */
    private String tagValue;

}
