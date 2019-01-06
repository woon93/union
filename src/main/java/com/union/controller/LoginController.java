package com.union.controller;

import com.union.model.CommentDto;
import com.union.model.PostDto;
import com.union.model.UserDto;
import com.union.service.CommentService;
import com.union.service.PostService;
import com.union.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;
import java.util.List;

@Controller
public class LoginController {

    @RequestMapping("/login")
    public String login(Model model) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth != null) {
            Collection<GrantedAuthority> authorityCollection = (Collection<GrantedAuthority>) auth.getAuthorities();
            model.addAttribute("authorities", authorityCollection.toString());
            model.addAttribute("username", SecurityContextHolder.getContext().getAuthentication().getName());
        }
        return "login";
    }

    @RequestMapping("/login_p")
    public String login_p(Model model) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth != null) {
            Collection<GrantedAuthority> authorityCollection = (Collection<GrantedAuthority>) auth.getAuthorities();
            model.addAttribute("authorities", authorityCollection.toString());
            model.addAttribute("username", SecurityContextHolder.getContext().getAuthentication().getName());
        }
        return "login_p";
    }


}
