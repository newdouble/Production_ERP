package com.cskaoyan.service.device;

import com.cskaoyan.bean.pagez.PageResult;

public interface DeviceCheckService {

    PageResult queryDeviceCheckByPageAndRows(int page, int rows);
}
