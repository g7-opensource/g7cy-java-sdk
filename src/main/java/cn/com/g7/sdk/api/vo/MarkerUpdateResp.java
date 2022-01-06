package cn.com.g7.sdk.api.vo;

/**
 * 更新标注点 响应数据
 * @author liwenlang
 * @version 1.0.0
 * @date 2021/10/13 18:41
 */
public class MarkerUpdateResp {

    /** 标注点id*/
    private String oid;

    /** 是否更新成功*/
    private Boolean update;

    public String getOid() {
        return oid;
    }

    public MarkerUpdateResp setOid(String oid) {
        this.oid = oid;
        return this;
    }

    public Boolean getUpdate() {
        return update;
    }

    public MarkerUpdateResp setUpdate(Boolean update) {
        this.update = update;
        return this;
    }
}
