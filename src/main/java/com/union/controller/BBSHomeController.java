package com.union.controller;

import com.union.model.UserDto;
import com.union.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
//@RestController
public class BBSHomeController {
    @Autowired
    private UserService userService;

    @GetMapping(value = "/bbs01")
    public String hello(Model model) {
        UserDto thisUser = new UserDto();
        thisUser.setUserId("admin");
        thisUser.setUserPassword("admin");
        String name = "大王";
        name = userService.getUserInfo(thisUser).getUserName();
        model.addAttribute("name", name);
        return "BBSHome";
    }



}
