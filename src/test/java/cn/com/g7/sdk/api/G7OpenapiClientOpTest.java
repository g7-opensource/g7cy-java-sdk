package cn.com.g7.sdk.api;

import cn.com.g7.sdk.api.enums.TruckHeadStockEnum;
import cn.com.g7.sdk.api.request.IRequest;
import cn.com.g7.sdk.api.request.impl.RestTemplateRequest;
import cn.com.g7.sdk.api.util.AssertUtil;
import cn.com.g7.sdk.api.vo.*;
import cn.com.g7.sdk.api.util.JsonUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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

    @Test
    public void faceUserCreateTest() {
        // 创建请求bean
        RestTemplate restTemplate = new RestTemplateBuilder().build();
        IRequest request = new RestTemplateRequest(restTemplate);
        // 创建开放平台接口客户端
        String accessKey = "6rtje9";
        String accessSecret = "VVFTpM2res3XO9uUrbRcKTTNnmDuN0B9";
        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(url, accessKey, accessSecret, request);
        FaceUserCreateReq req = new FaceUserCreateReq();
        req.setOrgcode("2017B6");
        req.setExtInfo("{\"driver_no\":\"司机编号\"}");
        req.setImage("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");
        req.setDriverLabel("xinan");
        FaceUserResp faceUserResp = g7OpenapiClient.faceUserCreate(req);
        AssertUtil.notNull(faceUserResp);
    }

    @Test
    public void faceUserUpdateTest() {
        // 创建请求bean
        RestTemplate restTemplate = new RestTemplateBuilder().build();
        IRequest request = new RestTemplateRequest(restTemplate);
        // 创建开放平台接口客户端
        String accessKey = "6rtje9";
        String accessSecret = "VVFTpM2res3XO9uUrbRcKTTNnmDuN0B9";
        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(url, accessKey, accessSecret, request);
        FaceUserUpdateReq req = new FaceUserUpdateReq();
        req.setOrgcode("2017B6");
        req.setUserId("0f2e01caa4ea4442a230b4e39dc4854e");
        req.setExtInfo("{\"driver_no\":\"修改司机编号\"}");
        req.setImage("/9j/4AAQSkZJRgABAQEAAQABAAD/2wBDAAYEBQYFBAYGBQYHBwYIChAKCgkJChQODwwQFxQYGBcUFhYaHSUfGhsjHBYWICwgIyYnKSopGR8tMC0oMCUoKSj/2wBDAQcHBwoIChMKChMoGhYaKCgoKCgoKCgoKCgoKCgoKCgoKCgoKCgoKCgoKCgoKCgoKCgoKCgoKCgoKCgoKCgoKCj/wAARCADSAVMDASIAAhEBAxEB/8QAHQAAAQQDAQEAAAAAAAAAAAAAAAECBAUDBgcICf/EAEQQAAEDAgMFBgMFBgMHBQAAAAEAAgMEEQUhMQYSQVHwBxNhcYGRIjKxFEKhweEIFSNS0fEzYnIWJDVDU1TSNGNzkpP/xAAaAQEAAwEBAQAAAAAAAAAAAAAAAQIFAwQG/8QALBEAAgIBBAIABQQCAwAAAAAAAAECAxEEEiExBUETIjJRYSORocFx0RRSgf/aAAwDAQACEQMRAD8A9DcU8aJvH1TlLAovxSoQgBCEIAQhCAEICWw5oBEAXTrZ8boQCBKjzQpID3R7o60QEAJClz5H2ScLkZIBEIGZ+Eg+WaFBIIQhACEIUgQoCOKVQBCmOTyuKdvHaTi2ymM4XhWzr44agtFVUSPYH7zSSGx2OWe6SdDpYhQ2o8stCLk8I7M5NdnZcp7O+2bDdoZYaDHoo8LxGSzWSB38CV3IE5sOWh99L9WfcHPIpGSlyhKEoPEhh1QgoUlRHJqcdE1QAOixuWQ6LG/rr1UoGNIfBOKa7VSBE05hOTXKAMKalPJJ1mpJF90Ju8EKMMjJet1T1jGqd6oByEIQAhCEAIQhAKNLp6YDklupAdc0cEXTZJGRsLnuDWgXJPAIB3FVW0m0GHbN4c+txeoZBA3Tedm48gOJXKO0ftugwmaWg2bhFRUtJa6peQWtP+UDXzOS8/bRbRYvtJiJqcVq5amc6b5sGDkBoFXISO84j+0FRRSvbRYPNIwD4XSSBtz4jgtDx/tz2jrZHfYpIaSM/cjZw8zc81yidpYfj11PgozYnyvuXWAQk6M7tY2nfCYxXvF/+YHu3h5ElQ5+0naKSLu6jGcQfH4S2P0v+K0xzQ1h7s3Ayuo7TvyZm5QGys2oxaOfv6fEa1j/APqCZwcb+IK2/Ae2HazDntMmIOqoRqyoAeD6nP2K5bJ8JB9rrGahz8nHJAe0tg+1DBNqKJneTMoq8fDJBK6wvzaeIW/AgtDgQQdCNCvnbHM9jrxktP8ANe1lvWyHaXtDs1PE+jrppqdnzU88pfE4eV8j5ID2ykK0Ps87T8F2yp42Rv8AsmJW+OlkOd+bT94LfAbqSBUIQgEJsM15F7YJzjfa5ivxO7uCRlI0tOdmNAPpvb3svXeQzdpxXjeg3cV2rxTEJLfx6mSW97X3nl1ua8+pltie3RQ3SbK7HdnH0/dyw/FBIN1wtfdIGvG415rqHZf2h1mAsjwzaKd9XhYyjmzdJT6Zc3M1y1FsuSiSQd5AY33LSLG9vDX3WpVERpap0f8AKcj4c1kw1c112j6CrQ1Xpwmuz1nTzQ1NPFPTSslglaHskYbtcDxBT1562H2xrdmZhG0Gowx7ry0xdoeLmHgfwP4rpb+1DZ9rSWtrnHkIR/5LTq1lc45k8MyNT4m6me2Edy9NG8uTVoZ7U8C/7fEP/wA2f+SsKLtC2cqnBprHwOP/AFonNHuLhdFqanwpI80vHaiKy4P9jaymOy4KLR4th1db7FX0s5PCOVpPtdSX3XaMk1lHllXKLxJYETDqnFYppGRRPlleyOJg3nveQ1rRzJOQVig5MJy8Vy7a/towXCHyQYNC7F6ht7va/u4Rb/NYl3oLeK3vZbFXY5szheKSQthfWU7ZjG0khpPAEqkZJvCLuEorLRZpDwRxQcvRXKCITChCC/bqnhMbqsigkEIQgBCEIAQhCAEIUPFcRpcLopKqumbFDGN4ucUA/EK6mw6kkqq6eOCCMXc95sAF5m7Wu1CfaCSWgweaeDCRdrz8hm87Z28FWdr3aPNtRiL6SjlLMMhd8DR/zD/MVzN0m+4XN/xUZySkZA/fd8IAj+88/kszJYoo723WHQ81EkkLiADkEBgtvSEE6AW/FQSSIYmS3fK07vI8Ux5Y4FkDMufEqOZe+kawutGCCVN70fJTsGfH0UghyxPaN0gbx4J8UIjj3pLNvoBmT5KZ3G4wlzsz8zhl+KwMfEwlzPjePvckBXTR2dfujc/zLEIcr2I9FaTQyyWc8u3dd0FV9Q2QgMaQ1g5cUIwRpQABf2KxAHIb1r8AE8taD8W+4+dk4PB+UBoHAG6AsMMrZKB7Hwuc2RubXXsQu+dkXbHWPrIMF2iInjNwyrcfjb4O5+a86tNhmLnzWenkfTzRyU0jmTA3D25bqA+g8FTBURNkhka9jhdrgbghZ1wLsi2zw+hwyGjqpnireQXOleLvJ9LgeC7rSTtniD2m91OSMC1bXSUlQyMkPdG5rSOBIIXkrYalDKRzz8xeRne7bC2f9l68Ft4X0XlrCKY4dimJ0MjQ11PVyxkEjg85fT3Wf5BtV5Rp+Mw5NMuZjuMszwN/a304clr200lNHFHLJ/iDINbq4cG+/wCCvsUlZTw95kXH5ON9FqronS1n2iZ5tGCG3zz4n0091h195Z9Rp6pP50QJKLE6lm8+ZtO0gEMjzsNdeaizy4nhziZgJ4r/ADdaK9mqbXDb5c+ureKVj2zAsl1ORByXdWNdrg9UqfcZNP8Az/XRBpK1lUwOjcL2zbxHn69cVLBubeF1RYrhs2HTfa6MHu73cBo39P6K2pJjLTRPNyXNvpa6Tgkt0ei1Nsm3Ca5X8knTRbDge2uNYPuthqzPT/8ASqPjb6cR6Fa4TccRna6rcSxKKlduAOdIBkOfqpqnNS+TsaiuqUMWJNfk7NL2qs/dwMOFn7eSRuuk/hN8b6ny/Fc32s2hxTaIhuK1bnwB282mYNyIG+Xw8fW61eGfFat3eU7O7iOhda2hz8fbgrfAAZ8TMOJNDJ2tLmZfA+3Wi72XWyXzS/YzoabTVJyhD/1/1k1rGsKNDRyzPLmPfcQxi97cyvWGy9IMP2YwejtbuKOFmnHcF151x+jOJY3hNAwX+1VMcRvmLOcAfwJXp4gA2boMgtHRtuO5nzXkH8yQ1I5KmuXtM4S6EiFGWC/bqnJqUHJAPQkCVACEIQAhCEALkn7QuOR4fsx9lLS583J1rDn0F1teX/2n5Wf7RU8YNQHd1cjeAj15cSoZKOHvlDn3IcBxKcyoDTdzHFp8VDc4ud8R9FkhfuuBsL8+JQFiJXPYDuCNnDmVjlJeN1py5pA8vzt5XSOaQc72tn4qpI5otpl4qXDKYwbAXvfzKgguLvlPksjSTYGwCkE0RPqM5XkN01+vgnvjiiA3G7zh46eGXqsULS+43uGVtFLfECMrnLXhxQuQ5N55/iOsOA5LFLTEMLnXsszg6OS9s+dk2Z735apkoVErd15cWi3AH809hj7uwzcdVJfB3gJGZ0uU2On7nNwtx5JkjBFkY4NBAtfh7LHuvuXXsGqyMZku8j4R6WVfVuBdbMAaBSC52Vx+XCMSjqIKdk04Pw7/AAPNetOx/G6nGcOMlbVQyygDeZAz4WHkXZ3Oa8XwWErbDezXqP8AZ0q8YnpnRSx7uHRj4LgtA45ZdXUA7wvOvadS/uXtPrJCwiDEYm1TCBxtuuHu2/qvRS4R2u4rS43tDBDTRMeMOD4vtAzLnOtvAeAtbzuvLrpRVXzGn4iqdt+I9ezSsQrHVU2+8/CBZrVDldNUTU9JSQyT1Mztxkcbd5z3a2HsifLy5cCuldhmERyS4njU26+oDxSw8dxtg5x8zcC/ILI01SsmkfV67ULSadziuuihp+yvaiakdNI2hhmA3mwPqLvJ5EgFoPr6rU8XwzEsDqRTYrST0cxJ3BILB/8ApcMncDkcl6Y2pxmHZzZ2uxWoaXR0sZfu87cF5cru23FsanlpccoqOoweZw3qYtsWcnBwzBGtxmtGzSwxiK5PmKfPWxn+osr8E6lqu8YWyAZc80BjS927YZ8CsFZS/u7EHwFxezdbJG82u+N43mnI2zBsfG6z0xFs8vVZM47WfY0WxugrIcp8iPa6wIUamwOnbUmple6RxN2hxyHJTKggM1tbnkocsks07Yo2ySSOdutjY0vc48g0Zn+6mDl1Em3Y1un6Jbp2ss2PQegA/IZj+6bUzkNpqmMAvila8Z2NjkfwvkrOm2I2qna10WBVrW33m97ux8s7OIP9lVvp56SrqsPr4pKepjFnxSAhzTwJHkF0lTKC3NHmjqKb81xkmzYti8Mdinalh72svFh8bquV3Bp+Vg87lp9CV3c6rRuyPBH4fglTiNSwNqcSl32i2YhbkweuZ9Qt44rc0sNtaPidbLdc19uATCnE8U1eg8giEIUZBfBOGg8kwJRwPkgMqE0aJQgFQhCAEIQgBeOf2iRKO0Oq7x7XEtaQAb2Fsl7GXi3t4e6ftLxU5HdLWjd5BoRko5sxt3AWy6/RS44icm6nK4WWmpxcOdYm/X5K2gpWjN1z5Cyo2WSKoXabBt+NweKuMJwyfEXta1oAdy4eamU1A2RzXPZkTk2x65rd8Mp3QUL3RMEbQPui5yvZcbLdq4O9VW7s0TGqCOjtFEA55yuON+V/RLhWzs87g50bi5xsGjj1b6Letntl6jFq51TUtJF8r+f9vZdNwrZ2moIhZjS4C1155anHCPQtOm8s5PR7ESsjEkzSLZ2APV/6qHX4G+naXFm4BnY6gWGq7bXxMiiccmgXuVzzGKCqxmoMNJeGnBN38XHNUjc88s6OpYwkcyq4w6Xu423N8wNVmjwGUwulqPhaBcg811TDdjKehguGXtq52ZJUyLY6XEpQaproqJuYjGr9dV1eozwjktOlyzjMdFJIQ2khc8uNgQFt2EdnrnQNmr2l0zhfcOg811XCNlIIpzMYWNa0/wANgGTfHzV46ga3UZeC52aiTWIloaeK5Zw7GNinRw2YQ1rRyzXM8YwmWkqHtcywHFerK6iY5pyBC5dttsuJmSzRttle1vx+iU6h5xIm2hNcI4lG1zZAbcfL0XqP9mZ1S/DKlr4pGwNtZxA3HeXG+S8zSxmOd0TxZzTYjkvX37PNC2l2Dila55E7y/4uHl4LRRmvg2rtGxiTBtmKiSmkEdTORBE7iL6keIAP4LgToyG3zy1y8bXB5LtXarh1TW0NDNDnDTyHfaBnc2sfLIjLPMLkcdFLMdyzzawNuGmuQ4HzzA4FYvkJNzw/R9X4XZCnK7b5KaeLe8T5Lbuy7aan2blqqPFN5lLUOD2zMaXbjhl8QGdjl5WUam2emkt3jhHcA2IvbTx5qb/s1T7vxTvI1OXXRXjqvdUtyPfq506it1WPh/Y6Jj+KbMbSbPVmG1WMUJgqoywky2Iy1tcH6LzU/szw+hxkCr2hp6jDmvvemjMj3DlyXVm7M0hj3t+RxtpcZrVMWpH0FQY3Nzydfd8l6X5CUvp4Manw+msnhSf8EfaaoixXG3T0MLoKKOKKngikIuGMba5sbXOZKwRsAaASdOPXJIHDIZeXXooNXjFJSSbs0oDgcxy/VcHvtlwss+khGrSVqCeIrjkmVYd3TiCQRyPXIqq26xSv2QpsLpcLe6mrK6lbVT1Lcn7r82xtPAAEXHE+FlIpMZoak7sc7A7Qb3w+ykY3Rw49BTRYp3k0cDd2JwdZ0beTTy0NvJeilqmX6qMzydM9bWlp5JpdrPZuH7Nm3eMY3X1eCYvO+rjjiMscsjrubnornt1pY48ewSrYGiWaCaJ9si4NLS3ztvu91c9jOA7LYDhsj8CqTLXTC0xnIbK2w+Xd5XHitX7Z8VjxDamlpKd/eChiLX2OQe43cOV7BvkV7L5xdTa6fRgeJoshq0nHGM8fjH+zdey7EPtmyscTzd9I90R/06j6kei2xct7Hagx12IUpNmyRNeG+LTb6OXUivTpJ76Ys5+Vp+FqZJdPn9xrk1K7VIV6TOBCaTmhME4L4Jw9Ewam/mnDxQge3RPWMEpygDkISXUgVCEIAXiLtUe6TtAxpznPJ+0HN1/z4L27wPkvEXaRaXbzGXglwNS8XI5FRIlGt05IdvCxA0urzDYzI5r5M87knTXw6yVPE1pO6TYcSeC2rAqZ1RM1jG7w0ItcnwGa4zeEd61llth9MXbuVm/5cuGg9tTy8l0LBsLZJStMrBu8G6j8dVEwPZ7JstWLHgzX391uEELY4wGiwtlZZ1tm7hHurrxyPoImQN3WNACnFwOQUNzt23M6JBPuva1+p0aDe64JN9HYzyQxz3bI3eB4FZ4KKnjA3GAeSdDu5fzHRZgC3hdHFoZz0MEbGyC4FuF1NaxpaNB117LDbf0us8TiBr6K8fyMDZBuAi1rZKHLNcFTaoF41z8FWPYQSEkyUjBM8FumXFUOKRtfTyNI4K5ny1Oiq68gRPJ4Arkm2yJHmvainbDjs7Im5b+QGuq9kdklBJh3Z7g0M7DHKYGuc0ixuc15abhn767RqOjZkZahrSQL2AOa9o0sLaemihZk2NoaPQLdr6Rj2/UwqoI6qmlgmaHRyNLXA8iuY11C6gqpIHN3XNdw4i97+q6kVUY/hbcSpiWC1SwHu3aX/wAp8PovJr9L8aOY9r+T06PU/BltfTOX1tVHS0z5ZHbsbG7x9lzPEO0Ooqp3swyOOONlx/EBc4657vkF0bEImVcUjC03Di17D8zHDVpHO+S0TEuzuB0/2qim7l7XF4aRdo/PgFjad1xf6ptSjL0bpshWYhiGBU+IVETXwuL2yviFhE5ptZwJvmCCCOCy7RYY2tia/PfuN0jmsWwOJ02ytDPh+M0ErGzOLpayE98x3AAtAu0Acc+N1sW9TvjD6KeOppH5xSxuuCOV+BGhCvfVBfPV0Uha4WP+DjW0zpMKoZnlnxD4QNLH2/Fc1c9ziZHkl5zJtc9dcCvQG22zAxvCZoobNntvxm33h0V57q6Kroqx8NXHJG8OLbPaR4ey0fGyi4PHZx8jfO6UW+kh9s9Bf9crdeC2TZbE5jUR0Up7yJwIjJNy0jO3j0Vq7n2DnAEXztwPWf8AVXmwlJUYntDTsjY4tiJe5wF7AA6r1amMZVvcebRWzqti4v2v2Os4HgpxGgkle4scMmG1/NQK3BpqOR3eRGxJO8BcH164q7xzaCm2Y/dlDKwWnuXne+QXABPmfothkZHVwFrwHscAQCL34r597o4b6Z9DHWYsb9FD2dy/Z9qqS2TZN6Im3MHL3C7IVynAcLkg2sw8Mu5jZO8uL2AsM/w11P4rqrsgtnxrzW1+TE83KM7YyXtf2NKQ6ISOK0TEEzGVvr/RCaddB7fohMgvr8eKfxWMapzeSAycU5M1CeNFAHJqchACELFVS9zTSyfyNLlPQSya7j21kGH1oo6cRS1A+YOdp4WC8rdptFUjaytq5I7MqXGT4b2B5LtNIBPO6WQb1TO8ukcBcgX0UPbHCaTFMOlayI70Y+Eu1Wd/yZbsvo15aWuMUl2efKaEl4JBFuWv6Lr/AGe4W6OmEj2Wvaw5LTMCwwz4j3bmAhhzC7ZgdCylpI2tbY2TUWZWEcaK8PJJih3RZZ7XWdjL2AF+GSzSxMay1tV5FE9TKuoe4REwi7zp4eK1PEqjEaaZ74h3j9cuHmef0/Bb3FDE55BfdZJcPpZQGvY1zeDSMl1UoxKuLkc0o9rXU8/+9SXcDazbm62vAtrqaveG3I5bwsrt2DUG6d2miBPJoWt4lgkcVQJKdgYQbgjT2R2RfoRg17N1hmbKPhyHgssZOfiqPB5XNYxj75Dgrk3A3vuqmOTr2SGBpuTbPM+Kj1EQawkKtxDGIKBpdLIGj6rR8a7R4g8x0ME1Run4nNbcK6rcispqJuFawht8uZVHiTw6je5pvlwWh1W3VZiD+7AdGD90i11dYJVyyYbUNnJJANrjkjo28nH4u7or+xPB/wB5dpk9dK1rmUbHOz/mJsD1zXpxcq7AcLbFs7U4k9lpaqd1j/lBsF1VasejLm+WNJ1TDoU5xTSrFTkHatTSYLtBBitMdynrxuygHLvG2zt4tt7FUtJirXsBNuRb4+Flv/bBh8tfsg51NG+WammZKGsaXG2bXZDPiuM0s4bI5hIsD5Zr5/X0qNja98n1fj5LUadN9x4/0boyohnOTgCRmDbwUGTDZ6WolqcJnFNPIAHt3N6OQ5ZluQvrmLG3FVkcx3QQb2069urKZDXyxEAG4y148PbrgvDFuPReVXokDaeqpWhuJ4TPcfNJSESN87EgjyzVZi+O7M19O418Qk5NqKZzSTnkCR+atW4kyQWkZlfPPK1xz81jcaOd9yGguI1sev0XSNiTzjH+Dl8FmsYDspsvi1HFMWQmZ3xObHORu6G1r8LhbxhGD4Vs/RFlJFFAwm5N7lx/NUr8EwWoLXyQQOdqTu5j191NwjDqT7bFT4VSCeqdmNzRuViSeA8fFdJ3St+VNv8ABzVW3nGDW8d2Ulx/aKXEsQlcY37rYYmmwawaAnmbXXRcGwyeWFkcEThG1obciwHitkw/ZyngDH1bu/ktmNGA8cuKud0NaGtFmgWAGQC9tehssx8V4S9Hht18Y8VrP5IWHYfFRNNvilOTnn6BSnJzkwrXrrjXFRgsIy5zlY90nyImu01TiUw6lWKBn0P0Qky5n2QnJJeJ6YnAqCB3XXusjViabp41QD05MabhKgHKHixIwuqP/tu+ilLDXR97Rzx67zCPwUS6LQ7RyqnnZh1D34FppSd3K5socX22ogqamtnLmkWZGfu69eilYnTvEMM0bd4RHdcOWZU0z09XhzmU+4HMZmb+HJY6RvSawc/2Pw8SYnUSuALQ8nTjddKgZcC+S1bZONkMcpAFy85881tlO5JvLOEeCbGwC3AKNi+/9ncIAN9TYmhw19k6SAFpDs/RV5wXSOaVMOOPkkMVS8Oz3WsFh+q12Co2qZjjIGx1UkPytc+bIk/eeTbIcguvyUbmEujHosTonbp3oQTzsrQs2cNESr3Gv1NfJhbYI31v2uQj4yxuV+rq4hcKqFjnAhpzS/Z7uu6GNo8RdNdJd27qdBlaypNpvKOkYYWCfSNY0W3fhGixYqGthBbO5pz42TqEyxfPm0rDjbgYwY4wXDw0TfwTjBStpKOokH2v+KdN12ivqKkw9se62niaOW6AtH2ioa6rg7ugqTT72pYS1zvUaei1jD9mNpm4i8l8P2Z5AMrd7fjZxDRfU8zn48ulcd/Llg5Tk49LJ0vGsDwyc732eMP1FgqF2D/Z4Kowt+4QBy8lBrTiGG4hEKDv30gs1zJzvOPjdbjSM+0QRteMn2yUptSxkpJcZwbzsdh8WF7M4fSQN3GMhbl4kXKuEymYIqeNg0a0BOJ1WujHfIh1THHJOcsbsypAhPIrXdotkMIx495U0/c1X/cQfA8+fBw81sKFScIzWJLJeu2dUt0HhnJq/s5xOlJNDUw1sYGQce7kPnc2/Fa9W4PiFGbVdFPDna5Zl7rvB1ScLcF4LPGwlzF4NGvylq+tZ/g8+yBtgGke/XQ81j3g0G2l73P9F3qfD6KQHvKOmdf+aIH8lEfgOEEm+GUWvGEHrivO/GS/7HpXloe4s4PNVBp3Rbe5AZ+w8l1Ts0wd1DhDq6qaW1VZZwDhm2MfKPC+Z9Qtpp8NoaM3paKmhdzZE0H3ss5K9Wm0KplvbyzhrPJ/GhshHCfYhTHHPJOJyN0x3Fe8yhp0TUpTVJAFY3Xt11yT3aLG7VQSOBFv0Qmjy/D9EKCC9QEIUge35rc04LHdPabjrrkgHMPAp6x+XXWSe0ghAKjzQhAaJi9FJS18oj+Vx3gDyVLNhzIq2Ssje4b7N10dsvNdHxWgFZFdp3ZW/KfyWmYjKyAPinO5KAbggrMvpcZZXRr6e5Tjj2avQtEILW878le0TwbZjgqho/iOIDgOF8lLppHNyvkuJdd4NmppQTYH3U4WeMiLKjpnkNB4lWtK8FuuvqpRbBkewB2SxPjuc1nvxTCcr6AJhFkyI+C4ufdVsj4GPsLE+WQWPHsWEf8ABidYk2JCgYXTTzvMhFm8vBVSTOiXBsFJvTWFrDVLW0xEZJ4JcNcA8tF/hyzVjVEGI5eJUOJRvk0ySk7yQ7pLXA6qZSRVTQGtew/gUCQMrXN0BNtFawgAttYeahIllXNSEuLpgCeaz4SwOraduRG+PXNS62xAtoUmARb+LwgDJpJV6o/Ojja8QbN60GaYUpzTSblbJiiOPJMOlkpPFNQAkJslTSboBEhKVM6+iAR3XXXBNOQ/p11kl8uusk1xFuuuSAYTdIdEqa5ANJyyTCnE5phz9UAjimpSbkpEA12qZ5ddZJzkw5IAOv6ITPU+yEJNhQkBSoQCcw+Nk1CAy/h117IBsb6ddeyRpuOuuvJL111+SAyA3QmA28k9ACLC97C/NCEBy7HrfvytaLD+J+QUenbdxKdi7t/Ga11xnK5PpmktuDksm36ma9XEUT6UG2ZVpT5DVVkDt23IKwpnjdBVEdckseOSiVcrgwgZXWcm41y8FElfvvsBdQ3k6I1nF6VzZGSeOZ+qs6DFaKmgbFI+zyPl5qXLTmX5m3aoZwWCSYOc3XUWUIvw+yfh9bSm7t/4jo1TpMQh+zEkg5WHEKllwNkZDo3ll1ArqB8bw10spbx8VbJXamZ5pGSPLmkHNWtM4uY2981V0UTGRNDGWarWMgMzVUwxKt9xcqz2Rp96WeoIyHwA/VUdS/fNhmSbDzW7YTTCjw+KKw37Xd5lerSw3S3fY8OrniOPuS3FMc7kUrjr11qmLRMwChCCbIBHJqcmoAKxngErjkeuCaePXNAA666+qxuIOiV5sSE1ACaTmgnJNcc0JBYicjmnXuDzKYShAiRxslTHlANJ5JDrYJUxygCISZIUgv09MTgUAqEIQCtNinjw66ssac02PMIB6cw8EwaA9dapfPrrNAZEE2Fymh1hmsdXII6SZ9/lYSgOS1b9+qleHZOkcfxKk0r9R7XKiN+KMG1yVjgnMcu45xvw8VjSlls2IrCL5jrBSaebdIGihRP3mgg8FmjIFjwUZLosJZbNsMr5XWMSxR2uRZYC6+ZOmircWgbUQmPfLSRqNbKMl0s8FvNitFF/iTMHhdYosWppHgxSMPgtElwBjiQXyeJLtf6KRFgETWjuamZpHir7D1xoi12bo+qlfOCxm+3gQU2slbI4NeAHcVqbqbFI4O7grWgf5rnh+K12uix2OUCCrjL7i5IJHHx5dZpsbIlRwdLcxrGXb/ZLHLvN8bZrXsClxE07TiO4H2yDTqriMue1rGAlzjZv0VMc4PLL5ey32dpPteId64fw4fiPnwC3EnJQsLoxQUUcI+b5nnm46qU4rWpr+HHBj3WfElkHFIhC6nEE0m6CbpEAJCfZBPJMJvp11kgAnPrr+yaSBZL11+CxuNygEQhNcf6oBCUwnXmlJz9Uy6ACbJiUm5SIBHHJMcc0rjnmmdddfrAEKYdU4nzSKQNQj0QgNgQgG6EA4G6VMTgUAqEIQDgck691je4RRuklIZG0bznPNgBzJK432iduWH4LJU0GzULcRrmAtFUXfwGO8LZvt6C/FSDss1RBBbv5oYr6d5IG315qvx6qh/cVc6KaJ94XW3Hg3v5ea8bjZjanbOukxbGag95UHedNVO+I+TRoPDJb5sZsPR4DXw1b6mapq23DS74WN4Gw/qV57NRCKayeiuibaeDozGndBsbWUKsjv8TdWlTojkAm1Efwm2axzTGYZW7wDX6jXzVu07wuCtSqGPhkMjLtI/EK6wrEGysAcfi5IuSxbC/DySPbln7rNTbsnHL6rLJTZbwXQIgOg0NgTyUWohkt8DLW46KS0vilO98o08ugllm1AI11RZR2jKS6ZWsabHvWuA8EyOhha/fAdfx1VgHEt5N1tZRZZHn4WW3vHgm5rsSsl9zKXNZawBC2PZGh76T7dK34GfDHfibC5WvYdQyV1bHTsN3OPxO5DiV0inhZTwRwxC0bBYBerS1Ze9mbqrcLavZlJukQkJWiZwEpCbpEE2QAmkoJzTOuuvyQCk8uuskhy066ySE2F+uuuSxkk6oBziDkNE1Ick1xKAUlMJQSmuKACblMJ4IJySIAQUJrjkgGnXzTCbDJKSmON1AEKRCCpAuSFjccyhMjDNgB8U4EFYweR66/NYK6vpcOpH1WIVMNLTMF3SzP3Wj1KAmLBXVtJh8PfV9VBSw/zzSBg/FcK7Qu3Lu+8odjmgkZOxCZt/8A6MP1PsuG4zjVfjFUajFq6orJz96WQvPpyVlEHrXF+1jY/DGPIxQVjx9ykYX39ch63XHduu3HGMSkdDs4ThNHbJ4s6Z/m7QeQ91xtzicvlHnmksBc2U4BZ4hjuJ4i95r8Rrqne176dzgfQnzWPAIBV49RQPbcOlaCD9FXi4vwP9/6K22Se2PafDXONgJhmq2PEHgvX9SPRH2YRU7QPujS3gsTGkVTAPHRWdU0GMeI5eqiRNDqoHkNL5r59vJseiygZduev6LJJHqD7rLENMk9zMtLhEEUdUwi4Vc9roX78e9e+Y5q9qot4aqvdHmQQFBKLLB8RDmgG1/NXz6kOiIGZ0WmGndv70Z3XhPGKVFI20zHW4EC66xafZHReTPs4l5y5lMu51yN23BUb8WjkJeXje1ItonPxTebk8+9lcspk+pqN0921wJ4lOhna1u8/IDPNU7aynjabygyE5m+QWJ9U+olDN1zI7XsciVWXXJDnng0Xa/tNx3ANtI/3I801PAN1zZI7sqed76t8rFd/wCzjbjD9tsDiqqV8cdcxtqqk3ruidxI5tPArzT2rsDg1z2DehILHWGh4FaXgGJVVBWxVmHVc1JUxmwliduuC1NM061gy9TFqfJ71JSLz7sb28T07mUe2NH3hB3TV0ws4eLmcfMey7dgOP4XtBRNq8GrYaqA6lhzb4OGrT4ELu1g85aE2TCb/ikvySdZddZKAGvXXNI4gDPj1+aC4AZa9deyxk31QATck80ITXHI+SACc00nkgn2TCUAO69khyR93rkmE3KAEISE8EAErGTqlJumEoSDjbyWNKdUiEAmuKRxyskKAPdCT3QoGS/+8PL8gvJ/bbWVVTt9ikFRUzSwQW7qOSQubH8P3Qch6IQrLsHOrDkFj4Dy/MIQuhAH5/X+iaOHp+SEIBBx8h9FMwj/AIzR/wDzN+oQhcp/SzpD6kepZf8A08f+kfQKJS/4rvX6oQvnjWLiL5E/7iEKyJRDl/wx5fmoUn+L1yQhGWFP+IOuCdUtaYnXaNOSEKoNYr2tu/4Rw4eSrUIXeHRD7LrAGNMzCWgm/LzWZ/8AxCb/AEhCFWfYic07Wfkb1xK5rh/yP80IWpo/oRn6v6yZWfJB5H6rZOz6sqaLbCnNHUTU5dcHunll9eSEL1+jyez2h91v+kfkk4s8/wCiEKgMaEIQDT8w8ikPzIQo9gYdPT8ikGhQhSDGhCEAjtD5Jn3/AF/qhChgYflCQ8fIfkhCEjEIQpIMbuvZIfmPmhCgCIQhQXP/2Q==");
        req.setDriverLabel("xinan");
        FaceUserResp faceUserResp = g7OpenapiClient.faceUserUpdate(req);
        AssertUtil.notNull(faceUserResp);
    }

    @Test
    public void faceUserQueryTest() {
        // 创建请求bean
        RestTemplate restTemplate = new RestTemplateBuilder().build();
        IRequest request = new RestTemplateRequest(restTemplate);
        // 创建开放平台接口客户端
        String accessKey = "6rtje9";
        String accessSecret = "VVFTpM2res3XO9uUrbRcKTTNnmDuN0B9";
        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(url, accessKey, accessSecret, request);
        FaceUserDeleteOrQueryReq req = new FaceUserDeleteOrQueryReq();
        req.setOrgcode("2017B6");
        req.setUserId("0f2e01caa4ea4442a230b4e39dc4854e");

        FaceUserResp faceUserResp = g7OpenapiClient.faceUserQuery(req);
        AssertUtil.notNull(faceUserResp);
    }

    @Test
    public void faceUserDeleteTest() {
        // 创建请求bean
        RestTemplate restTemplate = new RestTemplateBuilder().build();
        IRequest request = new RestTemplateRequest(restTemplate);
        // 创建开放平台接口客户端
        String accessKey = "6rtje9";
        String accessSecret = "VVFTpM2res3XO9uUrbRcKTTNnmDuN0B9";
        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(url, accessKey, accessSecret, request);
        FaceUserDeleteOrQueryReq req = new FaceUserDeleteOrQueryReq();
        req.setOrgcode("2017B6");
        req.setUserId("2af714d9436411ec832a005056b2871e");
        FaceUserResp faceUserResp = g7OpenapiClient.faceUserDelete(req);
        AssertUtil.notNull(faceUserResp);
    }

    @Test
    public void faceTruckLabelSaveTest() {
        // 创建请求bean
        RestTemplate restTemplate = new RestTemplateBuilder().build();
        IRequest request = new RestTemplateRequest(restTemplate);
        // 创建开放平台接口客户端
        String accessKey = "6rtje9";
        String accessSecret = "VVFTpM2res3XO9uUrbRcKTTNnmDuN0B9";
        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(url, accessKey, accessSecret, request);
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

    @Test
    public void faceTruckLabelQueryTest() {
        // 创建请求bean
        RestTemplate restTemplate = new RestTemplateBuilder().build();
        IRequest request = new RestTemplateRequest(restTemplate);
        // 创建开放平台接口客户端
        String accessKey = "6rtje9";
        String accessSecret = "VVFTpM2res3XO9uUrbRcKTTNnmDuN0B9";
        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(url, accessKey, accessSecret, request);
        FaceTruckLabelDeleteOrQueryReq req = new FaceTruckLabelDeleteOrQueryReq();
        req.setOrgcode("2017B6");
        List<String> plateNums = new ArrayList<>();
        plateNums.add("川A12345");
        req.setPlateNums(plateNums);
        List<FaceTruckLabel> faceTruckLabelList = g7OpenapiClient.faceTruckLabelQuery(req);
        AssertUtil.notNull(faceTruckLabelList);
    }

    @Test
    public void faceTruckLabelDeleteTest() {
        // 创建请求bean
        RestTemplate restTemplate = new RestTemplateBuilder().build();
        IRequest request = new RestTemplateRequest(restTemplate);
        // 创建开放平台接口客户端
        String accessKey = "6rtje9";
        String accessSecret = "VVFTpM2res3XO9uUrbRcKTTNnmDuN0B9";
        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(url, accessKey, accessSecret, request);
        FaceTruckLabelDeleteOrQueryReq req = new FaceTruckLabelDeleteOrQueryReq();
        req.setOrgcode("2017B6");
        List<String> plateNums = new ArrayList<>();
        plateNums.add("川A12345");
        req.setPlateNums(plateNums);
        g7OpenapiClient.faceTruckLabelDelete(req);
    }

    @Test
    public void batchSendVoiceTest() {
        // 创建请求bean
        RestTemplate restTemplate = new RestTemplateBuilder().build();
        IRequest request = new RestTemplateRequest(restTemplate);
        // 创建开放平台接口客户端
        String accessKey = "elfyik";
        String accessSecret = "dszpkdnu1jwszafavcnfuzktsujjvrvm";
        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(url, accessKey, accessSecret, request);
        List<MsgBatchSendVoiceReq> reqList = new ArrayList<>();
        MsgBatchSendVoiceReq req = new MsgBatchSendVoiceReq();
        req.setTxt("你好");
        req.setPlateNum("川A11112");
        reqList.add(req);
        List<MsgCommonVoiceSendResp> msgCommonVoiceSendRespList = g7OpenapiClient.batchSendVoice(reqList);
        log.info("rsp:{}", JsonUtil.toJson(msgCommonVoiceSendRespList));
    }

}
