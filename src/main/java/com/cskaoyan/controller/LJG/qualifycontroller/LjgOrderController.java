package com.cskaoyan.controller.LJG.qualifycontroller;

import com.cskaoyan.bean.COrder2;
import com.cskaoyan.mapper.COrderMapper;
import com.cskaoyan.service.LJG.measureservice.LjgOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
public class LjgOrderController {

   @Autowired
    LjgOrderService ljgOrderService;

   @Autowired
    COrderMapper cOrderMapper;

    @RequestMapping("/order/get/{idz}")
    @ResponseBody
    public COrder2 order(@PathVariable("idz")String id){
        COrder2 cOrder2 = ljgOrderService.queryOrderById(id);
        return cOrder2;
    }

    @RequestMapping("/order/get_data")
    @ResponseBody
    public List<COrder2> getOrder(){
        List<COrder2> cOrder2s = cOrderMapper.orderGetData();
        return cOrder2s;
    }
}
