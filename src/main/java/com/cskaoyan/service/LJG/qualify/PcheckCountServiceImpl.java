package com.cskaoyan.service.LJG.qualify;

import com.cskaoyan.bean.ProcessCountCheck2;
import com.cskaoyan.mapper.ProcessCountCheckMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/*
* 工序技术质检
* */
@Service
public class PcheckCountServiceImpl implements PCheckCountService {
    @Autowired
    ProcessCountCheckMapper processCountCheckMapper;

    @Override
    public List<ProcessCountCheck2> queryAllPCheckCount() {
        List<ProcessCountCheck2> processCountCheck2s = processCountCheckMapper.pCountCheckList();
        return processCountCheck2s;
    }
}
