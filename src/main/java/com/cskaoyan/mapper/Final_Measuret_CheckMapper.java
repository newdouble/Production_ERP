package com.cskaoyan.mapper;

import com.cskaoyan.bean.Final_Measuret_Check;
import com.cskaoyan.bean.Final_Measuret_CheckExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Final_Measuret_CheckMapper {
    long countByExample(Final_Measuret_CheckExample example);

    int deleteByExample(Final_Measuret_CheckExample example);

    int deleteByPrimaryKey(String fMeasureCheckId);

    int insert(Final_Measuret_Check record);

    int insertSelective(Final_Measuret_Check record);

    List<Final_Measuret_Check> selectByExample(Final_Measuret_CheckExample example);

    Final_Measuret_Check selectByPrimaryKey(String fMeasureCheckId);

    int updateByExampleSelective(@Param("record") Final_Measuret_Check record, @Param("example") Final_Measuret_CheckExample example);

    int updateByExample(@Param("record") Final_Measuret_Check record, @Param("example") Final_Measuret_CheckExample example);

    int updateByPrimaryKeySelective(Final_Measuret_Check record);

    int updateByPrimaryKey(Final_Measuret_Check record);
}