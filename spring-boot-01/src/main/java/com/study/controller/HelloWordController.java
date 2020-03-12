package com.study.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWordController {
    @RequestMapping("/hello")
    @ResponseBody
    public String Hello(){
        return "Hello Word!";
    }
}
