package com.cskaoyan.service.LJG.measureservice;

import com.cskaoyan.bean.ProcessMeasureCheck2;

import java.util.List;
/*工序计数质检*/
public interface LjgMeasureCheckService {
    List<ProcessMeasureCheck2> queryAllMeasureCheck();
}
