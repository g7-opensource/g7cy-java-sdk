package cn.com.g7.sdk.api.detailtest;

import cn.com.g7.sdk.api.G7OpenapiClient;
import cn.com.g7.sdk.api.enums.GetCountEnum;
import cn.com.g7.sdk.api.G7OpenapiException;
import cn.com.g7.sdk.api.request.IRequest;
import cn.com.g7.sdk.api.request.impl.RestTemplateRequest;
import cn.com.g7.sdk.api.util.JsonUtil;
import cn.com.g7.sdk.api.vo.TruckListCountReq;
import cn.com.g7.sdk.api.vo.TruckListCountResp;
import cn.com.g7.sdk.api.vo.TruckListInfoResp;
import cn.com.g7.sdk.api.vo.TruckListReq;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * 单元测试
 * 接口描述：车辆_车辆列表接口 /v1/base/truck/truck_list
 * @author sunzhiping
 * @date 2021-10-12
 */

public class TestWithTruckList {
    private final Logger log = LoggerFactory.getLogger(TestWithTruckList.class);
    private String url = "http://openapi.huoyunren.com";
    private String accessKey = "xsk8vj";
    private String accessSecret = "aUwDAkBf8mvr8YKX7GTqIszvpCeBoY4F";
    private String orgcode = "201IHA";


    /**
     * 接口描述：车辆_车辆列表接口 /v1/base/truck/truck_list
     * 测试传入所有参数
     *  select * from user where id=29  orgcode 201IHA  orgname 漯河双汇物流投资有限公司1
     * @throws Exception
     */
    @Test
    public void withRequiredParam() throws Exception {
        //初始化
        RestTemplate restTemplate = new RestTemplateBuilder().build();
        IRequest request = new RestTemplateRequest(restTemplate);
        // 创建开放平台接口客户端
        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(url, accessKey, accessSecret, request);
        //包装请求参数
        TruckListReq req = new TruckListReq();
        req.setOrgcodeLike(orgcode);
        List<TruckListInfoResp> truckListInfoResps = g7OpenapiClient.truckList(req);
        log.info("rsp:{}", JsonUtil.toJson(truckListInfoResps));
        //校验返回值
        Assertions.assertNotNull(truckListInfoResps);

        Assertions.assertTrue(JsonUtil.toJson(truckListInfoResps).contains("orgcode\":\"201IHA0102"));
    }

