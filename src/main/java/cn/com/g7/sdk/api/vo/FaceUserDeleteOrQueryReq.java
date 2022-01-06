package cn.com.g7.sdk.api.vo;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 删除和查询人脸信息请求
 *
 * @author zhaobijiang
 * @date 2021/11/16
 */
public class FaceUserDeleteOrQueryReq {

    /**
     * [必传] 所属机构号
     */
    private String orgcode;

    /**
     * [必传] 用户id
     */
    @JSONField(name = "user_id")
    private String userId;

    public String getOrgcode() {
        return orgcode;
    }

    public void setOrgcode(String orgcode) {
        this.orgcode = orgcode;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
