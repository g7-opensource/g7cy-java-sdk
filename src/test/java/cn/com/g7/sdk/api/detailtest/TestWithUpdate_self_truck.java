package cn.com.g7.sdk.api.detailtest;

import cn.com.g7.sdk.api.G7OpenapiClient;
import cn.com.g7.sdk.api.G7OpenapiException;
import cn.com.g7.sdk.api.request.IRequest;
import cn.com.g7.sdk.api.request.impl.RestTemplateRequest;
import cn.com.g7.sdk.api.util.JsonUtil;
import cn.com.g7.sdk.api.vo.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

/**
 * 单元测试
 * 接口描述：更新自有车接口V1.0  接口 /v1/base/truck/update_self_truck
 * @author sunzhiping
 * @date 2021-10-12
 */

public class TestWithUpdate_self_truck {
    private final Logger log = LoggerFactory.getLogger(TestWithUpdate_self_truck.class);
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
     * 接口描述：更新自有车接口V1.0  接口 /v1/base/truck/update_self_truck
     * 测试  修改车setIsHeadStock 从1 修改成2
     * 新增，更新，然后再删除这个车
     *  
     * @throws Exception
     */
    @Test
    public void withUpdateisheadstock() {
        String CarNum="鄂FW3N371";

        //初始化
        RestTemplate restTemplate = new RestTemplateBuilder().build();
        IRequest request = new RestTemplateRequest(restTemplate);
        // 创建开放平台接口客户端
        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(url, accessKey, accessSecret, request);
        // 先新增这个车
        SelfTruckAddReq req = new SelfTruckAddReq();
        req.setCarNum(CarNum);
        req.setIsHeadStock("1");
        req.setOrgcode(orgcode);
        SelfTruckAddResp selfTruckAddRsp = g7OpenapiClient.addSelfTruck(req);
        log.info("rsp:{}", JsonUtil.toJson(selfTruckAddRsp));
        Assertions.assertNotNull(selfTruckAddRsp);
        Assertions.assertTrue(JsonUtil.toJson(selfTruckAddRsp).contains("carnum\":\""+CarNum));

        //再更新这个车
        SelfTruckUpdateReq req_update = new SelfTruckUpdateReq();
        req_update.setPlateNum(CarNum);
        req_update.setIsHeadStock(2);

        SelfTruckUpdateResp selfTruckUpdateRsp = g7OpenapiClient.updateSelfTruck(req_update);
        log.info("rsp:{}", JsonUtil.toJson(selfTruckUpdateRsp));
        Assertions.assertNotNull(selfTruckUpdateRsp);
        Assertions.assertTrue(JsonUtil.toJson(selfTruckUpdateRsp).contains("result\":true"));


        // 删除这个车
        String ownIds=selfTruckAddRsp.getOwnId() ;
        log.info("delete ownIds:{}", ownIds);
        TruckDeleteReq req_delete = new TruckDeleteReq();
        req_delete.setOwnIds(ownIds);
        req_delete.setOrgcodeLike(orgcode);
        Map<String, TruckDeleteResp> stringTruckDeleteRspMap = g7OpenapiClient.truckDelete(req_delete);
        log.info("rsp:{}", JsonUtil.toJson(stringTruckDeleteRspMap));
        Assertions.assertNotNull(stringTruckDeleteRspMap);
        Assertions.assertTrue(JsonUtil.toJson(stringTruckDeleteRspMap).contains("carnum\":\""+CarNum));
        Assertions.assertTrue(JsonUtil.toJson(stringTruckDeleteRspMap).contains("op_code\":0"));
        Assertions.assertTrue(JsonUtil.toJson(stringTruckDeleteRspMap).contains("op_message\":\"success"));
        Assertions.assertTrue(JsonUtil.toJson(stringTruckDeleteRspMap).contains("op_result\":true"));
    }

