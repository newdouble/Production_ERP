package com.cskaoyan.service.plan;

import com.cskaoyan.bean.Manufacture;
import com.cskaoyan.bean.ManufactureExample;
import com.cskaoyan.bean.pagez.PageResult;
import com.cskaoyan.mapper.ManufactureMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManufactureServiceImpl implements ManufactureService {
    @Autowired
    ManufactureMapper manufactureMapper;
    @Override
    public PageResult queryOrderByPageAndRows(int page, int rows) {

        ManufactureExample customExample = new ManufactureExample();
        //页面分页
        PageHelper.startPage(page, rows);
        List<Manufacture> manufactures = manufactureMapper.selectByExample(customExample);

        PageResult pageResult = new PageResult();
        PageInfo<Manufacture> pageInfo = new PageInfo<>(manufactures);

        pageResult.setRows(manufactures);
        pageResult.setTotal(pageInfo.getTotal());
        return pageResult;
    }
}

