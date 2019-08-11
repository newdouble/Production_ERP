package com.cskaoyan.controller.LJG.qualifycontroller;

import com.cskaoyan.bean.Product;
import com.cskaoyan.service.LJG.qualify.LjgProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class LjgProductController {
    @Autowired
    LjgProductService ljgProductService;


    @RequestMapping("/product/get/{idz}")
    @ResponseBody
    public Product queryProduct(@PathVariable("idz") String id){

        return ljgProductService.queryProductById(id);

    }

    @RequestMapping("/product/get_data")
    @ResponseBody
    public List<Product> product(){
        List<Product> products = ljgProductService.queryAllProduct();
        return products;
    }



}
