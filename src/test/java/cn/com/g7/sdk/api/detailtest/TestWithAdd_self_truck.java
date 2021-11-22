package cn.com.g7.sdk.api.detailtest;

import cn.com.g7.sdk.api.G7OpenapiClient;
import cn.com.g7.sdk.api.enums.TruckHeadStockEnum;
import cn.com.g7.sdk.api.G7OpenapiException;
import cn.com.g7.sdk.api.request.IRequest;
import cn.com.g7.sdk.api.request.impl.RestTemplateRequest;
import cn.com.g7.sdk.api.util.JsonUtil;
import cn.com.g7.sdk.api.vo.SelfTruckAddReq;
import cn.com.g7.sdk.api.vo.SelfTruckAddResp;
import cn.com.g7.sdk.api.vo.TruckDeleteReq;
import cn.com.g7.sdk.api.vo.TruckDeleteResp;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

/**
 * 单元测试
 * 接口描述：增加车辆 接口 /v1/base/truck/add_self_truck
 * @author sunzhiping
 * @date 2021-10-12
 */

public class TestWithAdd_self_truck {
    private final Logger log = LoggerFactory.getLogger(TestWithAdd_self_truck.class);
    // 由于需要操作数据，测试环境网关
    private String url = "http://openapi-gateway.test.chinawayltd.com";

    /**jtjadmin 登录账号 200JX7机构
    private String accessKey_jtjadmin = "lm2h17";
    private String accessSecret_jtjadmin = "ttUMY3RsmO08IdiupbKQ5PNpE88kOYH5";
    private String orgcode_jtjadmin = "200JX7";
     */
    /**xuyanmei 登录账号 2002W7机构*/
    private String accessKey = "yyi8xa";
    private String accessSecret = "CCkbrsrjCA3b6rSurpHSjxNIemDT1nyp";
    private String orgcode = "2002W7";
    
    /**
     * 接口描述：增加车辆 接口 /v1/base/truck/add_self_truck
     * 测试传入所有参数
     *  
     * @throws Exception
     */
    @Test
    public void withRequiredParam() {
        //初始化
        RestTemplate restTemplate = new RestTemplateBuilder().build();
        IRequest request = new RestTemplateRequest(restTemplate);
        // 创建开放平台接口客户端
        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(url, accessKey, accessSecret, request);
        SelfTruckAddReq req = new SelfTruckAddReq();
        req.setCarNum("鄂FW3N361");
        req.setIsHeadStock(TruckHeadStockEnum.HEADSTOCK.getCode());
        req.setOrgcode(orgcode);
        SelfTruckAddResp selfTruckAddRsp = g7OpenapiClient.addSelfTruck(req);
        log.info("rsp:{}", JsonUtil.toJson(selfTruckAddRsp));
        Assertions.assertNotNull(selfTruckAddRsp);
        Assertions.assertTrue(JsonUtil.toJson(selfTruckAddRsp).contains("carnum\":\"鄂FW3N361\""));
        Assertions.assertTrue(JsonUtil.toJson(selfTruckAddRsp).contains("\"op_code\":0"));
        Assertions.assertTrue(JsonUtil.toJson(selfTruckAddRsp).contains("\"op_message\":\"success\""));
        Assertions.assertTrue(JsonUtil.toJson(selfTruckAddRsp).contains("\"op_result\":true"));
        Assertions.assertTrue(JsonUtil.toJson(selfTruckAddRsp).contains("\"optype\":\"add\""));
        Assertions.assertTrue(JsonUtil.toJson(selfTruckAddRsp).contains("ownid"));
        Assertions.assertTrue(JsonUtil.toJson(selfTruckAddRsp).contains("truckid"));

        // 删除这个车
        String ownIds=selfTruckAddRsp.getOwnId() ;
        log.info("delete ownIds:{}", ownIds);
        TruckDeleteReq req_delete = new TruckDeleteReq();
        req_delete.setOwnIds(ownIds);
        req_delete.setOrgcodeLike(orgcode);
        Map<String, TruckDeleteResp> stringTruckDeleteRspMap = g7OpenapiClient.truckDelete(req_delete);
        log.info("rsp:{}", JsonUtil.toJson(stringTruckDeleteRspMap));
        Assertions.assertNotNull(stringTruckDeleteRspMap);

    }

