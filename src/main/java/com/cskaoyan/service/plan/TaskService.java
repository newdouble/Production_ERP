package com.cskaoyan.service.plan;

import com.cskaoyan.bean.pagez.PageResult;


public interface TaskService {
   PageResult queryOrderByPageAndRows(int page, int rows);
}
