package com.jk.controlelr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Controller
public class UserController {

    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("queryUser")
    @ResponseBody
    public Map<String,Object>   queryUser(){
        Map user = restTemplate.getForObject("http://service-user/queryUser", Map.class);
        return user;
    }

}
