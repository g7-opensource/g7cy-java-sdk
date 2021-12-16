package cn.com.g7.sdk.api;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author dengfuwei
 * @version 1.0.0
 * @date 2021/12/16 6:32 下午
 */
@Configuration
@EnableConfigurationProperties(OpenapiProperties.class)
public class OpenapiAutoConfiguration {

    @Resource
    private OpenapiProperties openapiProperties;

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnBean(RestTemplate.class)
    public G7OpenapiClient g7OpenapiClient() {
        return new G7OpenapiClient(openapiProperties.getAccessKey(), openapiProperties.getAccessSecret());
    }
}
