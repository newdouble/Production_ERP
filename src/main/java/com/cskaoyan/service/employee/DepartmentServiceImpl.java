package com.cskaoyan.service.employee;

import com.cskaoyan.bean.Department;
import com.cskaoyan.bean.DepartmentExample;
import com.cskaoyan.bean.pagez.PageResult;
import com.cskaoyan.mapper.DepartmentMapper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * @author ethan
 * @date 2019/8/9 9:29
 */
@Service
public class DepartmentServiceImpl implements DepartmentService{

    @Autowired
    DepartmentMapper departmentMapper;

    @Override
    public Department getDepartmentById(String departmentId) {
        return departmentMapper.selectByPrimaryKey(departmentId);
    }

    @Override
    public List<Department> getData() {
        return departmentMapper.selectByExample(new DepartmentExample());
    }

    @Override
    public PageResult getPageList(int page, int rows) {
        DepartmentExample exampledepartment = new DepartmentExample();
        //页面分页
        PageHelper.startPage(page,rows);
        List<Department> departmentList = departmentMapper.selectByExample(exampledepartment);
        PageResult pageResult = new PageResult();
        PageInfo<Department> pageInfo = new PageInfo<>(departmentList);
        pageResult.setRows(departmentList);
        pageResult.setTotal(pageInfo.getTotal());
        return pageResult;
    }

    @Override
    public PageResult selectDepartmentsById(@PathVariable("departmentId") String departmentId, int page, int rows) {
        PageHelper.startPage(page,rows);
        List<Department> departments = departmentMapper.selectDepartmentsById(departmentId);
        PageResult pageResult = new PageResult();
        PageInfo<Department> pageInfo = new PageInfo<>(departments);
        pageResult.setRows(departments);
        pageResult.setTotal(pageInfo.getTotal());
        return pageResult;
    }

    @Override
    public PageResult selectDepartmentsByName(String departmentName, int page, int rows) {
        PageHelper.startPage(page,rows);
        List<Department> departments = departmentMapper.selectDepartmentsByName(departmentName);
        PageResult pageResult = new PageResult();
        PageInfo<Department> pageInfo = new PageInfo<>(departments);
        pageResult.setRows(departments);
        pageResult.setTotal(pageInfo.getTotal());
        return pageResult;
    }

}
