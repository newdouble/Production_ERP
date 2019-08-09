package com.cskaoyan.controller.qualifycontroller;

import com.cskaoyan.bean.UnqualifyApply;
import com.cskaoyan.service.qualify.UnqualifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("unqualify")
public class UnqualifyController {
    @Autowired
    UnqualifyService unqualifyService;

    @RequestMapping("find")
    public String findAll(){
        return "/WEB-INF/jsp/unqualify_list.jsp";
    }

    @RequestMapping("list")
    @ResponseBody
    public Map unqualify(){
        List<UnqualifyApply> unqualifyApplies = unqualifyService.queryAllUnQualify();
        int total = unqualifyApplies.size();
        Map map = new HashMap();
        map.put("total",total);
        map.put("rows",unqualifyApplies);
        return map ;
    }

}
