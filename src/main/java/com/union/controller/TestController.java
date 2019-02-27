package com.union.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
    @RequestMapping(value = {"/news"})
    public String test1(){
        return "news.html";
    }

    @RequestMapping(value = {"/class"})
    public String test2(){
        return "class.html";
    }
}
