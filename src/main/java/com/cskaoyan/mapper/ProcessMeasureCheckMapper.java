package com.cskaoyan.mapper;

import com.cskaoyan.bean.ProcessMeasureCheck;
import com.cskaoyan.bean.ProcessMeasureCheck2;
import com.cskaoyan.bean.ProcessMeasureCheckExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProcessMeasureCheckMapper {
    long countByExample(ProcessMeasureCheckExample example);

    int deleteByExample(ProcessMeasureCheckExample example);

    int deleteByPrimaryKey(String pMeasureCheckId);

    int insert(ProcessMeasureCheck record);

    int insertSelective(ProcessMeasureCheck record);

    List<ProcessMeasureCheck> selectByExample(ProcessMeasureCheckExample example);

    ProcessMeasureCheck selectByPrimaryKey(String pMeasureCheckId);

    int updateByExampleSelective(@Param("record") ProcessMeasureCheck record, @Param("example") ProcessMeasureCheckExample example);

    int updateByExample(@Param("record") ProcessMeasureCheck record, @Param("example") ProcessMeasureCheckExample example);

    int updateByPrimaryKeySelective(ProcessMeasureCheck record);

    int updateByPrimaryKey(ProcessMeasureCheck record);

    List<ProcessMeasureCheck2> measureCheck();

    List<ProcessMeasureCheck2> serachByPmeasureCheckId(@Param("id")String id);
}