package cn.com.g7.sdk.api.vo;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 创建人脸信息请求
 *
 * @author zhaobijiang
 * @date 2021/11/16
 */
public class FaceUserCreateReq {

    /**
     * [必传] 所属机构号
     */
    private String orgcode;

    /**
     * [必传] 图片信息 base64编码
     */
    private String image;

    /**
     * [必传] 扩展信息
     */
    @JSONField(name = "ext_info")
    private String extInfo;

    /**
     * 标签 - 对应车辆标签
     */
    @JSONField(name = "driver_label")
    private String driverLabel;

    public String getOrgcode() {
        return orgcode;
    }

    public void setOrgcode(String orgcode) {
        this.orgcode = orgcode;
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

    public String getDriverLabel() {
        return driverLabel;
    }

    public void setDriverLabel(String driverLabel) {
        this.driverLabel = driverLabel;
    }
}
