package com.cskaoyan.service.plan;

import com.cskaoyan.bean.COrder;
import com.cskaoyan.bean.COrderExample;
import com.cskaoyan.bean.pagez.PageResult;
import com.cskaoyan.mapper.COrderMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class COrderServiceImpl implements COrderService{
    @Autowired
    COrderMapper corderMapper;

    Logger logger = Logger.getLogger(this.getClass());
    @Override
    public PageResult queryOrderByPageAndRows(int page, int rows) {
        COrderExample cOrderExample = new COrderExample();
        //页面分页
        PageHelper.startPage(page, rows);
        List<COrder> cOrders = corderMapper.queryorderdetail2();

        PageResult pageResult = new PageResult();
        PageInfo<COrder> pageInfo = new PageInfo<>(cOrders);

        pageResult.setRows(cOrders);
        pageResult.setTotal(pageInfo.getTotal());
        return pageResult;
    }

    @Override
    public void DeleteById(String[] oid) {
        System.out.println("删除前");
        for (String id : oid) {
            corderMapper.deleteByPrimaryKey(id);
        }
        System.out.println("删除后");
    }

    @Override
    public void UpdateById(COrder cOrder) {
        System.out.println("更新前");
        corderMapper.updateByPrimaryKey(cOrder);
        System.out.println("更新后");

    }

    @Override
    public void InsertById(COrder cOrder) {
        corderMapper.insertSelective(cOrder);
    }

    //search_order_by_orderId模糊查询
    @Override
    public PageResult search_order_by_orderId(int page, int rows ,String id) {
        COrderExample cOrderExample = new COrderExample();
        //页面分页
        PageHelper.startPage(page, rows);
        List<COrder> cOrders = corderMapper.search_order_by_orderId(id);

        PageResult pageResult = new PageResult();
        PageInfo<COrder> pageInfo = new PageInfo<>(cOrders);

        pageResult.setRows(cOrders);
        pageResult.setTotal(pageInfo.getTotal());
        return pageResult;
    }

    @Override
    public PageResult search_order_by_orderCustom(int page, int rows, String SearchValue) {
        COrderExample cOrderExample = new COrderExample();
        //页面分页
        PageHelper.startPage(page, rows);
        List<COrder> cOrders = corderMapper.search_order_by_orderCustom(SearchValue);

        PageResult pageResult = new PageResult();
        PageInfo<COrder> pageInfo = new PageInfo<>(cOrders);

        pageResult.setRows(cOrders);
        pageResult.setTotal(pageInfo.getTotal());


        return pageResult;
    }

    @Override
    public PageResult search_order_by_orderProduct(int page, int rows, String searchValue) {
        COrderExample cOrderExample = new COrderExample();
        //页面分页
        PageHelper.startPage(page, rows);
        List<COrder> cOrders = corderMapper.search_order_by_orderProduct(searchValue);

        PageResult pageResult = new PageResult();
        PageInfo<COrder> pageInfo = new PageInfo<>(cOrders);

        pageResult.setRows(cOrders);
        pageResult.setTotal(pageInfo.getTotal());


        return pageResult;
    }


}
