package com.cskaoyan.service;

import com.cskaoyan.bean.Order;

import java.util.List;

public interface OrderService {
    List<Order> queryOrderByPageAndRows(int page, int rows);
}
