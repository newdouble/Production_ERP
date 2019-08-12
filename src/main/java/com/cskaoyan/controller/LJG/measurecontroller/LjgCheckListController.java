package com.cskaoyan.controller.LJG.measurecontroller;

import com.cskaoyan.bean.FinalCountCheck2;
import com.cskaoyan.service.LJG.measureservice.LjgCheckCountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("f_count_check")
public class LjgCheckListController {
    @Autowired
    LjgCheckCountService ljgCheckCountService;

   @RequestMapping("find")
    public String findCheck(){
       return "/WEB-INF/jsp/f_count_check_list.jsp";

   }


   @RequestMapping("list")
    @ResponseBody
    public Map check(){
       List<FinalCountCheck2> finalCountCheck2s = ljgCheckCountService.queryCheckCountList();
       int total = finalCountCheck2s.size();
       HashMap hashMap = new HashMap();
       hashMap.put("total",total);
       hashMap.put("rows",finalCountCheck2s);
       return hashMap;
   }

}
