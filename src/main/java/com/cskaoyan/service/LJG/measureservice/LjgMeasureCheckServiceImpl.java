package com.cskaoyan.service.LJG.measureservice;

import com.cskaoyan.bean.ProcessMeasureCheck2;
import com.cskaoyan.bean.pagez.PageResult;
import com.cskaoyan.mapper.ProcessMeasureCheckMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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

    @Override
    public PageResult serachByPmeasureCheckIdService(String id, int page, int rows) {
        PageResult pageResult = new PageResult();
        PageHelper.startPage(page,rows);
        List<ProcessMeasureCheck2> processMeasureCheck2s = processMeasureCheckMapper.serachByPmeasureCheckId(id);
        PageInfo<ProcessMeasureCheck2> pageInfo = new PageInfo<>();
        pageResult.setTotal(pageInfo.getTotal());
        pageResult.setRows(processMeasureCheck2s);
        return pageResult;

    }


}
