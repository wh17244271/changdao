package zhny.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zhny.common.IndBNoConstant;
import zhny.common.PublicConstant;
import zhny.dao.LoadDao;
import zhny.dao.PublicDao;
import zhny.entity.Device;
import zhny.entity.Load;
import zhny.entity.SourceParam;
import zhny.service.IIndexService;
import zhny.utils.Assert;
import zhny.utils.PointUtils;
import zhny.utils.StringUtils;
import zhny.utils.Types;

import java.time.LocalDate;
import java.util.*;

@Service( "indexService" )
public class IndexServicempl implements IIndexService {
    @Autowired
    private LoadDao loadDao;
    @Autowired
    private PublicDao publicDao;


    @Override
    public Object getIndexData() {
        HashMap<Object, Object> result = new HashMap<>();

        //实时数据接口
        SourceParam sourceParam = new SourceParam(PublicConstant.DATA_SOURCE, IndBNoConstant.LOAD, LocalDate.now());
        Load areaLoad = loadDao.getAreaLoad(sourceParam, true); //实时负荷
        Double load = null;
        if (null != areaLoad) {
            load = Types.Double(areaLoad.getLoad());
        }
        sourceParam.setIndBNo(IndBNoConstant.ELEC);
        Load areaPower = loadDao.getAreaPower(sourceParam);//实时负荷
        Double electric = null;
        if (null != areaPower) {
            electric = Types.Double(areaPower.getLoad());
        }
        HashMap<Object, Object> real = new HashMap<>();
        real.put("load", load);
        real.put("water", 1548);
        real.put("electric", electric);
        real.put("fire", 2820);
        real.put("gas", 7850);
        result.put("real", real);

        //生产数据
        HashMap<Object, Object> produce = new HashMap<>();//生产数据
        HashMap<Object, Object> wind = new HashMap<>();//风力
        wind.put("install", 150);
        wind.put("day", 0);
        wind.put("total", 0);
        produce.put("wind", wind);
        HashMap<Object, Object> light = new HashMap<>();//光能
        light.put("install", 150);
        light.put("day", 0);
        light.put("total", 0);
        produce.put("light", light);
        HashMap<Object, Object> post = new HashMap<>();//充电桩
        post.put("state", 10);
        post.put("charge", 40);
        post.put("surplus", 50);
        produce.put("post", post);
        HashMap<Object, Object> water = new HashMap<>();//潮汐能
        water.put("install", 150);
        water.put("day", 0);
        water.put("total", 0);
        produce.put("water", water);
        result.put("produce", produce);

        //节能情况
        HashMap<Object, Object> economy = new HashMap<>();//生产数据
        economy.put("total", 12780);
        economy.put("effect", "良好");
        economy.put("basic", 3000000);
        economy.put("actual", 1);
        economy.put("co2", 232356);
        economy.put("tree", 50);
        economy.put("oil", 523.301);
        economy.put("cat", 171308);
        result.put("economy", economy);

        //能源自给率图表数据
        HashMap<Object, Object> pipe = new HashMap<>();//生产数据
        pipe.put("energy", 330);
        pipe.put("land", 330);
        pipe.put("electric", 330);
        result.put("pipe", pipe);
        result.put("state", 200);

        return result;
    }

    /**
     * 获取设备列表
     *
     * @return
     */
    @Override
    public Object getDevice(String consNo) {
        HashMap<Object, Object> result = new HashMap<>();
        result.put("state", 200);

        HashMap<Object, Object> data = new HashMap<>();
        //电力设备
        List<Device> deviceList = publicDao.getDeviceList(consNo);
//        ArrayList<Object> dlsb = new ArrayList<>();
//        dlsb.add(new Device("001","发电机1"));
//        dlsb.add(new Device("002","发电机2"));
        data.put("电力设备", deviceList);
        //风力设备
        ArrayList<Object> flsb = new ArrayList<>();
        flsb.add(new Device("003", "风力发电机1","-1"));
        flsb.add(new Device("004", "风力发电机2","-1"));
        data.put("风力设备", flsb);

        ArrayList<Object> dataList = new ArrayList<>();
        dataList.add(data);
        result.put("data", dataList);

        return result;
    }

