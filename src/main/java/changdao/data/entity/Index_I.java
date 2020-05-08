package changdao.data.entity;

/**
 * 电流
 */
public class Index_I {
    /**
     * A向电流
     */
    private String directionA;
    /**
     * B向电流
     */
    private String directionB;
    /**
     * C向电流
     */
    private String directionC;
    /**
     * 采集时间
     */
    private String collectionTime;


    public Index_I() {
    }

    public Index_I(String directionA, String directionB, String directionC, String collectionTime) {
        this.directionA = directionA;
        this.directionB = directionB;
        this.directionC = directionC;
        this.collectionTime = collectionTime;
    }

    public String getDirectionA() {
        return directionA;
    }

    public void setDirectionA(String directionA) {
        this.directionA = directionA;
    }

    public String getDirectionB() {
        return directionB;
    }

    public void setDirectionB(String directionB) {
        this.directionB = directionB;
    }

    public String getDirectionC() {
        return directionC;
    }

    public void setDirectionC(String directionC) {
        this.directionC = directionC;
    }

    public String getCollectionTime() {
        return collectionTime;
    }

    public void setCollectionTime(String collectionTime) {
        this.collectionTime = collectionTime;
    }
}
