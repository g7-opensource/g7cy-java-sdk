package cn.com.g7.sdk.api.detailtest;

import cn.com.g7.sdk.api.G7OpenapiClient;
import cn.com.g7.sdk.api.G7OpenapiException;
import cn.com.g7.sdk.api.request.IRequest;
import cn.com.g7.sdk.api.request.impl.RestTemplateRequest;
import cn.com.g7.sdk.api.util.JsonUtil;
import cn.com.g7.sdk.api.vo.TruckModelInfoReq;
import cn.com.g7.sdk.api.vo.TruckModelInfoResp;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

/**
 * 单元测试
 * 接口描述：查询车辆_车辆详情2接口 /v1/base/truck/get_truck_model_info
 * @author sunzhiping
 * @date 2021-10-13
 */

public class TestWithGet_truck_model_info {
    private final Logger log = LoggerFactory.getLogger(TestWithGet_truck_model_info.class);
    private String url = "http://openapi.huoyunren.com";
    private String accessKey = "xsk8vj";
    private String accessSecret = "aUwDAkBf8mvr8YKX7GTqIszvpCeBoY4F";
    private String orgcode = "201IHA";
    private String truck_id = "7B49E76556C25847D47CBD345FDB5092";


    /**
     * 接口描述：查询车辆_车辆车型详情V1.0 接口 /v1/base/truck/get_truck_model_info
     * 测试传入必填参数
     *  select * from user where id=29  orgcode 201IHA  orgname 漯河双汇物流投资有限公司1
     * @throws Exception
     */
    @Test
    public void withRequiredParam() throws Exception {
            RestTemplate restTemplate = new RestTemplateBuilder().build();
            IRequest request = new RestTemplateRequest(restTemplate);
            // 创建开放平台接口客户端
            G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(url, accessKey, accessSecret, request);
            TruckModelInfoReq req = new TruckModelInfoReq();
            req.setOrgcodeLike(orgcode);
            req.setTruckId(truck_id);
            Map<String, TruckModelInfoResp> truckModelInfo = g7OpenapiClient.getTruckModelInfo(req);
            log.info("rsp:{}", JsonUtil.toJson(truckModelInfo));
            Assertions.assertNotNull(truckModelInfo);

            Assertions.assertTrue(JsonUtil.toJson(truckModelInfo).contains("\"truckid\":\"7B49E76556C25847D47CBD345FDB5092\""));



    }

    /**
     * 接口描述：查询车辆_车辆详情2接口 /v1/base/truck/get_truck_model_info
     * 测试 选取字段都有的数据比对验证
     *    orgcode 201Z7C
     * @throws Exception
     */
    @Test
    public void withRequiredParam2() throws Exception {
        RestTemplate restTemplate = new RestTemplateBuilder().build();
        IRequest request = new RestTemplateRequest(restTemplate);
        // 创建开放平台接口客户端
        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(url, "ulpb2o", "ZOTxxKh11V8KtkSwwJXLfGkpLxni64Wo", request);
        TruckModelInfoReq req = new TruckModelInfoReq();
        req.setOrgcodeLike("201Z7C");
        req.setTruckId("C91D1B9A68BD0F851041A6938B5730FD");
        Map<String, TruckModelInfoResp> truckModelInfo = g7OpenapiClient.getTruckModelInfo(req);
        log.info("rsp:{}", JsonUtil.toJson(truckModelInfo));
        Assertions.assertNotNull(truckModelInfo);

        Assertions.assertTrue(JsonUtil.toJson(truckModelInfo).contains("brand\":\"集瑞\""));
        Assertions.assertTrue(JsonUtil.toJson(truckModelInfo).contains("\"name\":\"集瑞危险品牵引汽车 联合 天然气 25000|8805kg 10338ml 276kw 375hp QCC4252N654W\""));
        Assertions.assertTrue(JsonUtil.toJson(truckModelInfo).contains("\"power\":\"276\""));
        Assertions.assertTrue(JsonUtil.toJson(truckModelInfo).contains("\"series\":\"联合\""));
        Assertions.assertTrue(JsonUtil.toJson(truckModelInfo).contains("\"truckmodelid\":\"be80f1a8d64e1855893bfe1fb1306fcb\""));
        Assertions.assertTrue(JsonUtil.toJson(truckModelInfo).contains("\"type\":\"危险品牵引汽车\""));
        Assertions.assertTrue(JsonUtil.toJson(truckModelInfo).contains("\"fuel_type\":\"天然气\""));
        Assertions.assertTrue(JsonUtil.toJson(truckModelInfo).contains("\"displacement\":\"10338\""));

    }



