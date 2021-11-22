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
 * 接口描述：删除车辆 接口 /v1/base/truck/truck_delete
 * @author sunzhiping
 * @date 2021-10-12
 */

public class TestWithTruck_delete {
    private final Logger log = LoggerFactory.getLogger(TestWithTruck_delete.class);
    // 由于需要操作数据，测试环境网关
    private String url = "http://openapi-gateway.test.chinawayltd.com";

    /**jtjadmin 登录账号 200JX7机构
    private String accessKey_jtjadmin = "lm2h17";
    private String accessSecret_jtjadmin = "ttUMY3RsmO08IdiupbKQ5PNpE88kOYH5";
    private String orgcode_jtjadmin = "200JX7";
     */
    /**_xuyanmei 登录账号 2002W7机构*/
    private String accessKey_xuyanmei = "yyi8xa";
    private String accessSecret_xuyanmei = "CCkbrsrjCA3b6rSurpHSjxNIemDT1nyp";
    private String orgcode_xuyanmei = "2002W7";

    /** sunzhiping的机构  登录账号 2002W7EJ机构*/
    private String accessKey = "oijzdb";
    private String accessSecret = "6ru1QRYS7V60zLowvx1NHHrojkPu1Mut";
    private String orgcode = "2002W7EJ";


    
    /**
     * 接口描述：删除车辆 接口 /v1/base/truck/truck_delete
     * 测试传入所有参数
     *
     */
    @Test
    public void withRequiredParam() {
        //初始化
        RestTemplate restTemplate = new RestTemplateBuilder().build();
        IRequest request = new RestTemplateRequest(restTemplate);
        // 创建开放平台接口客户端
        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(url, accessKey, accessSecret, request);
        SelfTruckAddReq req = new SelfTruckAddReq();
        req.setCarNum("鄂FW3N381");
        req.setIsHeadStock(TruckHeadStockEnum.HEADSTOCK.getCode());
        req.setOrgcode(orgcode);
        SelfTruckAddResp selfTruckAddRsp = g7OpenapiClient.addSelfTruck(req);
        log.info("rsp:{}", JsonUtil.toJson(selfTruckAddRsp));
        Assertions.assertNotNull(selfTruckAddRsp);
        Assertions.assertTrue(JsonUtil.toJson(selfTruckAddRsp).contains("carnum\":\"鄂FW3N381\""));


        // 删除这个车
        String ownIds=selfTruckAddRsp.getOwnId() ;
        log.info("delete ownIds:{}", ownIds);
        TruckDeleteReq req_delete = new TruckDeleteReq();
        req_delete.setOwnIds(ownIds);
        req_delete.setOrgcodeLike(orgcode);
        Map<String, TruckDeleteResp> stringTruckDeleteRspMap = g7OpenapiClient.truckDelete(req_delete);
        log.info("rsp:{}", JsonUtil.toJson(stringTruckDeleteRspMap));
        Assertions.assertNotNull(stringTruckDeleteRspMap);
        Assertions.assertTrue(JsonUtil.toJson(stringTruckDeleteRspMap).contains("carnum\":\"鄂FW3N381\""));
        Assertions.assertTrue(JsonUtil.toJson(stringTruckDeleteRspMap).contains("\"op_code\":0"));
        Assertions.assertTrue(JsonUtil.toJson(stringTruckDeleteRspMap).contains("\"op_message\":\"success\""));
        Assertions.assertTrue(JsonUtil.toJson(stringTruckDeleteRspMap).contains("\"op_result\":true"));
        Assertions.assertTrue(JsonUtil.toJson(stringTruckDeleteRspMap).contains("\"fromtype\":\"1\""));
        Assertions.assertTrue(JsonUtil.toJson(stringTruckDeleteRspMap).contains("truckid"));

    }

