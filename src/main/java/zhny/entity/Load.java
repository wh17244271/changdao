package zhny.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 负荷
 */
public class Load {
    /**
     * 负荷值
     */
    private String load; /**
     * 采集时间
     */
//    @JsonFormat(pattern="yyyy-MM-dd hh:mm:ss",timezone = "GMT+8")
    private String collectionTime;
    /**
     * 指标名称
     */
    private String indBNo;

    public Load() {
    }

    public Load(String load, String collectionTime) {
        this.load = load;
        this.collectionTime = collectionTime;
    }

    public String getLoad() {
        return load;
    }

    public void setLoad(String load) {
        this.load = load;
    }

    public String getCollectionTime() {
        return collectionTime;
    }

    public void setCollectionTime(String collectionTime) {
        this.collectionTime = collectionTime;
    }

    public String getIndBNo() {
        return indBNo;
    }

    public void setIndBNo(String indBNo) {
        this.indBNo = indBNo;
    }
}