    /**
     * 接口描述：增加车辆 接口 /v1/base/truck/add_self_truck
     * 已新增成功一个车，然后再新增这个车
     *
     * @throws Exception
     */
    @Test
    public void withAddHavenCarNum() {
        //初始化
        RestTemplate restTemplate = new RestTemplateBuilder().build();
        IRequest request = new RestTemplateRequest(restTemplate);
        // 创建开放平台接口客户端
        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(url, accessKey, accessSecret, request);
        SelfTruckAddReq req = new SelfTruckAddReq();
        req.setCarNum("鄂FW3N362");
        req.setIsHeadStock(TruckHeadStockEnum.HEADSTOCK.getCode());
        req.setOrgcode(orgcode);
        SelfTruckAddResp selfTruckAddRsp = g7OpenapiClient.addSelfTruck(req);
        log.info("rsp:{}", JsonUtil.toJson(selfTruckAddRsp));
        Assertions.assertNotNull(selfTruckAddRsp);
        Assertions.assertTrue(JsonUtil.toJson(selfTruckAddRsp).contains("carnum\":\"鄂FW3N362\""));

        SelfTruckAddReq req_2 = new SelfTruckAddReq();
        req_2.setCarNum("鄂FW3N362");
        req_2.setIsHeadStock(TruckHeadStockEnum.HEADSTOCK.getCode());
        req_2.setOrgcode(orgcode);

        try{
            SelfTruckAddResp selfTruckAddRsp2 = g7OpenapiClient.addSelfTruck(req_2);
            log.info("rsp:{}", JsonUtil.toJson(selfTruckAddRsp2));
            //校验返回值

            Assertions.fail("存在的车牌不可以加");
        }catch (G7OpenapiException e){
            Assertions.assertTrue(e.getMessage().contains("车牌号已经存在"));
        }
        // 删除这个车
        String ownIds=selfTruckAddRsp.getOwnId() ;
        log.info("delete ownIds:{}", ownIds);
        TruckDeleteReq req_delete = new TruckDeleteReq();
        req_delete.setOwnIds(ownIds);
        req_delete.setOrgcodeLike(orgcode);
        Map<String, TruckDeleteResp> stringTruckDeleteRspMap = g7OpenapiClient.truckDelete(req_delete);
        log.info("rsp:{}", JsonUtil.toJson(stringTruckDeleteRspMap));
        Assertions.assertNotNull(stringTruckDeleteRspMap);
        Assertions.assertTrue(JsonUtil.toJson(selfTruckAddRsp).contains("\"op_result\":true"));

    }

