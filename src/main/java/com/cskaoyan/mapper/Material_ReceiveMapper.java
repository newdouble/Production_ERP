package com.cskaoyan.mapper;

import com.cskaoyan.bean.Material_Receive;
import com.cskaoyan.bean.Material_ReceiveExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Material_ReceiveMapper {
    long countByExample(Material_ReceiveExample example);

    int deleteByExample(Material_ReceiveExample example);

    int deleteByPrimaryKey(String receiveId);

    int insert(Material_Receive record);

    int insertSelective(Material_Receive record);

    List<Material_Receive> selectByExample(Material_ReceiveExample example);

    Material_Receive selectByPrimaryKey(String receiveId);

    int updateByExampleSelective(@Param("record") Material_Receive record, @Param("example") Material_ReceiveExample example);

    int updateByExample(@Param("record") Material_Receive record, @Param("example") Material_ReceiveExample example);

    int updateByPrimaryKeySelective(Material_Receive record);

    int updateByPrimaryKey(Material_Receive record);
}