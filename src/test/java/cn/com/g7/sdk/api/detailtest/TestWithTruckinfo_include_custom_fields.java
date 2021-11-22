package cn.com.g7.sdk.api.detailtest;

import cn.com.g7.sdk.api.G7OpenapiClient;
import cn.com.g7.sdk.api.G7OpenapiException;
import cn.com.g7.sdk.api.request.IRequest;
import cn.com.g7.sdk.api.request.impl.RestTemplateRequest;
import cn.com.g7.sdk.api.util.JsonUtil;
import cn.com.g7.sdk.api.vo.TruckInfoAndCustomFieldResp;
import cn.com.g7.sdk.api.vo.TruckInfoCustomReq;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.client.RestTemplate;

/**
 * 单元测试
 * 接口描述：查询车辆详情接口 /v1/base/truck/truckinfo_include_custom_fields
 * @author sunzhiping
 * @date 2021-10-13
 */

public class TestWithTruckinfo_include_custom_fields {
    private final Logger log = LoggerFactory.getLogger(TestWithTruckinfo_include_custom_fields.class);
    private String url = "http://openapi.huoyunren.com";
    private String accessKey = "xsk8vj";
    private String accessSecret = "aUwDAkBf8mvr8YKX7GTqIszvpCeBoY4F";
    private String orgcode = "201IHA";


    /**
     * 接口描述：查询车辆详情接口 /v1/base/truck/truckinfo_include_custom_fields
     * 测试传入必填参数
     *  select * from user where id=29  orgcode 201IHA  orgname 漯河双汇物流投资有限公司1
     * @throws Exception
     */
    @Test
    public void withRequiredParam() throws Exception {
        //初始化
        // 创建请求bean
        RestTemplate restTemplate = new RestTemplateBuilder().build();
        IRequest request = new RestTemplateRequest(restTemplate);
        // 创建开放平台接口客户端
        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(url, accessKey, accessSecret, request);
        TruckInfoCustomReq req = new TruckInfoCustomReq();
        req.setOrgcodeLike("201IHA");
        req.setTruckIds("7B49E76556C25847D47CBD345FDB5092");
        TruckInfoAndCustomFieldResp truckInfoAndCustomFieldResp = g7OpenapiClient.truckInfoAndCustomField(req);
        log.info("rsp:{}", JsonUtil.toJson(truckInfoAndCustomFieldResp));
        Assert.assertNotNull(truckInfoAndCustomFieldResp);

        Assertions.assertTrue(JsonUtil.toJson(truckInfoAndCustomFieldResp).contains("\"carnum\":\"鄂FW3N36\""));
        Assertions.assertTrue(JsonUtil.toJson(truckInfoAndCustomFieldResp).contains("\"deleted\":0"));
        Assertions.assertTrue(JsonUtil.toJson(truckInfoAndCustomFieldResp).contains("\"orgcode\":\"201IHA0N02\""));
        Assertions.assertTrue(JsonUtil.toJson(truckInfoAndCustomFieldResp).contains("\"truckid\":\"7B49E76556C25847D47CBD345FDB5092\""));
        Assertions.assertTrue(JsonUtil.toJson(truckInfoAndCustomFieldResp).contains("\"ownid\":\"743332A469534979C03493838349CDEC\""));
        Assertions.assertTrue(JsonUtil.toJson(truckInfoAndCustomFieldResp).contains("\"fromtype\":1"));
        Assertions.assertTrue(JsonUtil.toJson(truckInfoAndCustomFieldResp).contains("\"fromorgcode\":\"201IHA0N02\""));
        Assertions.assertTrue(JsonUtil.toJson(truckInfoAndCustomFieldResp).contains("\"gpsno\":71025437"));
        Assertions.assertTrue(JsonUtil.toJson(truckInfoAndCustomFieldResp).contains("\"isfactory\":0"));
        Assertions.assertTrue(JsonUtil.toJson(truckInfoAndCustomFieldResp).contains("\"isheadstock\":1"));
        Assertions.assertTrue(JsonUtil.toJson(truckInfoAndCustomFieldResp).contains("\"lockstatus\":0"));

    }