    /**
     * 接口描述：车辆_车辆列表接口 /v1/base/truck/truck_list
     * 测试传入所有参数，包含传入 setGet_count，返回 满足条件数量 total
     *
     * @throws Exception
     */
    @Test
    public void withTruckListCount() throws Exception {
        RestTemplate restTemplate = new RestTemplateBuilder().build();
        IRequest request = new RestTemplateRequest(restTemplate);
        // 创建开放平台接口客户端
        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(url, accessKey, accessSecret, request);
        TruckListCountReq req = new TruckListCountReq(GetCountEnum.OBTAIN.getCode());
        req.setCarNumLike("鄂FW3N36");
        req.setIsBind(1);
        req.setOrgcodeLike("201IHA");
        req.setUpdateTimeGe("2021-10-12 16:13:11");
        req.setDeleted(0);
        req.setPageNo(1);
        req.setPageSize(100);
        TruckListCountResp truckListCountResp = g7OpenapiClient.truckListCount(req);
        log.info("rsp:{}", JsonUtil.toJson(truckListCountResp));
        //校验返回值
        Assertions.assertNotNull(truckListCountResp);
        Assertions.assertTrue(JsonUtil.toJson(truckListCountResp).contains("\"total\":1"));

//        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(accessKey, accessSecret);
//        TruckListCountReq req = new TruckListCountReq(GetCountEnum.OBTAIN.getCode());

//        req.setOrgcodeLike("201IHA");
//        req.setDeleted(0);
//        TruckListCountResp truckListCountResp = g7OpenapiClient.truckListCount(req);
//        log.info("rsp:{}", JsonUtil.toJson(truckListCountResp));
//        //校验返回值
//        Assertions.assertNotNull(truckListCountResp);
//        Assertions.assertTrue(JsonUtil.toJson(truckListCountResp).contains("\"total\""));


    }
    /**
     * 接口描述：车辆_车辆列表接口 /v1/base/truck/truck_list
     * 测试传入所有参数，没有传 setGet_count，返回车辆列表详情
     *
     * @throws Exception
     */
    @Test
    public void withAllParam2() throws Exception {
        RestTemplate restTemplate = new RestTemplateBuilder().build();
        IRequest request = new RestTemplateRequest(restTemplate);
        // 创建开放平台接口客户端
        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(url, accessKey, accessSecret, request);
        TruckListReq req = new TruckListReq();
        req.setCarNumLike("鄂FW3N36");
        req.setIsBind(1);
        req.setOrgcodeLike("201IHA");
        req.setUpdateTimeGe("2021-10-12 16:13:11");
        req.setDeleted(0);
//        req.setGet_count(1);
        req.setPageNo(1);
        req.setPageSize(100);
        List<TruckListInfoResp> truckListInfoResps = g7OpenapiClient.truckList(req);
        log.info("rsp:{}", JsonUtil.toJson(truckListInfoResps));
        //校验返回值
        Assertions.assertNotNull(truckListInfoResps);
        Assertions.assertTrue(JsonUtil.toJson(truckListInfoResps).contains("\"carnum\":\"鄂FW3N36\""));
        Assertions.assertTrue(JsonUtil.toJson(truckListInfoResps).contains("\"deleted\":\"0\""));
        Assertions.assertTrue(JsonUtil.toJson(truckListInfoResps).contains("\"orgcode\":\"201IHA0N02\""));
        Assertions.assertTrue(JsonUtil.toJson(truckListInfoResps).contains("\"truckid\":\"7B49E76556C25847D47CBD345FDB5092\""));
        Assertions.assertTrue(JsonUtil.toJson(truckListInfoResps).contains("\"ownid\":\"743332A469534979C03493838349CDEC\""));
        Assertions.assertTrue(JsonUtil.toJson(truckListInfoResps).contains("\"fromtype\":\"1\""));
        Assertions.assertTrue(JsonUtil.toJson(truckListInfoResps).contains("\"fromorgcode\":\"201IHA0N02\""));
        Assertions.assertTrue(JsonUtil.toJson(truckListInfoResps).contains("\"gpsno\":\"71025437\""));
    }

    /**
     * 接口描述：车辆_车辆列表接口 /v1/base/truck/truck_list
     * 测试传入所有参数，有司机，包含子机构查询场景
     *
     * @throws Exception
     */
    @Test
    public void withAllParamGet_count() throws Exception {
        // 创建开放平台接口客户端
        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(accessKey, accessSecret);
        TruckListCountReq req = new TruckListCountReq(GetCountEnum.OBTAIN.getCode());

        req.setOrgcodeLike("201IHA");
        req.setDeleted(0);
        TruckListCountResp truckListCountResp = g7OpenapiClient.truckListCount(req);
        log.info("rsp:{}", JsonUtil.toJson(truckListCountResp));
        //校验返回值
        Assertions.assertNotNull(truckListCountResp);
        Assertions.assertTrue(JsonUtil.toJson(truckListCountResp).contains("\"total\""));


    }


