package com.cskaoyan.service.device;

import com.cskaoyan.bean.pagez.PageResult;

public interface DeviceFaultService {
    PageResult queryDeviceFaultByPageAndRows(int page, int rows);
}
