package com.cskaoyan.bean.pagez;

import java.util.List;

//<<<<<<< HEAD
//<<<<<<< HEAD
//public class PageResult {
//
//    private long total;
//
//=======
//=======
///*<<<<<<< HEAD
//public class PageResult {
//
//    private long total;
//
//=======*/
//>>>>>>> 693bcb0db86d01db50467593b08f3bc651456da0
/**
 * @author ethan
 * @date 2019/8/9 15:03
 */
public class PageResult {
    //总记录数
    private long total;
    //每页的记录数
//>>>>>>> 2e0e520bfcc3d7d1abf5f1af65aaf1a483252f80
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
