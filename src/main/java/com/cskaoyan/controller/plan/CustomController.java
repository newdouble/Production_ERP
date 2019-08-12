package com.cskaoyan.controller.plan;

import com.cskaoyan.bean.pagez.PageResult;
import com.cskaoyan.service.plan.CustomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//import java.util.List;


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
    public PageResult queryOrderByPage(int page, int rows){
        return customService.queryOrderByPageAndRows(page,rows);
    }

    //查询search_custom_by_customId
    @RequestMapping("search_custom_by_customId")//显示下面的各列
    @ResponseBody
    public PageResult search_order_by_orderId(int page, int rows,String searchValue){
        return customService.search_custom_by_customId(page, rows, searchValue);
    }

    //search_custom_by_customName
    @RequestMapping("search_custom_by_customName")//显示下面的各列
    @ResponseBody
    public PageResult search_custom_by_customName(int page, int rows,String searchValue){
        return customService.search_custom_by_customName(page, rows, searchValue);
    }
}

