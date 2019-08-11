package com.cskaoyan.service.LJG.measureservice;

import com.cskaoyan.bean.FinalCountCheck2;
import com.cskaoyan.bean.FinalMeasuretCheck2;
import com.cskaoyan.bean.pagez.PageResult;
import com.cskaoyan.mapper.FinalCountCheckMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LjgCheckCountServiceImpl implements LjgCheckCountService {
    @Autowired
    FinalCountCheckMapper finalCountCheckMapper;
    @Override
    public List<FinalCountCheck2> queryCheckCountList() {
        List<FinalCountCheck2> finalCountCheck2s = finalCountCheckMapper.queryCheckCount();
        return finalCountCheck2s;
    }

    @Override
    public PageResult SearchFcountByFId(String id, int page, int rows) {
        PageResult pageResult = new PageResult();
        PageHelper.startPage(page,rows);
        List<FinalCountCheck2> finalCountCheck2s = finalCountCheckMapper.SearchFcountById(id);
        PageInfo<FinalCountCheck2> pageInfo = new PageInfo<>(finalCountCheck2s);
        pageResult.setRows(finalCountCheck2s);
        pageResult.setTotal(pageInfo.getTotal());
        return pageResult;
    }

    @Override
    public PageResult SearchFcountByOId(String id, int page, int rows) {
        PageResult pageResult = new PageResult();
        PageHelper.startPage(page,rows);
        List<FinalCountCheck2> finalCountCheck2s = finalCountCheckMapper.SearchFcountByOId(id);
        PageInfo<FinalCountCheck2> pageInfo = new PageInfo<>(finalCountCheck2s);
        pageResult.setRows(finalCountCheck2s);
        pageResult.setTotal(pageInfo.getTotal());
        return pageResult;
    }
}
