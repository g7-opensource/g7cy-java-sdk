package cn.com.g7.sdk.api;

import cn.com.g7.sdk.api.enums.CurrentInfoEnum;
import cn.com.g7.sdk.api.enums.GetCountEnum;
import cn.com.g7.sdk.api.enums.GpsStatusEnum;
import cn.com.g7.sdk.api.util.AssertUtil;
import cn.com.g7.sdk.api.vo.*;
import cn.com.g7.sdk.api.util.JsonUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * @author dengfuwei
 * @version 1.0.0
 * @date 2021/9/18 9:30 上午
 */
public class G7OpenapiClientTest {

    /**
     * 标准接口  user_model
     * 定制接口  user_custom_project
     */
    private final Logger log = LoggerFactory.getLogger(G7OpenapiClientTest.class);

    private String accessKey = "xsk8vj";
    private String accessSecret = "aUwDAkBf8mvr8YKX7GTqIszvpCeBoY4F";

    @Test
    public void truckListTest() throws Exception {
        // 创建开放平台接口客户端
        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(accessKey, accessSecret);
        TruckListReq req = new TruckListReq();
        req.setOrgcodeLike("201IHA");
        List<TruckListInfoResp> truckListInfoResps = g7OpenapiClient.truckList(req);
        log.info("rsp:{}", JsonUtil.toJson(truckListInfoResps));
        Assertions.assertNotNull(truckListInfoResps);
    }

    @Test
    public void truckListCountTest() throws Exception {
        // 创建开放平台接口客户端
        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(accessKey, accessSecret);
        TruckListCountReq req = new TruckListCountReq(GetCountEnum.OBTAIN.getCode());
        req.setOrgcodeLike("201IHA");
        TruckListCountResp truckListCountResp = g7OpenapiClient.truckListCount(req);
        log.info("rsp:{}", JsonUtil.toJson(truckListCountResp));
        Assertions.assertNotNull(truckListCountResp);
    }


    @Test
    public void truckInfoCustomTest() throws Exception {
        // 创建开放平台接口客户端
        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(accessKey, accessSecret);
        TruckInfoCustomReq req = new TruckInfoCustomReq();
        req.setOrgcodeLike("201IHA");
        req.setTruckIds("247EB99FE9817BC1F3D6DA6EFE2843AA");
        req.setOwnIds("FA2D41DD228E64EDA68CE3A8275A8185");
//        req.setGet_custom_fields("1");
        TruckInfoAndCustomFieldResp truckInfoAndCustomFieldResp = g7OpenapiClient.truckInfoAndCustomField(req);
        log.info("rsp:{}", JsonUtil.toJson(truckInfoAndCustomFieldResp));
        Assertions.assertNotNull(truckInfoAndCustomFieldResp);
    }

    @Test
    public void getTruckModelInfoTest() throws Exception {
        // 创建开放平台接口客户端
        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(accessKey, accessSecret);
        TruckModelInfoReq req = new TruckModelInfoReq();
        req.setOrgcodeLike("201IHA");
        req.setTruckId("7B49E76556C25847D47CBD345FDB5092");
        Map<String, TruckModelInfoResp> truckModelInfo = g7OpenapiClient.getTruckModelInfo(req);
        log.info("rsp:{}", JsonUtil.toJson(truckModelInfo));
        Assertions.assertNotNull(truckModelInfo);
    }

    @Test
    public void truckInfoTest() throws Exception {
        // 创建开放平台接口客户端
        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(accessKey, accessSecret);
        TruckInfoReq req = new TruckInfoReq();
        req.setOrgcodeLike("201IHA");
        req.setTruckIds("508BDF2FB4F8592D859C514921973502");
        req.setOwnIds("17A5A88326A292A5542DBAA685F876EF");
        List<TruckInfoResp> truckInfoRsps = g7OpenapiClient.truckInfo(req);
        log.info("rsp:{}", JsonUtil.toJson(truckInfoRsps));
        Assertions.assertNotNull(truckInfoRsps);
    }

