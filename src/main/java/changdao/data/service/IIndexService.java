package changdao.data.service;

import java.time.LocalDate;

public interface IIndexService {
    /**
     * 获取首页数据
     * @return
     */
    Object getIndexData();

    /**
     * 获取设备列表
     * @return
     */
    Object getDevice(String consNo);

    /**
     * 获取设备列表
     * @return
     */
    Object getDevicePowerData(String cons_no, String device_no, LocalDate date,String type);
}
