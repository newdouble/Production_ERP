package com.cskaoyan.controller.plan;


import com.cskaoyan.bean.COrder;
import com.cskaoyan.service.plan.COrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("order")
public class OrderController {
    @Autowired
    COrderService cOrderService;
    @Autowired
    HttpSession session;
    @RequestMapping("find")
    public String  find(){
        return "/WEB-INF/jsp/order_list.jsp";
    }
    String[] sysPermissionList = {"order:add","order:edit","order:delete"};
   @RequestMapping("list")
    @ResponseBody
    public List<COrder> queryOrderByPage(int page,int rows){
        List<COrder> cOrders = cOrderService.queryOrderByPageAndRows(page, rows);
        return cOrders;
    }
}
