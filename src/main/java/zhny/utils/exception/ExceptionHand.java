package zhny.utils.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import zhny.utils.ResponseJson;

/**
 * 异常处理类，用来处理request请求，响应时异常处理，用于Controller层
 */
@ControllerAdvice
public class ExceptionHand {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * 返回对象 VenusResponse提示异常
     * @param e
     * @return
     */
    @ExceptionHandler({ResponseException.class})
    @ResponseBody
    public ResponseJson exception(ResponseException e) {
        e.printStackTrace();
        logger.error(">>>>>>>>>>>>>>>>>错误信息:{}", e.getMessage());
        return new ResponseJson(false,null, e.getMessage());

    }


    /**
     * 捕捉运行时异常
     * @param e
     * @return
     */
    @ExceptionHandler({RuntimeException.class})
    @ResponseBody
    public ResponseJson exception(RuntimeException e) {
        e.printStackTrace();
        logger.error(">>>>>>>>>>>>>>>>>错误信息:{}", e.getMessage());
        return new ResponseJson(false,null, "运行出错，请联系系统管理员");

    }

    /**
     * 捕捉最终异常
     * @param e
     * @return
     */
    @ExceptionHandler({Exception.class})
    @ResponseBody
    public ResponseJson exception(Exception e) {
        e.printStackTrace();
        logger.error(">>>>>>>>>>>>>>>>>错误信息:{}", e.getMessage());
        return new ResponseJson(false,null, "系统出错，请联系系统管理员");

    }
 


}
