package com.cskaoyan.service.LJG.qualify;

import com.cskaoyan.bean.Product;
import com.cskaoyan.bean.ProductExample;
import com.cskaoyan.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LjgProductServiceImpl implements LjgProductService {
    @Autowired
    ProductMapper productMapper;

    @Override
    public Product queryProductById(String id) {
        Product product = productMapper.selectByPrimaryKey(id);
        return product;
    }

    @Override
    public List<Product> queryAllProduct() {
        ProductExample productExample = new ProductExample();
        productExample.createCriteria().andProductIdIsNotNull();
        List<Product> products = productMapper.selectByExample(productExample);
        return products;
    }
}