    /**
     * 接口描述：更新自有车接口V1.0  接口 /v1/base/truck/update_self_truck
     * 测试  修改车setIsHeadStock 从1 修改成2
     *
     * @throws Exception
     */
    @Test
    public void withUpdateAllParam() {
        // 基础管车 测试库存在的数据 ，可以一直更新
        String CarNum="鄂FW3N378";

        //初始化
        RestTemplate restTemplate = new RestTemplateBuilder().build();
        IRequest request = new RestTemplateRequest(restTemplate);
        // 创建开放平台接口客户端
        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(url, accessKey, accessSecret, request);

//        // 先新增这个车
//        SelfTruckAddReq req_add = new SelfTruckAddReq();
//        req_add.setCarNum(CarNum);
//        req_add.setIsHeadStock("1");
//        req_add.setOrgcode(orgcode);
//        SelfTruckAddResp selfTruckAddRsp = g7OpenapiClient.addSelfTruck(req_add);
//        log.info("rsp:{}", JsonUtil.toJson(selfTruckAddRsp));
//        Assertions.assertNotNull(selfTruckAddRsp);
//        Assertions.assertTrue(JsonUtil.toJson(selfTruckAddRsp).contains("carnum\":\""+CarNum));

        //再更新这个车
        SelfTruckUpdateReq req_update = new SelfTruckUpdateReq();
        req_update.setPlateNum(CarNum);
        req_update.setId("7B9DD1108289977AB1DABC925523E8E7");
        req_update.setOrgcode(orgcode);
        req_update.setIsHeadStock(2);


        SelfTruckUpdateResp selfTruckUpdateRsp = g7OpenapiClient.updateSelfTruck(req_update);
        log.info("rsp:{}", JsonUtil.toJson(selfTruckUpdateRsp));
        Assertions.assertNotNull(selfTruckUpdateRsp);
        Assertions.assertTrue(JsonUtil.toJson(selfTruckUpdateRsp).contains("result\":true"));
        // 删除这个车
//        String ownIds=selfTruckAddRsp.getOwnId() ;
//        log.info("delete ownIds:{}", ownIds);
//        TruckDeleteReq req_delete = new TruckDeleteReq();
//        req_delete.setOwnIds(ownIds);
//        req_delete.setOrgcodeLike(orgcode);
//        Map<String, TruckDeleteResp> stringTruckDeleteRspMap = g7OpenapiClient.truckDelete(req_delete);
//        log.info("rsp:{}", JsonUtil.toJson(stringTruckDeleteRspMap));
//        Assertions.assertNotNull(stringTruckDeleteRspMap);

    }




    /**
     * 接口描述：更新自有车接口V1.0  接口 /v1/base/truck/update_self_truck
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
        SelfTruckUpdateReq req_update = new SelfTruckUpdateReq();
        req_update.setPlateNum("");
        req_update.setId("7B9DD1108289977AB1DABC925523E8E7");
        req_update.setOrgcode(orgcode);
        req_update.setIsHeadStock(1);


        try{
            SelfTruckUpdateResp selfTruckUpdateRsp = g7OpenapiClient.updateSelfTruck(req_update);
            log.info("rsp:{}", JsonUtil.toJson(selfTruckUpdateRsp));
            //校验返回值
//            Assertions.fail("没有校验carnum为必传");
            Assertions.assertTrue(JsonUtil.toJson(selfTruckUpdateRsp).contains("result\":true"));


        }catch (G7OpenapiException e){
            Assertions.assertTrue(e.getMessage().contains("参数长度小于预期值carnum"));
        }


    }

    /**
     * 接口描述：更新自有车接口V1.0  接口 /v1/base/truck/update_self_truck
     * 测试传入所有参数，SetIsHeadStock传入空值
     *
     * @throws Exception
     */
    @Test
    public void testNullParamWithSetIsHeadStock() throws Exception {
        RestTemplate restTemplate = new RestTemplateBuilder().build();
        IRequest request = new RestTemplateRequest(restTemplate);
        // 创建开放平台接口客户端
        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(url, accessKey, accessSecret, request);
        SelfTruckUpdateReq req_update = new SelfTruckUpdateReq();
        req_update.setPlateNum("鄂FW3N378");
        req_update.setId("7B9DD1108289977AB1DABC925523E8E7");
        req_update.setOrgcode(orgcode);
        req_update.setIsHeadStock(null);

        SelfTruckUpdateResp selfTruckUpdateRsp = g7OpenapiClient.updateSelfTruck(req_update);
        log.info("rsp:{}", JsonUtil.toJson(selfTruckUpdateRsp));

        Assertions.assertTrue(JsonUtil.toJson(selfTruckUpdateRsp).contains("result\":true"));

    }

