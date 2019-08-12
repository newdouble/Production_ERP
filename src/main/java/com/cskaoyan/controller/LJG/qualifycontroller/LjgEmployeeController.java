package com.cskaoyan.controller.LJG.qualifycontroller;

import com.cskaoyan.bean.Employee;
import com.cskaoyan.bean.EmployeeExample;
import com.cskaoyan.mapper.EmployeeMapper;
import com.cskaoyan.service.LJG.qualify.LjgEmployeeDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("employee")
public class LjgEmployeeController {
    @Autowired
    LjgEmployeeDetailService ljgEmployeeDetailService;

    @Autowired
    EmployeeMapper employeeMapper;
    @RequestMapping("get/{idz}")
    @ResponseBody
    public Employee employeeDetail(@PathVariable("idz") String id){
        Employee employee = ljgEmployeeDetailService.queryEmployeeById(id);
        return employee;
    }

    @RequestMapping("get_data")
    @ResponseBody
    public List<Employee> employee(){
        EmployeeExample employeeExample = new EmployeeExample();
        employeeExample.createCriteria().andEmpIdIsNotNull();
        List<Employee> employees = employeeMapper.selectByExample(employeeExample);
        return employees;
    }
}
