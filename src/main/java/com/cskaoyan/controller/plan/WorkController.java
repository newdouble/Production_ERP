package com.cskaoyan.controller.plan;

import com.cskaoyan.bean.Product;
import com.cskaoyan.bean.Work;
import com.cskaoyan.service.plan.ProductService;
import com.cskaoyan.service.plan.WorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("work")
public class WorkController {
    @Autowired
    WorkService workService;
    @RequestMapping("find")
    public String  find(){
        return "/WEB-INF/jsp/work_list.jsp";
    }
    @RequestMapping("list")
    @ResponseBody
    public List<Work> queryOrderByPage(int page, int rows){
        List<Work> works = workService.queryOrderByPageAndRows(page,rows);
        return works;
    }
}