    @Override
    public Object getDevicePowerData(String cons_no, String device_no, LocalDate date, String type) {
        HashMap<Object, Object> result = new HashMap<>();
        //实时数据接口
        Load dayLoad = loadDao.getDayLoad(cons_no, device_no, date, IndBNoConstant.LOAD, true);
        Double load = null;
        if (null != dayLoad) {
            load = Types.Double(dayLoad.getLoad());
        }
        //获取用电量
        Load electricPower = loadDao.getDayElecData(cons_no, device_no, date, IndBNoConstant.ELEC);
        Double electric = null;
        if (null != electricPower) {
            electric = Types.Double(electricPower.getLoad());
        }
        HashMap<Object, Object> data = new HashMap<>();
        data.put("load", load);
        data.put("water", 1548);
        data.put("electric", electric);
        data.put("fire", 2820);
        data.put("gas", 7850);
        result.put("data", data);

        List<Map<String, Object>> aList = null;
        List<Map<String, Object>> bList = null;
        List<Map<String, Object>> cList = null;
        List<Map<String, Object>> puiList = null;
        List<Double> a = null;
        List<Double> b = null;
        List<Double> c = null;
        List<Double> pui = null;
        //点位数据
        if (StringUtils.isEmpty(type) || "fuhe".equals(type)) {
            aList = loadDao.getDayLoadPoint(cons_no, device_no, date, IndBNoConstant.POWER_A, false);
            a = this.getLine(PointUtils.getMatchPoint(aList, PointUtils.h1));
            bList = loadDao.getDayLoadPoint(cons_no, device_no, date, IndBNoConstant.POWER_B, false);
            b = this.getLine(PointUtils.getMatchPoint(bList, PointUtils.h1));
            cList = loadDao.getDayLoadPoint(cons_no, device_no, date, IndBNoConstant.POWER_C, false);
            c = this.getLine(PointUtils.getMatchPoint(cList, PointUtils.h1));
            puiList = loadDao.getDayLoadPoint(cons_no, device_no, date, IndBNoConstant.LOAD, true);
            pui = this.getLine(PointUtils.getMatchPoint(puiList, PointUtils.h1));
        }else if ("dianliu".equals(type)){
            aList = loadDao.getDayLoadPoint(cons_no, device_no, date, IndBNoConstant.I_A, false);
            a = this.getLine(PointUtils.getMatchPoint(aList, PointUtils.h1));
            bList = loadDao.getDayLoadPoint(cons_no, device_no, date, IndBNoConstant.I_B, false);
            b = this.getLine(PointUtils.getMatchPoint(bList, PointUtils.h1));
            cList = loadDao.getDayLoadPoint(cons_no, device_no, date, IndBNoConstant.I_C, false);
            c = this.getLine(PointUtils.getMatchPoint(cList, PointUtils.h1));
        }else if("dianya".equals(type)){
            aList = loadDao.getDayLoadPoint(cons_no, device_no, date, IndBNoConstant.U_A, false);
            a = this.getLine(PointUtils.getMatchPoint(aList, PointUtils.h1));
            bList = loadDao.getDayLoadPoint(cons_no, device_no, date, IndBNoConstant.U_B, false);
            b = this.getLine(PointUtils.getMatchPoint(bList, PointUtils.h1));
            cList = loadDao.getDayLoadPoint(cons_no, device_no, date, IndBNoConstant.U_C, false);
            c = this.getLine(PointUtils.getMatchPoint(cList, PointUtils.h1));
        }else {
            Assert.isTrue(true,"type类型不符合标准");
        }


        HashMap<Object, Object> line = new HashMap<>();
        line.put("a", a);
        line.put("b", b);
        line.put("c", c);
        line.put("pui", pui);

        result.put("line", line);
        result.put("state", 200);
        return result;
    }

    /**
     * 获取点位数据
     *
     * @param loads
     * @return
     */
    private static List<Double> getLine(List<Load> loads) {
        List<Double> result = new LinkedList<>();
        if (!StringUtils.isEmpty(loads)) {
            for (Load load : loads) {
                result.add(Types.Double(load.getLoad()));
            }
        }
        return result;
    }
}
