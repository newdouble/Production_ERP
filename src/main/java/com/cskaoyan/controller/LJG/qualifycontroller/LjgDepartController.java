package com.cskaoyan.controller.LJG.qualifycontroller;

import com.cskaoyan.bean.Department;
import com.cskaoyan.service.LJG.qualify.LjgDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class LjgDepartController {
 /*   @Autowired
    LjgDepartmentService departmentService;

    @RequestMapping("/department/get_data")
    @ResponseBody
    public List<Department> department(){
        List<Department> departments = departmentService.queryAllDepartment();
        return departments;
    }*/
}
