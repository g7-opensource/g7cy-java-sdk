package com.huoyunren.openapi.dto.uow.waybill;

import com.alibaba.fastjson.JSONObject;
import lombok.Data;

/**
 * 运单返回详情业务扩展信息
 * @author tangsiyuan
 * @date 2024/7/16
 **/
@Data
public class WaybillExtensionDTO {

    /**
     * 业务系统编码
     */
    private String bizSystem;

    /**
     * 扩展字段信息
     */
    private JSONObject properties;

}
