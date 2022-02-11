package cn.com.g7.sdk.kafka.core;

import cn.com.g7.sdk.kafka.consumer.IMessageConsumer;
import cn.com.g7.sdk.kafka.consumer.KafkaMessageProcessor;
import org.apache.kafka.g7.clients.CommonClientConfigs;
import org.apache.kafka.g7.clients.consumer.ConsumerConfig;
import org.apache.kafka.g7.common.config.SaslConfigs;
import org.apache.kafka.g7.common.config.SslConfigs;
import org.apache.kafka.g7.common.security.auth.SecurityProtocol;
import org.apache.kafka.g7.common.security.plain.PlainLoginModule;
import org.apache.kafka.g7.common.serialization.StringDeserializer;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.List;
import java.util.Properties;

/**
 * spring boot自动配置
 * @author dengfuwei
 * @version 1.0.0
 * @date 2021/9/18 2:49 下午
 */
@Configuration
@EnableConfigurationProperties(KafkaV261Properties.class)
public class KafkaV261AutoConfiguration {

    @Resource
    private KafkaV261Properties kafkaV261Properties;

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnBean(IMessageConsumer.class)
    public IKafkaMessageProcessor kafkaMessageProcessor(List<IMessageConsumer> messageHandlers) {
        return new KafkaMessageProcessor(messageHandlers);
    }

    /**
     * 初始化kafka消费者工厂类
     * @param kafkaMessageProcessor 消息处理器
     * @return kafka消费者创建工厂
     */
    @Bean
    @ConditionalOnBean(IKafkaMessageProcessor.class)
    @ConditionalOnMissingBean
    @ConditionalOnProperty(name = "g7.kafka.consumer.enable", havingValue = "true")
    public KafkaV261ConsumerFactory kafkaV261ConsumerFactory(IKafkaMessageProcessor kafkaMessageProcessor) {
        // kafka消费者工厂bean
        KafkaV261ConsumerFactory kafkaV261ConsumerFactory = new KafkaV261ConsumerFactory();

        String topic = buildTopic();
        // 根据实际实现的类，初始化消费者配置
        kafkaV261ConsumerFactory.getProcessorMap().put(topic, kafkaMessageProcessor);

        KafkaV261Properties.Consumer config = kafkaV261Properties.getConsumers().get(topic);
        if (config == null) {
            config = new KafkaV261Properties.Consumer();
        }
        config.setTopic(topic);
        config.getProps().putIfAbsent(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG, false);
        config.getProps().putIfAbsent(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "latest");
        config.getProps().putIfAbsent(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
        config.getProps().putIfAbsent(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
        config.getProps().putIfAbsent(ConsumerConfig.GROUP_ID_CONFIG, buildGroup());
        config.getProps().putIfAbsent(CommonClientConfigs.BOOTSTRAP_SERVERS_CONFIG, kafkaV261Properties.getKafkaBroker());

        // SASL config
        config.getProps().putIfAbsent(CommonClientConfigs.SECURITY_PROTOCOL_CONFIG, SecurityProtocol.SASL_SSL.name());
        config.getProps().putIfAbsent(SaslConfigs.SASL_MECHANISM, "PLAIN");
        config.getProps().putIfAbsent(SaslConfigs.SASL_JAAS_CONFIG, PlainLoginModule.class.getName() + " required username=\"" + kafkaV261Properties.getAccessKey() + "\" password=\"" + kafkaV261Properties.getAccessSecret() + "\";");
        // SSL config
        config.getProps().putIfAbsent(SslConfigs.SSL_ENDPOINT_IDENTIFICATION_ALGORITHM_CONFIG, "");
        // 认证文件
        String truststore = System.getProperty(KafkaConstants.KAFKA_CLIENT_TRUST_STORE);
        if (StringUtils.isEmpty(truststore)) {
            throw new IllegalArgumentException("truststore file is empty, please add -D" + KafkaConstants.KAFKA_CLIENT_TRUST_STORE + " parameter");
        }
        config.getProps().putIfAbsent(SslConfigs.SSL_TRUSTSTORE_LOCATION_CONFIG, truststore);
        // 密码跟文件对应的，不能随意修改
        config.getProps().putIfAbsent(SslConfigs.SSL_TRUSTSTORE_PASSWORD_CONFIG, kafkaV261Properties.getTrustStorePassword());

        kafkaV261Properties.getConsumers().put(topic, config);

        // 合并配置参数，不能改变commonProps的数据，否则同时初始化多个会出现配置参数混乱的情况
        Properties props = new Properties();
        props.putAll(kafkaV261Properties.getCommonProps());
        props.putAll(config.getProps());
        config.setProps(props);

        kafkaV261ConsumerFactory.createIfAbsent(topic, config);
        return kafkaV261ConsumerFactory;
    }

    /**
     * 构建topic名称
     * @return topic名称
     */
    private String buildTopic() {
        return new StringBuilder()
                .append("topic_")
                .append(kafkaV261Properties.getOrgcode())
                .append("_")
                .append(kafkaV261Properties.getAccessKey())
                .toString();
    }

    /**
     * 构建消费组名称
     * @return 消费组名称
     */
    private String buildGroup() {
        StringBuilder group = new StringBuilder();
        if (!StringUtils.isEmpty(kafkaV261Properties.getCluster())) {
            group.append(kafkaV261Properties.getCluster()).append("_");
        }
        return group.append("group_")
                .append(kafkaV261Properties.getOrgcode())
                .append("_")
                .append(kafkaV261Properties.getAccessKey())
                .toString();
    }
}
