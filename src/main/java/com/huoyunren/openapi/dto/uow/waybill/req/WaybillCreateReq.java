package com.huoyunren.openapi.dto.uow.waybill.req;

import com.huoyunren.openapi.dto.uow.waybill.*;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import lombok.Data;

/**
 * 运单创建请求
 * @author tangsiyuan
 * @date 2024/7/16
 **/
@Data
public class WaybillCreateReq {

    /**
     * 系统信息
     */
    @NotNull(message = "系统信息不能为空")
    @Valid
    private WaybillCreateSysReq sys;

    /**
     * 基础信息
     */
    @NotNull(message = "基础信息不能为空")
    @Valid
    private WaybillCreateBaseReq base;

    /**
     * 收入与支出运输费信息
     */
    private List<FreightDTO> incomeOutgoFreight;

    /**
     * 节点信息
     */
    private List<WaybillCreateNodesReq> nodes;

    /**
     * 运力信息
     */
    private WaybillCreateTransportCapacityReq transportCapacity;

    /**
     * 运单标记
     */
    private List<WaybillTagsReq> tags;

    /**
     * 业务扩展信息
     */
    private List<WaybillCreateExtensionReq> extension;

}
