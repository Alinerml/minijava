package com.aliner.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.function.ToDoubleBiFunction;

/**
 * @author aliner
 * @date 2023/12/20 22:35
 */

@RestController
public class Hello {

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
}
