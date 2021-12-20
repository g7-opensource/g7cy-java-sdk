package cn.com.g7.sdk.kafka.core;

import cn.com.g7.sdk.kafka.enums.DataCodeEnum;
import org.apache.kafka.v261.clients.consumer.ConsumerRecord;

import java.util.List;

/**
 * kafka数据处理接口定义
 * @author dengfuwei
 * @version 1.0.0
 * @date 2021/9/23 9:33 上午
 */
public interface IKafkaMessageProcessor {

	String DEFAULT = "DEFAULT";

	/**
	 * 订阅数据的编号{@link DataCodeEnum}
	 * @return topic名称
	 */
	default String code() {
		return DEFAULT;
	}

	/**
	 * 单条数据处理
	 * @param code 消费者唯一标识
	 * @param record 消费记录
	 * @throws Exception 异常
	 */
	default void process(String code, ConsumerRecord<String, String> record) throws Exception {
	}

	/**
	 * 批量数据处理。配置了 spring.kafka.consumers.code.max-batch-size>1 才会执行此方法，如果没有实现此方法，默认使用单条数据处理的方法
	 * @param code 消费者唯一标识
	 * @param records 消费记录
	 * @throws Exception 异常
	 */
	default void process(String code, List<ConsumerRecord<String, String>> records) throws Exception {
		for (ConsumerRecord<String, String> record : records) {
			process(code, record);
		}
	}
}