    /**
     * 接口描述：删除车辆 接口 /v1/base/truck/truck_delete
     *  传入父机构 机构号2002W7，删除成功
     *
     */
    @Test
    public void withOrgrootLike() {
        //初始化
        RestTemplate restTemplate = new RestTemplateBuilder().build();
        IRequest request = new RestTemplateRequest(restTemplate);
        // 创建开放平台接口客户端
        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(url, accessKey, accessSecret, request);
        SelfTruckAddReq req = new SelfTruckAddReq();
        req.setCarNum("鄂FW3N387");
        req.setIsHeadStock(TruckHeadStockEnum.HEADSTOCK.getCode());
        req.setOrgcode(orgcode);
        SelfTruckAddResp selfTruckAddRsp = g7OpenapiClient.addSelfTruck(req);
        log.info("rsp:{}", JsonUtil.toJson(selfTruckAddRsp));
        Assertions.assertNotNull(selfTruckAddRsp);
        Assertions.assertTrue(JsonUtil.toJson(selfTruckAddRsp).contains("carnum\":\"鄂FW3N387\""));


        // 删除这个车
        String ownIds=selfTruckAddRsp.getOwnId() ;
        log.info("delete ownIds:{}", ownIds);
        TruckDeleteReq req_delete = new TruckDeleteReq();
        req_delete.setOwnIds(ownIds);
        req_delete.setOrgcodeLike("2002W7");
        Map<String, TruckDeleteResp> stringTruckDeleteRspMap = g7OpenapiClient.truckDelete(req_delete);
        log.info("rsp:{}", JsonUtil.toJson(stringTruckDeleteRspMap));
        Assertions.assertNotNull(stringTruckDeleteRspMap);
        Assertions.assertTrue(JsonUtil.toJson(stringTruckDeleteRspMap).contains("carnum\":\"鄂FW3N387\""));
        Assertions.assertTrue(JsonUtil.toJson(stringTruckDeleteRspMap).contains("\"op_code\":0"));
        Assertions.assertTrue(JsonUtil.toJson(stringTruckDeleteRspMap).contains("\"op_message\":\"success\""));
        Assertions.assertTrue(JsonUtil.toJson(stringTruckDeleteRspMap).contains("\"op_result\":true"));
        Assertions.assertTrue(JsonUtil.toJson(stringTruckDeleteRspMap).contains("\"fromtype\":\"1\""));
        Assertions.assertTrue(JsonUtil.toJson(stringTruckDeleteRspMap).contains("truckid"));

    }

    /**
     * 接口描述：删除车辆 接口 /v1/base/truck/truck_delete
     * 删除2个车场景
     */
    @Test
    public void withDeleteTwoTruck() {
        //初始化
        RestTemplate restTemplate = new RestTemplateBuilder().build();
        IRequest request = new RestTemplateRequest(restTemplate);
        // 创建开放平台接口客户端
        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(url, accessKey, accessSecret, request);
        SelfTruckAddReq req = new SelfTruckAddReq();
        req.setCarNum("鄂FW3N382");
        req.setIsHeadStock(TruckHeadStockEnum.HEADSTOCK.getCode());
        req.setOrgcode(orgcode);
        SelfTruckAddResp selfTruckAddRsp = g7OpenapiClient.addSelfTruck(req);
        log.info("rsp:{}", JsonUtil.toJson(selfTruckAddRsp));
        Assertions.assertNotNull(selfTruckAddRsp);
        Assertions.assertTrue(JsonUtil.toJson(selfTruckAddRsp).contains("carnum\":\"鄂FW3N382\""));

        SelfTruckAddReq req_2 = new SelfTruckAddReq();
        req_2.setCarNum("鄂FW3N383");
        req_2.setIsHeadStock(TruckHeadStockEnum.HEADSTOCK.getCode());
        req_2.setOrgcode(orgcode);
        SelfTruckAddResp selfTruckAddRsp2 = g7OpenapiClient.addSelfTruck(req_2);
        Assertions.assertTrue(JsonUtil.toJson(selfTruckAddRsp2).contains("carnum\":\"鄂FW3N383\""));

        // 删除这个车
        String ownIds=selfTruckAddRsp.getOwnId() ;
        String ownIds2=selfTruckAddRsp2.getOwnId() ;
        log.info("delete ownIds:{}", ownIds);
        TruckDeleteReq req_delete = new TruckDeleteReq();
        req_delete.setOwnIds(ownIds+","+ownIds2);
        req_delete.setOrgcodeLike(orgcode);
        Map<String, TruckDeleteResp> stringTruckDeleteRspMap = g7OpenapiClient.truckDelete(req_delete);
        log.info("rsp:{}", JsonUtil.toJson(stringTruckDeleteRspMap));
        Assertions.assertNotNull(stringTruckDeleteRspMap);
        Assertions.assertTrue(JsonUtil.toJson(stringTruckDeleteRspMap).contains("carnum\":\"鄂FW3N382\""));
        Assertions.assertTrue(JsonUtil.toJson(stringTruckDeleteRspMap).contains("\"op_code\":0"));
        Assertions.assertTrue(JsonUtil.toJson(stringTruckDeleteRspMap).contains("\"op_message\":\"success\""));
        Assertions.assertTrue(JsonUtil.toJson(stringTruckDeleteRspMap).contains("\"op_result\":true"));
        Assertions.assertTrue(JsonUtil.toJson(stringTruckDeleteRspMap).contains("\"fromtype\":\"1\""));
        Assertions.assertTrue(JsonUtil.toJson(stringTruckDeleteRspMap).contains("truckid"));

        Assertions.assertTrue(JsonUtil.toJson(stringTruckDeleteRspMap).contains("carnum\":\"鄂FW3N383\""));
    }

