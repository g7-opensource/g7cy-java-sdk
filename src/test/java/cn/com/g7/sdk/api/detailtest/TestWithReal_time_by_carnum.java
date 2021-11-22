package cn.com.g7.sdk.api.detailtest;

import cn.com.g7.sdk.api.G7OpenapiClient;
import cn.com.g7.sdk.api.G7OpenapiException;
import cn.com.g7.sdk.api.util.JsonUtil;
import cn.com.g7.sdk.api.vo.RealTimeVideoReq;
import cn.com.g7.sdk.api.vo.RealTimeVideoResp;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * 单元测试
 * 接口描述：实时视频-根据车牌获取实时视频连接 /v1/device/video/real_time_by_carnum
 * @author sunzhiping
 * @date 2021-10-13
 */

public class TestWithReal_time_by_carnum {
    private final Logger log = LoggerFactory.getLogger(TestWithReal_time_by_carnum.class);
    // 测试环境2000VO  开放平台流媒体账号
    private String url = "http://openapi-gateway.test.chinawayltd.com";
    private String accessKey = "ewnx7r";
    private String accessSecret = "Ofrru7rDWbFGsv0GHBQScgOO2MxAlat6";
    private String orgcode = "2000VO";


    /**
     * 接口描述：实时视频-根据车牌获取实时视频连接 /v1/device/video/real_time_by_carnum
     * 测试传入必填参数
     *
     */
    @Test
    public void withRequiredParam() throws Exception {

        // 创建请求bean
        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(url, accessKey, accessSecret);
        RealTimeVideoReq req = new RealTimeVideoReq();
        req.setCarnum("测GF06T1");
        req.setOrgcode("2000VO");
        req.setStreamType(1);
        List<RealTimeVideoResp> realTimeVideoResp = g7OpenapiClient.realTimeByCarNum(req);
        log.info("rsp:{}", JsonUtil.toJson(realTimeVideoResp));
        Assertions.assertNotNull(realTimeVideoResp);
        Assertions.assertTrue(JsonUtil.toJson(realTimeVideoResp).contains("app=g7-flv-video"));
        Assertions.assertTrue(JsonUtil.toJson(realTimeVideoResp).contains("133064013020458"));

    }

    /**
     * 接口描述：实时视频-根据车牌获取实时视频连接 /v1/device/video/real_time_by_carnum
     * 测试传入必填参数
     *
     */
    @Test
    public void withAllParam() throws Exception {

        // 创建请求bean
        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(url, accessKey, accessSecret);
        RealTimeVideoReq req = new RealTimeVideoReq();
        req.setCarnum("测GF06T1");
        req.setOrgcode("2000VO");
        req.setHttps(false);
        req.setChannelNos("1,2");
        req.setStorage(false);
        req.setStreamType(0);
        List<RealTimeVideoResp> realTimeVideoResp = g7OpenapiClient.realTimeByCarNum(req);
        log.info("rsp:{}", JsonUtil.toJson(realTimeVideoResp));
        Assertions.assertNotNull(realTimeVideoResp);
        Assertions.assertTrue(JsonUtil.toJson(realTimeVideoResp).contains("app=g7-flv-video"));
        Assertions.assertTrue(JsonUtil.toJson(realTimeVideoResp).contains("133064013020458"));
    }

    /**
     * 接口描述：实时视频-根据车牌获取实时视频连接 /v1/device/video/real_time_by_carnum
     * 测试传入必填参数
     *
     */
    @Test
    public void withAllParamHttpsandStorage() throws Exception {

        // 创建请求bean
        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(url, accessKey, accessSecret);
        RealTimeVideoReq req = new RealTimeVideoReq();
        req.setCarnum("测GF06T1");
        req.setOrgcode("2000VO");
        req.setHttps(true);
        req.setChannelNos("1,2");
        req.setStorage(true);
        req.setStreamType(0);
        List<RealTimeVideoResp> realTimeVideoResp = g7OpenapiClient.realTimeByCarNum(req);
        log.info("rsp:{}", JsonUtil.toJson(realTimeVideoResp));
        Assertions.assertNotNull(realTimeVideoResp);
        Assertions.assertTrue(JsonUtil.toJson(realTimeVideoResp).contains("app=g7-flv-video"));
        Assertions.assertTrue(JsonUtil.toJson(realTimeVideoResp).contains("133064013020458"));
    }

