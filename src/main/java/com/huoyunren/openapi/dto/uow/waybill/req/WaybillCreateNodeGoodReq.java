package com.huoyunren.openapi.dto.uow.waybill.req;

import com.alibaba.fastjson.JSONObject;
import lombok.Data;

/**
 * 运单创建请求节点货物信息
 * @author tangsiyuan
 * @date 2024/7/16
 **/
@Data
public class WaybillCreateNodeGoodReq {

    /**
     * 关联订单编码
     */
    private String orderCode;

    /**
     * 关联订单对应的平台货物编码
     */
    private String orderGoodsCode;

    /**
     * 业务侧货物类型
     */
    private String bizGoodsType;

    /**
     * 货物名称
     */
    private String goodsName;

    /**
     * 企业内部货物编码
     */
    private String customGoodsCode;

    /**
     * 节点操作类型：1=装车；2=卸车；
     */
    private Integer nodeOperationType;

    /**
     * 货物类型（国标）
     */
    private String goodsClassificationCode;

    /**
     * 货物规格
     */
    private JSONObject goodsSpecs;


}
