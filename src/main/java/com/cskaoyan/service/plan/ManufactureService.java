package com.cskaoyan.service.plan;

import com.cskaoyan.bean.Manufacture;

import java.util.List;

public interface ManufactureService {
    List<Manufacture> queryOrderByPageAndRows(int page, int rows);
}
