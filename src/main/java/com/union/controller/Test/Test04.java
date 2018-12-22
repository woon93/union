package com.union.controller.Test;

import com.union.service.InfoMstService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
//@RestController
public class Test04 {
    @Autowired
    private InfoMstService infoMstService;

    @GetMapping(value = "/test04")
    public String hello(Model model) {
        String name = "大王";
        model.addAttribute("name", name);
        return "Test04";
    }



}