    /**
     * 接口描述：实时视频-根据车牌获取实时视频连接 /v1/device/video/real_time_by_carnum
     *输入错误的车牌号
     */
    @Test
    public void withAllParamOnErrorplate_num() throws Exception {


        // 创建请求bean
        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(url, accessKey, accessSecret);
        RealTimeVideoReq req = new RealTimeVideoReq();
        req.setCarnum("测GF06T111");
        req.setOrgcode("2000VO");
        req.setHttps(true);
        req.setChannelNos("1,2");
        req.setStorage(true);
        req.setStreamType(0);

        try{
            List<RealTimeVideoResp> realTimeVideoResp = g7OpenapiClient.realTimeByCarNum(req);
            log.info("rsp:{}", JsonUtil.toJson(realTimeVideoResp));
            Assertions.assertNotNull(realTimeVideoResp);
            Assertions.assertTrue(JsonUtil.toJson(realTimeVideoResp).contains("[]"));


        }catch (G7OpenapiException e){
            Assertions.assertTrue(e.getMessage().contains("can not find carnum->{测GF06T111} for this car under this orgcode->{2000VO}"));
        }
    }

    /**
     * 接口描述：实时视频-根据车牌获取实时视频连接 /v1/device/video/real_time_by_carnum
     * 多个车牌号
     */
    @Test
    public void withAllParamOnmore() throws Exception {
        // 创建请求bean
        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(url, accessKey, accessSecret);
        RealTimeVideoReq req = new RealTimeVideoReq();
        req.setCarnum("测GF06T1,测G7FS01");
        req.setOrgcode("2000VO");
        req.setHttps(false);
        req.setChannelNos("1,2");
        req.setStorage(false);
        req.setStreamType(1);

        try{
            List<RealTimeVideoResp> realTimeVideoResp = g7OpenapiClient.realTimeByCarNum(req);
            log.info("rsp:{}", JsonUtil.toJson(realTimeVideoResp));
            Assertions.assertNotNull(realTimeVideoResp);
            Assertions.assertTrue(JsonUtil.toJson(realTimeVideoResp).contains("[]"));


        }catch (G7OpenapiException e){
            Assertions.assertTrue(e.getMessage().contains("can not find carnum->{测GF06T1,测G7FS01} for this car under this orgcode->{2000VO}"));
        }

    }



    /**
     * 接口描述：实时视频-根据车牌获取实时视频连接 /v1/device/video/real_time_by_carnum
     * 测试传入所有参数，传入空值
     */
    @Test
    public void testnoParamCarnum() throws Exception {

        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(url, accessKey, accessSecret);
        RealTimeVideoReq req = new RealTimeVideoReq();
//        req.setCarnum("测GF06T1");
        req.setOrgcode("2000VO");
        req.setHttps(false);
        req.setChannelNos("1,2");
        req.setStorage(false);
        req.setStreamType(1);
        try{
            List<RealTimeVideoResp> realTimeVideoResp = g7OpenapiClient.realTimeByCarNum(req);
            log.info("rsp:{}", JsonUtil.toJson(realTimeVideoResp));
            Assertions.assertNotNull(realTimeVideoResp);
            Assertions.assertTrue(JsonUtil.toJson(realTimeVideoResp).contains("[]"));
        }catch (G7OpenapiException e){
            Assertions.assertTrue(e.getMessage().contains("can not find carnum->{null} for this car under this orgcode->{2000VO}"));
        }
    }


