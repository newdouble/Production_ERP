package com.cskaoyan.mapper;

import com.cskaoyan.bean.Device_Fault;
import com.cskaoyan.bean.Device_FaultExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Device_FaultMapper {
    long countByExample(Device_FaultExample example);

    int deleteByExample(Device_FaultExample example);

    int deleteByPrimaryKey(String deviceFaultId);

    int insert(Device_Fault record);

    int insertSelective(Device_Fault record);

    List<Device_Fault> selectByExample(Device_FaultExample example);

    Device_Fault selectByPrimaryKey(String deviceFaultId);

    int updateByExampleSelective(@Param("record") Device_Fault record, @Param("example") Device_FaultExample example);

    int updateByExample(@Param("record") Device_Fault record, @Param("example") Device_FaultExample example);

    int updateByPrimaryKeySelective(Device_Fault record);

    int updateByPrimaryKey(Device_Fault record);
}