    /**
     * 接口描述：查询车辆详情接口 /v1/base/truck/truckinfo_include_custom_fields
     * 测试传入必填参数
     *  select * from user where id=29  orgcode 201IHA  orgname 漯河双汇物流投资有限公司1
     * @throws Exception
     */
    @Test
    public void withRequiredParam2() throws Exception {
        //初始化
        // 创建请求bean
        RestTemplate restTemplate = new RestTemplateBuilder().build();
        IRequest request = new RestTemplateRequest(restTemplate);
        // 创建开放平台接口客户端
        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(url, "xsk8vj", "aUwDAkBf8mvr8YKX7GTqIszvpCeBoY4F", request);
        TruckInfoCustomReq req = new TruckInfoCustomReq();
        req.setOrgcodeLike("201IHA");
        req.setGpsnos("71025437");
//        req.setOwnIds("743332A469534979C03493838349CDEC");
//        req.setGetCustomFields("1");
        TruckInfoAndCustomFieldResp truckInfoAndCustomFieldResp = g7OpenapiClient.truckInfoAndCustomField(req);
        log.info("rsp:{}", JsonUtil.toJson(truckInfoAndCustomFieldResp));
        Assert.assertNotNull(truckInfoAndCustomFieldResp);

        Assertions.assertTrue(JsonUtil.toJson(truckInfoAndCustomFieldResp).contains("\"carnum\":\"鄂FW3N36\""));
        Assertions.assertTrue(JsonUtil.toJson(truckInfoAndCustomFieldResp).contains("\"deleted\":0"));
        Assertions.assertTrue(JsonUtil.toJson(truckInfoAndCustomFieldResp).contains("\"orgcode\":\"201IHA0N02\""));
        Assertions.assertTrue(JsonUtil.toJson(truckInfoAndCustomFieldResp).contains("\"truckid\":\"7B49E76556C25847D47CBD345FDB5092\""));
        Assertions.assertTrue(JsonUtil.toJson(truckInfoAndCustomFieldResp).contains("\"ownid\":\"743332A469534979C03493838349CDEC\""));
        Assertions.assertTrue(JsonUtil.toJson(truckInfoAndCustomFieldResp).contains("\"fromtype\":1"));
        Assertions.assertTrue(JsonUtil.toJson(truckInfoAndCustomFieldResp).contains("\"fromorgcode\":\"201IHA0N02\""));
        Assertions.assertTrue(JsonUtil.toJson(truckInfoAndCustomFieldResp).contains("\"gpsno\":71025437"));
        Assertions.assertTrue(JsonUtil.toJson(truckInfoAndCustomFieldResp).contains("\"isfactory\":0"));
        Assertions.assertTrue(JsonUtil.toJson(truckInfoAndCustomFieldResp).contains("\"isheadstock\":1"));
        Assertions.assertTrue(JsonUtil.toJson(truckInfoAndCustomFieldResp).contains("\"lockstatus\":0"));

    }


    /**
     * 接口描述：查询车辆详情接口 /v1/base/truck/truckinfo_include_custom_fields
     * 测试传入必填参数
     *  select * from user where id=29  orgcode 201IHA  orgname 漯河双汇物流投资有限公司1
     * @throws Exception
     */
    @Test
    public void withRequiredParam3() throws Exception {
        //初始化
        // 创建请求bean
        RestTemplate restTemplate = new RestTemplateBuilder().build();
        IRequest request = new RestTemplateRequest(restTemplate);
        // 创建开放平台接口客户端
        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(url, "xsk8vj", "aUwDAkBf8mvr8YKX7GTqIszvpCeBoY4F", request);
        TruckInfoCustomReq req = new TruckInfoCustomReq();
        req.setOrgcodeLike("201IHA");
        req.setCarNums("鄂FW3N36");
//        req.setOwnIds("743332A469534979C03493838349CDEC");
//        req.setGetCustomFields("1");
        TruckInfoAndCustomFieldResp truckInfoAndCustomFieldResp = g7OpenapiClient.truckInfoAndCustomField(req);
        log.info("rsp:{}", JsonUtil.toJson(truckInfoAndCustomFieldResp));
        Assert.assertNotNull(truckInfoAndCustomFieldResp);

        Assertions.assertTrue(JsonUtil.toJson(truckInfoAndCustomFieldResp).contains("\"carnum\":\"鄂FW3N36\""));
        Assertions.assertTrue(JsonUtil.toJson(truckInfoAndCustomFieldResp).contains("\"deleted\":0"));
        Assertions.assertTrue(JsonUtil.toJson(truckInfoAndCustomFieldResp).contains("\"orgcode\":\"201IHA0N02\""));
        Assertions.assertTrue(JsonUtil.toJson(truckInfoAndCustomFieldResp).contains("\"truckid\":\"7B49E76556C25847D47CBD345FDB5092\""));
        Assertions.assertTrue(JsonUtil.toJson(truckInfoAndCustomFieldResp).contains("\"ownid\":\"743332A469534979C03493838349CDEC\""));
        Assertions.assertTrue(JsonUtil.toJson(truckInfoAndCustomFieldResp).contains("\"fromtype\":1"));
        Assertions.assertTrue(JsonUtil.toJson(truckInfoAndCustomFieldResp).contains("\"fromorgcode\":\"201IHA0N02\""));
        Assertions.assertTrue(JsonUtil.toJson(truckInfoAndCustomFieldResp).contains("\"gpsno\":71025437"));
        Assertions.assertTrue(JsonUtil.toJson(truckInfoAndCustomFieldResp).contains("\"isfactory\":0"));
        Assertions.assertTrue(JsonUtil.toJson(truckInfoAndCustomFieldResp).contains("\"isheadstock\":1"));
        Assertions.assertTrue(JsonUtil.toJson(truckInfoAndCustomFieldResp).contains("\"lockstatus\":0"));

    }
    /**
     * 接口描述：查询车辆详情接口 /v1/base/truck/truckinfo_include_custom_fields
     * 测试传入必填参数
     *  select * from user where id=29  orgcode 201IHA  orgname 漯河双汇物流投资有限公司1
     * @throws Exception
     */
    @Test
    public void withRequiredParam4() throws Exception {
        //初始化
        // 创建请求bean
        RestTemplate restTemplate = new RestTemplateBuilder().build();
        IRequest request = new RestTemplateRequest(restTemplate);
        // 创建开放平台接口客户端
        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(url, "xsk8vj", "aUwDAkBf8mvr8YKX7GTqIszvpCeBoY4F", request);
        TruckInfoCustomReq req = new TruckInfoCustomReq();
        req.setOrgcodeLike("201IHA");
        req.setOwnIds("743332A469534979C03493838349CDEC");
//        req.setOwnIds("743332A469534979C03493838349CDEC");
//        req.setGetCustomFields("1");
        TruckInfoAndCustomFieldResp truckInfoAndCustomFieldResp = g7OpenapiClient.truckInfoAndCustomField(req);
        log.info("rsp:{}", JsonUtil.toJson(truckInfoAndCustomFieldResp));
        Assert.assertNotNull(truckInfoAndCustomFieldResp);

        Assertions.assertTrue(JsonUtil.toJson(truckInfoAndCustomFieldResp).contains("\"carnum\":\"鄂FW3N36\""));
        Assertions.assertTrue(JsonUtil.toJson(truckInfoAndCustomFieldResp).contains("\"deleted\":0"));
        Assertions.assertTrue(JsonUtil.toJson(truckInfoAndCustomFieldResp).contains("\"orgcode\":\"201IHA0N02\""));
        Assertions.assertTrue(JsonUtil.toJson(truckInfoAndCustomFieldResp).contains("\"truckid\":\"7B49E76556C25847D47CBD345FDB5092\""));
        Assertions.assertTrue(JsonUtil.toJson(truckInfoAndCustomFieldResp).contains("\"ownid\":\"743332A469534979C03493838349CDEC\""));
        Assertions.assertTrue(JsonUtil.toJson(truckInfoAndCustomFieldResp).contains("\"fromtype\":1"));
        Assertions.assertTrue(JsonUtil.toJson(truckInfoAndCustomFieldResp).contains("\"fromorgcode\":\"201IHA0N02\""));
        Assertions.assertTrue(JsonUtil.toJson(truckInfoAndCustomFieldResp).contains("\"gpsno\":71025437"));
        Assertions.assertTrue(JsonUtil.toJson(truckInfoAndCustomFieldResp).contains("\"isfactory\":0"));
        Assertions.assertTrue(JsonUtil.toJson(truckInfoAndCustomFieldResp).contains("\"isheadstock\":1"));
        Assertions.assertTrue(JsonUtil.toJson(truckInfoAndCustomFieldResp).contains("\"lockstatus\":0"));

    }

