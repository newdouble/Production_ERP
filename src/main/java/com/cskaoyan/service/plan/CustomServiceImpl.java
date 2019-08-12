package com.cskaoyan.service.plan;

import com.cskaoyan.bean.Custom;
import com.cskaoyan.bean.CustomExample;
import com.cskaoyan.bean.pagez.PageResult;
import com.cskaoyan.mapper.CustomMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomServiceImpl implements CustomService {
    @Autowired
    CustomMapper customMapper;

    @Override
    public PageResult queryOrderByPageAndRows(int page, int rows) {

        CustomExample customExample = new CustomExample();
        //页面分页
        PageHelper.startPage(page, rows);
        List<Custom> customs = customMapper.selectByExample(customExample);

        PageResult pageResult = new PageResult();
        PageInfo<Custom> pageInfo = new PageInfo<>(customs);

        pageResult.setRows(customs);
        pageResult.setTotal(pageInfo.getTotal());
        return pageResult;
    }

    @Override
    public PageResult search_custom_by_customId(int page, int rows, String searchValue) {
        CustomExample customExample = new CustomExample();
        //页面分页
        PageHelper.startPage(page, rows);
        List<Custom> customs = customMapper.search_custom_by_customId(searchValue);

        PageResult pageResult = new PageResult();
        PageInfo<Custom> pageInfo = new PageInfo<>(customs);

        pageResult.setRows(customs);
        pageResult.setTotal(pageInfo.getTotal());
        return pageResult;
    }

    @Override
    public PageResult search_custom_by_customName(int page, int rows, String searchValue) {
        CustomExample customExample = new CustomExample();
        //页面分页
        PageHelper.startPage(page, rows);
        List<Custom> customs = customMapper.search_custom_by_customName(searchValue);

        PageResult pageResult = new PageResult();
        PageInfo<Custom> pageInfo = new PageInfo<>(customs);

        pageResult.setRows(customs);
        pageResult.setTotal(pageInfo.getTotal());
        return pageResult;
    }

//    @Override
//    public PageResult queryOrderByPageAndRows(int page, int rows) {
//        CustomExample customExample = new CustomExample();
//        customExample.createCriteria().andCustomIdIsNotNull();
//        //        cOrderExample.createCriteria().andCustomIdBetween(String.valueOf((page-1)*rows),String.valueOf((rows+page-1)*rows));
//        return customMapper.selectByExample(customExample);
//    }
}
