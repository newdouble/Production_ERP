package com.cskaoyan.mapper;

import com.cskaoyan.bean.Material_Consume;
import com.cskaoyan.bean.Material_ConsumeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Material_ConsumeMapper {
    long countByExample(Material_ConsumeExample example);

    int deleteByExample(Material_ConsumeExample example);

    int deleteByPrimaryKey(String consumeId);

    int insert(Material_Consume record);

    int insertSelective(Material_Consume record);

    List<Material_Consume> selectByExample(Material_ConsumeExample example);

    Material_Consume selectByPrimaryKey(String consumeId);

    int updateByExampleSelective(@Param("record") Material_Consume record, @Param("example") Material_ConsumeExample example);

    int updateByExample(@Param("record") Material_Consume record, @Param("example") Material_ConsumeExample example);

    int updateByPrimaryKeySelective(Material_Consume record);

    int updateByPrimaryKey(Material_Consume record);
}