    /**
     * 接口描述：查询车辆_车辆详情2接口 /v1/base/truck/get_truck_model_info
     * 测试传入所有参数，传入空值
     *
     * @throws Exception
     */
    @Test
    public void testNullParamOrgcode_like() throws Exception {
        RestTemplate restTemplate = new RestTemplateBuilder().build();
        IRequest request = new RestTemplateRequest(restTemplate);
        // 创建开放平台接口客户端
        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(url, "ulpb2o", "ZOTxxKh11V8KtkSwwJXLfGkpLxni64Wo", request);
        TruckModelInfoReq req = new TruckModelInfoReq();
        req.setOrgcodeLike("");
        req.setTruckId("C91D1B9A68BD0F851041A6938B5730FD");


        try{
            Map<String, TruckModelInfoResp> truckModelInfo = g7OpenapiClient.getTruckModelInfo(req);
            log.info("rsp:{}", JsonUtil.toJson(truckModelInfo));
            Assertions.assertNotNull(truckModelInfo);
            Assertions.fail("没有校验必填");

        }catch (G7OpenapiException e){
            Assertions.assertTrue(e.getMessage().contains("参数长度小于预期值orgcode_like"));
        }
    }

    /**
     * 接口描述：查询车辆_车辆详情2接口 /v1/base/truck/get_truck_model_info
     * 测试传入所有参数，传入空值
     *
     * @throws Exception
     */
    @Test
    public void testNullParamTruck_id() throws Exception {
        RestTemplate restTemplate = new RestTemplateBuilder().build();
        IRequest request = new RestTemplateRequest(restTemplate);
        // 创建开放平台接口客户端
        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(url, "ulpb2o", "ZOTxxKh11V8KtkSwwJXLfGkpLxni64Wo", request);
        TruckModelInfoReq req = new TruckModelInfoReq();
        req.setOrgcodeLike("201IHA");
        req.setTruckId("");
        try{
            Map<String, TruckModelInfoResp> truckModelInfo = g7OpenapiClient.getTruckModelInfo(req);
            log.info("rsp:{}", JsonUtil.toJson(truckModelInfo));
            Assertions.assertNotNull(truckModelInfo);
            Assertions.fail("没有校验必填");

        }catch (G7OpenapiException e){
            Assertions.assertTrue(e.getMessage().contains("参数长度小于预期值truck_id"));
        }
    }


    /**
     * 接口描述：查询车辆_车辆详情2接口 /v1/base/truck/get_truck_model_info
     * 测试 不传入参数， 返回了100个车??? ,没有必填的校验??
     *
     * @throws Exception
     */
    @Test
    public void testNoParam() throws Exception {
        RestTemplate restTemplate = new RestTemplateBuilder().build();
        IRequest request = new RestTemplateRequest(restTemplate);
        // 创建开放平台接口客户端
        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(url, accessKey, accessSecret, request);
        TruckModelInfoReq req = new TruckModelInfoReq();

        try{
            Map<String, TruckModelInfoResp> truckModelInfo = g7OpenapiClient.getTruckModelInfo(req);
            log.info("rsp:{}", JsonUtil.toJson(truckModelInfo));
            Assertions.assertNotNull(truckModelInfo);
            Assertions.fail("没有校验必填");

        }catch (G7OpenapiException e){
            Assertions.assertTrue(e.getMessage().contains("参数缺失truck_id"));
        }
    }