    /**
     * 接口描述：删除车辆 接口 /v1/base/truck/truck_delete
     * 用机构号去删除车
     */
    @Test
    public void withDeleteOrgcodeLike() {
        //初始化
        RestTemplate restTemplate = new RestTemplateBuilder().build();
        IRequest request = new RestTemplateRequest(restTemplate);
        // 创建开放平台接口客户端
        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(url, accessKey, accessSecret, request);
        SelfTruckAddReq req = new SelfTruckAddReq();
        req.setCarNum("鄂FW3N38611");
        req.setIsHeadStock(TruckHeadStockEnum.HEADSTOCK.getCode());
        req.setOrgcode(orgcode);
        SelfTruckAddResp selfTruckAddRsp = g7OpenapiClient.addSelfTruck(req);
        log.info("rsp:{}", JsonUtil.toJson(selfTruckAddRsp));
        Assertions.assertNotNull(selfTruckAddRsp);
        Assertions.assertTrue(JsonUtil.toJson(selfTruckAddRsp).contains("carnum\":\"鄂FW3N38611\""));

        SelfTruckAddReq req_2 = new SelfTruckAddReq();
        req_2.setCarNum("鄂FW3N38711");
        req_2.setIsHeadStock(TruckHeadStockEnum.HEADSTOCK.getCode());
        req_2.setOrgcode(orgcode);
        SelfTruckAddResp selfTruckAddRsp2 = g7OpenapiClient.addSelfTruck(req_2);
        log.info("rsp:{}", JsonUtil.toJson(selfTruckAddRsp2));
        Assertions.assertTrue(JsonUtil.toJson(selfTruckAddRsp2).contains("carnum\":\"鄂FW3N38711\""));

        // 删除这个车
        String ownIds=selfTruckAddRsp.getOwnId() ;
        String ownIds2=selfTruckAddRsp2.getOwnId() ;
        log.info("delete ownIds:{},{}", ownIds,ownIds2);

        try{
            TruckDeleteReq req_delete = new TruckDeleteReq();
//        req_delete.setOwnIds(ownIds+","+ownIds2);
            req_delete.setOrgcodeLike(orgcode);
            Map<String, TruckDeleteResp> stringTruckDeleteRspMap = g7OpenapiClient.truckDelete(req_delete);
            log.info("rsp:{}", JsonUtil.toJson(stringTruckDeleteRspMap));
            Assertions.assertNotNull(stringTruckDeleteRspMap);
            Assertions.assertTrue(JsonUtil.toJson(stringTruckDeleteRspMap).contains("carnum\":\"鄂FW3N38611\""));
            Assertions.assertTrue(JsonUtil.toJson(stringTruckDeleteRspMap).contains("\"op_code\":0"));
            Assertions.assertTrue(JsonUtil.toJson(stringTruckDeleteRspMap).contains("\"op_message\":\"success\""));
            Assertions.assertTrue(JsonUtil.toJson(stringTruckDeleteRspMap).contains("\"op_result\":true"));
            Assertions.assertTrue(JsonUtil.toJson(stringTruckDeleteRspMap).contains("\"fromtype\":\"1\""));
            Assertions.assertTrue(JsonUtil.toJson(stringTruckDeleteRspMap).contains("truckid"));

            Assertions.assertTrue(JsonUtil.toJson(stringTruckDeleteRspMap).contains("carnum\":\"鄂FW3N38711\""));


        }catch (G7OpenapiException e){
            TruckDeleteReq req_delete = new TruckDeleteReq();
            req_delete.setOwnIds(ownIds+","+ownIds2);
            req_delete.setOrgcodeLike(orgcode);
            Map<String, TruckDeleteResp> stringTruckDeleteRspMap = g7OpenapiClient.truckDelete(req_delete);

            Assertions.assertTrue(e.getMessage().contains("参数缺失own_ids"));
        }

    }

