package com.cskaoyan.service.plan;

import com.cskaoyan.bean.Task;
import com.cskaoyan.bean.TaskExample;
import com.cskaoyan.mapper.TaskMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {
    @Autowired
    TaskMapper taskMapper;
    @Override
    public List<Task> queryOrderByPageAndRows(int page, int rows) {
        TaskExample taskExample = new TaskExample();
        taskExample.createCriteria().andTaskIdIsNotNull();
        //        cOrderExample.createCriteria().andCustomIdBetween(String.valueOf((page-1)*rows),String.valueOf((rows+page-1)*rows));
        List<Task> tasks = taskMapper.selectByExample(taskExample);
        return tasks;
    }
}