    /**
     * 接口描述：车辆_车辆列表接口 /v1/base/truck/truck_list
     * 测试传入所有参数，有司机，包含子机构查询场景
     *
     * @throws Exception
     */
    @Test
    public void withAllParamHasdriver1() throws Exception {
        RestTemplate restTemplate = new RestTemplateBuilder().build();
        IRequest request = new RestTemplateRequest(restTemplate);
        // 创建开放平台接口客户端
        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(url, accessKey, accessSecret, request);
        TruckListReq req = new TruckListReq();
        req.setCarNumLike("苏HC3137");
        req.setIsBind(0);
        req.setOrgcodeLike("201IHA07");
        req.setUpdateTimeGe("2020-10-12 16:13:11");
        req.setDeleted(0);
//        req.setGet_count(1);
        req.setPageNo(1);
        req.setPageSize(100);
        List<TruckListInfoResp> truckListInfoResps = g7OpenapiClient.truckList(req);
        log.info("rsp:{}", JsonUtil.toJson(truckListInfoResps));
        //校验返回值
        Assertions.assertNotNull(truckListInfoResps);
        Assertions.assertTrue(JsonUtil.toJson(truckListInfoResps).contains("\"carnum\":\"苏HC3137\""));
        Assertions.assertTrue(JsonUtil.toJson(truckListInfoResps).contains("\"deleted\":\"0\""));
        Assertions.assertTrue(JsonUtil.toJson(truckListInfoResps).contains("\"orgcode\":\"201IHA07\""));
        Assertions.assertTrue(JsonUtil.toJson(truckListInfoResps).contains("\"truckid\":\"7A20F1BA5913323C55EFBA85E3CEA541\""));
        Assertions.assertTrue(JsonUtil.toJson(truckListInfoResps).contains("\"ownid\":\"DB77CEDF0F5423C7C59B133ECDC256D3\""));
        Assertions.assertTrue(JsonUtil.toJson(truckListInfoResps).contains("\"fromtype\":\"1\""));
        Assertions.assertTrue(JsonUtil.toJson(truckListInfoResps).contains("\"fromorgcode\":\"201IHA07\""));
        Assertions.assertTrue(JsonUtil.toJson(truckListInfoResps).contains("\"gpsno\":\"0\""));
        Assertions.assertTrue(JsonUtil.toJson(truckListInfoResps).contains("\"maindriver_id\":\"00CD7B10B681A595A8E956BCEF37E83E\""));
    }

    /**
     * 接口描述：车辆_车辆列表接口 /v1/base/truck/truck_list
     * 测试传入所有参数，有司机，包含子机构查询场景
     *
     * @throws Exception
     */
    @Test
    public void withAllParamCarnum_like() throws Exception {
        RestTemplate restTemplate = new RestTemplateBuilder().build();
        IRequest request = new RestTemplateRequest(restTemplate);
        // 创建开放平台接口客户端
        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(url, accessKey, accessSecret, request);
        TruckListReq req = new TruckListReq();
        req.setCarNumLike("苏");
//        req.setIsBind(0);
        req.setOrgcodeLike("201IHA");
//        req.setUpdateTimeGe("2020-10-12 16:13:11");
        req.setDeleted(0);
//        req.setGet_count(1);
        req.setPageNo(1);
        req.setPageSize(100);
        List<TruckListInfoResp> truckListInfoResps = g7OpenapiClient.truckList(req);
        log.info("rsp:{}", JsonUtil.toJson(truckListInfoResps));
        //校验返回值
        Assertions.assertNotNull(truckListInfoResps);
        Assertions.assertTrue(JsonUtil.toJson(truckListInfoResps).contains("\"carnum\":\"苏HC3137\""));
        Assertions.assertTrue(JsonUtil.toJson(truckListInfoResps).contains("\"deleted\":\"0\""));
        Assertions.assertTrue(JsonUtil.toJson(truckListInfoResps).contains("\"orgcode\":\"201IHA07\""));
        Assertions.assertTrue(JsonUtil.toJson(truckListInfoResps).contains("\"truckid\":\"7A20F1BA5913323C55EFBA85E3CEA541\""));
        Assertions.assertTrue(JsonUtil.toJson(truckListInfoResps).contains("\"ownid\":\"DB77CEDF0F5423C7C59B133ECDC256D3\""));
        Assertions.assertTrue(JsonUtil.toJson(truckListInfoResps).contains("\"fromtype\":\"1\""));
        Assertions.assertTrue(JsonUtil.toJson(truckListInfoResps).contains("\"fromorgcode\":\"201IHA07\""));
        Assertions.assertTrue(JsonUtil.toJson(truckListInfoResps).contains("\"gpsno\":\"0\""));
        Assertions.assertTrue(JsonUtil.toJson(truckListInfoResps).contains("\"maindriver_id\":\"00CD7B10B681A595A8E956BCEF37E83E\""));
    }



