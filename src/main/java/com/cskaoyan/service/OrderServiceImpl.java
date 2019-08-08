package com.cskaoyan.service;

import com.cskaoyan.bean.Order;
import com.cskaoyan.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class OrderServiceImpl implements OrderService {
    @Autowired
    OrderMapper orderMapper;
    @Override
    public List<Order> queryOrderByPageAndRows(int page, int rows) {
        new Orderexample

    }
}
