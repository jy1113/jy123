package com.jk.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@FeignClient("service-user") //声明为feign的客户端 , 指名要调用的服务
public interface UserServiceFeign extends UserService_api{
}
