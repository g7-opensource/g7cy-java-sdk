package cn.com.g7.sdk.api;

import cn.com.g7.sdk.api.enums.TruckHeadStockEnum;
import cn.com.g7.sdk.api.request.IRequest;
import cn.com.g7.sdk.api.request.impl.RestTemplateRequest;
import cn.com.g7.sdk.api.vo.*;
import cn.com.g7.sdk.api.util.JsonUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

/**
 * SDK数据操作测试    测试环境
 * @author dengfuwei
 * @version 1.0.0
 * @date 2021/10/14 10:54
 */
public class G7OpenapiClientOpTest {
    /**
     * 账号：jtjadmin
     * 密码：123456aA
     * 机构号：200JX7
     * 标准接口  user_model
     * 定制接口  user_custom_project
     */
    private final Logger log = LoggerFactory.getLogger(G7OpenapiClientTest.class);

    private String url = "http://openapi-gateway.test.chinawayltd.com";
    private String accessKey = "lm2h17";
    private String accessSecret = "ttUMY3RsmO08IdiupbKQ5PNpE88kOYH5";

    /**
     *
     * @throws Exception
     */
    @Test
    public void addSelfTruckTest() throws Exception {
        // 创建请求bean
        RestTemplate restTemplate = new RestTemplateBuilder().build();
        IRequest request = new RestTemplateRequest(restTemplate);
        // 创建开放平台接口客户端
        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(url, accessKey, accessSecret, request);
        SelfTruckAddReq req = new SelfTruckAddReq();
        req.setCarNum("川C999999");
        req.setIsHeadStock(TruckHeadStockEnum.HEADSTOCK.getCode());
        req.setOrgcode("200JX7");
        SelfTruckAddResp selfTruckAddRsp = g7OpenapiClient.addSelfTruck(req);
        log.info("rsp:{}", JsonUtil.toJson(selfTruckAddRsp));
        Assertions.assertNotNull(selfTruckAddRsp);
    }

    /**
     *
     * @throws Exception
     */
    @Test
    public void updateSelfTruckTest() throws Exception {
        // 创建请求bean
        RestTemplate restTemplate = new RestTemplateBuilder().build();
        IRequest request = new RestTemplateRequest(restTemplate);
        // 创建开放平台接口客户端
        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(url, accessKey, accessSecret, request);
        SelfTruckUpdateReq req = new SelfTruckUpdateReq();
        req.setPlateNum("川E88888");
        req.setId("90FA462D2257D85A1EF80C7FE71DB118");
        req.setIsHeadStock(2);
        req.setOrgcode("200JX7");
        SelfTruckUpdateResp selfTruckUpdateRsp = g7OpenapiClient.updateSelfTruck(req);
        log.info("rsp:{}", JsonUtil.toJson(selfTruckUpdateRsp));
        Assertions.assertNotNull(selfTruckUpdateRsp);
    }

    /**
     *
     * @throws Exception
     */
    @Test
    public void truckDeleteTest() throws Exception {
        // 创建请求bean
        RestTemplate restTemplate = new RestTemplateBuilder().build();
        IRequest request = new RestTemplateRequest(restTemplate);
        // 创建开放平台接口客户端
        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(url, accessKey, accessSecret, request);
        TruckDeleteReq req = new TruckDeleteReq();
        req.setOwnIds("90FA462D2257D85A1EF80C7FE71DB118");
//        req.setOrgcode_like("200JX7");
        Map<String, TruckDeleteResp> stringTruckDeleteRspMap = g7OpenapiClient.truckDelete(req);
        log.info("rsp:{}", JsonUtil.toJson(stringTruckDeleteRspMap));
        Assertions.assertNotNull(stringTruckDeleteRspMap);
    }


    @Test
    public void createDriverTest() throws Exception {
        // 创建请求bean
        RestTemplate restTemplate = new RestTemplateBuilder().build();
        IRequest request = new RestTemplateRequest(restTemplate);
        // 创建开放平台接口客户端
        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(url, accessKey, accessSecret, request);
        DriverCreateReq req = new DriverCreateReq();
        req.setDriverName("刘五师傅");
        req.setOrgcode("200JX7");
        Map<String, DriverCreateResp> driverCreateRspMap = g7OpenapiClient.createDriver(req);
        log.info("rsp:{}", JsonUtil.toJson(driverCreateRspMap));
        Assertions.assertNotNull(driverCreateRspMap);
    }



    @Test
    public void deleteDriverTest() throws Exception {
        // 创建请求bean
        RestTemplate restTemplate = new RestTemplateBuilder().build();
        IRequest request = new RestTemplateRequest(restTemplate);
        // 创建开放平台接口客户端
        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(url, accessKey, accessSecret, request);
        DriverDeleteReq req = new DriverDeleteReq();
        req.setDriverIds("9CD7215AA2DC5D09DA13D97F8C77293B");
        DriverDeleteResp driverDeleteRsp = g7OpenapiClient.deleteDriver(req);
        log.info("rsp:{}", JsonUtil.toJson(driverDeleteRsp));
        Assertions.assertNotNull(driverDeleteRsp);
    }


