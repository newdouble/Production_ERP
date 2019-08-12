package com.cskaoyan.controller.LJG.qualifycontroller;

import com.cskaoyan.bean.Custom;
import com.cskaoyan.service.LJG.customservice.LjgCustomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class LjgCustomController {
    @Autowired
    LjgCustomService ljgCustomService;

    @RequestMapping("/custom/get_data")
    @ResponseBody
    public List<Custom> custom(){
        List<Custom> customs = ljgCustomService.queryAllCustom();
        return customs;
    }
}
