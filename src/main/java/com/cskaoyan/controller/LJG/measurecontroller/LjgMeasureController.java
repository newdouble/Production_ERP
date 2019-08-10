package com.cskaoyan.controller.LJG.measurecontroller;

import com.cskaoyan.bean.FinalMeasuretCheck2;
import com.cskaoyan.service.LJG.measureservice.LjgMeasureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
/*成品计数质检controller层*/
@Controller
@RequestMapping("measure")
public class LjgMeasureController {
    @Autowired
    LjgMeasureService ljgMeasureService;

   @RequestMapping("find")
    public String measureAll(){
        return "/WEB-INF/jsp/measurement_list.jsp";
    }

    @RequestMapping("list")
    @ResponseBody
    public Map measureDetail(){
        List<FinalMeasuretCheck2> finalMeasuretCheck2s = ljgMeasureService.queryMeasureDetail();
        int total = finalMeasuretCheck2s.size();
        HashMap map = new HashMap<>();
        map.put("total",total);
        map.put("rows",finalMeasuretCheck2s);
        return map;
    }
}
