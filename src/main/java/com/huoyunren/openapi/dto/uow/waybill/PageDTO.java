package com.huoyunren.openapi.dto.uow.waybill;

import lombok.Data;

/**
 * @author tangsiyuan
 * @date 2024/9/10
 **/
@Data
public class PageDTO {

    /**
     * 页号
     */
    private Long page;


    /**
     * 每页条数
     */
    private Long pageSize;
}
