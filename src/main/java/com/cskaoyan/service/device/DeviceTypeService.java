package com.cskaoyan.service.device;

import com.cskaoyan.bean.Device;
import com.cskaoyan.bean.DeviceType;
import com.cskaoyan.bean.pagez.PageResult;

import java.util.List;

public interface DeviceTypeService {

    //设备种类
    PageResult queryDeviceTypeByPageAndRows(int page, int rows);

}
