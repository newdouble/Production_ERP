package com.cskaoyan.service.LJG.qualify;

import com.cskaoyan.bean.ProcessCountCheck;
import com.cskaoyan.bean.ProcessCountCheck2;
import com.cskaoyan.bean.pagez.PageResult;
import com.cskaoyan.mapper.ProcessCountCheckMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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

    @Override
    public PageResult searchPCById(String id, int page, int rows) {
        PageResult pageResult = new PageResult();
        PageHelper.startPage(page,rows);
        List<ProcessCountCheck> processCountChecks = processCountCheckMapper.searchPCountCheckById(id);
        PageInfo<ProcessCountCheck2> pageInfo = new PageInfo<>();
        pageResult.setTotal(pageInfo.getTotal());
        pageResult.setRows(processCountChecks);
        return pageResult;
    }
}
