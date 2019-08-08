package com.cskaoyan.mapper;

import com.cskaoyan.bean.Technology_Plan;
import com.cskaoyan.bean.Technology_PlanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Technology_PlanMapper {
    long countByExample(Technology_PlanExample example);

    int deleteByExample(Technology_PlanExample example);

    int deleteByPrimaryKey(String technologyPlanId);

    int insert(Technology_Plan record);

    int insertSelective(Technology_Plan record);

    List<Technology_Plan> selectByExample(Technology_PlanExample example);

    Technology_Plan selectByPrimaryKey(String technologyPlanId);

    int updateByExampleSelective(@Param("record") Technology_Plan record, @Param("example") Technology_PlanExample example);

    int updateByExample(@Param("record") Technology_Plan record, @Param("example") Technology_PlanExample example);

    int updateByPrimaryKeySelective(Technology_Plan record);

    int updateByPrimaryKey(Technology_Plan record);
}