package changdao.utils.exception;

/**
 * 自定义异常，对前台参数进行解析时出现的相关错误
 */
public class ResponseException extends RuntimeException {
    public ResponseException() {
        super();
    }

    public ResponseException(String msg) {
        super(msg);
    }
}
