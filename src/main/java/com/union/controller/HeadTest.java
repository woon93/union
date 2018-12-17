package com.union.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HeadTest {

@GetMapping(value = "/head")
    public String Hello(){


        return "head";
    }


}
