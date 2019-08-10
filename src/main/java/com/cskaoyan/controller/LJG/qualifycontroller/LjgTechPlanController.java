package com.cskaoyan.controller.LJG.qualifycontroller;

import com.cskaoyan.bean.TechnologyPlan;
import com.cskaoyan.service.LJG.qualify.LjgTechnologyPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
public class LjgTechPlanController {
    @Autowired
    LjgTechnologyPlanService ljgTechnologyPlanService;

    @RequestMapping("/technologyPlan/get_data")
    @ResponseBody
    public List<TechnologyPlan> tech(){
        List<TechnologyPlan> technologyPlans = ljgTechnologyPlanService.queryAllTechPlan();
        return technologyPlans;
    }
}
