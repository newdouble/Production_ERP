package com.cskaoyan.service.employee;

import com.cskaoyan.bean.Department;
import com.cskaoyan.bean.pagez.PageResult;

import java.util.List;

/**
 * @author ethan
 * @date 2019/8/9 9:27
 */
public interface DepartmentService {

    Department getDepartmentById(String departmentId);

    List<Department> getData();

    PageResult getPageList(int page, int rows);

    PageResult selectDepartmentsById(String departmentId, int page, int rows);

    PageResult selectDepartmentsByName(String departmentName, int page, int rows);

}