    /**
     * 接口描述：查询车辆详情接口 /v1/base/truck/truckinfo_include_custom_fields
     * 测试传入所有参数，包含传入 setGet_count，返回 满足条件数量 total
     *
     * @throws Exception
     */
    @Test
    public void withAllParam1() throws Exception {
        RestTemplate restTemplate = new RestTemplateBuilder().build();
        IRequest request = new RestTemplateRequest(restTemplate);
        // 创建开放平台接口客户端
        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(url, "xsk8vj", "aUwDAkBf8mvr8YKX7GTqIszvpCeBoY4F", request);
        TruckInfoCustomReq req = new TruckInfoCustomReq();
        req.setTruckIds("7B49E76556C25847D47CBD345FDB5092");
        req.setOwnIds("743332A469534979C03493838349CDEC");
        req.setCarNums("鄂FW3N36");
        req.setGpsnos("71025437");
        req.setOrgcodeLike("201IHA");
        req.setGetCustomFields("1");

//        req.setOwnIds("743332A469534979C03493838349CDEC");
//        req.setGetCustomFields("1");
        TruckInfoAndCustomFieldResp truckInfoAndCustomFieldResp = g7OpenapiClient.truckInfoAndCustomField(req);
        log.info("rsp:{}", JsonUtil.toJson(truckInfoAndCustomFieldResp));
        Assert.assertNotNull(truckInfoAndCustomFieldResp);

        Assertions.assertTrue(JsonUtil.toJson(truckInfoAndCustomFieldResp).contains("\"carnum\":\"鄂FW3N36\""));
        Assertions.assertTrue(JsonUtil.toJson(truckInfoAndCustomFieldResp).contains("\"deleted\":0"));
        Assertions.assertTrue(JsonUtil.toJson(truckInfoAndCustomFieldResp).contains("\"orgcode\":\"201IHA0N02\""));
        Assertions.assertTrue(JsonUtil.toJson(truckInfoAndCustomFieldResp).contains("\"truckid\":\"7B49E76556C25847D47CBD345FDB5092\""));
        Assertions.assertTrue(JsonUtil.toJson(truckInfoAndCustomFieldResp).contains("\"ownid\":\"743332A469534979C03493838349CDEC\""));
        Assertions.assertTrue(JsonUtil.toJson(truckInfoAndCustomFieldResp).contains("\"fromtype\":1"));
        Assertions.assertTrue(JsonUtil.toJson(truckInfoAndCustomFieldResp).contains("\"fromorgcode\":\"201IHA0N02\""));
        Assertions.assertTrue(JsonUtil.toJson(truckInfoAndCustomFieldResp).contains("\"gpsno\":71025437"));
        Assertions.assertTrue(JsonUtil.toJson(truckInfoAndCustomFieldResp).contains("\"isfactory\":0"));
        Assertions.assertTrue(JsonUtil.toJson(truckInfoAndCustomFieldResp).contains("\"isheadstock\":1"));
        Assertions.assertTrue(JsonUtil.toJson(truckInfoAndCustomFieldResp).contains("\"lockstatus\":0"));
    }
    /**
     * 接口描述：查询车辆详情接口 /v1/base/truck/truckinfo_include_custom_fields
     * 测试传入所有参数
     *
     * @throws Exception
     */
    @Test
    public void withAllParamcustom_fields0() throws Exception {
        RestTemplate restTemplate = new RestTemplateBuilder().build();
        IRequest request = new RestTemplateRequest(restTemplate);
        // 创建开放平台接口客户端
        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(url, "xsk8vj", "aUwDAkBf8mvr8YKX7GTqIszvpCeBoY4F", request);
        TruckInfoCustomReq req = new TruckInfoCustomReq();
        req.setTruckIds("7B49E76556C25847D47CBD345FDB5092");
        req.setOwnIds("743332A469534979C03493838349CDEC");
        req.setCarNums("鄂FW3N36");
        req.setGpsnos("71025437");
        req.setOrgcodeLike("201IHA");
        req.setGetCustomFields("0");

        TruckInfoAndCustomFieldResp truckInfoAndCustomFieldResp = g7OpenapiClient.truckInfoAndCustomField(req);
        log.info("rsp:{}", JsonUtil.toJson(truckInfoAndCustomFieldResp));
        Assert.assertNotNull(truckInfoAndCustomFieldResp);

        Assertions.assertTrue(JsonUtil.toJson(truckInfoAndCustomFieldResp).contains("\"carnum\":\"鄂FW3N36\""));
        Assertions.assertTrue(JsonUtil.toJson(truckInfoAndCustomFieldResp).contains("\"deleted\":0"));
        Assertions.assertTrue(JsonUtil.toJson(truckInfoAndCustomFieldResp).contains("\"orgcode\":\"201IHA0N02\""));
        Assertions.assertTrue(JsonUtil.toJson(truckInfoAndCustomFieldResp).contains("\"truckid\":\"7B49E76556C25847D47CBD345FDB5092\""));
        Assertions.assertTrue(JsonUtil.toJson(truckInfoAndCustomFieldResp).contains("\"ownid\":\"743332A469534979C03493838349CDEC\""));
        Assertions.assertTrue(JsonUtil.toJson(truckInfoAndCustomFieldResp).contains("\"fromtype\":1"));
        Assertions.assertTrue(JsonUtil.toJson(truckInfoAndCustomFieldResp).contains("\"fromorgcode\":\"201IHA0N02\""));
        Assertions.assertTrue(JsonUtil.toJson(truckInfoAndCustomFieldResp).contains("\"gpsno\":71025437"));
        Assertions.assertTrue(JsonUtil.toJson(truckInfoAndCustomFieldResp).contains("\"isfactory\":0"));
        Assertions.assertTrue(JsonUtil.toJson(truckInfoAndCustomFieldResp).contains("\"isheadstock\":1"));
        Assertions.assertTrue(JsonUtil.toJson(truckInfoAndCustomFieldResp).contains("\"lockstatus\":0"));
    }


