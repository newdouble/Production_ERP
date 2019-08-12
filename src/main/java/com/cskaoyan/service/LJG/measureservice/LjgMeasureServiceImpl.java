package com.cskaoyan.service.LJG.measureservice;

import com.cskaoyan.bean.FinalMeasuretCheck;
import com.cskaoyan.bean.FinalMeasuretCheck2;
import com.cskaoyan.bean.ProcessMeasureCheck2;
import com.cskaoyan.mapper.FinalMeasuretCheckMapper;
import com.cskaoyan.mapper.ProcessMeasureCheckMapper;
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
}