    /**
     * 接口描述：增加车辆 接口 /v1/base/truck/add_self_truck
     * 增加车辆 类型  TRAILER("2","挂车");
     *
     * @throws Exception
     */
    @Test
    public void withSetIsHeadStockTRAILER() throws Exception {
        RestTemplate restTemplate = new RestTemplateBuilder().build();
        IRequest request = new RestTemplateRequest(restTemplate);
        // 创建开放平台接口客户端
        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(url, accessKey, accessSecret, request);
        SelfTruckAddReq req = new SelfTruckAddReq();
        req.setCarNum("鄂FW3N363");
        req.setOrgcode(orgcode);
        req.setIsHeadStock(TruckHeadStockEnum.TRAILER.getCode());

        
        SelfTruckAddResp selfTruckAddRsp = g7OpenapiClient.addSelfTruck(req);
        log.info("rsp:{}", JsonUtil.toJson(selfTruckAddRsp));
        //校验返回值
        Assertions.assertNotNull(selfTruckAddRsp);
        Assertions.assertTrue(JsonUtil.toJson(selfTruckAddRsp).contains("carnum\":\"鄂FW3N363\""));
        Assertions.assertTrue(JsonUtil.toJson(selfTruckAddRsp).contains("\"op_code\":0"));
        Assertions.assertTrue(JsonUtil.toJson(selfTruckAddRsp).contains("\"op_message\":\"success\""));
        Assertions.assertTrue(JsonUtil.toJson(selfTruckAddRsp).contains("\"op_result\":true"));
        Assertions.assertTrue(JsonUtil.toJson(selfTruckAddRsp).contains("\"optype\":\"add\""));
        Assertions.assertTrue(JsonUtil.toJson(selfTruckAddRsp).contains("ownid"));
        Assertions.assertTrue(JsonUtil.toJson(selfTruckAddRsp).contains("truckid"));

        // 删除这个车
        String ownIds=selfTruckAddRsp.getOwnId() ;
        log.info("delete ownIds:{}", ownIds);
        TruckDeleteReq req_delete = new TruckDeleteReq();
        req_delete.setOwnIds(ownIds);
        req_delete.setOrgcodeLike(orgcode);
        Map<String, TruckDeleteResp> stringTruckDeleteRspMap = g7OpenapiClient.truckDelete(req_delete);
        log.info("rsp:{}", JsonUtil.toJson(stringTruckDeleteRspMap));
        Assertions.assertNotNull(stringTruckDeleteRspMap);
        
    }


    /**
     * 接口描述：增加车辆 接口 /v1/base/truck/add_self_truck
     * 测试传入所有参数，传入空值
     *
     * @throws Exception
     */
    @Test
    public void testNullParamWithCarnum() throws Exception {
        RestTemplate restTemplate = new RestTemplateBuilder().build();
        IRequest request = new RestTemplateRequest(restTemplate);
        // 创建开放平台接口客户端
        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(url, accessKey, accessSecret, request);
        SelfTruckAddReq req = new SelfTruckAddReq();
        req.setCarNum("");
        req.setOrgcode(orgcode);
        req.setIsHeadStock(TruckHeadStockEnum.HEADSTOCK.getCode());

        try{
            SelfTruckAddResp selfTruckAddRsp = g7OpenapiClient.addSelfTruck(req);
            log.info("rsp:{}", JsonUtil.toJson(selfTruckAddRsp));
            //校验返回值
            Assertions.fail("没有校验carnum为必传");


        }catch (G7OpenapiException e){
            Assertions.assertTrue(e.getMessage().contains("参数长度小于预期值carnum"));
        }


    }

