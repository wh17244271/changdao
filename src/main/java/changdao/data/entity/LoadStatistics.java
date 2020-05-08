package changdao.data.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * 负荷统计信息
 */
public class LoadStatistics {
    /**
     * 最大负荷值
     */
    private String maxLoad;
    /**
     * 最大采集时间
     */
    @JsonFormat(pattern="yyyy-MM-dd hh:mm:ss",timezone = "GMT+8")
    private Date maxLoadTime;
    /**
     * 最小负荷值
     */
    private String minLoad;
    /**
     * 最小采集时间
     */
    @JsonFormat(pattern="yyyy-MM-dd hh:mm:ss",timezone = "GMT+8")
    private Date minLoadTime;
    /**
     * 当前负荷值
     */
    private String currentLoad;
    /**
     * 当前采集时间
     */
    @JsonFormat(pattern="yyyy-MM-dd hh:mm:ss",timezone = "GMT+8")
    private Date currentLoadTime;

    public String getMaxLoad() {
        return maxLoad;
    }

    public void setMaxLoad(String maxLoad) {
        this.maxLoad = maxLoad;
    }

    public Date getMaxLoadTime() {
        return maxLoadTime;
    }

    public void setMaxLoadTime(Date maxLoadTime) {
        this.maxLoadTime = maxLoadTime;
    }

    public String getMinLoad() {
        return minLoad;
    }

    public void setMinLoad(String minLoad) {
        this.minLoad = minLoad;
    }

    public Date getMinLoadTime() {
        return minLoadTime;
    }

    public void setMinLoadTime(Date minLoadTime) {
        this.minLoadTime = minLoadTime;
    }

    public String getCurrentLoad() {
        return currentLoad;
    }

    public void setCurrentLoad(String currentLoad) {
        this.currentLoad = currentLoad;
    }

    public Date getCurrentLoadTime() {
        return currentLoadTime;
    }

    public void setCurrentLoadTime(Date currentLoadTime) {
        this.currentLoadTime = currentLoadTime;
    }
}