    /**
     * 接口描述：删除车辆 接口 /v1/base/truck/truck_delete
     * 只 传Ownids 删除
     */
    @Test
    public void withDeleteOwnids() {
        //初始化
        RestTemplate restTemplate = new RestTemplateBuilder().build();
        IRequest request = new RestTemplateRequest(restTemplate);
        // 创建开放平台接口客户端
        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(url, accessKey, accessSecret, request);
        SelfTruckAddReq req = new SelfTruckAddReq();
        req.setCarNum("鄂FW3N388");
        req.setIsHeadStock(TruckHeadStockEnum.HEADSTOCK.getCode());
        req.setOrgcode(orgcode);
        SelfTruckAddResp selfTruckAddRsp = g7OpenapiClient.addSelfTruck(req);
        log.info("rsp:{}", JsonUtil.toJson(selfTruckAddRsp));
        Assertions.assertNotNull(selfTruckAddRsp);
        Assertions.assertTrue(JsonUtil.toJson(selfTruckAddRsp).contains("carnum\":\"鄂FW3N388\""));

        SelfTruckAddReq req_2 = new SelfTruckAddReq();
        req_2.setCarNum("鄂FW3N389");
        req_2.setIsHeadStock(TruckHeadStockEnum.HEADSTOCK.getCode());
        req_2.setOrgcode(orgcode);
        SelfTruckAddResp selfTruckAddRsp2 = g7OpenapiClient.addSelfTruck(req_2);
        log.info("rsp:{}", JsonUtil.toJson(selfTruckAddRsp2));
        Assertions.assertTrue(JsonUtil.toJson(selfTruckAddRsp2).contains("carnum\":\"鄂FW3N389\""));

        // 删除这个车
        String ownIds=selfTruckAddRsp.getOwnId() ;
        String ownIds2=selfTruckAddRsp2.getOwnId() ;
        log.info("delete ownIds:{},{}", ownIds,ownIds2);
            TruckDeleteReq req_delete = new TruckDeleteReq();
            req_delete.setOwnIds(ownIds+","+ownIds2);
//            req_delete.setOrgcodeLike(orgcode);
            Map<String, TruckDeleteResp> stringTruckDeleteRspMap = g7OpenapiClient.truckDelete(req_delete);
            log.info("rsp:{}", JsonUtil.toJson(stringTruckDeleteRspMap));
            Assertions.assertNotNull(stringTruckDeleteRspMap);
            Assertions.assertTrue(JsonUtil.toJson(stringTruckDeleteRspMap).contains("carnum\":\"鄂FW3N388\""));
            Assertions.assertTrue(JsonUtil.toJson(stringTruckDeleteRspMap).contains("carnum\":\"鄂FW3N389\""));

    }


    /**
     * 接口描述：删除车辆 接口 /v1/base/truck/truck_delete
     * 测试传入所有参数，传入空值
     *
     * @throws Exception
     */
    @Test
    public void testNullParamWithOwnIds() throws Exception {
        RestTemplate restTemplate = new RestTemplateBuilder().build();
        IRequest request = new RestTemplateRequest(restTemplate);
        // 创建开放平台接口客户端
        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(url, accessKey, accessSecret, request);
        TruckDeleteReq req_delete = new TruckDeleteReq();
        req_delete.setOwnIds(null);
        req_delete.setOrgcodeLike(orgcode);

        try{
            Map<String, TruckDeleteResp> stringTruckDeleteRspMap = g7OpenapiClient.truckDelete(req_delete);
            log.info("rsp:{}", JsonUtil.toJson(stringTruckDeleteRspMap));
            //校验返回值
//            Assertions.fail("没有校验 必传");
            Assertions.assertTrue(JsonUtil.toJson(stringTruckDeleteRspMap).contains("carnum\":\"鄂FW3N386\""));


        }catch (G7OpenapiException e){
            Assertions.assertTrue(e.getMessage().contains("参数缺失own_ids"));
        }

    }