    /**
     * 接口描述：增加车辆 接口 /v1/base/truck/add_self_truck
     * 测试传入所有参数，传入空值
     *
     * @throws Exception
     */
    @Test
    public void testNullParamWithSetIsHeadStock() throws Exception {
        RestTemplate restTemplate = new RestTemplateBuilder().build();
        IRequest request = new RestTemplateRequest(restTemplate);
        // 创建开放平台接口客户端
        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(url, accessKey, accessSecret, request);
        SelfTruckAddReq req = new SelfTruckAddReq();
        req.setCarNum("鄂FW3N364");
        req.setIsHeadStock(null);
        req.setOrgcode(orgcode);
        req.setIsHeadStock(TruckHeadStockEnum.HEADSTOCK.getCode());

        SelfTruckAddResp selfTruckAddRsp = g7OpenapiClient.addSelfTruck(req);
        log.info("rsp:{}", JsonUtil.toJson(selfTruckAddRsp));

        Assertions.assertTrue(JsonUtil.toJson(selfTruckAddRsp).contains("carnum\":\"鄂FW3N364\""));
        Assertions.assertTrue(JsonUtil.toJson(selfTruckAddRsp).contains("\"op_code\":0"));
        Assertions.assertTrue(JsonUtil.toJson(selfTruckAddRsp).contains("\"op_message\":\"success\""));
        Assertions.assertTrue(JsonUtil.toJson(selfTruckAddRsp).contains("\"op_result\":true"));
        Assertions.assertTrue(JsonUtil.toJson(selfTruckAddRsp).contains("\"optype\":\"add\""));
        Assertions.assertTrue(JsonUtil.toJson(selfTruckAddRsp).contains("ownid"));
        Assertions.assertTrue(JsonUtil.toJson(selfTruckAddRsp).contains("truckid"));

        // 删除这个车
        String ownIds=selfTruckAddRsp.getOwnId() ;
        log.info("delete ownIds:{}", ownIds);
        TruckDeleteReq req_delete = new TruckDeleteReq();
        req_delete.setOwnIds(ownIds);
        req_delete.setOrgcodeLike(orgcode);
        Map<String, TruckDeleteResp> stringTruckDeleteRspMap = g7OpenapiClient.truckDelete(req_delete);
        log.info("rsp:{}", JsonUtil.toJson(stringTruckDeleteRspMap));
        Assertions.assertNotNull(stringTruckDeleteRspMap);
    }

    /**
     * 接口描述：增加车辆 接口 /v1/base/truck/add_self_truck
     * 测试不传入 isheadstock
     *
     * @throws Exception
     */
    @Test
    public void testnoParamWithSetIsHeadStock() throws Exception {
        RestTemplate restTemplate = new RestTemplateBuilder().build();
        IRequest request = new RestTemplateRequest(restTemplate);
        // 创建开放平台接口客户端
        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(url, accessKey, accessSecret, request);
        SelfTruckAddReq req = new SelfTruckAddReq();
        req.setCarNum("鄂FW3N365");
        req.setOrgcode(orgcode);
        req.setIsHeadStock(TruckHeadStockEnum.HEADSTOCK.getCode());

        SelfTruckAddResp selfTruckAddRsp = g7OpenapiClient.addSelfTruck(req);
        log.info("rsp:{}", JsonUtil.toJson(selfTruckAddRsp));

        Assertions.assertTrue(JsonUtil.toJson(selfTruckAddRsp).contains("carnum\":\"鄂FW3N365\""));
        Assertions.assertTrue(JsonUtil.toJson(selfTruckAddRsp).contains("\"op_code\":0"));
        Assertions.assertTrue(JsonUtil.toJson(selfTruckAddRsp).contains("\"op_message\":\"success\""));
        Assertions.assertTrue(JsonUtil.toJson(selfTruckAddRsp).contains("\"op_result\":true"));
        Assertions.assertTrue(JsonUtil.toJson(selfTruckAddRsp).contains("\"optype\":\"add\""));
        Assertions.assertTrue(JsonUtil.toJson(selfTruckAddRsp).contains("ownid"));
        Assertions.assertTrue(JsonUtil.toJson(selfTruckAddRsp).contains("truckid"));

        // 删除这个车
        String ownIds=selfTruckAddRsp.getOwnId() ;
        log.info("delete ownIds:{}", ownIds);
        TruckDeleteReq req_delete = new TruckDeleteReq();
        req_delete.setOwnIds(ownIds);
        req_delete.setOrgcodeLike(orgcode);
        Map<String, TruckDeleteResp> stringTruckDeleteRspMap = g7OpenapiClient.truckDelete(req_delete);
        log.info("rsp:{}", JsonUtil.toJson(stringTruckDeleteRspMap));
        Assertions.assertNotNull(stringTruckDeleteRspMap);

    }

