package cn.com.g7.sdk.api.vo;

import com.alibaba.fastjson.annotation.JSONField;

/**
 *
 * 车辆车型详情V1.0
 * todo 返回值结构与开放平台不一致
 * @author liwenlang
 * @version 1.0.0
 * @date 2021/10/11 16:49
 */
public class TruckModelInfoResp {

    /** 车辆id */
    @JSONField(name = "truckid")
    private String truckId;

    /** 车型ID */
    @JSONField(name = "truckmodelid")
    private String truckModelId;

    /** 额定载重 */
    @JSONField(name = "carrying_weight")
    private String carryingWeight;

    /** 排量,单位ml */
    private String displacement;

    /** 功率,单位kw */
    private String power;

    /** 马力 */
    private String horsepower;

    /** 品牌名称 */
    private String brand;

    /** 系列 */
    private String series;

    /** 整备重量 单位KG */
    @JSONField(name = "curb_weight")
    private String curbWeight;

    /** 车辆总重 单位KG */
    @JSONField(name = "total_mass")
    private String totalMass;

    /** 外廓长 单位m todo 单位有误*/
    @JSONField(name = "truck_length")
    private String truckLength;

    /** 外廓宽 单位m todo 单位有误*/
    @JSONField(name = "truck_width")
    private String truckWidth;

    /** 外廓高 单位m todo 单位有误*/
    @JSONField(name = "truck_high")
    private String truckHigh;

    /** 车厢长 单位m todo 单位有误*/
    @JSONField(name = "compartment_length")
    private String compartmentLength;

    /** 车厢宽 单位m todo 单位有误*/
    @JSONField(name = "compartment_width")
    private String compartmentWidth;

    /** 车厢高 单位m todo 单位有误*/
    @JSONField(name = "compartment_high")
    private String compartmentHigh;

    /** 发动机型号 */
    @JSONField(name = "engine_model")
    private String engineModel;

    /** 燃料种类 */
    @JSONField(name = "fuel_type")
    private String fuelType;

    /** 电机型号 */
    @JSONField(name = "electric_machine")
    private String electricMachine;

    /** 电机的峰值功率 */
    @JSONField(name = "max_power")
    private String maxPower;

    /** 电池类型 */
    @JSONField(name = "battery_type")
    private String batteryType;

    /** 续航里程 */
    private String endurance;

    /** 充电时间 */
    @JSONField(name = "charge_time")
    private String chargeTime;

    /** 电池型号 */
    @JSONField(name = "battery_model")
    private String batteryModel;

    /** 类型（车型中的车辆类型) */
    private String type;

    /** 驱动 */
    private String drive;

    /** 车型全称 */
    private String name;

    public String getTruckId() {
        return truckId;
    }

    public TruckModelInfoResp setTruckId(String truckId) {
        this.truckId = truckId;
        return this;
    }

    public String getTruckModelId() {
        return truckModelId;
    }

    public TruckModelInfoResp setTruckModelId(String truckModelId) {
        this.truckModelId = truckModelId;
        return this;
    }

    public String getCarryingWeight() {
        return carryingWeight;
    }

    public TruckModelInfoResp setCarryingWeight(String carryingWeight) {
        this.carryingWeight = carryingWeight;
        return this;
    }

    public String getDisplacement() {
        return displacement;
    }

    public TruckModelInfoResp setDisplacement(String displacement) {
        this.displacement = displacement;
        return this;
    }

    public String getPower() {
        return power;
    }

    public TruckModelInfoResp setPower(String power) {
        this.power = power;
        return this;
    }

    public String getHorsepower() {
        return horsepower;
    }

    public TruckModelInfoResp setHorsepower(String horsepower) {
        this.horsepower = horsepower;
        return this;
    }

    public String getBrand() {
        return brand;
    }

    public TruckModelInfoResp setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public String getSeries() {
        return series;
    }

    public TruckModelInfoResp setSeries(String series) {
        this.series = series;
        return this;
    }

    public String getCurbWeight() {
        return curbWeight;
    }

    public TruckModelInfoResp setCurbWeight(String curbWeight) {
        this.curbWeight = curbWeight;
        return this;
    }

    public String getTotalMass() {
        return totalMass;
    }

    public TruckModelInfoResp setTotalMass(String totalMass) {
        this.totalMass = totalMass;
        return this;
    }

    public String getTruckLength() {
        return truckLength;
    }

    public TruckModelInfoResp setTruckLength(String truckLength) {
        this.truckLength = truckLength;
        return this;
    }

    public String getTruckWidth() {
        return truckWidth;
    }

    public TruckModelInfoResp setTruckWidth(String truckWidth) {
        this.truckWidth = truckWidth;
        return this;
    }

    public String getTruckHigh() {
        return truckHigh;
    }

    public TruckModelInfoResp setTruckHigh(String truckHigh) {
        this.truckHigh = truckHigh;
        return this;
    }

    public String getCompartmentLength() {
        return compartmentLength;
    }

    public TruckModelInfoResp setCompartmentLength(String compartmentLength) {
        this.compartmentLength = compartmentLength;
        return this;
    }

    public String getCompartmentWidth() {
        return compartmentWidth;
    }

    public TruckModelInfoResp setCompartmentWidth(String compartmentWidth) {
        this.compartmentWidth = compartmentWidth;
        return this;
    }

    public String getCompartmentHigh() {
        return compartmentHigh;
    }

    public TruckModelInfoResp setCompartmentHigh(String compartmentHigh) {
        this.compartmentHigh = compartmentHigh;
        return this;
    }

    public String getEngineModel() {
        return engineModel;
    }

    public TruckModelInfoResp setEngineModel(String engineModel) {
        this.engineModel = engineModel;
        return this;
    }

    public String getFuelType() {
        return fuelType;
    }

    public TruckModelInfoResp setFuelType(String fuelType) {
        this.fuelType = fuelType;
        return this;
    }

    public String getElectricMachine() {
        return electricMachine;
    }

    public TruckModelInfoResp setElectricMachine(String electricMachine) {
        this.electricMachine = electricMachine;
        return this;
    }

    public String getMaxPower() {
        return maxPower;
    }

    public TruckModelInfoResp setMaxPower(String maxPower) {
        this.maxPower = maxPower;
        return this;
    }

    public String getBatteryType() {
        return batteryType;
    }

    public TruckModelInfoResp setBatteryType(String batteryType) {
        this.batteryType = batteryType;
        return this;
    }

    public String getEndurance() {
        return endurance;
    }

    public TruckModelInfoResp setEndurance(String endurance) {
        this.endurance = endurance;
        return this;
    }

    public String getChargeTime() {
        return chargeTime;
    }

    public TruckModelInfoResp setChargeTime(String chargeTime) {
        this.chargeTime = chargeTime;
        return this;
    }

    public String getBatteryModel() {
        return batteryModel;
    }

    public TruckModelInfoResp setBatteryModel(String batteryModel) {
        this.batteryModel = batteryModel;
        return this;
    }

    public String getType() {
        return type;
    }

    public TruckModelInfoResp setType(String type) {
        this.type = type;
        return this;
    }

    public String getDrive() {
        return drive;
    }

    public TruckModelInfoResp setDrive(String drive) {
        this.drive = drive;
        return this;
    }

    public String getName() {
        return name;
    }

    public TruckModelInfoResp setName(String name) {
        this.name = name;
        return this;
    }
}
