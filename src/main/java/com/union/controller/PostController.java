package com.union.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PostController {

@GetMapping(value = "/posts")
    public String Hello(Model model){

    model.addAttribute("name", "假装这是帖子!!!");
        return "Post";
    }


}