    /**
     * 接口描述：更新自有车接口V1.0  接口 /v1/base/truck/update_self_truck
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
        SelfTruckUpdateReq req_update = new SelfTruckUpdateReq();
        req_update.setPlateNum("鄂FW3N378");
        req_update.setId("7B9DD1108289977AB1DABC925523E8E7");
        req_update.setOrgcode(orgcode);

        SelfTruckUpdateResp selfTruckUpdateRsp = g7OpenapiClient.updateSelfTruck(req_update);
        log.info("rsp:{}", JsonUtil.toJson(selfTruckUpdateRsp));

        Assertions.assertTrue(JsonUtil.toJson(selfTruckUpdateRsp).contains("result\":true"));

    }

    /**
     * 接口描述：更新自有车接口V1.0  接口 /v1/base/truck/update_self_truck
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
        SelfTruckUpdateReq req_update = new SelfTruckUpdateReq();
        req_update.setPlateNum("鄂FW3N378");
        req_update.setId("7B9DD1108289977AB1DABC925523E8E7");
        req_update.setOrgcode("");


        try{
            SelfTruckUpdateResp selfTruckUpdateRsp = g7OpenapiClient.updateSelfTruck(req_update);
            log.info("rsp:{}", JsonUtil.toJson(selfTruckUpdateRsp));
            //校验返回值
            Assertions.fail("没有校验orgcode为必传");
        }catch (G7OpenapiException e){
            Assertions.assertTrue(e.getMessage().contains("非法的机构号"));
        }
    }

    /**
     * 接口描述：更新自有车接口V1.0  接口 /v1/base/truck/update_self_truck
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
        SelfTruckUpdateReq req_update = new SelfTruckUpdateReq();



        try{
            SelfTruckUpdateResp selfTruckUpdateRsp = g7OpenapiClient.updateSelfTruck(req_update);
            log.info("rsp:{}", JsonUtil.toJson(selfTruckUpdateRsp));
            //校验返回值
            Assertions.fail("参数缺失carnum");


        }catch (G7OpenapiException e){
            Assertions.assertTrue(e.getMessage().contains("参数缺失plate_num"));
        }
    }

    /**
     * 接口描述：更新自有车接口V1.0  接口 /v1/base/truck/update_self_truck
     * 测试传入所有参数，不传入 Orgcode_like
     *
     * @throws Exception
     */
    @Test
    public void testnoParamWithOrgcode() throws Exception {
        RestTemplate restTemplate = new RestTemplateBuilder().build();
        IRequest request = new RestTemplateRequest(restTemplate);
        // 创建开放平台接口客户端
        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(url, accessKey, accessSecret, request);

        SelfTruckUpdateReq req_update = new SelfTruckUpdateReq();
        req_update.setPlateNum("鄂FW3N378");
        req_update.setId("7B9DD1108289977AB1DABC925523E8E7");
        req_update.setIsHeadStock(1);

        SelfTruckUpdateResp selfTruckUpdateRsp = g7OpenapiClient.updateSelfTruck(req_update);
        Assertions.assertTrue(JsonUtil.toJson(selfTruckUpdateRsp).contains("result\":true"));

    }


