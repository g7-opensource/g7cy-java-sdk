package cn.com.g7.sdk.api.vo;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 查询司机列表响应数据
 * @author liwenlang
 * @version 1.0.0
 * @date 2021/10/12 16:09
 */
public class DriverListResp {

    /** 主键*/
    private String id;
    
    /** 使用机构编号 */
    private String orgcode;
    
    /** 来源类型（1自有，3外部共享)*/
    @JSONField(name = "fromtype")
    private Integer fromType;
    
    /** 车辆ID */
    @JSONField(name = "truckid")
    private String truckId;
    
    /** 姓名 */
    @JSONField(name = "drivername")
    private String driverName;

    /** 司机类型（0,自建司机，3lbs外协车司机） */
    @JSONField(name = "drivertype")
    private String driverType;

    /** 邮政编码 */

    private String postcode;

    /** 手机号 */
    private String phone;

    /** IC 卡号 */
    private String iccard;

    /** 身份证 */
    private String idcard;

    /** 工号 */
    @JSONField(name = "workno")
    private String workNo;

    /** 年龄 */
    private String age;

    /** 入职日期 */
    @JSONField(name = "fromdate")
    private String fromDate;

    /** 学历 */
    private String edu;

    /** 户口所在地 */
    private String household;

    /** 籍贯 */
    private String hometown;

    /** 当前居住地 */
    private String address;

    /** 家庭联系电话 */
    @JSONField(name = "familytel")
    private String familyTel;

    /** 员工状态(在职,离职,试用) */
    private String status;

    /** 更新时间 */
    @JSONField(name = "updatetime")
    private String updateTime;

    /** 司机绑定车辆类型（1为主驾驶 2为副驾驶）*/
    @JSONField(name = "bindtrucktype")
    private Integer bindTruckType;

    /** 身份证附件 */
    @JSONField(name = "idcardattach")
    private String idcardAttach;

    /** 离职时间 */
    @JSONField(name = "departuretime")
    private Integer departureTime;

    /** 性别, 0未知，1男，2女 */
    private Integer gender;

    public String getId() {
        return id;
    }

    public DriverListResp setId(String id) {
        this.id = id;
        return this;
    }

    public String getOrgcode() {
        return orgcode;
    }

    public DriverListResp setOrgcode(String orgcode) {
        this.orgcode = orgcode;
        return this;
    }

    public Integer getFromType() {
        return fromType;
    }

    public DriverListResp setFromType(Integer fromType) {
        this.fromType = fromType;
        return this;
    }

    public String getTruckId() {
        return truckId;
    }

    public DriverListResp setTruckId(String truckId) {
        this.truckId = truckId;
        return this;
    }

    public String getDriverName() {
        return driverName;
    }

    public DriverListResp setDriverName(String driverName) {
        this.driverName = driverName;
        return this;
    }

    public String getDriverType() {
        return driverType;
    }

    public DriverListResp setDriverType(String driverType) {
        this.driverType = driverType;
        return this;
    }

    public String getPostcode() {
        return postcode;
    }

    public DriverListResp setPostcode(String postcode) {
        this.postcode = postcode;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public DriverListResp setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getIccard() {
        return iccard;
    }

    public DriverListResp setIccard(String iccard) {
        this.iccard = iccard;
        return this;
    }

    public String getIdcard() {
        return idcard;
    }

    public DriverListResp setIdcard(String idcard) {
        this.idcard = idcard;
        return this;
    }

    public String getWorkNo() {
        return workNo;
    }

    public DriverListResp setWorkNo(String workNo) {
        this.workNo = workNo;
        return this;
    }

    public String getAge() {
        return age;
    }

    public DriverListResp setAge(String age) {
        this.age = age;
        return this;
    }

    public String getFromDate() {
        return fromDate;
    }

    public DriverListResp setFromDate(String fromDate) {
        this.fromDate = fromDate;
        return this;
    }

    public String getEdu() {
        return edu;
    }

    public DriverListResp setEdu(String edu) {
        this.edu = edu;
        return this;
    }

    public String getHousehold() {
        return household;
    }

    public DriverListResp setHousehold(String household) {
        this.household = household;
        return this;
    }

    public String getHometown() {
        return hometown;
    }

    public DriverListResp setHometown(String hometown) {
        this.hometown = hometown;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public DriverListResp setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getFamilyTel() {
        return familyTel;
    }

    public DriverListResp setFamilyTel(String familyTel) {
        this.familyTel = familyTel;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public DriverListResp setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public DriverListResp setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    public Integer getBindTruckType() {
        return bindTruckType;
    }

    public DriverListResp setBindTruckType(Integer bindTruckType) {
        this.bindTruckType = bindTruckType;
        return this;
    }

    public String getIdcardAttach() {
        return idcardAttach;
    }

    public DriverListResp setIdcardAttach(String idcardAttach) {
        this.idcardAttach = idcardAttach;
        return this;
    }

    public Integer getDepartureTime() {
        return departureTime;
    }

    public DriverListResp setDepartureTime(Integer departureTime) {
        this.departureTime = departureTime;
        return this;
    }

    public Integer getGender() {
        return gender;
    }

    public DriverListResp setGender(Integer gender) {
        this.gender = gender;
        return this;
    }


}
