package com.huoyunren.openapi.dto.uow.waybill;

import lombok.Data;

/**
 * 运单返回详情联系人信息
 * @author tangsiyuan
 * @date 2024/7/16
 **/
@Data
public class WaybillNodeContactDTO {

    /**
     * 联系人姓名
     */
    private String contactName;

    /**
     * 联系单位
     */
    private String contactUnit;

    /**
     * 联系电话
     */
    private String contactTel;

    /**
     * 联系手机号
     */
    private String contactPhoneNumber;

    /**
     * 节点联系人国家电话代码
     */
    private String dialingCodes;

}