    /**
     * 接口描述：查询车辆_车辆详情2接口 /v1/base/truck/get_truck_model_info
     * Testcasename:测试传入超长参数
     *
     * @throws Exception
     */
    @Test
    public void testBigParam() throws Exception {
        RestTemplate restTemplate = new RestTemplateBuilder().build();
        IRequest request = new RestTemplateRequest(restTemplate);
        // 创建开放平台接口客户端
        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(url, accessKey, accessSecret, request);
        TruckModelInfoReq req = new TruckModelInfoReq();

        req.setOrgcodeLike("201IHA");
        req.setTruckId("1232132111112321321111111111111QWEASFSAF12321321111111111111QWEASFSAF12321321111111111111QWEASFSAF12321321111111111111QWEASFSAF12321321111111111111QWEASFSAF111111111QWEASFSAF");

        Map<String, TruckModelInfoResp> truckModelInfo = g7OpenapiClient.getTruckModelInfo(req);
        log.info("rsp:{}", JsonUtil.toJson(truckModelInfo));
        Assertions.assertNull(truckModelInfo);


    }

    /**
     * 接口描述：查询车辆_车辆详情2接口 /v1/base/truck/get_truck_model_info
     * Testcasename:测试传入超长参数
     *
     * @throws Exception
     */
    @Test
    public void testAbnormalcharacterParam() throws Exception {

        RestTemplate restTemplate = new RestTemplateBuilder().build();
        IRequest request = new RestTemplateRequest(restTemplate);
        // 创建开放平台接口客户端
        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(url, accessKey, accessSecret, request);
        TruckModelInfoReq req = new TruckModelInfoReq();
        req.setOrgcodeLike(orgcode);
        req.setTruckId(truck_id+"!@#!@#!$!$%^&*()");
        Map<String, TruckModelInfoResp> truckModelInfo = g7OpenapiClient.getTruckModelInfo(req);
        log.info("rsp:{}", JsonUtil.toJson(truckModelInfo));
        Assertions.assertNull(truckModelInfo);

    }

    /**
     * 接口描述：查询车辆_车辆详情2接口 /v1/base/truck/get_truck_model_info
     * 测试 Carnum_like 不属于这个机构
     *
     * @throws Exception
     */
    @Test
    public void OnOtherWithCarnum_like() throws Exception {

        RestTemplate restTemplate = new RestTemplateBuilder().build();
        IRequest request = new RestTemplateRequest(restTemplate);
        // 创建开放平台接口客户端
        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(url, accessKey, accessSecret, request);
        TruckModelInfoReq req = new TruckModelInfoReq();

        req.setOrgcodeLike("201IHA");
        req.setTruckId("C91D1B9A68BD0F851041A6938B5730FD");

        try{
            Map<String, TruckModelInfoResp> truckModelInfo = g7OpenapiClient.getTruckModelInfo(req);
            log.info("rsp:{}", JsonUtil.toJson(truckModelInfo));
            Assertions.assertNull(truckModelInfo);
        }catch (G7OpenapiException e){
            Assertions.assertTrue(e.getMessage().contains("无权操作数据"));
        }

    }

    /**
     * 接口描述：查询车辆_车辆详情2接口 /v1/base/truck/get_truck_model_info
     * 测试 用其他正确的机构号，来查询车辆 不属于这个机构access_id kjfqvl
     * kjfqvl 机构账号 select * from user where id= 22  Orgcode 20005J
     * @throws Exception
     */
    @Test
    public void OnOtherWithOrgcode_like() throws Exception {
        RestTemplate restTemplate = new RestTemplateBuilder().build();
        IRequest request = new RestTemplateRequest(restTemplate);
        // 创建开放平台接口客户端
        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(url, "ulpb2o", "ZOTxxKh11V8KtkSwwJXLfGkpLxni64Wo", request);
        TruckModelInfoReq req = new TruckModelInfoReq();
        req.setOrgcodeLike("201IHA");
        req.setTruckId("C91D1B9A68BD0F851041A6938B5730FD");

        try{
            Map<String, TruckModelInfoResp> truckModelInfo = g7OpenapiClient.getTruckModelInfo(req);
            log.info("rsp:{}", JsonUtil.toJson(truckModelInfo));
            Assertions.assertNotNull(truckModelInfo);
            Assertions.fail("居然没有限制权限");
        }catch (G7OpenapiException e){
            Assertions.assertTrue(e.getMessage().contains("无权操作数据"));
        }
    }

}
