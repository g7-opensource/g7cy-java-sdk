package com.huoyunren.openapi.dto.uow.waybill.res;

import com.huoyunren.openapi.dto.uow.waybill.WaybillDTO;
import java.util.List;
import lombok.Data;

/**
 * @author tangsiyuan
 * @date 2024/9/9
 **/
@Data
public class WaybillCooperatePagingRsp {

    /**
     * 是否还有数据 0：否，1：是
     */
    private Integer hasMore;

    /**
     * 游标
     */
    private Long cursor;

    /**
     * 每页条数
     */
    private Long pageSize;

    /**
     * 运单列表数据
     */
    private List<WaybillDTO> waybillList;

}
