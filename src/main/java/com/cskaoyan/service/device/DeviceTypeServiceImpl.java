package com.cskaoyan.service.device;

import com.cskaoyan.bean.*;
import com.cskaoyan.bean.pagez.PageResult;
import com.cskaoyan.mapper.DeviceTypeMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DeviceTypeServiceImpl implements DeviceTypeService {

    @Autowired
    DeviceTypeMapper deviceTypeMapper;
    @Override
    public PageResult queryDeviceTypeByPageAndRows(int page, int rows) {

        DeviceTypeExample deviceTypeExample = new DeviceTypeExample();
        //页面分页
        PageHelper.startPage(page,rows);
        List<DeviceType> deviceTypes = deviceTypeMapper.selectByExample(deviceTypeExample);

        PageResult pageResult = new PageResult();
        PageInfo<DeviceType> pageInfo = new PageInfo<>(deviceTypes);

        pageResult.setRows(deviceTypes);
        pageResult.setTotal(pageInfo.getTotal());
        return pageResult;
    }
}
