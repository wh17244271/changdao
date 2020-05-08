package zhny.entity;

/**
 * 电能示值
 */
public class PowerView {
    /**
     * 正向有功用电量/功(单位kWh)
     */
    private String positiveActive;
    /**
     * 反向无功用电量/功(单位kWh)
     */
    private String reverseReactive;
    /**
     * 反向有功用电量/功(单位kWh)
     */
    private String reverseActive;
    /**
     * 正向无功用电量/功(单位kWh)
     */
    private String positiveReactive;
    /**
     * 采集时间
     */
    private String collectionTime;


    public PowerView() {
    }

    public PowerView(String positiveActive, String reverseReactive, String reverseActive, String positiveReactive, String collectionTime) {
        this.positiveActive = positiveActive;
        this.reverseReactive = reverseReactive;
        this.reverseActive = reverseActive;
        this.positiveReactive = positiveReactive;
        this.collectionTime = collectionTime;
    }

    public String getPositiveActive() {
        return positiveActive;
    }

    public void setPositiveActive(String positiveActive) {
        this.positiveActive = positiveActive;
    }

    public String getReverseReactive() {
        return reverseReactive;
    }

    public void setReverseReactive(String reverseReactive) {
        this.reverseReactive = reverseReactive;
    }

    public String getReverseActive() {
        return reverseActive;
    }

    public void setReverseActive(String reverseActive) {
        this.reverseActive = reverseActive;
    }

    public String getPositiveReactive() {
        return positiveReactive;
    }

    public void setPositiveReactive(String positiveReactive) {
        this.positiveReactive = positiveReactive;
    }

    public String getCollectionTime() {
        return collectionTime;
    }

    public void setCollectionTime(String collectionTime) {
        this.collectionTime = collectionTime;
    }
}