    /**
     * 接口描述：查询车辆详情接口 /v1/base/truck/truckinfo_include_custom_fields
     * 测试传入所有参数，传入 Truck_id 不对的数据7B49E76556C25847D47CBD345FDB5092222
     *
     * @throws Exception
     */
    @Test
    public void withAllParamOnErrorTruck_id() throws Exception {
        RestTemplate restTemplate = new RestTemplateBuilder().build();
        IRequest request = new RestTemplateRequest(restTemplate);
        // 创建开放平台接口客户端
        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(url, "xsk8vj", "aUwDAkBf8mvr8YKX7GTqIszvpCeBoY4F", request);
        TruckInfoCustomReq req = new TruckInfoCustomReq();
        req.setTruckIds("7B49E76556C25847D47CBD345FDB5092222");
        req.setOwnIds("743332A469534979C03493838349CDEC");
        req.setCarNums("鄂FW3N36");
        req.setGpsnos("71025437");
        req.setOrgcodeLike("201IHA");
        req.setGetCustomFields("1");

//        req.setOwnIds("743332A469534979C03493838349CDEC");
//        req.setGetCustomFields("1");
        TruckInfoAndCustomFieldResp truckInfoAndCustomFieldResp = g7OpenapiClient.truckInfoAndCustomField(req);
        log.info("rsp:{}", JsonUtil.toJson(truckInfoAndCustomFieldResp));
        Assertions.assertTrue(JsonUtil.toJson(truckInfoAndCustomFieldResp).contains("\"truckinfo\":[]"));
    }