    /**
     * 接口描述：实时视频-根据车牌获取实时视频连接 /v1/device/video/real_time_by_carnum
     * 测试传入所有参数，不传入值
     */
    @Test
    public void testnoParamStreamType() throws Exception {

        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(url, accessKey, accessSecret);
        RealTimeVideoReq req = new RealTimeVideoReq();
        req.setCarnum("测GF06T1");
        req.setOrgcode("2000VO");
        req.setHttps(false);
        req.setChannelNos("1,2");
        req.setStorage(false);
//        req.setStreamType(1);
        try{
            List<RealTimeVideoResp> realTimeVideoResp = g7OpenapiClient.realTimeByCarNum(req);
            log.info("rsp:{}", JsonUtil.toJson(realTimeVideoResp));
            Assertions.assertNotNull(realTimeVideoResp);
            Assertions.assertTrue(JsonUtil.toJson(realTimeVideoResp).contains("[]"));
        }catch (G7OpenapiException e){
            Assertions.assertTrue(e.getMessage().contains("服务器错误！Failed to convert value of type 'java.lang.String' to required type 'java.lang.Integer'; "));
        }
    }


    /**
     * 接口描述：实时视频-根据车牌获取实时视频连接 /v1/device/video/real_time_by_carnum
     * 测试传入所有参数，不传入值
     */
    @Test
    public void testnoParamOrgcode() throws Exception {

        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(url, accessKey, accessSecret);
        RealTimeVideoReq req = new RealTimeVideoReq();
        req.setCarnum("测GF06T1");
//        req.setOrgcode("2000VO");
        req.setHttps(false);
        req.setChannelNos("1,2");
        req.setStorage(false);
        req.setStreamType(1);
        try{
            List<RealTimeVideoResp> realTimeVideoResp = g7OpenapiClient.realTimeByCarNum(req);
            log.info("rsp:{}", JsonUtil.toJson(realTimeVideoResp));
            Assertions.assertNotNull(realTimeVideoResp);
            Assertions.assertTrue(JsonUtil.toJson(realTimeVideoResp).contains("[]"));
        }catch (G7OpenapiException e){
            Assertions.assertTrue(e.getMessage().contains("服务器错误！Required String parameter 'orgcode' is not present"));
        }
    }

    /**
     * 接口描述：实时视频-根据车牌获取实时视频连接 /v1/device/video/real_time_by_carnum
     * 测试传入所有参数，传入空值
     */
    @Test
    public void testNullParamCarnum() throws Exception {

        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(url, accessKey, accessSecret);
        RealTimeVideoReq req = new RealTimeVideoReq();
        req.setCarnum("");
        req.setOrgcode("2000VO");
        req.setHttps(false);
        req.setChannelNos("1,2");
        req.setStorage(false);
        req.setStreamType(1);
        try{
            List<RealTimeVideoResp> realTimeVideoResp = g7OpenapiClient.realTimeByCarNum(req);
            log.info("rsp:{}", JsonUtil.toJson(realTimeVideoResp));
            Assertions.assertNotNull(realTimeVideoResp);
            Assertions.assertTrue(JsonUtil.toJson(realTimeVideoResp).contains("[]"));
        }catch (G7OpenapiException e){
            Assertions.assertTrue(e.getMessage().contains("服务器错误！Required String parameter 'carnum' is not present"));
        }
    }