    @Test
    public void simpleCurrentsGpsNoTest() throws Exception {
        // 创建开放平台接口客户端
        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(accessKey, accessSecret);
        SimpleCurrentsGpsNoReq req = new SimpleCurrentsGpsNoReq();
        req.setGpsnos("91547834");
        List<SimpleCurrentsGpsNoResp> simpleCurrentsGpsNoRsps = g7OpenapiClient.simpleCurrentsGpsNo(req);
        log.info("rsp:{}", JsonUtil.toJson(simpleCurrentsGpsNoRsps));
        Assertions.assertNotNull(simpleCurrentsGpsNoRsps);
    }

    @Test
    public void truckCurrentInfoBatchTest() throws Exception {
        // 创建开放平台接口客户端
        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(accessKey, accessSecret);
        TruckCurrentInfoBatchReq req = new TruckCurrentInfoBatchReq();
        req.setPlateNums(Arrays.asList("宜A006676","豫A9993Y","豫KZ1234", "津RLG209"));
        req.setFields(Arrays.asList(CurrentInfoEnum.LOC.getField(),CurrentInfoEnum.COLD.getField(),CurrentInfoEnum.DRIVER.getField(),CurrentInfoEnum.STATUS.getField()));
        Map<String, TruckCurrentInfoBatchResp> stringTruckCurrentInfoBatchRspMap = g7OpenapiClient.truckCurrentInfoBatch(req);
        log.info("rsp:{}", JsonUtil.toJson(stringTruckCurrentInfoBatchRspMap));
        Assertions.assertNotNull(stringTruckCurrentInfoBatchRspMap);
    }


   @Test
    public void gpsNoStatusListTest() throws Exception {
       // 创建开放平台接口客户端
        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(accessKey, accessSecret);
        GpsNoStatusListReq req = new GpsNoStatusListReq();
        req.setOrgcode("201IHA");
        req.setStatus(GpsStatusEnum.NO_MOVEMENT.getCode()+","+GpsStatusEnum.IN_MOVEMENT);
        GpsNoStatusListResp gpsNoStatusListRsp = g7OpenapiClient.gpsNoStatusList(req);
        log.info("rsp:{}", JsonUtil.toJson(gpsNoStatusListRsp));
        Assertions.assertNotNull(gpsNoStatusListRsp);
    }

   @Test
    public void driverListTest() throws Exception {
       // 创建开放平台接口客户端
        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(accessKey, accessSecret);
        DriverListReq req = new DriverListReq();
        req.setOrgcodeLike("201IHA");
        req.setDriverName("郭士光");
        List<DriverListResp> driverListRsps = g7OpenapiClient.driverList(req);
        log.info("rsp:{}", JsonUtil.toJson(driverListRsps));
        Assertions.assertNotNull(driverListRsps);
    }

   @Test
    public void driverListCountTest() throws Exception {
        // 创建开放平台接口客户端
        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(accessKey, accessSecret);
        DriverListCountReq req = new DriverListCountReq(GetCountEnum.OBTAIN.getCode());
        req.setOrgcodeLike("201IHA");
        DriverListCountResp driverListCountRsp = g7OpenapiClient.driverListCount(req);
        log.info("rsp:{}", JsonUtil.toJson(driverListCountRsp));
        Assertions.assertNotNull(driverListCountRsp);
    }

    @Test
    public void getAllSubOrgansTest() throws Exception {
        // 创建开放平台接口客户端
        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(accessKey, accessSecret);
        SubOrgansGetAllReq req = new SubOrgansGetAllReq();
        req.setParent("201IHA");
        SubOrgansGetAllResp allSubOrgans = g7OpenapiClient.getAllSubOrgans(req);
        log.info("rsp:{}", JsonUtil.toJson(allSubOrgans));
        Assertions.assertNotNull(allSubOrgans);
    }

    @Test
    public void getOrgByCodeTest() throws Exception {
        // 创建开放平台接口客户端
        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(accessKey, accessSecret);
        OrgGetByCodeReq req = new OrgGetByCodeReq();
        req.setOrgcode("201IHA,201IHA020702");
        Map<String, OrgGetByCodeResp> orgByCode = g7OpenapiClient.getOrgByCode(req);
        log.info("rsp:{}", JsonUtil.toJson(orgByCode));
        Assertions.assertNotNull(orgByCode);
    }

