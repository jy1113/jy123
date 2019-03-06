package com.jk.controller;

import com.jk.mapper.UserMapper;
import com.jk.model.User;
import com.jk.service.UserService_api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class UserController implements UserService_api {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("queryUser")
    @ResponseBody
    public Map<String,Object> queryUser(){
        Map<String,Object> user = new HashMap<>();
        user.put("userID","wqe12312");
        user.put("userName","张三");
        user.put("passWord","密码");
        return user;
    }

    @Override
    @PostMapping("addUser")
    @ResponseBody
    public void addUser(@RequestBody User user) {
        if (user.getId()!=null){
            userMapper.updateUser(user);
        }else{
            userMapper.addUser(user);
        }
    }


    @ResponseBody
    @GetMapping("findAllUser")
    public List findAllUser() {
        return userMapper.findAllUser();
    }

    @ResponseBody
    @DeleteMapping("delUserById")
    public void delUserById( Integer id) {
        userMapper.delUserById(id);
    }

    @ResponseBody
    @GetMapping("queryById")
    public User queryById(Integer id) {
        return userMapper.queryById(id);
    }

}
