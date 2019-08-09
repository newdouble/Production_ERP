package com.cskaoyan.service.device;

import com.cskaoyan.bean.*;
import com.cskaoyan.bean.pagez.PageResult;
import com.cskaoyan.mapper.DeviceCheckMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceCheckServiceImpl implements DeviceCheckService{

    @Autowired
    DeviceCheckMapper deviceCheckMapper;

    @Override
    public PageResult queryDeviceCheckByPageAndRows(int page, int rows) {

        DeviceCheckExample deviceCheckExample = new DeviceCheckExample();
        //页面分页
        PageHelper.startPage(page, rows);
        List<DeviceCheck> deviceChecks = deviceCheckMapper.selectByExample(deviceCheckExample);

        PageResult pageResult = new PageResult();
        PageInfo<DeviceCheck> pageInfo = new PageInfo<>(deviceChecks);

        pageResult.setRows(deviceChecks);
        pageResult.setTotal(pageInfo.getTotal());
        return pageResult;
    }
}
