package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangyu
 * @date 2019-01-04 17:49
 */
@RestController
@RequestMapping("home")
public class HomeController {
    @RequestMapping("home")
    public String home(){
        return "hello springboot!";
    }
}
