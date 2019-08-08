package com.cskaoyan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class PageController {

    @RequestMapping(value = {"index","/"})
    public String login(){
        System.out.println("111");
        return "WEB-INF/jsp/login.jsp";
    }
}