    /**
     * 接口描述：查询车辆详情接口 /v1/base/truck/truckinfo_include_custom_fields
     * 测试传入所有参数，传入 Truck_id 不对的数据7B49E76556C25847D47CBD345FDB5092222
     *
     * @throws Exception
     */
    @Test
    public void withAllParamOnmore() throws Exception {
        RestTemplate restTemplate = new RestTemplateBuilder().build();
        IRequest request = new RestTemplateRequest(restTemplate);
        // 创建开放平台接口客户端
        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(url, "xsk8vj", "aUwDAkBf8mvr8YKX7GTqIszvpCeBoY4F", request);
        TruckInfoCustomReq req = new TruckInfoCustomReq();
        req.setTruckIds("3FD62FCBD781FA37FB68FCB8FA6D7B74,1EA9235CAD016D140CCD58F24EE22051,4814A14CA8403DAC674483F32326EF12,7B49E76556C25847D47CBD345FDB5092");
        req.setOwnIds("036EC4A4D7ADA1B03ED0660BF58A20ED,743332A469534979C03493838349CDEC,E1E76B2F66BB6E2489883E4EA70FEF06,A15C9391693D0570B097BED81E66E4FD");
        req.setCarNums("鄂FW3N36,豫AN1830,吉AW2266,吉AP4005");
        req.setGpsnos("71025437,71015297,0,71015303");
        req.setOrgcodeLike("201IHA");
//        req.setGetCustomFields("1");

//        req.setOwnIds("743332A469534979C03493838349CDEC");
//        req.setGetCustomFields("1");
        TruckInfoAndCustomFieldResp truckInfoAndCustomFieldResp = g7OpenapiClient.truckInfoAndCustomField(req);
        log.info("rsp:{}", JsonUtil.toJson(truckInfoAndCustomFieldResp));
//        Assertions.assertTrue(JsonUtil.toJson(truckInfoAndCustomFieldResp).contains("\"carnum\":\"鄂FW3N36\""));
        Assertions.assertTrue(JsonUtil.toJson(truckInfoAndCustomFieldResp).contains("\"carnum\":\"豫AN1830\""));
        Assertions.assertTrue(JsonUtil.toJson(truckInfoAndCustomFieldResp).contains("\"carnum\":\"吉AW2266\""));
        Assertions.assertTrue(JsonUtil.toJson(truckInfoAndCustomFieldResp).contains("\"carnum\":\"吉AP4005\""));
    }

    /**
     * 接口描述：查询车辆详情接口 /v1/base/truck/truckinfo_include_custom_fields
     * 测试传入所有参数，传入 Truck_id 不对的数据7B49E76556C25847D47CBD345FDB5092222
     *
     * @throws Exception
     */
    @Test
    public void withParamHasTruckmodelid() throws Exception {
        RestTemplate restTemplate = new RestTemplateBuilder().build();
        IRequest request = new RestTemplateRequest(restTemplate);
        // 创建开放平台接口客户端
        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(url, "ulpb2o", "ZOTxxKh11V8KtkSwwJXLfGkpLxni64Wo", request);
        TruckInfoCustomReq req = new TruckInfoCustomReq();
        req.setTruckIds("C91D1B9A68BD0F851041A6938B5730FD");
        req.setOrgcodeLike("201Z7C");

        TruckInfoAndCustomFieldResp truckInfoAndCustomFieldResp = g7OpenapiClient.truckInfoAndCustomField(req);
        log.info("rsp:{}", JsonUtil.toJson(truckInfoAndCustomFieldResp));
        Assertions.assertTrue(JsonUtil.toJson(truckInfoAndCustomFieldResp).contains("\"truckmodelid\":\"be80f1a8d64e1855893bfe1fb1306fcb\""));
    }
    /**
     * 接口描述：查询车辆详情接口 /v1/base/truck/truckinfo_include_custom_fields
     * 测试传 返回 "maindriver_id":"775D958E1F3D80461816136702F03140" 字段检查正确
     *
     * @throws Exception
     */
    @Test
    public void withParamHasmaindriver_id() throws Exception {
        RestTemplate restTemplate = new RestTemplateBuilder().build();
        IRequest request = new RestTemplateRequest(restTemplate);
        // 创建开放平台接口客户端
        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(url, "ulpb2o", "ZOTxxKh11V8KtkSwwJXLfGkpLxni64Wo", request);
        TruckInfoCustomReq req = new TruckInfoCustomReq();
        req.setTruckIds("7A7BBC8D3FDF155DD704B9BD8FA834B7");
        req.setOrgcodeLike("201Z7C");

        TruckInfoAndCustomFieldResp truckInfoAndCustomFieldResp = g7OpenapiClient.truckInfoAndCustomField(req);
        log.info("rsp:{}", JsonUtil.toJson(truckInfoAndCustomFieldResp));
        Assertions.assertTrue(JsonUtil.toJson(truckInfoAndCustomFieldResp).contains("\"maindriver_id\":\"775D958E1F3D80461816136702F03140\""));
    }

    /**
     * 接口描述：查询车辆详情接口 /v1/base/truck/truckinfo_include_custom_fields
     * 测试传 返回 "maindriver_id":"775D958E1F3D80461816136702F03140" 字段检查正确
     *
     * @throws Exception
     */
    @Test
    public void withParamHasdepdriver_id() throws Exception {
        RestTemplate restTemplate = new RestTemplateBuilder().build();
        IRequest request = new RestTemplateRequest(restTemplate);
        // 创建开放平台接口客户端
        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(url, "xsk8vj", "aUwDAkBf8mvr8YKX7GTqIszvpCeBoY4F", request);
        TruckInfoCustomReq req = new TruckInfoCustomReq();
        req.setTruckIds("92422D0D4808636ED252CEA3DE1D7138");
        req.setOrgcodeLike("201IHA");

        TruckInfoAndCustomFieldResp truckInfoAndCustomFieldResp = g7OpenapiClient.truckInfoAndCustomField(req);
        log.info("rsp:{}", JsonUtil.toJson(truckInfoAndCustomFieldResp));
        Assertions.assertTrue(JsonUtil.toJson(truckInfoAndCustomFieldResp).contains("\"depdriver_id\":\"A5544B59F4B0FD2B7DD52DE785C505D8\""));
    }