    @Test
    public void editDriverTest() throws Exception {
        // 创建请求bean
        RestTemplate restTemplate = new RestTemplateBuilder().build();
        IRequest request = new RestTemplateRequest(restTemplate);
        // 创建开放平台接口客户端
        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(url, accessKey, accessSecret, request);
        DriverEditReq req = new DriverEditReq();
        req.setDriverId("69669456B5EB3D84D9D61CD1BF763B0D");
        req.setDriverName("刘七师傅");
        req.setPhone("18999999999");
        req.setOrgcode("200JX7");
        OperationDefaultResult operationCommonResult = g7OpenapiClient.editDriver(req);
        log.info("rsp:{}", JsonUtil.toJson(operationCommonResult));
        Assertions.assertNotNull(operationCommonResult);
    }

    @Test
    public void bindDevice() throws Exception {
        // 创建请求bean
        RestTemplate restTemplate = new RestTemplateBuilder().build();
        IRequest request = new RestTemplateRequest(restTemplate);
        // 创建开放平台接口客户端
        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(url, accessKey, accessSecret, request);
        DeviceBindReq req = new DeviceBindReq();
        req.setTruckOwnId("C2AC3A7FB7C22B756EA9D4BEA6D32E1F");
        req.setTruckId("E123B1BA54C63BC233196AB6CB30730B");
        req.setGpsno(10001006);
        DeviceBindResp deviceBindRsp = g7OpenapiClient.bindDevice(req);
        log.info("rsp:{}", JsonUtil.toJson(deviceBindRsp));
        Assertions.assertNotNull(deviceBindRsp);
    }

    @Test
    public void unbindDevice() throws Exception {
        // 创建请求bean
        RestTemplate restTemplate = new RestTemplateBuilder().build();
        IRequest request = new RestTemplateRequest(restTemplate);
        // 创建开放平台接口客户端
        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(url, accessKey, accessSecret, request);
        DeviceUnbindReq req = new DeviceUnbindReq();
        String str = "[{\"truckId\":\"E123B1BA54C63BC233196AB6CB30730B\",\"gpsno\":\"10001006\"}]";
        req.setDeviceList(str);
        req.setOrgcode("200JX7");
        Map<String, DeviceUnbindRsp> stringDeviceUnbindRspMap = g7OpenapiClient.unbindDevice(req);
        log.info("rsp:{}", JsonUtil.toJson(stringDeviceUnbindRspMap));
        Assertions.assertNotNull(stringDeviceUnbindRspMap);
    }


    @Test
    public void bindDriverTest() throws Exception {
        // 创建请求bean
        RestTemplate restTemplate = new RestTemplateBuilder().build();
        IRequest request = new RestTemplateRequest(restTemplate);
        // 创建开放平台接口客户端
        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(url, accessKey, accessSecret, request);
        DriverBindReq req = new DriverBindReq();
        req.setDriverId("EBDF864125D0D42E6FC878C3BBB78C2D");
        req.setTruckId("E123B1BA54C63BC233196AB6CB30730B");
        req.setBindTruckType("1");
        OperationDefaultResult operationCommonResult = g7OpenapiClient.bindDriver(req);
        log.info("rsp:{}", JsonUtil.toJson(operationCommonResult));
        Assertions.assertNotNull(operationCommonResult);
    }


    /**
     * todo  接口业务异常
     * @throws Exception
     */
    @Test
    public void markerCreatTest() throws Exception {
        // 创建请求bean
        RestTemplate restTemplate = new RestTemplateBuilder().build();
        IRequest request = new RestTemplateRequest(restTemplate);
        // 创建开放平台接口客户端
        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(url, accessKey, accessSecret, request);
        MarkerCreatOrUpdateReq req = new MarkerCreatOrUpdateReq();
        req.setName("测试标注点");
        req.setLatLngs("[{\"lng\":\"116.3788975\",\"lat\":\"39.9990682\"}]");
        req.setRadius("200");
        req.setGraphtype("1");
        req.setColor("AC5287");
        req.setCode("1122334455");
        req.setSite("1");
        req.setRemark("111111");
        req.setUpdateUser("56CB75026FA9C6CC441EF4C01B6AF521");

        MarkerCreatResp markerCreatRsp = g7OpenapiClient.markerCreat(req);
        log.info("rsp:{}", JsonUtil.toJson(markerCreatRsp));
        Assertions.assertNotNull(markerCreatRsp);
    }




    /**
     * todo  接口业务异常
     * @throws Exception
     */
    @Test
    public void markerUpdateTest() throws Exception {
        // 创建请求bean
        RestTemplate restTemplate = new RestTemplateBuilder().build();
        IRequest request = new RestTemplateRequest(restTemplate);
        // 创建开放平台接口客户端
        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(url, accessKey, accessSecret, request);
        MarkerCreatOrUpdateReq req = new MarkerCreatOrUpdateReq();
        req.setId("6FA388D5FDC6487E875F8703F7B7FABD");
        req.setName("测试标注点");
        req.setLatLngs("[{\"lng\":\"116.3788975\",\"lat\":\"39.9990682\"}]");
        req.setRadius("200");
        req.setGraphtype("1");
        req.setColor("AC5287");
        req.setCode("1122334455");
        req.setSite("0");
        req.setRemark("111111");
        req.setUpdateUser("56CB75026FA9C6CC441EF4C01B6AF521");

        MarkerUpdateResp markerUpdateRsp = g7OpenapiClient.markerUpdate(req);
        log.info("rsp:{}", JsonUtil.toJson(markerUpdateRsp));
        Assertions.assertNotNull(markerUpdateRsp);
    }

}
