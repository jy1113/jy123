package com.jk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class OrderService {
    //标明此方法只接收get请求
    //@RequestMapping(value = "queryOrder",method= RequestMethod.GET)
    @GetMapping("queryOrder")
    @ResponseBody
    public Map<String,Object> queryOrder(){
        Map<String, Object> order = new HashMap<>();
        order.put("orderId","a6s5d4sf4d5fgh");
        order.put("orderDesc","iphone XS MAX");
        order.put("orderPrice",9999);
        return order;
    }
}
