package com.cskaoyan.service.plan;



import com.cskaoyan.bean.Work;

import java.util.List;

public interface WorkService {
    List<Work> queryOrderByPageAndRows(int page, int rows);
}
