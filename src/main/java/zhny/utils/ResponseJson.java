package zhny.utils;

public class ResponseJson<T> {
    private final static Integer SUCCESS= 0;
    private final static Integer ERRO= 500;
    /**
     * 0:成功
     * 200——299：为保留的权限错误状态码（暂时不要动）
     */
   private Integer code;
   private boolean suc;
   private String msg;
   private T data;
   private Object relatedData;

    public ResponseJson() {
    }

    public ResponseJson(boolean suc, T data) {
        this.code = suc?ResponseJson.SUCCESS:ResponseJson.ERRO;
        this.suc = suc;
        this.data = data;
    }

    public ResponseJson( boolean suc, T data, String msg) {
        this.code = suc?ResponseJson.SUCCESS:ResponseJson.ERRO;
        this.suc = suc;
        this.msg = msg;
        this.data = data;
    }

    public static Integer getSUCCESS() {
        return SUCCESS;
    }

    public static Integer getERRO() {
        return ERRO;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public boolean isSuc() {
        return suc;
    }

    public void setSuc(boolean suc) {
        this.suc = suc;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Object getRelatedData() {
        return relatedData;
    }

    public void setRelatedData(Object relatedData) {
        this.relatedData = relatedData;
    }
}
