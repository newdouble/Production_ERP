package com.cskaoyan.service.LJG.measureservice;

import com.cskaoyan.bean.COrder2;
import com.cskaoyan.mapper.COrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LjgOrderServiceImpl implements LjgOrderService {
    @Autowired
    COrderMapper cOrderMapper;
    @Override
    public COrder2 queryOrderDetail(String id) {
        return null;
    }

    @Override
    public COrder2 queryOrderById(String id) {
        COrder2 queryorderdetail = cOrderMapper.queryorderdetail(id);
        return queryorderdetail;
    }
}
