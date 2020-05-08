package zhny.entity;


import zhny.utils.Times;

/**
 * 入参
 */
public class InnerParmeter {
    /**
     * 组织机构(用户:cons_no)
     */
    private String deptId;
    /**
     * 设备(测点：mp_id)
     */
    private String deviceId;
    /**
     * 起始时间 yyyy-MM-dd
     */
    private String startTime;
    /**
     * 结束时间 yyyy-MM-dd
     */
    private String endTime ;
    /**
     * 取点密度
     */
    private String collectionCycle;
    /**
     * 指标
     */
    private String indBNo;
    /**
     * 指标集合
     */
    private String[] indBNos;

    /**
     * 起始月 yyyy-MM
     */
    private String startMonth;
    /**
     * 结束月 yyyy-MM
     */
    private String endMonth ;


    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = Times.subStringDate(startTime);
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = Times.subStringDate(endTime);
    }

    public String getCollectionCycle() {
        return collectionCycle;
    }

    public void setCollectionCycle(String collectionCycle) {
        this.collectionCycle = collectionCycle;
    }

    public String getIndBNo() {
        return indBNo;
    }

    public void setIndBNo(String indBNo) {
        this.indBNo = indBNo;
    }

    public String[] getIndBNos() {
        return indBNos;
    }

    public void setIndBNos(String[] indBNos) {
        this.indBNos = indBNos;
    }

    public String getStartMonth() {
        return Times.subStringMonth(startTime) ;
    }
    /**
     * 只提供入参时自动转化时间
     */
    @Deprecated
    private void setStartMonth(String startMonth ) {
        this.startMonth = Times.subStringMonth(startMonth) ;
    }

    public String getEndMonth() {
        return Times.subStringMonth(endTime) ;
    }

    /**
     * 只提供入参时自动转化时间
     */
    @Deprecated
    private void setEndMonth(String endMonth) {
        this.endMonth = Times.subStringMonth(endMonth) ;
    }


}
