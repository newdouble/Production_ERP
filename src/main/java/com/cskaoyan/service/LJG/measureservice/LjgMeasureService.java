package com.cskaoyan.service.LJG.measureservice;

import com.cskaoyan.bean.FinalMeasuretCheck;
import com.cskaoyan.bean.FinalMeasuretCheck2;
import com.cskaoyan.bean.ProcessMeasureCheck2;
/*成品技术质检*/
import java.util.List;

public interface LjgMeasureService {
    List<FinalMeasuretCheck2> queryMeasureDetail();
}
