package zhny.utils;

import org.springframework.util.StringUtils;
import zhny.utils.exception.ResponseException;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Map;
import java.util.regex.Pattern;

public class Assert {

    /**
     * 检查年份 yyyy-MM-dd
     * @param startTime
     * @param endTime
     * @return
     */
    public static boolean checkDate(String startTime,String endTime,String erroMessage) {
        LocalDate start = Times.parseDate(startTime);
        LocalDate end = Times.parseDate(endTime);

        if (start.isAfter(end)){
            throw new ResponseException(erroMessage);
        }
        return true;
    }

    /**
     * 检测月份 yyyy-MM
     * @param startMonth
     * @param endMonth
     * @param erroMessage
     * @return
     */
    public static boolean checkMonth(String startMonth,String endMonth,String erroMessage) {
        LocalDate start = Times.parseDate(startMonth + "-01");
        LocalDate end = Times.parseDate(endMonth + "-01");


        if (start.isAfter(end)){
            throw new ResponseException(erroMessage);
        }
        return true;
    }

    public static void main(String[] args) {
        boolean b = checkMonth("2020-02", "2020-04","错误");
        System.out.println(b);
    }


    /**
     * 判断字符串是否为空
     *
     * @param value
     * @param errorMessage
     */
    public static void isEmpty(String value, String errorMessage) {
        if (StringUtils.isEmpty(value)) {
            throw new ResponseException(errorMessage);
        }
    }

    /**
     * 判断是否为纯数字
     * @param str
     * @return
     */
    public static boolean isInteger(String str) {
        Pattern pattern = Pattern.compile("^[-\\+]?[\\d]*$");
        return pattern.matcher(str).matches();
    }

    /**
     * 判断Collection集合是否为空
     *
     * @param value
     * @param errorMessage
     */
    public static <T> void isEmpty(Collection<T> value, String errorMessage) {
        if (value == null || value.size() == 0) {
            throw new ResponseException(errorMessage);
        }
    }

    /**
     * 判断Map集合是否为空
     *
     * @param value
     * @param errorMessage
     */
    public static <K, V> void isEmpty(Map<K, V> value, String errorMessage) {
        if (value == null || value.size() == 0) {
            throw new ResponseException(errorMessage);
        }
    }

    /**
     * 判断数组是否为空
     *
     * @param value
     * @param errorMessage
     */
    public static <T> void isEmpty(T[] value, String errorMessage) {
        if (value == null || value.length == 0) {
            throw new ResponseException(errorMessage);
        }
    }

    /**
     * 判断对象是否为空
     *
     * @param value
     * @param errorMessage
     */
    public static void isNull(Object value, String errorMessage) {
        if (value == null) {
            throw new ResponseException(errorMessage);
        }
    }

    /**
     * 判断对象是否不为空
     *
     * @param value
     * @param errorMessage
     */
    public static void isNotNull(Object value, String errorMessage) {
        if (value != null) {
            throw new ResponseException(errorMessage);
        }
    }

    /**
     * 判断是否为真
     *
     * @param value
     * @param errorMessage
     */
    public static void isTrue(boolean value, String errorMessage) {
        if (value) {
            throw new ResponseException(errorMessage);
        }
    }

    /**
     * 判断是否为假
     *
     * @param value
     * @param errorMessage
     */
    public static void isFalse(boolean value, String errorMessage) {
        if (!value ) {
            throw new ResponseException(errorMessage);
        }
    }
}
