package com.cskaoyan.service.plan;

import com.cskaoyan.bean.Custom;

import java.util.List;

public interface CustomService {
    List<Custom> queryOrderByPageAndRows(int page, int rows);
}
