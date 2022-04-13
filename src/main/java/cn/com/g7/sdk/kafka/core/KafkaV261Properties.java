package cn.com.g7.sdk.kafka.core;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

/**
 * spring boot配置项
 * @author dengfuwei
 * @version 1.0.0
 * @date 2021/9/18 2:45 下午
 */
@ConfigurationProperties(prefix = "g7.kafka")
public class KafkaV261Properties {

    /** 机构号*/
    private String orgcode;

    /** 用户名-密码键值对*/
    private Map<String, String> authMap;

    /** 集群编号，如果配置值，会拼接到消费组的前面.需要提前配置消费组授权才能使用*/
    private String cluster;

    /** kafkaBroker环境 默认正式*/
    private String kafkaBroker = KafkaConstants.KAFKA_BROKER;

    /** 认证文件密码*/
    private String trustStorePassword = "123456";

    /** 公共属性*/
    private Properties commonProps = new Properties();

    /** 消费者配置，key为自定义的唯一标识，value为消费者配置*/
    private Map<String, Consumer> consumers = new ConcurrentHashMap<>();

    /**
     * 消费者配置
     * @author openapi
     * @version 1.0.0
     * @date 2021/9/18 2:48 下午
     */
    public static class Consumer {

        /** 配置属性*/
        private Properties props = new Properties();

        /** topic，只支持单个*/
        private String topic;

        /** 启动的消费者数量*/
        private int count = 1;

        /** 是否拉取数据*/
        private boolean poll = true;

        /** 是否停止消费*/
        private boolean stop = false;

        /** 拉取数据超时时间，单位毫秒*/
        private long timeout = 3000;

        /** 处理数据期间，手动提交offset的间隔，单位毫秒。与 commitRecords 同时生效*/
        private long commitInterval = 2000;

        /** 处理达到指定条数时提交offsets，与 commitInterval 同时生效*/
        private int commitRecords = 500;

        /** 出现异常时的间隔处理时间，单位毫秒*/
        private long expInterval = 5000;

        /** 内存队列最大等待数量，超过此数量时将暂停拉取数据*/
        private int maxQueueSize = 1000;

        /** 最大批量处理数量，为1表示单条处理，大于1表示每次处理多条。默认为1*/
        private int maxBatchSize = 1;

        public Properties getProps() {
            return props;
        }

        public void setProps(Properties props) {
            this.props = props;
        }

        public String getTopic() {
            return topic;
        }

        public void setTopic(String topic) {
            this.topic = topic;
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public boolean isPoll() {
            return poll;
        }

        public void setPoll(boolean poll) {
            this.poll = poll;
        }

        public boolean isStop() {
            return stop;
        }

        public void setStop(boolean stop) {
            this.stop = stop;
        }

        public long getTimeout() {
            return timeout;
        }

        public void setTimeout(long timeout) {
            this.timeout = timeout;
        }

        public long getCommitInterval() {
            return commitInterval;
        }

        public void setCommitInterval(long commitInterval) {
            this.commitInterval = commitInterval;
        }

        public int getCommitRecords() {
            return commitRecords;
        }

        public void setCommitRecords(int commitRecords) {
            this.commitRecords = commitRecords;
        }

        public long getExpInterval() {
            return expInterval;
        }

        public void setExpInterval(long expInterval) {
            this.expInterval = expInterval;
        }

        public int getMaxQueueSize() {
            return maxQueueSize;
        }

        public void setMaxQueueSize(int maxQueueSize) {
            this.maxQueueSize = maxQueueSize;
        }

        public int getMaxBatchSize() {
            return maxBatchSize;
        }

        public void setMaxBatchSize(int maxBatchSize) {
            this.maxBatchSize = maxBatchSize;
        }
    }

    public String getOrgcode() {
        return orgcode;
    }

    public void setOrgcode(String orgcode) {
        this.orgcode = orgcode;
    }

    public String getCluster() {
        return cluster;
    }

    public void setCluster(String cluster) {
        this.cluster = cluster;
    }

    public String getKafkaBroker() {
        return kafkaBroker;
    }

    public void setKafkaBroker(String kafkaBroker) {
        this.kafkaBroker = kafkaBroker;
    }

    public String getTrustStorePassword() {
        return trustStorePassword;
    }

    public void setTrustStorePassword(String trustStorePassword) {
        this.trustStorePassword = trustStorePassword;
    }

    public Properties getCommonProps() {
        return commonProps;
    }

    public void setCommonProps(Properties commonProps) {
        this.commonProps = commonProps;
    }

    public Map<String, Consumer> getConsumers() {
        return consumers;
    }

    public void setConsumers(Map<String, Consumer> consumers) {
        this.consumers = consumers;
    }

    public Map<String, String> getAuthMap() {
        return authMap;
    }

    public void setAuthMap(Map<String, String> authMap) {
        this.authMap = authMap;
    }
}
