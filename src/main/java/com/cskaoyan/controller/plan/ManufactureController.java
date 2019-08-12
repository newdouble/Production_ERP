package com.cskaoyan.controller.plan;

import com.cskaoyan.bean.Manufacture;
import com.cskaoyan.bean.pagez.PageResult;
import com.cskaoyan.service.plan.ManufactureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
@RequestMapping("manufacture")
public class ManufactureController {
    @Autowired
    ManufactureService manufactureService;
    @RequestMapping("find")
    public String  find(){
        System.out.println("find");
        return "/WEB-INF/jsp/manufacture_list.jsp";
    }
    @RequestMapping("list")
    @ResponseBody
    public PageResult queryOrderByPage(int page, int rows){
        return manufactureService.queryOrderByPageAndRows(page,rows);
    }
}