    /**
     * 接口描述：查询车辆详情接口 /v1/base/truck/truckinfo_include_custom_fields
     * 测试传入所有参数，传入空值
     *
     * @throws Exception
     */
    @Test
    public void testNullParamOrgcode_like() throws Exception {
        RestTemplate restTemplate = new RestTemplateBuilder().build();
        IRequest request = new RestTemplateRequest(restTemplate);
        // 创建开放平台接口客户端
        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(url, "xsk8vj", "aUwDAkBf8mvr8YKX7GTqIszvpCeBoY4F", request);
        TruckInfoCustomReq req = new TruckInfoCustomReq();
        req.setTruckIds("7B49E76556C25847D47CBD345FDB5092");
        req.setOwnIds("743332A469534979C03493838349CDEC");
        req.setCarNums("鄂FW3N36");
        req.setGpsnos("71025437");
        req.setOrgcodeLike("");
        req.setGetCustomFields("1");

        try{
            TruckInfoAndCustomFieldResp truckInfoAndCustomFieldResp = g7OpenapiClient.truckInfoAndCustomField(req);
            log.info("rsp:{}", JsonUtil.toJson(truckInfoAndCustomFieldResp));
            Assert.assertNotNull(truckInfoAndCustomFieldResp);


        }catch (G7OpenapiException e){
            Assertions.assertTrue(e.getMessage().contains("参数长度小于预期值orgcode_like"));
        }
    }

    /**
     * 接口描述：查询车辆详情接口 /v1/base/truck/truckinfo_include_custom_fields
     * 测试传入所有参数，传入空值
     *
     * @throws Exception
     */
    @Test
    public void testNullParamTruck_ids() throws Exception {
        RestTemplate restTemplate = new RestTemplateBuilder().build();
        IRequest request = new RestTemplateRequest(restTemplate);
        // 创建开放平台接口客户端
        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(url, "xsk8vj", "aUwDAkBf8mvr8YKX7GTqIszvpCeBoY4F", request);
        TruckInfoCustomReq req = new TruckInfoCustomReq();
        req.setTruckIds("");
//        req.setTruckIds("7B49E76556C25847D47CBD345FDB5092");
//        req.setOwnIds("743332A469534979C03493838349CDEC");
//        req.setCarNums("鄂FW3N36");
//        req.setGpsnos("71025437");
        req.setOrgcodeLike("201IHA");
        req.setGetCustomFields("1");

        try{
            TruckInfoAndCustomFieldResp truckInfoAndCustomFieldResp = g7OpenapiClient.truckInfoAndCustomField(req);
            log.info("rsp:{}", JsonUtil.toJson(truckInfoAndCustomFieldResp));
            Assertions.fail("没有检查参数缺失");

        }catch (G7OpenapiException e){
            Assertions.assertTrue(e.getMessage().contains("参数缺失truck_ids/own_ids/carnums/gpsnos"));
        }
    }
    /**
     * 接口描述：查询车辆详情接口 /v1/base/truck/truckinfo_include_custom_fields
     * 测试传入所有参数，传入空值
     *
     * @throws Exception
     */
    @Test
    public void testNullParamOwn_ids() throws Exception {
        RestTemplate restTemplate = new RestTemplateBuilder().build();
        IRequest request = new RestTemplateRequest(restTemplate);
        // 创建开放平台接口客户端
        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(url, "xsk8vj", "aUwDAkBf8mvr8YKX7GTqIszvpCeBoY4F", request);
        TruckInfoCustomReq req = new TruckInfoCustomReq();
        req.setOwnIds("");
//        req.setTruckIds("7B49E76556C25847D47CBD345FDB5092");
//        req.setOwnIds("743332A469534979C03493838349CDEC");
//        req.setCarNums("鄂FW3N36");
//        req.setGpsnos("71025437");
        req.setOrgcodeLike("201IHA");
        req.setGetCustomFields("1");

        try{
            TruckInfoAndCustomFieldResp truckInfoAndCustomFieldResp = g7OpenapiClient.truckInfoAndCustomField(req);
            log.info("rsp:{}", JsonUtil.toJson(truckInfoAndCustomFieldResp));
            Assertions.fail("没有检查参数缺失");

        }catch (G7OpenapiException e){
            Assertions.assertTrue(e.getMessage().contains("参数缺失truck_ids/own_ids/carnums/gpsnos"));
        }
    }

    /**
     * 接口描述：查询车辆详情接口 /v1/base/truck/truckinfo_include_custom_fields
     * 测试传入所有参数，传入空值
     *
     * @throws Exception
     */
    @Test
    public void testNullParamCarnums() throws Exception {
        RestTemplate restTemplate = new RestTemplateBuilder().build();
        IRequest request = new RestTemplateRequest(restTemplate);
        // 创建开放平台接口客户端
        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(url, "xsk8vj", "aUwDAkBf8mvr8YKX7GTqIszvpCeBoY4F", request);
        TruckInfoCustomReq req = new TruckInfoCustomReq();
        req.setCarNums("");
//        req.setTruckIds("7B49E76556C25847D47CBD345FDB5092");
//        req.setOwnIds("743332A469534979C03493838349CDEC");
//        req.setCarNums("鄂FW3N36");
//        req.setGpsnos("71025437");
        req.setOrgcodeLike("201IHA");
        req.setGetCustomFields("1");

        try{
            TruckInfoAndCustomFieldResp truckInfoAndCustomFieldResp = g7OpenapiClient.truckInfoAndCustomField(req);
            log.info("rsp:{}", JsonUtil.toJson(truckInfoAndCustomFieldResp));
            Assertions.fail("没有检查参数缺失");

        }catch (G7OpenapiException e){
            Assertions.assertTrue(e.getMessage().contains("参数缺失truck_ids/own_ids/carnums/gpsnos"));
        }
    }

