package com.huoyunren.openapi.dto.uow.waybill.req;

import com.huoyunren.openapi.dto.uow.waybill.WaybillStrategyDTO;
import lombok.Data;

/**
 * 运单修改请求更新策略信息
 * @author tangsiyuan
 * @date 2024/7/18
 **/
@Data
public class WaybillModifyStrategyReq extends WaybillStrategyDTO {

    /**
     * 更新模式：1=部分字段更新；2=全量字段更新；
     */
//    @NotNull(message = "更新模式不能为空")
//    private Integer modifiedMode;

}