    @Test
    public void getAllRoleByOrgCodeTest() throws Exception {
        // 创建开放平台接口客户端
        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(accessKey, accessSecret);
        OrgRoleGetAllReq req = new OrgRoleGetAllReq();
        req.setOrgcode("201IHA");
        req.setLimit(100);
        OrgRoleGetAllResp allRoleByOrgCode = g7OpenapiClient.getAllRoleByOrgCode(req);
        log.info("rsp:{}", JsonUtil.toJson(allRoleByOrgCode));
        Assertions.assertNotNull(allRoleByOrgCode);
    }

    @Test
    public void truckCurrentLocationTest() throws Exception {
        // 创建开放平台接口客户端
        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(accessKey, accessSecret);
        TruckCurrentLocationReq req = new TruckCurrentLocationReq();
        req.setPlateNum("豫LN3821高");
        TruckCurrentLocationResp truckCurrentLocationResp = g7OpenapiClient.truckCurrentLocation(req);
        log.info("rsp:{}", JsonUtil.toJson(truckCurrentLocationResp));
        Assertions.assertNotNull(truckCurrentLocationResp);
    }

    @Test
    public void truckCurrentInfoTest() throws Exception {
        // 创建开放平台接口客户端
        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(accessKey, accessSecret);
        TruckCurrentInfoReq req = new TruckCurrentInfoReq();
        req.setPlateNum("豫LN3821高");
        req.setFields("loc,status,driver");
        req.setAddrRequired(true);
        TruckCurrentInfoResp truckCurrentInfoResp = g7OpenapiClient.truckCurrentInfo(req);
        log.info("rsp:{}", JsonUtil.toJson(truckCurrentInfoResp));
        Assertions.assertNotNull(truckCurrentInfoResp);
    }


    @Test
    public void truckHistoryLocationTest() throws Exception {
        // 创建开放平台接口客户端
        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(accessKey, accessSecret);
        TruckHistoryLocationReq req = new TruckHistoryLocationReq();
        req.setFrom("2021-11-07 12:00:00");
        req.setTo("2021-11-07 13:00:00");
        req.setPlateNum("豫LN3821高");
        List<TruckHistoryLocationResp> truckHistoryLocationResps = g7OpenapiClient.truckHistoryLocation(req);
        log.info("rsp:{}", JsonUtil.toJson(truckHistoryLocationResps));
        Assertions.assertNotNull(truckHistoryLocationResps);
    }

    @Test
    public void truckMileageTest() throws Exception {
        // 创建开放平台接口客户端
        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(accessKey, accessSecret);
        TruckMileageReq req = new TruckMileageReq();
        req.setFrom("2021-11-07 12:00:00");
        req.setTo("2021-11-07 13:00:00");
        req.setPlateNum("豫LN3821高");
        TruckMileageResp truckMileageResp = g7OpenapiClient.truckMileage(req);
        log.info("rsp:{}", JsonUtil.toJson(truckMileageResp));
        Assertions.assertNotNull(truckMileageResp);
    }

    @Test
    public void queryEventTest() throws Exception {
        // 创建开放平台接口客户端
        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(accessKey, accessSecret);
        EventQueryReq req = new EventQueryReq();
        req.setFrom(1636257600L);
        req.setTo(1636261200L);
        req.setOrgcodes(Arrays.asList("201IHA"));
        req.setEventTypes(Arrays.asList("19","20","21"));
        EventQueryResp eventQueryResp = g7OpenapiClient.queryEvent(req);
        log.info("rsp:{}", JsonUtil.toJson(eventQueryResp));
        Assertions.assertNotNull(eventQueryResp);
    }

