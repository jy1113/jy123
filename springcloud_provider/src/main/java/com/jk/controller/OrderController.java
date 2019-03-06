package com.jk.controller;

import com.jk.pojo.Order;
import com.jk.service.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Controller
public class OrderController implements OrderService {
    //标明此方法只接收get请求
    //@RequestMapping(value = "queryOrder",method= RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> queryOrder(){
        Map<String, Object> order = new HashMap<>();
        order.put("orderId","a6s5d4sf4d5fgh");
        order.put("orderDesc","iphone XS MAX");
        order.put("orderPrice",9999);
        return order;
    }

    @Override     //@RequestBody 把json字符串 转成对应对象
    @ResponseBody
    public void saveOrder(@RequestBody Order order) {
        System.out.println("order = [" + order.toString() + "]");

    }
}
