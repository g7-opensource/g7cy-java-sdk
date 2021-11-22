package cn.com.g7.sdk.api.detailtest;

import cn.com.g7.sdk.api.G7OpenapiClient;
import cn.com.g7.sdk.api.G7OpenapiException;
import cn.com.g7.sdk.api.util.JsonUtil;
import cn.com.g7.sdk.api.vo.VideoRealTimeUrlResp;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * 单元测试
 * 接口描述：实时视频查询 /v1/media/video/real_time_url
 * @author sunzhiping
 * @date 2021-10-13
 */

public class TestWithReal_time_url {
    private final Logger log = LoggerFactory.getLogger(TestWithReal_time_url.class);
    // 测试环境 开放平台流媒体账号
    private String url = "http://openapi-gateway.test.chinawayltd.com";
    private String accessKey = "ewnx7r";
    private String accessSecret = "Ofrru7rDWbFGsv0GHBQScgOO2MxAlat6";
    private String orgcode = "2000VO";


    /**
     * 接口描述：实时视频查询 /v1/media/video/real_time_url
     * 测试传入必填参数
     *
     */
    @Test
    public void withRequiredParam() throws Exception {

        // 创建请求bean
        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(url, accessKey, accessSecret);
        List<VideoRealTimeUrlResp> resp = g7OpenapiClient.videoRealTimeUrl("测GF06T1");
        log.info("rsp:{}", JsonUtil.toJson(resp));
        Assertions.assertNotNull(resp);
        Assertions.assertTrue(JsonUtil.toJson(resp).contains("app=g7-flv-video"));
        Assertions.assertTrue(JsonUtil.toJson(resp).contains("133064013020458"));

    }

    /**
     * 接口描述：实时视频查询 /v1/media/video/real_time_url
     *输入错误的车牌号
     */
    @Test
    public void withAllParamOnErrorplate_num() throws Exception {
        // 创建请求bean
        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(url, accessKey, accessSecret);
        List<VideoRealTimeUrlResp> resp = g7OpenapiClient.videoRealTimeUrl("测GF06T111");
        log.info("rsp:{}", JsonUtil.toJson(resp));
        Assertions.assertTrue(JsonUtil.toJson(resp).contains("[]"));

    }

    /**
     * 接口描述：实时视频查询 /v1/media/video/real_time_url
     * 多个车牌号
     */
    @Test
    public void withAllParamOnmore() throws Exception {

        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(url, accessKey, accessSecret);
        List<VideoRealTimeUrlResp>  resp = g7OpenapiClient.videoRealTimeUrl("测GF06T1,测G7FS01");
        log.info("rsp:{}", JsonUtil.toJson(resp));
        Assertions.assertNotNull(resp);

    }



    /**
     * 接口描述：实时视频查询 /v1/media/video/real_time_url
     * 测试传入所有参数，传入空值
     *
     * 
     */
    @Test
    public void testNullParam() throws Exception {

        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(url, accessKey, accessSecret);

        

        try{
            List<VideoRealTimeUrlResp>  resp = g7OpenapiClient.videoRealTimeUrl("");
            log.info("rsp:{}", JsonUtil.toJson(resp));
            Assertions.assertNotNull(resp);


        }catch (G7OpenapiException e){
            Assertions.assertTrue(e.getMessage().contains("服务器错误！Required String parameter 'plate_num' is not present"));
        }
    }



    /**
     * 接口描述：实时视频查询 /v1/media/video/real_time_url
     * Testcasename:测试传入超长参数
     *
     * 
     */
    @Test
    public void testBigParam() throws Exception {
        G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(url, accessKey, accessSecret);
        List<VideoRealTimeUrlResp> resp = g7OpenapiClient.videoRealTimeUrl("测GF06TFF0706F072AD7B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50927B49E76556C25847D47CBD345FDB50929444265B416C9AE624561");
        log.info("rsp:{}", JsonUtil.toJson(resp));
        Assertions.assertTrue(JsonUtil.toJson(resp).contains("[]"));


    }


}
