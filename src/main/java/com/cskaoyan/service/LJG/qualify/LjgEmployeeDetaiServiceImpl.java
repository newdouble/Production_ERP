package com.cskaoyan.service.LJG.qualify;

import com.cskaoyan.bean.Employee;
import com.cskaoyan.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LjgEmployeeDetaiServiceImpl implements LjgEmployeeDetailService {
    @Autowired
    EmployeeMapper employeeMapper;
    @Override
    public Employee queryEmployeeById(String id) {
        Employee employee = employeeMapper.applyDetail(id);
        return employee;
    }
}
