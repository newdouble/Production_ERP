package com.cskaoyan.service.plan;



import com.cskaoyan.bean.COrder;
import com.cskaoyan.bean.pagez.PageResult;
import org.apache.ibatis.annotations.Param;


public interface COrderService {
    PageResult queryOrderByPageAndRows(int page, int rows);

    void DeleteById(String[] oid);

    void UpdateById(COrder cOrder);

    void InsertById(COrder cOrder);

    PageResult search_order_by_orderId(int page, int rows,@Param("id") String searchValue);

    PageResult search_order_by_orderCustom(int page, int rows, @Param("id")String searchValue);

    PageResult search_order_by_orderProduct(int page, int rows,@Param("id")String searchValue);
}
