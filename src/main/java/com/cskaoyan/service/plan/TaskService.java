package com.cskaoyan.service.plan;

import com.cskaoyan.bean.Task;

import java.util.List;

public interface TaskService {
    List<Task> queryOrderByPageAndRows(int page, int rows);
}
