package com.cskaoyan.mapper;

import com.cskaoyan.bean.Unqualify_Apply;
import com.cskaoyan.bean.Unqualify_ApplyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Unqualify_ApplyMapper {
    long countByExample(Unqualify_ApplyExample example);

    int deleteByExample(Unqualify_ApplyExample example);

    int deleteByPrimaryKey(String unqualifyApplyId);

    int insert(Unqualify_Apply record);

    int insertSelective(Unqualify_Apply record);

    List<Unqualify_Apply> selectByExample(Unqualify_ApplyExample example);

    Unqualify_Apply selectByPrimaryKey(String unqualifyApplyId);

    int updateByExampleSelective(@Param("record") Unqualify_Apply record, @Param("example") Unqualify_ApplyExample example);

    int updateByExample(@Param("record") Unqualify_Apply record, @Param("example") Unqualify_ApplyExample example);

    int updateByPrimaryKeySelective(Unqualify_Apply record);

    int updateByPrimaryKey(Unqualify_Apply record);
}