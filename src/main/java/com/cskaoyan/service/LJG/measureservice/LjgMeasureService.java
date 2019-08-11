package com.cskaoyan.service.LJG.measureservice;

import com.cskaoyan.bean.FinalMeasuretCheck;
import com.cskaoyan.bean.FinalMeasuretCheck2;
import com.cskaoyan.bean.ProcessMeasureCheck2;
import com.cskaoyan.bean.pagez.PageResult;
/*成品技术质检*/
import java.util.List;

public interface LjgMeasureService {
    List<FinalMeasuretCheck2> queryMeasureDetail();

   PageResult queryMeasureSearchById(String id,int page,int rows);

    PageResult queryMeasureSearchByOId(String id,int page,int rows);
}