    /**
     * 接口描述：车辆_车辆列表接口 /v1/base/truck/truck_list
     * 测试传入所有参数，比对 实际接口响应的数据 和SDK响应数据
     *
     * @throws Exception
     */
    @Test
    public void withAllParam3() throws Exception {
        RestTemplate restTemplate = new RestTemplateBuilder().build();
        IRequest request = new RestTemplateRequest(restTemplate);
        // 创建开放平台接口客户端
        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(url, accessKey, accessSecret, request);
        TruckListReq req = new TruckListReq();
        req.setCarNumLike("鄂FW3N36");
        req.setIsBind(1);
        req.setOrgcodeLike("201IHA");
        req.setUpdateTimeGe("2021-10-12 16:13:11");
        req.setDeleted(0);
//        req.setGet_count(1);
        req.setPageNo(1);
        req.setPageSize(100);
        List<TruckListInfoResp> truckListInfoResps = g7OpenapiClient.truckList(req);
        log.info("rsp:{}", JsonUtil.toJson(truckListInfoResps));


        //校验返回值
        Assertions.assertNotNull(truckListInfoResps);
        Assertions.assertTrue(JsonUtil.toJson(truckListInfoResps).contains("\"carnum\":\"鄂FW3N36\""));
    }

    /**
     * 接口描述：车辆_车辆列表接口 /v1/base/truck/truck_list
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
        TruckListReq req = new TruckListReq();
        req.setCarNumLike("");
        req.setIsBind(1);
        req.setOrgcodeLike("201IHA");
        req.setUpdateTimeGe("2021-10-12 16:13:11");
        req.setDeleted(0);
//        req.setGet_count(1);
        req.setPageNo(1);
        req.setPageSize(100);
        try{
            List<TruckListInfoResp> truckListInfoResps = g7OpenapiClient.truckList(req);
            log.info("rsp:{}", JsonUtil.toJson(truckListInfoResps));
            //校验返回值
            Assertions.assertNotNull(truckListInfoResps);


        }catch (G7OpenapiException e){
            Assertions.assertTrue(e.getMessage().contains("参数长度小于预期值carnum_like"));
        }
    }

    /**
     * 接口描述：车辆_车辆列表接口 /v1/base/truck/truck_list
     * 测试传入所有参数，传入空值
     *
     * @throws Exception
     */
    @Test
    public void testNullParamWithIsbind() throws Exception {
        RestTemplate restTemplate = new RestTemplateBuilder().build();
        IRequest request = new RestTemplateRequest(restTemplate);
        // 创建开放平台接口客户端
        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(url, accessKey, accessSecret, request);
        TruckListReq req = new TruckListReq();
        req.setCarNumLike("鄂FW3N36");
        req.setIsBind(null);
        req.setOrgcodeLike("201IHA");
        req.setUpdateTimeGe("2021-10-12 16:13:11");
        req.setDeleted(0);
//        req.setGet_count(1);
        req.setPageNo(1);
        req.setPageSize(100);

            List<TruckListInfoResp> truckListInfoResps = g7OpenapiClient.truckList(req);
            log.info("rsp:{}", JsonUtil.toJson(truckListInfoResps));
            //校验返回值
            Assertions.assertNotNull(truckListInfoResps);
            Assertions.assertTrue(JsonUtil.toJson(truckListInfoResps).contains("\"carnum\":\"鄂FW3N36\""));
            Assertions.assertTrue(JsonUtil.toJson(truckListInfoResps).contains("\"deleted\":\"0\""));
            Assertions.assertTrue(JsonUtil.toJson(truckListInfoResps).contains("\"orgcode\":\"201IHA0N02\""));
            Assertions.assertTrue(JsonUtil.toJson(truckListInfoResps).contains("\"truckid\":\"7B49E76556C25847D47CBD345FDB5092\""));
            Assertions.assertTrue(JsonUtil.toJson(truckListInfoResps).contains("\"ownid\":\"743332A469534979C03493838349CDEC\""));
            Assertions.assertTrue(JsonUtil.toJson(truckListInfoResps).contains("\"fromtype\":\"1\""));
            Assertions.assertTrue(JsonUtil.toJson(truckListInfoResps).contains("\"fromorgcode\":\"201IHA0N02\""));
            Assertions.assertTrue(JsonUtil.toJson(truckListInfoResps).contains("\"gpsno\":\"71025437\""));

    }

