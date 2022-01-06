package cn.com.g7.sdk.api.vo;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 人脸信息操作统一返回信息
 *
 * @author zhaobijiang
 * @date 2021/11/16
 */

public class FaceUserResp {

    /**
     * 机构号
     */
    private String orgcode;

    /**
     * 用户ID,UUID
     */
    @JSONField(name = "user_id")
    private String userId;

    /**
     * 人脸照片
     */
    private String image;

    /**
     * 扩展信息,json字符串
     */
    @JSONField(name = "ext_info")
    private String extInfo;

    /**
     * 创建状态  2 创建成功  3 创建失败
     */
    private String status;

    /**
     * 是否已删除 0:否, 1:是
     */
    private String deleted;

    /**
     * 描述信息
     */
    private String description;

    /**
     * 创建时间
     */
    @JSONField(name = "create_time")
    private String createTime;

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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getExtInfo() {
        return extInfo;
    }

    public void setExtInfo(String extInfo) {
        this.extInfo = extInfo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDeleted() {
        return deleted;
    }

    public void setDeleted(String deleted) {
        this.deleted = deleted;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}
