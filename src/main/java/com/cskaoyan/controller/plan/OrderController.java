package com.cskaoyan.controller.plan;


import com.cskaoyan.bean.COrder;
import com.cskaoyan.bean.plan.ResponseMsg;
import com.cskaoyan.bean.pagez.PageResult;
import com.cskaoyan.service.plan.COrderService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;


@Controller
@RequestMapping("order")
public class OrderController {

    //显示
    @Autowired
    COrderService cOrderService;
    @Autowired
    HttpSession session;

    @RequestMapping("find")//显示修饰栏
    public String  find(){
        return "/WEB-INF/jsp/order_list.jsp";
    }

    @RequestMapping("list")//显示下面的各列
    @ResponseBody
    public PageResult queryOrderByPage(int page, int rows){
        return cOrderService.queryOrderByPageAndRows(page, rows);
    }


    //增加
    @RequestMapping("add_judge")//增加判断
    public String add_judge(){
        return  "/WEB-INF/jsp/order_add.jsp";
    }

    @RequestMapping("add")//增加
    public String add(){
        return  "/WEB-INF/jsp/order_add.jsp";
    }

    @RequestMapping(value = "/insert", method= RequestMethod.POST)//更新
    @ResponseBody
    public ResponseMsg InsertById(COrder cOrder){
        cOrderService.InsertById(cOrder);
        ResponseMsg responseMsg = new ResponseMsg();
        responseMsg.setStatus(200);
        responseMsg.setData("");
        responseMsg.setMsg("OK");
        return  responseMsg;
    }



    //编辑
    @RequestMapping("edit_judge")//编辑判断
    public String edit_judge(){
        return  "/WEB-INF/jsp/order_edit.jsp";
    }

    @RequestMapping("edit")//编辑
    public String edit(){
        return  "/WEB-INF/jsp/order_edit.jsp";
    }

    @RequestMapping(value = "/update_all", method= RequestMethod.POST)//更新
    @ResponseBody
    public ResponseMsg UpdateById(COrder cOrder){
        cOrderService.UpdateById(cOrder);
        ResponseMsg responseMsg = new ResponseMsg();
        responseMsg.setStatus(200);
        responseMsg.setData("");
        responseMsg.setMsg("OK");
        return  responseMsg;
    }


    //删除
    @RequestMapping("delete_judge")//删除判断
    public String delete_judge(){
        return  "/WEB-INF/jsp/order_edit.jsp";
    }

    @RequestMapping("delete_batch")//删除
    @ResponseBody
    public ResponseMsg deleteById(@Param("ids") String[] ids){
        cOrderService.DeleteById(ids);
        ResponseMsg responseMsg = new ResponseMsg();
        responseMsg.setStatus(200);
        responseMsg.setData("");
        responseMsg.setMsg("OK");
        return  responseMsg;
    }


    //查询search_order_by_orderId
    @RequestMapping("search_order_by_orderId")//显示下面的各列
    @ResponseBody
    public PageResult search_order_by_orderId(int page, int rows,String searchValue){
        return cOrderService.search_order_by_orderId(page, rows, searchValue);
    }


//    查询search_order_by_orderCustom
    @RequestMapping("search_order_by_orderCustom")//显示下面的各列
    @ResponseBody
    public PageResult search_order_by_orderCustom(int page, int rows,String searchValue){
        return cOrderService.search_order_by_orderCustom(page, rows, searchValue);
    }

    //search_order_by_orderProduct
    @RequestMapping("search_order_by_orderProduct")//显示下面的各列
    @ResponseBody
    public PageResult search_order_by_orderProduct(int page, int rows,String searchValue){
        return cOrderService.search_order_by_orderProduct(page, rows, searchValue);
    }


}
