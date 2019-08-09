package com.cskaoyan.service.device;

import com.cskaoyan.bean.pagez.PageResult;

public interface DeviceService {
    PageResult queryDeviceByPageAndRows(int page, int rows);

}
