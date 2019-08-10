package com.cskaoyan.service.LJG.measureservice;

import com.cskaoyan.bean.FinalCountCheck2;
import com.cskaoyan.mapper.FinalCountCheckMapper;
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
}
