package cn.com.g7.sdk.kafka.core;

/**
 * 重置offset的信息
 * @author dengfuwei
 * @version 1.0.0
 * @date 2021/9/23 9:23 上午
 */
public class SeekInfo {

    /** kafka topic*/
    private String topic;

    /** kafka topic partition*/
    private int partition;

    /** kafka topic partition offset*/
    private long offset;

    public SeekInfo(String topic, int partition, long offset) {
        this.topic = topic;
        this.partition = partition;
        this.offset = offset;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public int getPartition() {
        return partition;
    }

    public void setPartition(int partition) {
        this.partition = partition;
    }

    public long getOffset() {
        return offset;
    }

    public void setOffset(long offset) {
        this.offset = offset;
    }
}
