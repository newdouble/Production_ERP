package com.cskaoyan.controller.plan;

import com.cskaoyan.bean.Task;
import com.cskaoyan.bean.pagez.PageResult;
import com.cskaoyan.service.plan.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("task")
public class TaskController {
    @Autowired
    TaskService taskService;
    @RequestMapping("find")
    public String  find(){
        return "/WEB-INF/jsp/task_list.jsp";
    }
    @RequestMapping("list")
    @ResponseBody
    public PageResult queryOrderByPage(int page, int rows){

        return taskService.queryOrderByPageAndRows(page,rows);
    }
}