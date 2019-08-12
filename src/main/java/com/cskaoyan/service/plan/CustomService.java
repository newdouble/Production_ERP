package com.cskaoyan.service.plan;

import com.cskaoyan.bean.pagez.PageResult;


public interface CustomService {
    PageResult queryOrderByPageAndRows(int page, int rows);

    PageResult search_custom_by_customId(int page, int rows, String searchValue);

    PageResult search_custom_by_customName(int page, int rows, String searchValue);
}
