package changdao.data.entity;

/**
 * 月用量
 */
public class MonthPower {
    /**
     * 尖峰
     */
    private String mountainPeak;
    /**
     * 峰
     */
    private String peak;
    /**
     * 平
     */
    private String normal;
    /**
     * 谷
     */
    private String valley;
    /**
     * 日期
     */
    private String time;

    public String getMountainPeak() {
        return mountainPeak;
    }

    public void setMountainPeak(String mountainPeak) {
        this.mountainPeak = mountainPeak;
    }

    public String getPeak() {
        return peak;
    }

    public void setPeak(String peak) {
        this.peak = peak;
    }

    public String getNormal() {
        return normal;
    }

    public void setNormal(String normal) {
        this.normal = normal;
    }

    public String getValley() {
        return valley;
    }

    public void setValley(String valley) {
        this.valley = valley;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
