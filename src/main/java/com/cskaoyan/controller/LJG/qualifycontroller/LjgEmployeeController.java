package com.cskaoyan.controller.LJG.qualifycontroller;

import com.cskaoyan.bean.Employee;
import com.cskaoyan.service.LJG.qualify.LjgEmployeeDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LjgEmployeeController {
    @Autowired
    LjgEmployeeDetailService ljgEmployeeDetailService;

    @RequestMapping("employee/get/{idz}")
    @ResponseBody
    public Employee employeeDetail(@PathVariable("idz") String id){
        Employee employee = ljgEmployeeDetailService.queryEmployeeById(id);
        return employee;
    }
}
