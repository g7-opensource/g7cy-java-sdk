package cn.com.g7.sdk.api.detailtest;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;


/**
* Application Tester.
*
* @author sunzhiping
* @date 2021-10-12
*/

@SpringBootTest
@ExtendWith(SpringExtension.class)
@WebAppConfiguration
public class BaseTest {
    private final Logger log = LoggerFactory.getLogger(BaseTest.class);

    @BeforeEach
    public void before() throws Exception {
        log.info("---------------------------------开始测试---------------------------------");
    }

    @AfterEach
    public void after() throws Exception {
        log.info("---------------------------------测试结束---------------------------------");
    }
}
