package com.fc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UerController {
    @RequestMapping("hello")
    public String hello(){
        return "猪脚饭、鸡公煲、凉皮，泡面搭档";
    }
}