    /**
     * 接口描述：实时视频-根据车牌获取实时视频连接 /v1/device/video/real_time_by_carnum
     * 测试传入所有参数，传入空值
     */
    @Test
    public void testNullParamOrgcode() throws Exception {

        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(url, accessKey, accessSecret);
        RealTimeVideoReq req = new RealTimeVideoReq();
        req.setCarnum("测GF06T1");
        req.setOrgcode("");
        req.setHttps(false);
        req.setChannelNos("1,2");
        req.setStorage(false);
        req.setStreamType(1);
        try{
            List<RealTimeVideoResp> realTimeVideoResp = g7OpenapiClient.realTimeByCarNum(req);
            log.info("rsp:{}", JsonUtil.toJson(realTimeVideoResp));
            Assertions.assertNotNull(realTimeVideoResp);
            Assertions.assertTrue(JsonUtil.toJson(realTimeVideoResp).contains("[]"));
        }catch (G7OpenapiException e){
            Assertions.assertTrue(e.getMessage().contains("服务器错误！Required String parameter 'orgcode' is not present"));
        }
    }
    /**
     * 接口描述：实时视频-根据车牌获取实时视频连接 /v1/device/video/real_time_by_carnum
     * 测试传入所有参数，传入空值
     */
    @Test
    public void testNullParamStreamType() throws Exception {

        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(url, accessKey, accessSecret);
        RealTimeVideoReq req = new RealTimeVideoReq();
        req.setCarnum("测GF06T1");
        req.setOrgcode("2000VO");
        req.setHttps(false);
        req.setChannelNos("1,2");
        req.setStorage(false);
        req.setStreamType(-1);
        try{
            List<RealTimeVideoResp> realTimeVideoResp = g7OpenapiClient.realTimeByCarNum(req);
            log.info("rsp:{}", JsonUtil.toJson(realTimeVideoResp));
            Assertions.assertNotNull(realTimeVideoResp);
            Assertions.assertTrue(JsonUtil.toJson(realTimeVideoResp).contains("[]"));
        }catch (G7OpenapiException e){
            Assertions.assertTrue(e.getMessage().contains("streamType must to be 0 or 1"));
        }
    }


    /**
     * 接口描述：实时视频-根据车牌获取实时视频连接 /v1/device/video/real_time_by_carnum
     * 测试传入所有参数，传入空值
     */
    @Test
    public void testnoParam() throws Exception {

        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(url, accessKey, accessSecret);
        RealTimeVideoReq req = new RealTimeVideoReq();

        try{
            List<RealTimeVideoResp> realTimeVideoResp = g7OpenapiClient.realTimeByCarNum(req);
            log.info("rsp:{}", JsonUtil.toJson(realTimeVideoResp));
            Assertions.assertNotNull(realTimeVideoResp);
            Assertions.assertTrue(JsonUtil.toJson(realTimeVideoResp).contains("[]"));
        }catch (G7OpenapiException e){
            Assertions.assertTrue(e.getMessage().contains("服务器错误！Required String parameter 'orgcode' is not present"));
        }
    }
    /**
     * 接口描述：实时视频-根据车牌获取实时视频连接 /v1/device/video/real_time_by_carnum
     * Testcasename:测试传入超长参数
     *
     * 
     */
    @Test
    public void testBigParam() throws Exception {

        // 创建请求bean
        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(url, accessKey, accessSecret);
        RealTimeVideoReq req = new RealTimeVideoReq();
        req.setCarnum("测GF0测GF06T111测GF06T111测GF06T111测GF06T111测GF06T111测GF06T111测GF06T111测GF06T111测GF06T111测GF06T111测GF06T111测GF06T1116T111");
        req.setOrgcode("20002000VO2000VO2000VO2000VO2000VO2000VO2000VO2000VO2000VO2000VO2000VO2000VO2000VO2000VO2000VO2000VO2000VO2000VO2000VOVO");
        req.setHttps(true);
        req.setChannelNos("1,2");
        req.setStorage(true);
        req.setStreamType(0);

        try{
            List<RealTimeVideoResp> realTimeVideoResp = g7OpenapiClient.realTimeByCarNum(req);
            log.info("rsp:{}", JsonUtil.toJson(realTimeVideoResp));
            Assertions.assertNotNull(realTimeVideoResp);
            Assertions.assertTrue(JsonUtil.toJson(realTimeVideoResp).contains("[]"));


        }catch (G7OpenapiException e){
            Assertions.assertTrue(e.getMessage().contains("can not find carnum"));
        }

    }


}
