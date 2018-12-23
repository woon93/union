package com.union.controller.Test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.stereotype.Controller
public class Test01 {

    @RequestMapping(value = {"/"})
    private String showPage(){
        return "Test01";
    }

    @ResponseBody
    public String hello(){
        return "Hello World !!!";
    }

    @RequestMapping(value = {"/test01"})
    public String test01(){
        return "Test01.html";
    }
}
