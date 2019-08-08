package com.cskaoyan.mapper;

import com.cskaoyan.bean.Final_Count_Check;
import com.cskaoyan.bean.Final_Count_CheckExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Final_Count_CheckMapper {
    long countByExample(Final_Count_CheckExample example);

    int deleteByExample(Final_Count_CheckExample example);

    int deleteByPrimaryKey(String fCountCheckId);

    int insert(Final_Count_Check record);

    int insertSelective(Final_Count_Check record);

    List<Final_Count_Check> selectByExample(Final_Count_CheckExample example);

    Final_Count_Check selectByPrimaryKey(String fCountCheckId);

    int updateByExampleSelective(@Param("record") Final_Count_Check record, @Param("example") Final_Count_CheckExample example);

    int updateByExample(@Param("record") Final_Count_Check record, @Param("example") Final_Count_CheckExample example);

    int updateByPrimaryKeySelective(Final_Count_Check record);

    int updateByPrimaryKey(Final_Count_Check record);
}