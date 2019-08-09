package com.cskaoyan.service.plan;

import com.cskaoyan.bean.Product;

import java.util.List;

public interface ProductService {
    List<Product> queryOrderByPageAndRows(int page, int rows);
}
