package changdao.data.dao;

import changdao.data.entity.Device;

import java.util.List;

/**
 * 获取
 */
public interface PublicDao {

    /**
     * 获取用户下的设备列表
     * @param consNo
     * @return
     */
   List<Device> getDeviceList(String consNo);

}
