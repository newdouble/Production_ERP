package com.cskaoyan.service.plan;

import com.cskaoyan.bean.ProcessExample;
import com.cskaoyan.bean.Product;
import com.cskaoyan.bean.ProductExample;
import com.cskaoyan.bean.pagez.PageResult;
import com.cskaoyan.mapper.ProductMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    ProductMapper productMapper;
    @Override
    public PageResult queryOrderByPageAndRows(int page, int rows) {
        ProductExample productExample = new ProductExample();
        //页面分页
        PageHelper.startPage(page, rows);
        List<Product> products = productMapper.selectByExample(productExample);

        PageResult pageResult = new PageResult();
        PageInfo<Product> pageInfo = new PageInfo<>(products);

        pageResult.setRows(products);
        pageResult.setTotal(pageInfo.getTotal());
        return pageResult;
    }
}
