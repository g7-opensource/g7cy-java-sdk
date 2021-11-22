###包结构说明

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
// 创建开放平台接口客户端,可配置对用的环境地址,使用RestTemplate请求方式
G7OpenapiClient g7OpenapiClient = new G7OpenapiClient(url,accessKey, accessSecret);
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
- 依赖jar包
```xml
<dependency>
    <groupId>cn.com.g7</groupId>
    <artifactId>g7cy-java-sdk</artifactId>
    <version>${g7cy-java-sdk.version}</version>
</dependency>
```

- 配置参数
```properties
spring.kafka.v261.access-key=dev_accesskey
spring.kafka.v261.access-secret=dev_accesssecret
spring.kafka.v261.orgcode=200001
spring.kafka.v261.kafka-broker=broker1:9001,broker2:9001
```

- 增加启动参数(避免中文路径)
```shell
-DKAFKA_CLIENT_TRUST_STORE=/Users/openapi/Documents/workspace/idea2021/demo-parent/demo-sdk-openapi-kafka/kafka/kafka.client.truststore.jks
```

- 继承要订阅的数据处理类，如定位数据
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