    /**
     * 接口描述：增加车辆 接口 /v1/base/truck/add_self_truck
     * 测试传入所有参数，传入空值
     *
     * @throws Exception
     */
    @Test
    public void testNullParamWithOrgcode() throws Exception {
        RestTemplate restTemplate = new RestTemplateBuilder().build();
        IRequest request = new RestTemplateRequest(restTemplate);
        // 创建开放平台接口客户端
        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(url, accessKey, accessSecret, request);
        SelfTruckAddReq req = new SelfTruckAddReq();
        req.setCarNum("鄂FW3N366");
        req.setIsHeadStock(TruckHeadStockEnum.HEADSTOCK.getCode());
        req.setOrgcode("");

        try{
            SelfTruckAddResp selfTruckAddRsp = g7OpenapiClient.addSelfTruck(req);
            log.info("rsp:{}", JsonUtil.toJson(selfTruckAddRsp));
            //校验返回值
            Assertions.fail("没有校验orgcode为必传");
        }catch (G7OpenapiException e){
            Assertions.assertTrue(e.getMessage().contains("参数长度小于预期值orgcode"));
        }
    }

    /**
     * 接口描述：增加车辆 接口 /v1/base/truck/add_self_truck
     * 测试 不传入参数
     *
     * @throws Exception
     */
    @Test
    public void testNoParam() throws Exception {
        RestTemplate restTemplate = new RestTemplateBuilder().build();
        IRequest request = new RestTemplateRequest(restTemplate);
        // 创建开放平台接口客户端
        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(url, accessKey, accessSecret, request);
        SelfTruckAddReq req = new SelfTruckAddReq();
        try{
            SelfTruckAddResp selfTruckAddRsp = g7OpenapiClient.addSelfTruck(req);
            log.info("rsp:{}", JsonUtil.toJson(selfTruckAddRsp));
            //校验返回值
            Assertions.fail("参数缺失carnum");


        }catch (G7OpenapiException e){
            Assertions.assertTrue(e.getMessage().contains("参数缺失carnum"));
        }
    }

    /**
     * 接口描述：增加车辆 接口 /v1/base/truck/add_self_truck
     * 测试传入所有参数，传入空值Orgcode_like
     *
     * @throws Exception
     */
    @Test
    public void testNullParamWithOrgcode_like() throws Exception {
        RestTemplate restTemplate = new RestTemplateBuilder().build();
        IRequest request = new RestTemplateRequest(restTemplate);
        // 创建开放平台接口客户端
        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(url, accessKey, accessSecret, request);
        SelfTruckAddReq req = new SelfTruckAddReq();
        req.setCarNum("鄂FW3N367");
        req.setIsHeadStock(TruckHeadStockEnum.HEADSTOCK.getCode());
        req.setOrgcode("");
        try{
            SelfTruckAddResp selfTruckAddRsp = g7OpenapiClient.addSelfTruck(req);
            log.info("rsp:{}", JsonUtil.toJson(selfTruckAddRsp));
            //校验返回值
            Assertions.assertNotNull(selfTruckAddRsp);
        }catch (G7OpenapiException e){
            Assertions.assertTrue(e.getMessage().contains("参数长度小于预期值orgcode"));
        }
    }


