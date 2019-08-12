package com.cskaoyan.controller.plan;


import com.cskaoyan.bean.Product;
import com.cskaoyan.bean.pagez.PageResult;
import com.cskaoyan.service.plan.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("product")
public class ProductController {
    @Autowired
    ProductService productService;
    @RequestMapping("find")
    public String  find(){
        return "/WEB-INF/jsp/product_list.jsp";
    }
    @RequestMapping("list")
    @ResponseBody
    public PageResult queryOrderByPage(int page, int rows){
        return productService.queryOrderByPageAndRows(page,rows);
    }
}