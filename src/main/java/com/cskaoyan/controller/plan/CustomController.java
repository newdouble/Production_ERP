package com.cskaoyan.controller.plan;

import com.cskaoyan.bean.Custom;
import com.cskaoyan.service.plan.CustomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
@RequestMapping("custom")
public class CustomController {
    @Autowired
    CustomService customService;
    @RequestMapping("find")
    public String  find(){
        return "/WEB-INF/jsp/custom_list.jsp";
    }
    @RequestMapping("list")
    @ResponseBody
    public List<Custom> queryOrderByPage(int page, int rows){
        List<Custom> customs = customService.queryOrderByPageAndRows(page,rows);
        return customs;
    }
}

