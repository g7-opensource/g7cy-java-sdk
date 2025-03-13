package com.huoyunren.openapi.dto.uow.waybill.req;

import com.huoyunren.openapi.dto.uow.waybill.FreightDTO;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import lombok.Data;

/**
 * 运单修改请求
 * @author tangsiyuan
 * @date 2024/7/18
 **/
@Data
public class WaybillModifyReq {

    /**
     * 系统信息
     */
    @NotNull(message = "系统信息不能为空")
    @Valid
    private WaybillModifySysReq sys;

    /**
     * 修改策略信息
     */
    @NotNull(message = "修改策略信息不能为空")
    @Valid
    private WaybillModifyStrategyReq strategy;

    /**
     * 基础信息
     */
    @NotNull(message = "基础信息不能为空")
    @Valid
    private WaybillModifyBaseReq base;

    /**
     * 收入与支出运输费信息
     */
    private List<FreightDTO> incomeOutgoFreight;

    /**
     * 节点信息
     */
    @Valid
    private List<WaybillModifyNodesReq> nodes;

    /**
     * 运力信息
     */
    @Valid
    private WaybillModifyTransportCapacityReq transportCapacity;

    /**
     * 运单标记
     */
    private List<WaybillTagsReq> tags;

    /**
     * 业务扩展信息
     */
    @Valid
    private List<WaybillModifyExtensionReq> extension;


}