    @Test
    public void currentInfoByGpsNoTest() throws Exception {
        // 创建开放平台接口客户端
        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(accessKey, accessSecret);
        CurrentInfoByGpsNoReq req = new CurrentInfoByGpsNoReq();
        req.setGpsno("91547833");
        req.setFields("loc,status,driver");
        req.setAddrRequired(true);
        TruckCurrentInfoResp truckCurrentInfoResp = g7OpenapiClient.currentInfoByGpsNo(req);
        log.info("rsp:{}", JsonUtil.toJson(truckCurrentInfoResp));
        Assertions.assertNotNull(truckCurrentInfoResp);
    }

    @Test
    public void videoRealTimeUrlTest() throws Exception {
        // 创建开放平台接口客户端
        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(accessKey, accessSecret);
        List<VideoRealTimeUrlResp> resp = g7OpenapiClient.videoRealTimeUrl("豫KZ1234");
        log.info("rsp:{}", JsonUtil.toJson(resp));
        Assertions.assertNotNull(resp);
    }

    @Test
    public void truckHistoryLocationByGpsNonTest() throws Exception {
        // 创建开放平台接口客户端
        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(accessKey, accessSecret);
        TruckHistoryLocationByGpsNoReq req = new TruckHistoryLocationByGpsNoReq();
        req.setFrom("2021-11-07 12:00:00");
        req.setTo("2021-11-07 13:00:00");
        req.setGpsno(91547833);
        List<TruckHistoryLocationResp> truckHistoryLocationResps = g7OpenapiClient.truckHistoryLocationByGpsNo(req);
        log.info("rsp:{}", JsonUtil.toJson(truckHistoryLocationResps));
        Assertions.assertNotNull(truckHistoryLocationResps);
    }

    /**
     * TODO 待测
     * @throws Exception
     */
    @Test
    public void dailyTemperatureTest() throws Exception {
        // 创建开放平台接口客户端
        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(accessKey, accessSecret);
        DailyTemperatureReq req = new DailyTemperatureReq();
        req.setFrom("2021-11-07 12:00:00");
        req.setTo("2021-11-07 13:00:00");
        req.setGpsno("91547833");
        DailyTemperatureResp dailyTemperatureResp = g7OpenapiClient.dailyTemperature(req);
        log.info("rsp:{}", JsonUtil.toJson(dailyTemperatureResp));
        Assertions.assertNotNull(dailyTemperatureResp);
    }

    @Test
    public void realTimeByCarNumTest() throws Exception {
        // 创建开放平台接口客户端
        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(accessKey, accessSecret);
        RealTimeVideoReq req = new RealTimeVideoReq();
        req.setCarnum("豫LN3821高");
        req.setOrgcode("201IHA");
        req.setStreamType(1);
        List<RealTimeVideoResp> realTimeVideoResp = g7OpenapiClient.realTimeByCarNum(req);
        log.info("rsp:{}", JsonUtil.toJson(realTimeVideoResp));
        Assertions.assertNotNull(realTimeVideoResp);
    }

    @Test
    public void faceTruckLabelDeleteTest() {
        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(accessKey, accessSecret);
        FaceTruckLabelDeleteOrQueryReq req = new FaceTruckLabelDeleteOrQueryReq();
        req.setOrgcode("2017B6");
        List<String> plateNums = new ArrayList<>();
        plateNums.add("川A12345");
        req.setPlateNums(plateNums);
        g7OpenapiClient.faceTruckLabelDelete(req);
    }

    @Test
    public void faceTruckLabelSaveTest() {
        // 创建请求bean
        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(accessKey, accessSecret);
        FaceTruckLabelCreateReq req = new FaceTruckLabelCreateReq();
        req.setOrgcode("2017B6");
        FaceTruckLabel truckLabel = new FaceTruckLabel();
        truckLabel.setPlateNum("川A12345");
        truckLabel.setLabel("xinan");
        List<FaceTruckLabel> labels = new ArrayList<>(4);
        labels.add(truckLabel);
        req.setLabels(labels);
        List<FaceTruckLabel> faceTruckLabelList = g7OpenapiClient.faceTruckLabelSave(req);
        AssertUtil.notNull(faceTruckLabelList);
    }
}
