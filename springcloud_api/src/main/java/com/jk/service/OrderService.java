package com.jk.service;


import com.jk.pojo.Order;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@RequestMapping("order")
public interface OrderService {
    @GetMapping
    Map<String,Object> queryOrder();
    @PostMapping
    void saveOrder(Order order);
}
