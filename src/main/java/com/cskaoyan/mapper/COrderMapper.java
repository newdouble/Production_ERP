package com.cskaoyan.mapper;

import com.cskaoyan.bean.COrder;
import com.cskaoyan.bean.COrder2;
import com.cskaoyan.bean.COrderExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface COrderMapper {
    long countByExample(COrderExample example);

    int deleteByExample(COrderExample example);

    int deleteByPrimaryKey(String orderId);

    int insert(COrder record);

    int insertSelective(COrder record);

    List<COrder> selectByExample(COrderExample example);

    COrder selectByPrimaryKey(String orderId);

    int updateByExampleSelective(@Param("record") COrder record, @Param("example") COrderExample example);

    int updateByExample(@Param("record") COrder record, @Param("example") COrderExample example);

    int updateByPrimaryKeySelective(COrder record);

    int updateByPrimaryKey(COrder record);

    COrder2 queryorderdetail(@Param("oid") String id);


    List<COrder> queryorderdetail2();

    List<COrder> search_order_by_orderId(@Param("id") String id);

    List<COrder> search_order_by_orderCustom(@Param("id") String id);

    List<COrder> search_order_by_orderProduct(@Param("id") String id);

    List<COrder2> orderGetData();

}