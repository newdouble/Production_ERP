package com.cskaoyan.controller.employee;

import com.cskaoyan.bean.Department;
import com.cskaoyan.bean.pagez.PageResult;
import com.cskaoyan.service.employee.DepartmentService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author ethan
 * @date 2019/8/8 23:31
 */
@Controller
@RequestMapping("/department")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;
    /**
     * 获取Json数据
     * @param departmentId
     * @return
     */
    @RequestMapping("/get/{departmentId}")
    @ResponseBody
    public Department getDepartmentById(@PathVariable String departmentId){
        return departmentService.getDepartmentById(departmentId);
    }
    /**
     * 获取list数据
     * @return
     */
    @RequestMapping("/get_data")
    @ResponseBody
    public List<Department> getData(){
        return departmentService.getData();
    }

    /**
     * department的主页
     * @return
     */
    @RequestMapping("/find")
    public String find(){
        return "/WEB-INF/jsp/department_list.jsp";
    }
    /*显示页面*/
    @RequestMapping("/list")
    @ResponseBody
    public PageResult getPageList(int page, int rows){

        return departmentService.getPageList(page,rows);
    }
    /*通过部门ID搜索*/
    @RequestMapping("/search_department_by_departmentId")
    @ResponseBody
    public PageResult searchDepartmentByDepartmentId(String departmentId,int page,int rows){
        return departmentService.selectDepartmentsById(departmentId,page,rows);
    }
    /*通过部门名搜索*/
    @RequestMapping("/search_department_by_departmentName")
    @ResponseBody
    public PageResult searchDepartmentByDepartmentName(String departmentName,int page,int rows){
        return departmentService.selectDepartmentsByName(departmentName,page,rows);
    }
    @RequestMapping()
}
