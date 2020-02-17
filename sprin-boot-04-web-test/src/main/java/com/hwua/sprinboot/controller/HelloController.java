package com.hwua.sprinboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Controller
public class HelloController {
    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "Hello World!";
    }

    @RequestMapping("/success")
    public String success(Map<String,String> map){
        map.put("hello","哈哈");
        return "success";
    }
}
