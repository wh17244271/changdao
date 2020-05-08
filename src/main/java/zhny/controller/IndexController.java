package zhny.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import zhny.service.IIndexService;
import zhny.utils.Assert;
import zhny.utils.StringUtils;
import zhny.utils.Times;

import java.time.LocalDate;

@Controller
@RequestMapping(value = "/index")
public class IndexController {
    @Autowired
    private IIndexService indexService;

    /**
     *
     根据节点id获取所有下级组织机构树(当节点id为空时为root节点)
     * @param deptId
     * @return
     */
    @ResponseBody
    @RequestMapping( "/getIndexData" )
    public Object getOrgInfo(String deptId) {

        Object indexData = indexService.getIndexData();
        return indexData;
    }

    /**
     * 获取设备
     * @param cons_no
     * @return
     */
    @ResponseBody
    @RequestMapping( "/getDevice" )
    public Object getDevice(String cons_no) {
        Assert.isEmpty(cons_no,"用户不能为空");
        Object indexData = indexService.getDevice(cons_no);
        return indexData;
    }

    /**
     * 获取设备数据详情
     * @param cons_no
     * @return
     */
    @ResponseBody
    @RequestMapping( "/getDevicePowerData" )
    public Object getDevicePowerData(String cons_no,String device_no,String time,String type) {
        Assert.isEmpty(cons_no,"用户不能为空");
        LocalDate date = null;
        if (StringUtils.isEmpty(time)){
            date = LocalDate.now();
        }else {
            date = Times.parseDate(time);
        }


        Assert.isTrue((StringUtils.isEmpty(device_no) && !StringUtils.isEmpty(type)) ||
                        (!StringUtils.isEmpty(device_no) && StringUtils.isEmpty(type))
        ,"传递设备号，必须传递type，没有设备号，不需要传递type");

        Object indexData = indexService.getDevicePowerData(cons_no, device_no, date,type);
        return indexData;
    }

}
