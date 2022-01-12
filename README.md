### 包结构说明

- api：API接口相关
   - enums：枚举
   - request：API请求相关，包含请求的不同实现，记录请求相关信息的bean，请求返回数据结构定义
   - util：工具类
   - vo：请求参数和返回值对象定义
- kafka：kafka消费相关
   - bo：数据类定义
   - consumer：数据消费者抽象类
   - core：kafka消费核心处理
   - enums：枚举

### API使用说明
- 依赖jar包
```xml
<dependency>
    <groupId>cn.com.g7</groupId>
    <artifactId>g7cy-java-sdk</artifactId>
    <version>${g7cy-java-sdk.version}</version>
</dependency>
```

- 配置参数（spring boot方式）
```properties
# 开放平台地址
g7.openapi.url=https://openapi.huoyunren.com
# access_key
g7.openapi.access-key=access_key
# access_secret
g7.openapi.access-secret=access_secret
```

- 参数说明
```java
/** 开放平台host，不同环境不一样*/
private String url;
/** 认证accessKey*/
private String accessKey;
/** 认证accessSecret*/
private String accessSecret;
```

- 创建API客户端(示例一)
```java
// 创建请求bean 主要决定使用那种请求方式(如RestTemplate)
RestTemplate restTemplate = new RestTemplateBuilder().build();
IRequest request = new RestTemplateRequest(restTemplate);
// 创建开放平台接口客户端
G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(url, accessKey, accessSecret, request);
```
- 创建API客户端(示例二)
```java
// 创建开放平台接口客户端(默认正式环境)
G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(accessKey, accessSecret);
```
- 创建API客户端(示例三)
```java
// 创建开放平台接口客户端,可配置对应的环境地址,使用RestTemplate请求方式
G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(url,accessKey, accessSecret);
```
- 创建API客户端(示例四)
```java
// 创建开放平台接口客户端,可配置对应的环境地址、连接超时、响应超时、参数；使用RestTemplate请求方式
G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(url, accessKey, accessSecret, connectTimeout, readTimeout);

// 创建开放平台接口客户端,可配置连接超时、响应超时、参数；使用RestTemplate请求方式
G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(accessKey, accessSecret, connectTimeout, readTimeout);
```

- 请求示例
```java
// 创建开放平台接口客户端
G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(accessKey, accessSecret);
TruckListReq req = new TruckListReq();
req.setOrgcodeLike("XXXXXX");
//调用查询车辆的方法
List<TruckListInfoResp> truckList = g7OpenapiClient.truckList(req);
```

### Kafka消费数据使用说明(spring boot方式)
- 安装kafka-client定制包到私有仓库，jar包和源码包在resources/lib目录
- 依赖jar包

```xml
<dependencies>
  <dependency>
      <groupId>cn.com.g7</groupId>
      <artifactId>g7cy-java-sdk</artifactId>
      <version>${g7cy-java-sdk.version}</version>
  </dependency>
  
  <dependency>
      <groupId>cn.com.g7</groupId>
      <artifactId>kafka-clients-v2.6.1</artifactId>
      <version>${kafka-clients-v261.version}</version>
      <exclusions>
          <exclusion>
              <groupId>org.apache.kafka</groupId>
              <artifactId>kafka-clients</artifactId>
          </exclusion>
      </exclusions>
  </dependency>
</dependencies>
```

- 配置参数
```properties
g7.kafka.consumer.enable=true
g7.kafka.orgcode=200001
g7.kafka.access-key=dev_accesskey
g7.kafka.access-secret=dev_accesssecret
```

- 增加启动参数(避免中文路径，注意修改文件路径)
```shell
-DKAFKA_CLIENT_TRUST_STORE=-DKAFKA_CLIENT_TRUST_STORE=/Users/dengfuwei/Documents/workspace/idea2021/g7cy-java-sdk-example/src/main/resources/kafka/kafka.client.truststore.jks
```

- 继承要订阅的数据处理类，如定位数据(所有抽象类：cn.com.g7.sdk.kafka.consumer.*)
```java
import cn.com.g7.openapi.sdk.bo.Location;
import cn.com.g7.openapi.sdk.consumer.AbstractLocationConsumer;
import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
@Component
public class G7LocationConsumer extends AbstractLocationConsumer {

    private final Logger log = LoggerFactory.getLogger(G7LocationConsumer.class);

    @Override
    public void process(Location location) {
        log.info("g7 location:{}", JSON.toJSONString(location));
    }
}
```

#### 其他说明
- 注意修改启动参数中的文件路径
- kafka认证文件必须放到直接可读的位置，不能放到依赖的jar包里面
- 建议获取到数据后第一步是记录日志并发送到内部MQ中，再异步进行处理，因为不同类型的数据是在一个kafka topic中，避免同步处理数据慢导致阻塞
- kafka topic的partition数量为3，因此建议最大消费者数量为3个
- 正常情况下数据是有序的（设备维度有序），但为了保证尽量不丢数据，会有重试机制，可能导致最终收到的数据乱序，可以根据收到数据的time字段判断数据产生的时间