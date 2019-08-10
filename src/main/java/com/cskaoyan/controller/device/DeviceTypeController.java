package com.cskaoyan.controller.device;

import com.cskaoyan.bean.pagez.PageResult;
import com.cskaoyan.service.device.DeviceTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DeviceTypeController {
    @Autowired
    DeviceTypeService deviceTypeService;

    @RequestMapping("device/deviceType")
    public String queryDeviceType(){
        System.out.println("aaaaa");
        return "/WEB-INF/jsp/deviceType.jsp";
    }
    @RequestMapping("deviceType/list")
    @ResponseBody
    public PageResult queryDeviceTypeByPage(int page, int rows){
        return deviceTypeService.queryDeviceTypeByPageAndRows(page,rows);
    }
}
