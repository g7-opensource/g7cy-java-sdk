package cn.com.g7.sdk.api.vo;

/**
 * 删除标注点 响应数据
 * @author liwenlang
 * @version 1.0.0
 * @date 2021/10/13 18:34
 */
public class MarkerDeleteResp {

    /** 标注点id*/
    private String oid;

    /** 是否删除成功*/
    private Boolean delete;

    public String getOid() {
        return oid;
    }

    public MarkerDeleteResp setOid(String oid) {
        this.oid = oid;
        return this;
    }

    public Boolean getDelete() {
        return delete;
    }

    public MarkerDeleteResp setDelete(Boolean delete) {
        this.delete = delete;
        return this;
    }
}
