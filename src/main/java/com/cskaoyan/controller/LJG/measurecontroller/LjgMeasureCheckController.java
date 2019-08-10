package com.cskaoyan.controller.LJG.measurecontroller;

import com.cskaoyan.bean.ProcessMeasureCheck2;
import com.cskaoyan.service.LJG.measureservice.LjgMeasureCheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*工序计量质检controller层*/
@Controller
@RequestMapping("p_measure_check")
public class LjgMeasureCheckController {
    @Autowired
    LjgMeasureCheckService ljgMeasureCheckService;

    @RequestMapping("find")
    public String find(){
        return "/WEB-INF/jsp/p_measure_check_list.jsp";
    }

    @RequestMapping("list")
    @ResponseBody
    public Map fiand(){
        List<ProcessMeasureCheck2> processMeasureCheck2s = ljgMeasureCheckService.queryAllMeasureCheck();
        int total = processMeasureCheck2s.size();
        HashMap hashMap = new HashMap();
        hashMap.put("total",total);
        hashMap.put("rows",processMeasureCheck2s);
        return hashMap;
    }
}
