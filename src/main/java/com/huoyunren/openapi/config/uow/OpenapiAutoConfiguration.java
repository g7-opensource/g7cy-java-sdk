package com.huoyunren.openapi.config.uow;

import com.huoyunren.openapi.util.http.G7OpenapiClient;
import javax.annotation.Resource;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author luoyu
 * @version 1.0.0
 */
@Configuration
@EnableConfigurationProperties(OpenapiProperties.class)
public class OpenapiAutoConfiguration {

    @Resource
    private OpenapiProperties openapiProperties;

    @Bean(value = "uowG7OpenapiClient")
    @ConditionalOnMissingBean
    @ConditionalOnBean(RestTemplate.class)
    public G7OpenapiClient g7OpenapiClient() {
        return new G7OpenapiClient(openapiProperties.getAccessKey(), openapiProperties.getAccessSecret());
    }
}