    /**
     * 接口描述：车辆_车辆列表接口 /v1/base/truck/truck_list
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
        TruckListReq req = new TruckListReq();
//        req.setOrgcodeLike("201IHA");
        List<TruckListInfoResp> truckListInfoResps = g7OpenapiClient.truckList(req);
        log.info("rsp:{}", JsonUtil.toJson(truckListInfoResps));
        Assertions.assertNotNull(truckListInfoResps);

//        Assertions.assertEquals("testNoParam", resultString);
    }

    /**
     * 接口描述：车辆_车辆列表接口 /v1/base/truck/truck_list
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
        TruckListReq req = new TruckListReq();
        req.setCarNumLike("鄂FW3N36");
        req.setIsBind(1);
        req.setOrgcodeLike("201IHA");
        req.setUpdateTimeGe("");
        req.setDeleted(0);
//        req.setGet_count(1);
        req.setPageNo(1);
        req.setPageSize(100);
        try{
            List<TruckListInfoResp> truckListInfoResps = g7OpenapiClient.truckList(req);
            log.info("rsp:{}", JsonUtil.toJson(truckListInfoResps));
            //校验返回值
            Assertions.assertNotNull(truckListInfoResps);


        }catch (G7OpenapiException e){
            Assertions.assertTrue(e.getMessage().contains("参数长度小于预期值orgcode_like"));
        }
    }

    /**
     * 接口描述：车辆_车辆列表接口 /v1/base/truck/truck_list
     * 测试传入所有参数，传入空值Updatetime_ge
     *
     * @throws Exception
     */
    @Test
    public void testNullParamWithUpdatetime_ge() throws Exception {
        RestTemplate restTemplate = new RestTemplateBuilder().build();
        IRequest request = new RestTemplateRequest(restTemplate);
        // 创建开放平台接口客户端
        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(url, accessKey, accessSecret, request);
        TruckListReq req = new TruckListReq();
        req.setCarNumLike("鄂FW3N36");
        req.setIsBind(1);
        req.setOrgcodeLike("201IHA");
        req.setUpdateTimeGe("");
        req.setDeleted(0);
//        req.setGet_count(1);
        req.setPageNo(1);
        req.setPageSize(100);
        try{
            List<TruckListInfoResp> truckListInfoResps = g7OpenapiClient.truckList(req);
            log.info("rsp:{}", JsonUtil.toJson(truckListInfoResps));
            //校验返回值
            Assertions.assertNotNull(truckListInfoResps);
            Assertions.assertTrue(JsonUtil.toJson(truckListInfoResps).contains("\"carnum\":\"鄂FW3N36\""));
            Assertions.assertTrue(JsonUtil.toJson(truckListInfoResps).contains("\"deleted\":\"0\""));
            Assertions.assertTrue(JsonUtil.toJson(truckListInfoResps).contains("\"orgcode\":\"201IHA0N02\""));
            Assertions.assertTrue(JsonUtil.toJson(truckListInfoResps).contains("\"truckid\":\"7B49E76556C25847D47CBD345FDB5092\""));
            Assertions.assertTrue(JsonUtil.toJson(truckListInfoResps).contains("\"ownid\":\"743332A469534979C03493838349CDEC\""));
            Assertions.assertTrue(JsonUtil.toJson(truckListInfoResps).contains("\"fromtype\":\"1\""));
            Assertions.assertTrue(JsonUtil.toJson(truckListInfoResps).contains("\"fromorgcode\":\"201IHA0N02\""));
            Assertions.assertTrue(JsonUtil.toJson(truckListInfoResps).contains("\"gpsno\":\"71025437\""));

        }catch (G7OpenapiException e){
            Assertions.assertTrue(e.getMessage().contains("参数长度小于预期值updatetime_ge"));
        }
    }


