package com.union.controller;

import com.union.model.Info;
import com.union.service.InfoMstService;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Controller
//@RestController
public class Test03 {
    @Autowired
    private InfoMstService infoMstService;

    @GetMapping(value = "/test03")
    public String hello(Model model) {
        String name = "大王";
        model.addAttribute("name", name);
        return "Test03";
    }



}
