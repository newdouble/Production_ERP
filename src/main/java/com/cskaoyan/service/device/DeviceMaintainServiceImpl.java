package com.cskaoyan.service.device;

import com.cskaoyan.bean.DeviceMaintain;
import com.cskaoyan.bean.DeviceMaintainExample;
import com.cskaoyan.bean.pagez.PageResult;
import com.cskaoyan.mapper.DeviceMaintainMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceMaintainServiceImpl implements DeviceMaintainService {

    @Autowired
    DeviceMaintainMapper deviceMaintainMapper;

    @Override
    public PageResult queryDeviceMaintainByPageAndRows(int page, int rows) {

        DeviceMaintainExample deviceMaintainExample = new DeviceMaintainExample();
        PageHelper.startPage(page, rows);
        List<DeviceMaintain> deviceMaintains = deviceMaintainMapper.selectByExample(deviceMaintainExample);

        PageResult pageResult = new PageResult();
        PageInfo<DeviceMaintain> pageInfo = new PageInfo<>(deviceMaintains);

        pageResult.setRows(deviceMaintains);
        pageResult.setTotal(pageInfo.getTotal());
        return pageResult;
    }
}
