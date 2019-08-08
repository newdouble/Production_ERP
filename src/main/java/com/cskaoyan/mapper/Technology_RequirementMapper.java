package com.cskaoyan.mapper;

import com.cskaoyan.bean.Technology_Requirement;
import com.cskaoyan.bean.Technology_RequirementExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Technology_RequirementMapper {
    long countByExample(Technology_RequirementExample example);

    int deleteByExample(Technology_RequirementExample example);

    int deleteByPrimaryKey(String technologyRequirementId);

    int insert(Technology_Requirement record);

    int insertSelective(Technology_Requirement record);

    List<Technology_Requirement> selectByExample(Technology_RequirementExample example);

    Technology_Requirement selectByPrimaryKey(String technologyRequirementId);

    int updateByExampleSelective(@Param("record") Technology_Requirement record, @Param("example") Technology_RequirementExample example);

    int updateByExample(@Param("record") Technology_Requirement record, @Param("example") Technology_RequirementExample example);

    int updateByPrimaryKeySelective(Technology_Requirement record);

    int updateByPrimaryKey(Technology_Requirement record);
}