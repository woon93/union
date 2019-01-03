package com.union.controller.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HeadTest {

@GetMapping(value = "demo/head")
    public String Hello(){


        return "demo/head";
    }


}
