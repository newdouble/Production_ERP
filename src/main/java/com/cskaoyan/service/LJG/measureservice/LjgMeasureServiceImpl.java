package com.cskaoyan.service.LJG.measureservice;

import com.cskaoyan.bean.FinalMeasuretCheck;
import com.cskaoyan.bean.FinalMeasuretCheck2;
import com.cskaoyan.bean.ProcessMeasureCheck2;
import com.cskaoyan.bean.pagez.PageResult;
import com.cskaoyan.mapper.FinalMeasuretCheckMapper;
import com.cskaoyan.mapper.ProcessMeasureCheckMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LjgMeasureServiceImpl implements LjgMeasureService {
    @Autowired
   FinalMeasuretCheckMapper finalMeasuretCheckMapper;
    @Override
    public List<FinalMeasuretCheck2> queryMeasureDetail() {

        List<FinalMeasuretCheck2> processMeasureCheck2s = finalMeasuretCheckMapper.queryMeasureDetail();
        return processMeasureCheck2s;

    }

    @Override
    public PageResult queryMeasureSearchById(String id, int page, int rows ) {
        PageResult pageResult = new PageResult();
        PageHelper.startPage(page,rows);
        List<FinalMeasuretCheck2> finalMeasuretCheck2s = finalMeasuretCheckMapper.measureSearchById(id);
        PageInfo<FinalMeasuretCheck2> pageInfo = new PageInfo<>(finalMeasuretCheck2s);
        pageResult.setRows(finalMeasuretCheck2s);
        pageResult.setTotal(pageInfo.getTotal());
        return pageResult;
    }

    @Override
    public PageResult queryMeasureSearchByOId(String id, int page, int rows) {
        PageResult pageResult = new PageResult();
        PageHelper.startPage(page,rows);
        List<FinalMeasuretCheck2> finalMeasuretCheck2s = finalMeasuretCheckMapper.measureSearchByOId(id);
        PageInfo<FinalMeasuretCheck2> pageInfo = new PageInfo<>(finalMeasuretCheck2s);
        pageResult.setRows(finalMeasuretCheck2s);
        pageResult.setTotal(pageInfo.getTotal());
        return pageResult;
    }
}