    /**
     * 接口描述：车辆_车辆列表接口 /v1/base/truck/truck_list
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
        TruckListReq req = new TruckListReq();
        req.setCarNumLike("鄂FW3N3226鄂FW3N3226鄂FW3N3226鄂FW3N3226鄂FW3N3226鄂FW3N3226鄂FW3N3226鄂FW3N3226鄂FW3N3226鄂FW3N3226鄂FW3N3226鄂FW3N3226鄂FW3N3226鄂FW3N3226鄂FW3N3226");
        req.setIsBind(2222222);
        req.setOrgcodeLike("201IHA201IHA201IHA201IHA201IHA201IHA201IHA201IHA201IHA201IHA201IHA201IHA201IHA201IHA201IHA201IHA201IHA201IHA201IHA201IHA201IHA201IHA201IHA201IHA201IHA201IHA201IHA201IHA201IHA");
        req.setUpdateTimeGe("");
        req.setDeleted(33333333);
//        req.setGet_count(1);
        req.setPageNo(111111111);
        req.setPageSize(111111111);
        try{
            List<TruckListInfoResp> truckListInfoResps = g7OpenapiClient.truckList(req);
            log.info("rsp:{}", JsonUtil.toJson(truckListInfoResps));
            //校验返回值
            Assertions.assertNotNull(truckListInfoResps);
            Assertions.assertTrue(JsonUtil.toJson(truckListInfoResps).contains("\"carnum\":\"鄂FW3N36\""));
            Assertions.assertTrue(JsonUtil.toJson(truckListInfoResps).contains("\"deleted\":\"0\""));
            Assertions.assertTrue(JsonUtil.toJson(truckListInfoResps).contains("\"orgcode\":\"201IHA0N02\""));
            Assertions.assertTrue(JsonUtil.toJson(truckListInfoResps).contains("\"truckid\":\"7B49E76556C25847D47CBD345FDB5092\""));
            Assertions.assertTrue(JsonUtil.toJson(truckListInfoResps).contains("\"ownid\":\"743332A469534979C03493838349CDEC\""));
            Assertions.assertTrue(JsonUtil.toJson(truckListInfoResps).contains("\"fromtype\":\"1\""));
            Assertions.assertTrue(JsonUtil.toJson(truckListInfoResps).contains("\"fromorgcode\":\"201IHA0N02\""));
            Assertions.assertTrue(JsonUtil.toJson(truckListInfoResps).contains("\"gpsno\":\"71025437\""));

        }catch (G7OpenapiException e){
            Assertions.assertTrue(e.getMessage().contains("参数长度大于预期值carnum_like"));
        }
    }

    /**
     * 接口描述：车辆_车辆列表接口 /v1/base/truck/truck_list
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
        TruckListReq req = new TruckListReq();
        req.setCarNumLike("鄂FW3N32！@#￥%！@……&*（鄂FW3N3226");
        req.setIsBind(2222222);
        req.setOrgcodeLike("201IHA");
        req.setUpdateTimeGe("");
//        req.setDeleted(33333333);
////        req.setGet_count(1);
//        req.setPageNo(111111111);
//        req.setPageSize(111111111);
        try{
            List<TruckListInfoResp> truckListInfoResps = g7OpenapiClient.truckList(req);
            log.info("rsp:{}", JsonUtil.toJson(truckListInfoResps));
            //校验返回值
            Assertions.assertNotNull(truckListInfoResps);
            Assertions.assertTrue(JsonUtil.toJson(truckListInfoResps).contains("\"carnum\":\"鄂FW3N36\""));
            Assertions.assertTrue(JsonUtil.toJson(truckListInfoResps).contains("\"deleted\":\"0\""));
            Assertions.assertTrue(JsonUtil.toJson(truckListInfoResps).contains("\"orgcode\":\"201IHA0N02\""));
            Assertions.assertTrue(JsonUtil.toJson(truckListInfoResps).contains("\"truckid\":\"7B49E76556C25847D47CBD345FDB5092\""));
            Assertions.assertTrue(JsonUtil.toJson(truckListInfoResps).contains("\"ownid\":\"743332A469534979C03493838349CDEC\""));
            Assertions.assertTrue(JsonUtil.toJson(truckListInfoResps).contains("\"fromtype\":\"1\""));
            Assertions.assertTrue(JsonUtil.toJson(truckListInfoResps).contains("\"fromorgcode\":\"201IHA0N02\""));
            Assertions.assertTrue(JsonUtil.toJson(truckListInfoResps).contains("\"gpsno\":\"71025437\""));

        }catch (G7OpenapiException e){
            Assertions.assertTrue(e.getMessage().contains("参数长度大于预期值carnum_like"));
        }
    }

    /**
     * 接口描述：车辆_车辆列表接口 /v1/base/truck/truck_list
     * 测试传入所有参数，传入空值Deleted
     *
     * @throws Exception
     */
    @Test
    public void testNullParamWithDeleted() throws Exception {
        RestTemplate restTemplate = new RestTemplateBuilder().build();
        IRequest request = new RestTemplateRequest(restTemplate);
        // 创建开放平台接口客户端
        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(url, accessKey, accessSecret, request);
        TruckListReq req = new TruckListReq();
        req.setCarNumLike("鄂FW3N36");
        req.setIsBind(1);
        req.setOrgcodeLike("201IHA");
        req.setUpdateTimeGe("2021-10-12 16:13:11");
        req.setDeleted(-1);
        req.setPageNo(1);
        req.setPageSize(100);
        try{
            List<TruckListInfoResp> truckListInfoResps = g7OpenapiClient.truckList(req);
            log.info("rsp:{}", JsonUtil.toJson(truckListInfoResps));
            //校验返回值
            Assertions.assertNotNull(truckListInfoResps);
            Assertions.assertTrue(JsonUtil.toJson(truckListInfoResps).contains("\"carnum\":\"鄂FW3N36\""));
            Assertions.assertTrue(JsonUtil.toJson(truckListInfoResps).contains("\"deleted\":\"0\""));
            Assertions.assertTrue(JsonUtil.toJson(truckListInfoResps).contains("\"orgcode\":\"201IHA0N02\""));
            Assertions.assertTrue(JsonUtil.toJson(truckListInfoResps).contains("\"truckid\":\"7B49E76556C25847D47CBD345FDB5092\""));
            Assertions.assertTrue(JsonUtil.toJson(truckListInfoResps).contains("\"ownid\":\"743332A469534979C03493838349CDEC\""));
            Assertions.assertTrue(JsonUtil.toJson(truckListInfoResps).contains("\"fromtype\":\"1\""));
            Assertions.assertTrue(JsonUtil.toJson(truckListInfoResps).contains("\"fromorgcode\":\"201IHA0N02\""));
            Assertions.assertTrue(JsonUtil.toJson(truckListInfoResps).contains("\"gpsno\":\"71025437\""));

        }catch (G7OpenapiException e){
            Assertions.assertTrue(e.getMessage().contains("参数长度小于预期值Deleted"));
        }
    }

