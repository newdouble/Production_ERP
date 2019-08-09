package com.cskaoyan.service.plan;

import com.cskaoyan.bean.Product;
import com.cskaoyan.bean.ProductExample;
import com.cskaoyan.bean.Work;
import com.cskaoyan.bean.WorkExample;
import com.cskaoyan.mapper.ProductMapper;
import com.cskaoyan.mapper.WorkMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkServiceImpl implements WorkService{
    @Autowired
    WorkMapper workMapper;
    @Override
    public List<Work> queryOrderByPageAndRows(int page, int rows) {
        WorkExample workExample = new WorkExample();
        workExample.createCriteria().andWorkIdIsNotNull();
        List<Work> works = workMapper.selectByExample(workExample);
        return works;
    }
}
