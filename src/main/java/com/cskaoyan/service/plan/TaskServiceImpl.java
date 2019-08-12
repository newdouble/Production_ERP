package com.cskaoyan.service.plan;

import com.cskaoyan.bean.Task;
import com.cskaoyan.bean.TaskExample;
import com.cskaoyan.bean.pagez.PageResult;
import com.cskaoyan.mapper.TaskMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {
    @Autowired
    TaskMapper taskMapper;
    @Override
    public PageResult queryOrderByPageAndRows(int page, int rows) {
        TaskExample taskExample = new TaskExample();
        //页面分页
        PageHelper.startPage(page, rows);
        List<Task> tasks =taskMapper.selectByExample(taskExample);

        PageResult pageResult = new PageResult();
        PageInfo<Task> pageInfo = new PageInfo<>(tasks);

        pageResult.setRows(tasks);
        pageResult.setTotal(pageInfo.getTotal());
        return pageResult;
    }
}
