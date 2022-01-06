package cn.com.g7.sdk.api.vo;

import java.util.List;

/**
 * 创建车辆标签请求
 *
 * @author zhaobijiang
 * @date 2021/11/16
 */
public class FaceTruckLabelCreateReq {

    /**
     * [必传] 所属机构号
     */
    private String orgcode;
    
    /**
     * 标签列表
     */
    private List<FaceTruckLabel> labels;

    public String getOrgcode() {
        return orgcode;
    }

    public void setOrgcode(String orgcode) {
        this.orgcode = orgcode;
    }

    public List<FaceTruckLabel> getLabels() {
        return labels;
    }

    public void setLabels(List<FaceTruckLabel> labels) {
        this.labels = labels;
    }
}