    /**
     * 接口描述：更新自有车接口V1.0  接口 /v1/base/truck/update_self_truck
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
        SelfTruckUpdateReq req_update = new SelfTruckUpdateReq();


        //再更新这个车

        req_update.setPlateNum("鄂FW3N3226鄂FW3N3226鄂FW3N3226鄂FW3N3226鄂FW3N3226鄂FW3N3226鄂FW3N3226鄂FW3N3226鄂FW3N3226鄂FW3N3226鄂FW3N3226鄂FW3N3226鄂FW3N3226鄂FW3N3226鄂FW3N3226");
        req_update.setId("7B9DD1108289977A7B9DD1108289977AB1DABC925523E8E77B9DD1108289977AB1DABC925523E8E77B9DD1108289977AB1DABC925523E8E77B9DD1108289977AB1DABC925523E8E77B9DD1108289977AB1DABC925523E8E7B1DABC925523E8E7");
        req_update.setOrgcode("201IHA201IHA201IHA201IHA201IHA201IHA201IHA201IHA201IHA201IHA201IHA201IHA201IHA201IHA201IHA201IHA201IHA201IHA201IHA201IHA201IHA201IHA201IHA201IHA201IHA201IHA201IHA201IHA201IHA");
        req_update.setIsHeadStock(2222222);

        try{
            SelfTruckUpdateResp selfTruckUpdateRsp = g7OpenapiClient.updateSelfTruck(req_update);
            log.info("rsp:{}", JsonUtil.toJson(selfTruckUpdateRsp));
            //校验返回值
            Assertions.assertTrue(JsonUtil.toJson(selfTruckUpdateRsp).contains("result\":true"));
        }catch (G7OpenapiException e){
            Assertions.assertTrue(e.getMessage().contains("参数不在可选值范围内isheadstock"));
        }
    }

    /**
     * 接口描述：更新自有车接口V1.0  接口 /v1/base/truck/update_self_truck
     * Testcasename:测试传入异常字符参数
     *
     * @throws Exception
     */
    @Test
    public void testAbnormalcharacterParam() throws Exception {
        RestTemplate restTemplate = new RestTemplateBuilder().build();
        IRequest request = new RestTemplateRequest(restTemplate);
        // 创建开放平台接口客户端
        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(url, accessKey, accessSecret, request);
        SelfTruckUpdateReq req_update = new SelfTruckUpdateReq();
        req_update.setPlateNum("鄂FW3N3226鄂F!@#$@$%^&*()3226鄂FW3N3226鄂FW3N3226鄂FW3N3226鄂FW3N3226鄂FW3N3226鄂FW3N3226");


        try{
            SelfTruckUpdateResp selfTruckUpdateRsp = g7OpenapiClient.updateSelfTruck(req_update);
            log.info("rsp:{}", JsonUtil.toJson(selfTruckUpdateRsp));
            //校验返回值
            Assertions.assertNotNull(selfTruckUpdateRsp);
            Assertions.assertTrue(JsonUtil.toJson(selfTruckUpdateRsp).contains("\"carnum\":\"鄂FW3N3226\""));


        }catch (G7OpenapiException e){
            Assertions.assertTrue(e.getMessage().contains("该车不存在"));
        }
    }



    /**
     * 接口描述：更新自有车接口V1.0  接口 /v1/base/truck/update_self_truck
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
        SelfTruckUpdateReq req_update = new SelfTruckUpdateReq();
        req_update.setPlateNum("鄂FW3N378");
        req_update.setId("7B9DD1108289977AB1DABC925523E8E7");
        req_update.setOrgcode("200JX7");
        req_update.setIsHeadStock(2);

        try{
            SelfTruckUpdateResp selfTruckUpdateRsp = g7OpenapiClient.updateSelfTruck(req_update);
            log.info("rsp:{}", JsonUtil.toJson(selfTruckUpdateRsp));
            //校验返回值
            Assertions.assertNull(selfTruckUpdateRsp);
            Assertions.fail("居然没有限制权限");
        }catch (G7OpenapiException e){
            Assertions.assertTrue(e.getMessage().contains("非法的机构号"));
        }

    }

}
