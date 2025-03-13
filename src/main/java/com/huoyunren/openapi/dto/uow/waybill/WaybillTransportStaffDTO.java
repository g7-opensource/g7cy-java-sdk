package com.huoyunren.openapi.dto.uow.waybill;

import lombok.Data;


/**
 * 运单返回详情运输人员信息
 * @author tangsiyuan
 * @date 2024/7/16
 **/
@Data
public class WaybillTransportStaffDTO {

    /**
     * 运输人员姓名
     */
    private String transportStaffName;

    /**
     * 运输人员手机号
     */
    private String transportStaffPhoneNumber;

    /**
     * 运输操作人员身份证号
     */
    private String transportStaffIdcardNumber;

    /**
     * 运输操作人员类型：1=主驾司机；2=副驾司机；3=押运员；
     */
    private Integer transportStaffType;

    /**
     * 合作关系
     */
    private String cooperation;

}
