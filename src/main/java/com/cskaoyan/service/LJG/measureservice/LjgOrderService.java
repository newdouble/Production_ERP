package com.cskaoyan.service.LJG.measureservice;


import com.cskaoyan.bean.COrder2;

public interface LjgOrderService {
    COrder2 queryOrderDetail(String id);
    COrder2 queryOrderById(String id);
}
