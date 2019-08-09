package com.cskaoyan.controller.device;

import com.cskaoyan.bean.pagez.PageResult;
import com.cskaoyan.service.device.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DeviceMonitorController {


    @Autowired
    DeviceService deviceService;

    @Autowired
    DeviceCheckService deviceCheckService;
    @Autowired
    DeviceFaultService deviceFaultService;
    @Autowired
    DeviceMaintainService deviceMaintainService;

    @RequestMapping("device/deviceList")
    public String queryDeviceList(){
        return "/WEB-INF/jsp/deviceList.jsp";
    }
    @RequestMapping("deviceList/list")
    @ResponseBody
    public PageResult queryDeviceByPage(int page, int rows){
        return deviceService.queryDeviceByPageAndRows(page,rows);
    }





    @RequestMapping("device/deviceCheck")
    public String queryDeviceCheck(){
        return "/WEB-INF/jsp/deviceCheck.jsp";
    }
    @RequestMapping("deviceCheck/list")
    @ResponseBody
    public PageResult queryDeviceCheckByPage(int page, int rows){
        return deviceCheckService.queryDeviceCheckByPageAndRows(page,rows);
    }

    @RequestMapping("device/deviceFault")
    public String queryDeviceFault(){
        return "/WEB-INF/jsp/deviceFault.jsp";
    }
    @RequestMapping("deviceFault/list")
    @ResponseBody
    public PageResult queryDeviceFaultByPage(int page, int rows){
        return deviceFaultService.queryDeviceFaultByPageAndRows(page,rows);
    }

    @RequestMapping("device/deviceMaintain")
    public String queryDeviceMaintain(){
        return "/WEB-INF/jsp/deviceMaintain.jsp";
    }
    @RequestMapping("deviceMaintain/list")
    @ResponseBody
    public PageResult queryDeviceMaintainByPage(int page, int rows){
        return deviceMaintainService.queryDeviceMaintainByPageAndRows(page,rows);
    }






}
