package com.aliner.controller;

import com.aliner.common.Result;
import com.aliner.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserController {
    @Resource
    UserService userService;

    @GetMapping("/getAllUser")
    Result getAllUser(){
        return userService.getAllUser();
    }
}
