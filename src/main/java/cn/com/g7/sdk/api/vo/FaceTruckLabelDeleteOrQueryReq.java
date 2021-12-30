package cn.com.g7.sdk.api.vo;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

/**
 * 删除和查询车辆标签请求
 *
 * @author zhaobijiang
 * @date 2021/11/11
 */
public class FaceTruckLabelDeleteOrQueryReq {

    /**
     * [必传] 所属机构号
     */
    private String orgcode;

    /**
     * 车辆编号列表
     */
    @JSONField(name = "plate_nums")
    private List<String> plateNums;

    public String getOrgcode() {
        return orgcode;
    }

    public void setOrgcode(String orgcode) {
        this.orgcode = orgcode;
    }

    public List<String> getPlateNums() {
        return plateNums;
    }

    public void setPlateNums(List<String> plateNums) {
        this.plateNums = plateNums;
    }
}
