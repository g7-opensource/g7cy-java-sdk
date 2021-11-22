package cn.com.g7.sdk.api.detailtest;


import cn.com.g7.sdk.api.G7OpenapiClientTest;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;


/**
 * @author sunzhiping
 * @date 2021-10-12
 *
 */
@RunWith(JUnitPlatform.class)
@SelectClasses({
        G7OpenapiClientTest.class, //需要运行的测试类
        TestWithTruckList.class,    //需要运行的测试类
        TestWithTruckinfo_include_custom_fields.class,
        TestWithGet_truck_model_info.class,
        TestWithTruck_info.class,
        TestWithAdd_self_truck.class,
        TestWithTruck_delete.class,
        TestWithUpdate_self_truck.class,
        TestWithReal_time_url.class,
        TestWithReal_time_by_carnum.class



})


public class SuiteExecuteTests {
    /*
     * 1.测试套件就是组织测试类一起运行的
     *
     * 写一个作为测试套件的入口类，这个类里不包含其他的方法
     * 更改测试运行器Suite.class
     * 将要测试的类作为数组传入到Suite.SuiteClasses（{}）
     */
}