    /**
     * 接口描述：删除车辆 接口 /v1/base/truck/truck_delete
     * 删除一个已经删除的车
     *
     * @throws Exception
     */
    @Test
    public void testNullParamWithOrgcodeLike() throws Exception {
        RestTemplate restTemplate = new RestTemplateBuilder().build();
        IRequest request = new RestTemplateRequest(restTemplate);
        // 创建开放平台接口客户端
        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(url, accessKey, accessSecret, request);
        TruckDeleteReq req_delete = new TruckDeleteReq();
        req_delete.setOwnIds("DDE1929683EDA147FAAE490B95D0C70E");
        req_delete.setOrgcodeLike(orgcode);


            Map<String, TruckDeleteResp> stringTruckDeleteRspMap = g7OpenapiClient.truckDelete(req_delete);
            log.info("rsp:{}", JsonUtil.toJson(stringTruckDeleteRspMap));
            //校验返回值
        Assertions.assertTrue(JsonUtil.toJson(stringTruckDeleteRspMap).contains("\"op_message\":\"查询车辆失败\""));

    }



    /**
     * 接口描述：删除车辆 接口 /v1/base/truck/truck_delete
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
        TruckDeleteReq req_delete = new TruckDeleteReq();


        try {
            Map<String, TruckDeleteResp> stringTruckDeleteRspMap = g7OpenapiClient.truckDelete(req_delete);
            log.info("rsp:{}", JsonUtil.toJson(stringTruckDeleteRspMap));
            //校验返回值
//            Assertions.fail("没有校验 必传");
            Assertions.assertTrue(JsonUtil.toJson(stringTruckDeleteRspMap).contains("carnum\":\"鄂FW3N386\""));


        } catch (G7OpenapiException e) {
            Assertions.assertTrue(e.getMessage().contains("参数缺失own_ids"));
        }
    }


    /**
     * 接口描述：删除车辆 接口 /v1/base/truck/truck_delete
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
        TruckDeleteReq req_delete = new TruckDeleteReq();
        req_delete.setOwnIds("鄂FW3N3226鄂FW3N3226鄂FW3N3226鄂FW3N3226鄂FW3N3226鄂FW3N3226鄂FW3N3226鄂FW3N3226鄂FW3N3226鄂FW3N3226鄂FW3N3226鄂FW3N3226鄂FW3N3226鄂FW3N3226鄂FW3N3226");
        req_delete.setOrgcodeLike("201IHA201IHA201IHA201IHA201IHA201IHA201IHA201IHA201IHA201IHA201IHA201IHA201IHA201IHA201IHA201IHA201IHA201IHA201IHA201IHA201IHA201IHA201IHA201IHA201IHA201IHA201IHA201IHA201IHA");

        try{
            Map<String, TruckDeleteResp> stringTruckDeleteRspMap = g7OpenapiClient.truckDelete(req_delete);
            log.info("rsp:{}", JsonUtil.toJson(stringTruckDeleteRspMap));
            //校验返回值
            Assertions.fail("没有校验 必传");
        }catch (G7OpenapiException e){
            Assertions.assertTrue(e.getMessage().contains("无权操作数据"));
        }
    }

    /**
     * 接口描述：删除车辆 接口 /v1/base/truck/truck_delete
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
        TruckDeleteReq req_delete = new TruckDeleteReq();
        req_delete.setOwnIds("鄂FW3N32！@#￥%！@……&*（鄂FW3N3226");
        req_delete.setOrgcodeLike("200W3N32！@#￥%！@……&*（鄂FW3");

        try{
            Map<String, TruckDeleteResp> stringTruckDeleteRspMap = g7OpenapiClient.truckDelete(req_delete);
            log.info("rsp:{}", JsonUtil.toJson(stringTruckDeleteRspMap));
            //校验返回值
            Assertions.fail("没有校验 必传");

        }catch (G7OpenapiException e){
            Assertions.assertTrue(e.getMessage().contains("参数长度小于预期值own_ids"));
        }
    }



    /**
     * 接口描述：删除车辆 接口 /v1/base/truck/truck_delete
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
        TruckDeleteReq req_delete = new TruckDeleteReq();
        req_delete.setOwnIds("C9A10472EF1B2632CDC27B4B4DEC4C35");
        req_delete.setOrgcodeLike("200JX7");

        try{
            Map<String, TruckDeleteResp> stringTruckDeleteRspMap = g7OpenapiClient.truckDelete(req_delete);
            log.info("rsp:{}", JsonUtil.toJson(stringTruckDeleteRspMap));
            //校验返回值
            Assertions.fail("没有校验 必传");
        }catch (G7OpenapiException e){
            Assertions.assertTrue(e.getMessage().contains("无权操作数据"));
        }

    }

}
