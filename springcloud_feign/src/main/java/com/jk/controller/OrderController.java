package com.jk.controller;

import com.jk.pojo.Order;
import com.jk.service.OrderServiceFegin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Controller
public class OrderController {
    @Autowired
    private OrderServiceFegin orderServiceFegin;
    @GetMapping("queryOrder")
    @ResponseBody
    public Map<String,Object> queryOrder(){

        return orderServiceFegin.queryOrder();
    }
    @PostMapping("saveOrder")
    @ResponseBody
    public void saveOrder(@RequestBody Order order){
        orderServiceFegin.saveOrder(order);
    }
}
