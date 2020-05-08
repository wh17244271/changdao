package changdao.data.entity;


import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * 概览数据
 */
public class OverviewData {
    /**
     * 今日最高负荷
     */
    private String todayMaxLoad;
    /**
     * 今日最高负荷采集时间
     */
    @JsonFormat(pattern="yyyy-MM-dd hh:mm:ss",timezone = "GMT+8")
    private Date  todayMaxLoadCollectionTime;
    /**
     * 今日最低负荷
     */
    private String todayMinLoad;
    /**
     * 今日最低负荷采集时间
     */
    @JsonFormat(pattern="yyyy-MM-dd hh:mm:ss",timezone = "GMT+8")
    private Date todayMinLoadCollectionTime;
    /**
     * 当前负荷
     */
    private String currentLoad;
    /**
     * 当前负荷采集时间
     */
    @JsonFormat(pattern="yyyy-MM-dd hh:mm:ss",timezone = "GMT+8")
    private Date  currentLoadCollectionTime;

    /**
     * 今日用电量
     */
    private String todayConsumption;
    /**
     * 昨日用电量
     */
    private String yesterdayConsumption;

    public String getTodayMaxLoad() {
        return todayMaxLoad;
    }

    public void setTodayMaxLoad(String todayMaxLoad) {
        this.todayMaxLoad = todayMaxLoad;
    }

    public Date getTodayMaxLoadCollectionTime() {
        return todayMaxLoadCollectionTime;
    }

    public void setTodayMaxLoadCollectionTime(Date todayMaxLoadCollectionTime) {
        this.todayMaxLoadCollectionTime = todayMaxLoadCollectionTime;
    }

    public String getTodayMinLoad() {
        return todayMinLoad;
    }

    public void setTodayMinLoad(String todayMinLoad) {
        this.todayMinLoad = todayMinLoad;
    }

    public Date getTodayMinLoadCollectionTime() {
        return todayMinLoadCollectionTime;
    }

    public void setTodayMinLoadCollectionTime(Date todayMinLoadCollectionTime) {
        this.todayMinLoadCollectionTime = todayMinLoadCollectionTime;
    }

    public String getCurrentLoad() {
        return currentLoad;
    }

    public void setCurrentLoad(String currentLoad) {
        this.currentLoad = currentLoad;
    }

    public Date getCurrentLoadCollectionTime() {
        return currentLoadCollectionTime;
    }

    public void setCurrentLoadCollectionTime(Date currentLoadCollectionTime) {
        this.currentLoadCollectionTime = currentLoadCollectionTime;
    }

    public String getTodayConsumption() {
        return todayConsumption;
    }

    public void setTodayConsumption(String todayConsumption) {
        this.todayConsumption = todayConsumption;
    }

    public String getYesterdayConsumption() {
        return yesterdayConsumption;
    }

    public void setYesterdayConsumption(String yesterdayConsumption) {
        this.yesterdayConsumption = yesterdayConsumption;
    }
}
