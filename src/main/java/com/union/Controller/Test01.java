package com.union.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.stereotype.Controller
public class Test01 {

    @RequestMapping(value = {"/"})
    @ResponseBody
    public String hello(){
        return "Hello World !!!";
    }

    @RequestMapping(value = {"/test01"})
    public String test01(){
        return "Test01.html";
    }
}
