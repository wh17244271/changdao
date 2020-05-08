package zhny.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * 日用量
 */
public class DayPower {
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
    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    private Date time;

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

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