    /**
     * 接口描述：查询车辆详情接口 /v1/base/truck/truckinfo_include_custom_fields
     * 测试传入所有参数，传入空值
     *
     * @throws Exception
     */
    @Test
    public void testNullParamGpsnos() throws Exception {
        RestTemplate restTemplate = new RestTemplateBuilder().build();
        IRequest request = new RestTemplateRequest(restTemplate);
        // 创建开放平台接口客户端
        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(url, "xsk8vj", "aUwDAkBf8mvr8YKX7GTqIszvpCeBoY4F", request);
        TruckInfoCustomReq req = new TruckInfoCustomReq();
        req.setGpsnos("");
//        req.setTruckIds("7B49E76556C25847D47CBD345FDB5092");
//        req.setOwnIds("743332A469534979C03493838349CDEC");
//        req.setCarNums("鄂FW3N36");
//        req.setGpsnos("71025437");
        req.setOrgcodeLike("201IHA");
        req.setGetCustomFields("1");

        try{
            TruckInfoAndCustomFieldResp truckInfoAndCustomFieldResp = g7OpenapiClient.truckInfoAndCustomField(req);
            log.info("rsp:{}", JsonUtil.toJson(truckInfoAndCustomFieldResp));
            Assertions.fail("没有检查参数缺失");

        }catch (G7OpenapiException e){
            Assertions.assertTrue(e.getMessage().contains("参数缺失truck_ids/own_ids/carnums/gpsnos"));
        }
    }

    /**
     * 接口描述：查询车辆详情接口 /v1/base/truck/truckinfo_include_custom_fields
     * 测试 不传入参数， 返回了100个车??? ,没有必填的校验??
     *
     * @throws Exception
     */
    @Test
    public void testNoParam() throws Exception {
        RestTemplate restTemplate = new RestTemplateBuilder().build();
        IRequest request = new RestTemplateRequest(restTemplate);
        // 创建开放平台接口客户端
        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(url, "xsk8vj", "aUwDAkBf8mvr8YKX7GTqIszvpCeBoY4F", request);
        TruckInfoCustomReq req = new TruckInfoCustomReq();

        try{
            TruckInfoAndCustomFieldResp truckInfoAndCustomFieldResp = g7OpenapiClient.truckInfoAndCustomField(req);
            log.info("rsp:{}", JsonUtil.toJson(truckInfoAndCustomFieldResp));
            Assertions.fail("没有检查参数缺失");

        }catch (G7OpenapiException e){
            Assertions.assertTrue(e.getMessage().contains("参数缺失truck_ids/own_ids/carnums/gpsnos"));
        }
    }


    /**
     * 接口描述：查询车辆详情接口 /v1/base/truck/truckinfo_include_custom_fields
     * Testcasename:测试传入超长参数
     *
     * @throws Exception
     */
    @Test
    public void testBigParam() throws Exception {
        RestTemplate restTemplate = new RestTemplateBuilder().build();
        IRequest request = new RestTemplateRequest(restTemplate);
        // 创建开放平台接口客户端
        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(url, "xsk8vj", "aUwDAkBf8mvr8YKX7GTqIszvpCeBoY4F", request);
        TruckInfoCustomReq req = new TruckInfoCustomReq();
        req.setTruckIds("12373B16EA12373B16EA9BA45112373B16EA9BA45127938A317B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50929E6F42D412373B16EA9BA45127938A317B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50929E6F42D412373B16EA9BA45127938A317B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50929E6F42D412373B16EA9BA45127938A317B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50929E6F42D427938A317B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50929E6F42D412373B16EA9BA45112373B16EA9BA45127938A317B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50929E6F42D412373B16EA9BA45127938A317B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50929E6F42D412373B16EA9BA45127938A317B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50929E6F42D412373B16EA9BA45127938A317B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50929E6F42D427938A317B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50929E6F42D412373B16EA9BA45112373B16EA9BA45127938A317B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50929E6F42D412373B16EA9BA45127938A317B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50929E6F42D412373B16EA9BA45127938A317B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50929E6F42D412373B16EA9BA45127938A317B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50929E6F42D427938A317B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50929E6F42D412373B16EA9BA45112373B16EA9BA45127938A317B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50929E6F42D412373B16EA9BA45127938A317B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50929E6F42D412373B16EA9BA45127938A317B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50929E6F42D412373B16EA9BA45127938A317B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50929E6F42D427938A317B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50929E6F42D412373B16EA9BA45112373B16EA9BA45127938A317B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50929E6F42D412373B16EA9BA45127938A317B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50929E6F42D412373B16EA9BA45127938A317B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50929E6F42D412373B16EA9BA45127938A317B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50929E6F42D427938A317B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50929E6F42D49BA45112373B16EA9BA45127938A317B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50929E6F42D412373B16EA9BA45127938A317B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50929E6F42D412373B16EA9BA45127938A317B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50929E6F42D412373B16EA9BA45127938A317B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50929E6F42D427938A317B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50929E6F42D4");
        req.setOwnIds("FF0706F072AD743332A469534979C03493838349CDEC743332A469534979C03493838349CDEC743332A469534979C03493838349CDEC743332A469534979C03493838349CDEC743332A469534979C03493838349CDEC743332A469534979C03493838349CDEC743332A469534979C03493838349CDEC743332A469534979C03493838349CDEC743332A469534979C03493838349CDEC743332A469534979C03493838349CDEC9444265B416C9AE62456");
        req.setCarNums("FF0706F072AD743332A469534979C03493838349CDEC743332A469534979C03493838349CDEC743332A469534979C03493838349CDEC743332A469534979C03493838349CDEC743332A469534979C03493838349CDEC743332A469534979C03493838349CDEC743332A469534979C03493838349CDEC743332A469534979C03493838349CDEC743332A469534979C03493838349CDEC743332A469534979C03493838349CDEC9444265B416C9AE62456");
        req.setGpsnos("FF0706F072AD743332A469534979C03493838349CDEC743332A469534979C03493838349CDEC743332A469534979C03493838349CDEC743332A469534979C03493838349CDEC743332A469534979C03493838349CDEC743332A469534979C03493838349CDEC743332A469534979C03493838349CDEC743332A469534979C03493838349CDEC743332A469534979C03493838349CDEC743332A469534979C03493838349CDEC9444265B416C9AE62456");
        req.setOrgcodeLike("201IHA");
        req.setGetCustomFields("1");


            TruckInfoAndCustomFieldResp truckInfoAndCustomFieldResp = g7OpenapiClient.truckInfoAndCustomField(req);
            log.info("rsp:{}", JsonUtil.toJson(truckInfoAndCustomFieldResp));
//            Assertions.fail("没有检查参数缺失");
        Assertions.assertTrue(JsonUtil.toJson(truckInfoAndCustomFieldResp).contains("\"truckinfo\":[]"));

    }

