package com.cskaoyan.controller.auther;

import com.cskaoyan.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


@Controller
RequestMapping("order")
public class OrderListController {
  @Autowired
  OrderService orderService;

}
