package com.cskaoyan.service.device;

import com.cskaoyan.bean.pagez.PageResult;

public interface DeviceMaintainService {
    PageResult queryDeviceMaintainByPageAndRows(int page, int rows);
}