    /**
     * 接口描述：增加车辆 接口 /v1/base/truck/add_self_truck
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
        SelfTruckAddReq req = new SelfTruckAddReq();
        req.setCarNum("鄂FW3N3226鄂FW3N3226鄂FW3N3226鄂FW3N3226鄂FW3N3226鄂FW3N3226鄂FW3N3226鄂FW3N3226鄂FW3N3226鄂FW3N3226鄂FW3N3226鄂FW3N3226鄂FW3N3226鄂FW3N3226鄂FW3N3226");
        req.setIsHeadStock("2222222");
        req.setOrgcode("201IHA201IHA201IHA201IHA201IHA201IHA201IHA201IHA201IHA201IHA201IHA201IHA201IHA201IHA201IHA201IHA201IHA201IHA201IHA201IHA201IHA201IHA201IHA201IHA201IHA201IHA201IHA201IHA201IHA");

        try{
            SelfTruckAddResp selfTruckAddRsp = g7OpenapiClient.addSelfTruck(req);
            log.info("rsp:{}", JsonUtil.toJson(selfTruckAddRsp));
            //校验返回值
            Assertions.assertNotNull(selfTruckAddRsp);
            Assertions.assertTrue(JsonUtil.toJson(selfTruckAddRsp).contains("\"carnum\":\"鄂FW3N3226鄂FW3N3226鄂FW\""));
        }catch (G7OpenapiException e){
            Assertions.assertTrue(e.getMessage().contains("参数不在可选值范围内isheadstock"));
        }
    }

    /**
     * 接口描述：增加车辆 接口 /v1/base/truck/add_self_truck
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
        SelfTruckAddReq req = new SelfTruckAddReq();
        req.setCarNum("鄂FW3N32！@#￥%！@……&*（鄂FW3N3226");
        req.setIsHeadStock(TruckHeadStockEnum.HEADSTOCK.getCode());
        req.setOrgcode(orgcode);

        try{
            SelfTruckAddResp selfTruckAddRsp = g7OpenapiClient.addSelfTruck(req);
            log.info("rsp:{}", JsonUtil.toJson(selfTruckAddRsp));
            //校验返回值
            Assertions.assertNotNull(selfTruckAddRsp);
            Assertions.assertTrue(JsonUtil.toJson(selfTruckAddRsp).contains("\"carnum\":\"鄂FW3N3226\""));
            Assertions.assertTrue(JsonUtil.toJson(selfTruckAddRsp).contains("\"deleted\":\"0\""));
            Assertions.assertTrue(JsonUtil.toJson(selfTruckAddRsp).contains("\"orgcode\":\"201IHA0N02\""));
            Assertions.assertTrue(JsonUtil.toJson(selfTruckAddRsp).contains("\"truckid\":\"7B49E76556C25847D47CBD345FDB5092\""));
            Assertions.assertTrue(JsonUtil.toJson(selfTruckAddRsp).contains("\"ownid\":\"743332A469534979C03493838349CDEC\""));
            Assertions.assertTrue(JsonUtil.toJson(selfTruckAddRsp).contains("\"fromtype\":\"1\""));
            Assertions.assertTrue(JsonUtil.toJson(selfTruckAddRsp).contains("\"fromorgcode\":\"201IHA0N02\""));
            Assertions.assertTrue(JsonUtil.toJson(selfTruckAddRsp).contains("\"gpsno\":\"71025437\""));

        }catch (G7OpenapiException e){
            Assertions.assertTrue(e.getMessage().contains("车牌号格式不正确"));
        }
    }



    /**
     * 接口描述：增加车辆 接口 /v1/base/truck/add_self_truck
     * 测试 用其他正确的机构号，来查询车辆 不属于这个机构access_id kjfqvl
     * kjfqvl 机构账号 select * from user where id= 22  Orgcode 20005J
     * @throws Exception
     */
    @Test
    public void OnOtherWithOrgcode_like() throws Exception {
        RestTemplate restTemplate = new RestTemplateBuilder().build();
        IRequest request = new RestTemplateRequest(restTemplate);
        // 创建开放平台接口客户端
        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(url, accessKey, accessSecret, request);
        SelfTruckAddReq req = new SelfTruckAddReq();
        req.setCarNum("川A1S9999");
        req.setIsHeadStock(TruckHeadStockEnum.HEADSTOCK.getCode());
        req.setOrgcode("200JX7");

        try{
            SelfTruckAddResp selfTruckAddRsp = g7OpenapiClient.addSelfTruck(req);
            log.info("rsp:{}", JsonUtil.toJson(selfTruckAddRsp));
            //校验返回值
            Assertions.assertNull(selfTruckAddRsp);
            Assertions.fail("居然没有限制权限");
        }catch (G7OpenapiException e){
            Assertions.assertTrue(e.getMessage().contains("无权操作数据"));
        }

    }

}
