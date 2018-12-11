package com.union.controller;
import com.union.model.Info;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.sound.sampled.Port;

@org.springframework.stereotype.Controller
public class Test01 {

    @RequestMapping(value = {"/"})
    @ResponseBody
    public String hello(){
        return "Hello World !!!";
    }

    @RequestMapping(value = {"/test01"})
    public String test01(){
        Info Info = new Info();
        return "Test01.html";
    }
}
