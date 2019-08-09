package com.cskaoyan.service.device;

import com.cskaoyan.bean.DeviceFault;
import com.cskaoyan.bean.DeviceFaultExample;
import com.cskaoyan.bean.pagez.PageResult;
import com.cskaoyan.mapper.DeviceFaultMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceFaultServiceImpl implements DeviceFaultService {
    @Autowired
    DeviceFaultMapper deviceFaultMapper;
    @Override
    public PageResult queryDeviceFaultByPageAndRows(int page, int rows) {
        DeviceFaultExample deviceFaultExample = new DeviceFaultExample();
        PageHelper.startPage(page, rows);
        List<DeviceFault> deviceFaults = deviceFaultMapper.selectByExample(deviceFaultExample);

        PageResult pageResult = new PageResult();
        PageInfo<DeviceFault> pageInfo = new PageInfo<>(deviceFaults);

        pageResult.setRows(deviceFaults);
        pageResult.setTotal(pageInfo.getTotal());
        return pageResult;
    }
}
