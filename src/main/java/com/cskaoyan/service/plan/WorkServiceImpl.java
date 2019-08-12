package com.cskaoyan.service.plan;

import com.cskaoyan.bean.Work;
import com.cskaoyan.bean.WorkExample;
import com.cskaoyan.bean.pagez.PageResult;
import com.cskaoyan.mapper.WorkMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkServiceImpl implements WorkService{
    @Autowired
    WorkMapper workMapper;
    @Override
    public PageResult queryOrderByPageAndRows(int page, int rows) {
        WorkExample workExample = new WorkExample();
        //页面分页
        PageHelper.startPage(page, rows);
        List<Work> works =workMapper.selectByExample(workExample);

        PageResult pageResult = new PageResult();
        PageInfo<Work> pageInfo = new PageInfo<>(works);

        pageResult.setRows(works);
        pageResult.setTotal(pageInfo.getTotal());
        return pageResult;
    }
}
