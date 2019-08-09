package com.cskaoyan.service.plan;



import com.cskaoyan.bean.COrder;

import java.util.List;

public interface COrderService {
    List<COrder> queryOrderByPageAndRows(int page, int rows);
}
