package com.cskaoyan.service.LJG.measureservice;

import com.cskaoyan.bean.ProcessMeasureCheck2;
import com.cskaoyan.bean.pagez.PageResult;
import org.apache.ibatis.annotations.Param;

import java.util.List;
/*工序计数质检*/
public interface LjgMeasureCheckService {
    List<ProcessMeasureCheck2> queryAllMeasureCheck();

    PageResult serachByPmeasureCheckIdService(String id, int page, int rows);
}
