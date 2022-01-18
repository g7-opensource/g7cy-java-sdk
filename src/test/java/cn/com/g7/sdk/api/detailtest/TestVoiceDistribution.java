package cn.com.g7.sdk.api.detailtest;

import cn.com.g7.sdk.api.G7OpenapiClient;
import cn.com.g7.sdk.api.G7OpenapiClientTest;
import cn.com.g7.sdk.api.request.IRequest;
import cn.com.g7.sdk.api.request.impl.RestTemplateRequest;
import cn.com.g7.sdk.api.util.AssertUtil;
import cn.com.g7.sdk.api.util.JsonUtil;
import cn.com.g7.sdk.api.vo.FaceTruckLabel;
import cn.com.g7.sdk.api.vo.FaceTruckLabelCreateReq;
import cn.com.g7.sdk.api.vo.MsgBatchSendVoiceReq;
import cn.com.g7.sdk.api.vo.MsgCommonVoiceSendResp;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @创建人 yj
 * @创建时间 2022/1/17
 * @描述
 */
public class TestVoiceDistribution {
    private final Logger log = LoggerFactory.getLogger(TestVoiceDistribution.class);
    private String url = "http://openapi-gateway.test.chinawayltd.com";

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

//        for (int i = 1; i < 6; i++) {
//            MsgBatchSendVoiceReq req = new MsgBatchSendVoiceReq();
//            req.setTxt("你已疲劳驾驶,请注意安全!" + i);
//            req.setPlateNums(Arrays.asList("川A11112", "干B11116", "GREAT02", "登A00003", "开AFM029S", "川A33322", "川SFM633", "粤B11151", "粤B11131"
//                    , "点AFM002S", "粤B11124", "疲AFM027", "川A00003", "点AFM031O", "川A11113", "点AFM031O", "川A11113", "登A00001", "干B11143", "干B11122", "干B11134"
//                    , "手AFM033", "开ASM001", "CESHI9", "粤B11160"));
//            reqList.add(req);
//        }

        MsgBatchSendVoiceReq req = new MsgBatchSendVoiceReq();
        req.setTxt("你已疲劳驾驶,请注意安全!");
        req.setPlateNums(Arrays.asList("川A11112", "干B11116", "GREAT02", "登A00003", "开AFM029S", "川A33322","川A11112", "干B11116", "GREAT02", "登A00003", "开AFM029S", "川A33322"));
        reqList.add(req);

//        MsgBatchSendVoiceReq req = new MsgBatchSendVoiceReq();
//        req.setTxt("你已疲劳驾驶,请注意安全!");
//        req.setPlateNums(Arrays.asList("川A11112", "干B11116", "GREAT02", "登A00003", "开AFM029S", "川A33322", "川SFM633", "粤B11151", "粤B11131"
//                , "点AFM002S", "粤B11124", "疲AFM027", "川A00003", "点AFM031O", "点AFM031O", "川A11113", "登A00001", "干B11143", "干B11122", "干B11134"
//                , "手AFM033", "开ASM001", "CESHI9", "粤B11160", "开AM0011", "粤B11136", "川AFM344", "套AFM622", "载T00002", "开AFM004O"));
//        reqList.add(req);

        List<MsgCommonVoiceSendResp> msgCommonVoiceSendRespList = g7OpenapiClient.batchSendVoice(reqList);
        log.info("rsp:{}", JsonUtil.toJson(msgCommonVoiceSendRespList));
    }
}
