package com.cskaoyan.service.device;

import com.cskaoyan.bean.Device;
import com.cskaoyan.bean.DeviceExample;
import com.cskaoyan.bean.pagez.PageResult;
import com.cskaoyan.mapper.DeviceMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceServiceImpl implements DeviceService {

    @Autowired
    DeviceMapper deviceMapper;

    @Override
    public PageResult queryDeviceByPageAndRows(int page, int rows) {
        DeviceExample deviceExample = new DeviceExample();
        PageHelper.startPage(page, rows);
        List<Device> devices = deviceMapper.selectByExample(deviceExample);

        PageResult pageResult = new PageResult();
        PageInfo<Device> pageInfo = new PageInfo<>(devices);

        pageResult.setRows(devices);
        pageResult.setTotal(pageInfo.getTotal());
        return pageResult;
    }
}
