package com.huoyunren.openapi.dto.uow.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class UowOrderNodeContactDTO {

    /**
     * 订单节点联系人姓名
     */
    @JsonProperty(value = "contact_name")
    private String contactName;

    /**
     * 订单节点联系人单位
     */
    @JsonProperty(value = "contact_unit")
    private String contactUnit;

    /**
     * 订单节点联系人电话
     */
    @JsonProperty(value = "contact_tel")
    private String contactTel;

    /**
     * 订单节点联系人手机号
     */
    @JsonProperty(value = "contact_phone_number")
    private String contactPhoneNumber;

    /**
     * 运输上一个节点编码
     */
    @JsonProperty(value = "dialing_codes")
    private String dialingCodes;
}
