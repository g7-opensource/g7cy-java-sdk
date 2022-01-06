package cn.com.g7.sdk.api.vo;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 查询车辆详情  自定义字段值
 * @author liwenlang
 * @version 1.0.0
 * @date 2021/10/11 16:07
 */
public class TruckCustomField {
    /** 主键ID*/
    private	String id;

    /** 字段名称 */
    @JSONField(name = "fieldname")
    private	String fieldName;

    /** 字段中文名称*/
    @JSONField(name = "fieldtext")
    private	String fieldText;

    /** 字段别名*/
    @JSONField(name = "nickname")
    private	String nickName;

    /** 字段info,比如接口字段的信息*/
    private	String info;

    public String getId() {
        return id;
    }

    public TruckCustomField setId(String id) {
        this.id = id;
        return this;
    }

    public String getFieldName() {
        return fieldName;
    }

    public TruckCustomField setFieldName(String fieldName) {
        this.fieldName = fieldName;
        return this;
    }

    public String getFieldText() {
        return fieldText;
    }

    public TruckCustomField setFieldText(String fieldText) {
        this.fieldText = fieldText;
        return this;
    }

    public String getNickName() {
        return nickName;
    }

    public TruckCustomField setNickName(String nickName) {
        this.nickName = nickName;
        return this;
    }

    public String getInfo() {
        return info;
    }

    public TruckCustomField setInfo(String info) {
        this.info = info;
        return this;
    }
}
