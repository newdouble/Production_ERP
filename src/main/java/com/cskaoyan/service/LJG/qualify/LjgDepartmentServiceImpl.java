package com.cskaoyan.service.LJG.qualify;

import com.cskaoyan.bean.Department;
import com.cskaoyan.bean.DepartmentExample;
import com.cskaoyan.mapper.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LjgDepartmentServiceImpl implements LjgDepartmentService {
    @Autowired
    DepartmentMapper departmentMapper;
    @Override
    public List<Department> queryAllDepartment() {
        DepartmentExample departmentExample = new DepartmentExample();
        departmentExample.createCriteria().andDepartmentIdIsNotNull();
        List<Department> departments = departmentMapper.selectByExample(departmentExample);
        return departments;
    }
}
