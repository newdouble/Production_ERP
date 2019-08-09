package com.cskaoyan.service.plan;

import com.cskaoyan.bean.ProcessExample;
import com.cskaoyan.bean.Product;
import com.cskaoyan.bean.ProductExample;
import com.cskaoyan.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    ProductMapper productMapper;
    @Override
    public List<Product> queryOrderByPageAndRows(int page, int rows) {
        ProductExample productExample = new ProductExample();
        productExample.createCriteria().andProductIdIsNotNull();
        List<Product> products = productMapper.selectByExample(productExample);
        return products;
    }
}
