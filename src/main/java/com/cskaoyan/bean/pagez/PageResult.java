package com.cskaoyan.bean.pagez;

import java.util.List;


/**
 * @author ethan
 * @date 2019/8/9 15:03
 */
public class PageResult {
    //总记录数
    private long total;
    //每页的记录数

    private List<?> rows;

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<?> getRows() {
        return rows;
    }

    public void setRows(List<?> rows) {
        this.rows = rows;
    }
}
