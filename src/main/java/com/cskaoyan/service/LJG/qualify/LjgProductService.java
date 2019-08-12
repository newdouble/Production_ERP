package com.cskaoyan.service.LJG.qualify;

import com.cskaoyan.bean.Product;

import java.util.List;

public interface LjgProductService {
    Product queryProductById(String id);
    List<Product> queryAllProduct();
}
