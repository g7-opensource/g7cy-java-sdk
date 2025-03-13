package com.huoyunren.openapi.dto.uow.waybill;

import java.util.List;
import lombok.Data;

/**
 * 运单返回详情
 * @author tangsiyuan
 * @date 2024/7/16
 **/
@Data
public class WaybillDTO {

    /**
     * 系统信息
     */
    private WaybillSysDTO sys;

    /**
     * 基础信息
     */
    private WaybillBaseDTO base;

    /**
     * 收入与支出运输费信息
     */
    private List<FreightDTO> incomeOutgoFreight;

    /**
     * 运输过程操作信息
     */
    private TransportProcessesDTO transportProcesses;

    /**
     * 节点信息
     */
    private List<WaybillNodesDTO> nodes;

    /**
     * 运力信息
     */
    private WaybillTransportCapacityDTO transportCapacity;

    /**
     * 运单标记
     */
    private List<WaybillTagsDTO> tags;

    /**
     * 业务扩展信息
     */
    private List<WaybillExtensionDTO> extension;

}
