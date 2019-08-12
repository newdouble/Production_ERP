package com.cskaoyan.service.LJG.qualify;


import com.cskaoyan.bean.UnqualifyApply;
import com.cskaoyan.bean.pagez.PageResult;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UnqualifyService {
    List<UnqualifyApply> queryAllUnQualify();
    PageResult  searchUnqualifyApplyById(String id,int page,int rows);
    PageResult  searchUnqualifyByName( String name, int page, int rows);


}