    /**
     * 接口描述：车辆_车辆列表接口 /v1/base/truck/truck_list
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
        TruckListReq req = new TruckListReq();
        req.setCarNumLike("鲁S32207");
        req.setIsBind(1);
        req.setOrgcodeLike("201IHA");
        req.setUpdateTimeGe("2021-10-12 16:13:11");
        req.setDeleted(0);
//        req.setGet_count(1);
        req.setPageNo(1);
        req.setPageSize(100);
        List<TruckListInfoResp> truckListInfoResps = g7OpenapiClient.truckList(req);
        log.info("rsp:{}", JsonUtil.toJson(truckListInfoResps));

        //校验返回值
        Assertions.assertNull(truckListInfoResps);


    }

    /**
     * 接口描述：车辆_车辆列表接口 /v1/base/truck/truck_list
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
        TruckListReq req = new TruckListReq();
        req.setOrgcodeLike("201IHA");
        try{
            List<TruckListInfoResp> truckListInfoResps = g7OpenapiClient.truckList(req);
            log.info("rsp:{}", JsonUtil.toJson(truckListInfoResps));
            //校验返回值
            Assertions.assertNull(truckListInfoResps);
            Assertions.fail("居然没有限制权限");
        }catch (G7OpenapiException e){
            Assertions.assertTrue(e.getMessage().contains("无权操作数据"));
        }



    }

}
