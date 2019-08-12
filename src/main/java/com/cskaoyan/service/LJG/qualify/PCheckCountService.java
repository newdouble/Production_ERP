package com.cskaoyan.service.LJG.qualify;

import com.cskaoyan.bean.ProcessCountCheck2;
import com.cskaoyan.bean.pagez.PageResult;

import java.util.List;

public interface PCheckCountService {
    List<ProcessCountCheck2> queryAllPCheckCount();

    PageResult searchPCById(String id,int page,int rows);
}