    /**
     * 接口描述：查询车辆详情接口 /v1/base/truck/truckinfo_include_custom_fields
     * Testcasename:测试传入超长参数
     *
     * @throws Exception
     */
    @Test
    public void testAbnormalcharacterParam() throws Exception {
        RestTemplate restTemplate = new RestTemplateBuilder().build();
        IRequest request = new RestTemplateRequest(restTemplate);
        // 创建开放平台接口客户端
        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(url, "xsk8vj", "aUwDAkBf8mvr8YKX7GTqIszvpCeBoY4F", request);
        TruckInfoCustomReq req = new TruckInfoCustomReq();
        req.setTruckIds("鄂FW3N32！@#￥%！+_))9@……&*（鄂FW3N3226");
        req.setOrgcodeLike("201IHA");
        req.setGetCustomFields("1");


        TruckInfoAndCustomFieldResp truckInfoAndCustomFieldResp = g7OpenapiClient.truckInfoAndCustomField(req);
        log.info("rsp:{}", JsonUtil.toJson(truckInfoAndCustomFieldResp));
//            Assertions.fail("没有检查参数缺失");
        Assertions.assertTrue(JsonUtil.toJson(truckInfoAndCustomFieldResp).contains("\"truckinfo\":[]"));
    }

    /**
     * 接口描述：查询车辆详情接口 /v1/base/truck/truckinfo_include_custom_fields
     * 测试 Carnum_like 不属于这个机构
     *
     * @throws Exception
     */
    @Test
    public void OnOtherWithCarnum_like() throws Exception {

        RestTemplate restTemplate = new RestTemplateBuilder().build();
        IRequest request = new RestTemplateRequest(restTemplate);
        // 创建开放平台接口客户端
        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(url, "xsk8vj", "aUwDAkBf8mvr8YKX7GTqIszvpCeBoY4F", request);
        TruckInfoCustomReq req = new TruckInfoCustomReq();
        req.setCarNums("鲁S32207");
        req.setOrgcodeLike("201IHA");
        req.setGetCustomFields("1");


        TruckInfoAndCustomFieldResp truckInfoAndCustomFieldResp = g7OpenapiClient.truckInfoAndCustomField(req);
        log.info("rsp:{}", JsonUtil.toJson(truckInfoAndCustomFieldResp));
//            Assertions.fail("没有检查参数缺失");
        Assertions.assertTrue(JsonUtil.toJson(truckInfoAndCustomFieldResp).contains("\"truckinfo\":[]"));


    }

    /**
     * 接口描述：查询车辆详情接口 /v1/base/truck/truckinfo_include_custom_fields
     * 测试 用其他正确的机构号，来查询车辆 不属于这个机构access_id kjfqvl
     * kjfqvl 机构账号 select * from user where id= 22  Orgcode 20005J
     * @throws Exception
     */
    @Test
    public void OnOtherWithOrgcode_like() throws Exception {

        RestTemplate restTemplate = new RestTemplateBuilder().build();
        IRequest request = new RestTemplateRequest(restTemplate);
        // 创建开放平台接口客户端
        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(url, "kjfqvl", "BgwKabK223GEbKqwQIZvbf6Upq3R51Ge", request);
        TruckInfoCustomReq req = new TruckInfoCustomReq();
        req.setCarNums("鲁S32207");
        req.setOrgcodeLike("201IHA");
        req.setGetCustomFields("1");

        try{
            TruckInfoAndCustomFieldResp truckInfoAndCustomFieldResp = g7OpenapiClient.truckInfoAndCustomField(req);
            log.info("rsp:{}", JsonUtil.toJson(truckInfoAndCustomFieldResp));
            //校验返回值
            Assertions.assertNull(truckInfoAndCustomFieldResp);
            Assertions.fail("居然没有限制权限");
        }catch (G7OpenapiException e){
            Assertions.assertTrue(e.getMessage().contains("无权操作数据"));
        }
    }

}
