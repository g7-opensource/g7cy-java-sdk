package cn.com.g7.sdk.api.vo;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 删除标注点 请求参数
 * @author liwenlang
 * @version 1.0.0
 * @date 2021/10/13 18:31
 */
public class MarkerDeleteReq {

    /** 标注点id*/
    private String id;

    /** 更新用户id*/
    @JSONField(name = "updateuser")
    private String updateUser;

    public String getId() {
        return id;
    }

    public MarkerDeleteReq setId(String id) {
        this.id = id;
        return this;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public MarkerDeleteReq setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
        return this;
    }
}
