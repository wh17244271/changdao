package zhny.entity;

/**
 * 设备
 */
public class Device {
    /**
     * 设备Id
     */
    private String code;
    /**
     * 设备名称
     */
    private String name;
    /**
     * 设备父id
     */
    private String pCode;

    public Device() {
    }

    public Device(String code, String name,String pCode) {
        this.code = code;
        this.name = name;
        this.pCode = pCode;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getpCode() {
        return pCode;
    }

    public void setpCode(String pCode) {
        this.pCode = pCode;
    }
}
