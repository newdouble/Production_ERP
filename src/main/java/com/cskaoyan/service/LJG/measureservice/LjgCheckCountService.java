package com.cskaoyan.service.LJG.measureservice;

import com.cskaoyan.bean.FinalCountCheck2;
import com.cskaoyan.bean.pagez.PageResult;

import java.util.List;

/*成品计数质检*/
public interface LjgCheckCountService {
    List<FinalCountCheck2> queryCheckCountList();

    PageResult SearchFcountByFId(String id,int page,int rows);

    PageResult SearchFcountByOId(String id,int page,int rows);
}
