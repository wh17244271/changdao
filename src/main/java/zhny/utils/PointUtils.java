package zhny.utils;


import zhny.common.PointConstant;
import zhny.entity.Load;
import zhny.utils.exception.ResponseException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class PointUtils {
    /**
     * 获取取点密度
     *
     * @param list
     * @param collectionCycle
     * @return
     */
    public static List<Load> getMatchPoint(List<Map<String, Object>> list, String collectionCycle) {
        Pattern POINT_PATTERN = Pattern.compile("^[P]\\d{4}$");
        //获取密度
        String pointCount = getpointCount(collectionCycle);
        List<Load> newList = new ArrayList<>();
        Load load = null;
        if (newList == null) {
            return newList;
        }
        for (Map<String, Object> map : list) {

            //获取当天时间
           String date = Types.LocalDate(map.get("DATA_DATE")).format(Times.defaultDateFormatter);
            String indBNo = Types.String(map.get("IND_B_NO"));

            for (Map.Entry<String, Object> entry : map.entrySet()) {
                String key = entry.getKey();
                String value =String.valueOf( entry.getValue());
                if (POINT_PATTERN.matcher(key).matches()) {
                    load = new Load();
                    //key : P1130 >>> 11:30
                    key = new StringBuffer(key).delete(0,1).insert(2,":").toString();
                    String point = key.substring(3); //取 P1010 最后两个字符，判断时间点
                    String dateTime = getDateTime(date, key.substring(0));

                    if(StringUtils.isEmpty(collectionCycle)){
                        load.setCollectionTime(dateTime);
                        load.setLoad(value);
                        load.setIndBNo(indBNo);
                        newList.add(load);
                    }
                    //每1小时取一次
                    else if(PointConstant.POINTCOUNT_24.equals(pointCount)){
                        if(PointConstant.POINTCOUNT_24_LIST.contains(point)){
                            load.setCollectionTime(dateTime);
                            load.setLoad(value);
                            load.setIndBNo(indBNo);
                            newList.add(load);
                        }
                    }
                    //每半小时取一次
                    else if(PointConstant.POINTCOUNT_48.equals(pointCount)){
                        if(PointConstant.POINTCOUNT_48_LIST.contains(point)){
                            load.setCollectionTime(dateTime);
                            load.setLoad(value);
                            load.setIndBNo(indBNo);
                            load.setIndBNo(indBNo);
                            newList.add(load);
                        }
                    }
                    //每15分钟取一次
                    else if(PointConstant.POINTCOUNT_96.equals(pointCount)){
                        if(PointConstant.POINTCOUNT_96_LIST.contains(point)){
                            load.setCollectionTime(dateTime);
                            load.setLoad(value);
                            load.setIndBNo(indBNo);
                            newList.add(load);
                        }
                    }
                    //每10分钟取一次
                    else if(PointConstant.POINTCOUNT_144.equals(pointCount)){
                        if(PointConstant.POINTCOUNT_144_LIST.contains(point)){
                            load.setCollectionTime(dateTime);
                            load.setLoad(value);
                            load.setIndBNo(indBNo);
                            newList.add(load);
                        }
                    }
                    //每5分钟取一次
                    else if(PointConstant.POINTCOUNT_288.equals(pointCount)){
                        if(PointConstant.POINTCOUNT_288_LIST.contains(point)){
                            load.setCollectionTime(dateTime);
                            load.setLoad(value);
                            load.setIndBNo(indBNo);
                            newList.add(load);
                        }
                    }else{
                        throw new ResponseException("请选择正确的数据频度");
                    }

                }

            }
        }
        return newList;
    }
    private static String getDateTime(String date,String point){
        //date 2020-03-02   point  0000 0005 0010
        return date+" "+point+":00";
    }

    public static final String m5="m5";
    public static final String m10="m10";
    public static final String m15="m15";
    public static final String m30="m30";
    public static final String h1="h1";

    /**
     * 获取 pointCount 密度
     * @param collectionCycle
     * @return
     */
    private static String getpointCount(String collectionCycle){
        Map<String,String> pointCount = new HashMap<>();
        pointCount.put(m5,PointConstant.POINTCOUNT_288);
        pointCount.put(m10,PointConstant.POINTCOUNT_144);
        pointCount.put(m15,PointConstant.POINTCOUNT_96);
        pointCount.put(m30,PointConstant.POINTCOUNT_48);
        pointCount.put(h1,PointConstant.POINTCOUNT_24);
        pointCount.put("h2",PointConstant.POINTCOUNT_24);
        pointCount.put("h6",PointConstant.POINTCOUNT_24);
        pointCount.put("h12",PointConstant.POINTCOUNT_24);
        pointCount.put("d1",PointConstant.POINTCOUNT_24);
        pointCount.put("w1",PointConstant.POINTCOUNT_24);
        pointCount.put("month1",PointConstant.POINTCOUNT_24);
        pointCount.put("year1",PointConstant.POINTCOUNT_24);

        return pointCount.get(collectionCycle);

    }


}
