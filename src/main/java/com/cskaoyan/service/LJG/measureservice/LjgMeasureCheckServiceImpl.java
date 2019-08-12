package com.cskaoyan.service.LJG.measureservice;

import com.cskaoyan.bean.ProcessMeasureCheck2;
import com.cskaoyan.mapper.ProcessMeasureCheckMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LjgMeasureCheckServiceImpl implements LjgMeasureCheckService {
    @Autowired
    ProcessMeasureCheckMapper processMeasureCheckMapper;

    @Override
    public List<ProcessMeasureCheck2> queryAllMeasureCheck() {
        List<ProcessMeasureCheck2> processMeasureCheck2s = processMeasureCheckMapper.measureCheck();
        return processMeasureCheck2s;
    }
}
