package com.union.controller;

import com.union.model.ArticleDto;
import com.union.model.UserDto;
import com.union.service.CommentService;
import com.union.service.PostService;
import com.union.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
//@RestController
public class Publish {
    @Autowired
    private UserService userService;

    @Autowired
    private PostService postService;

    @Autowired
    private CommentService commentService;

    @RequestMapping(value = "/pushArticle", method = RequestMethod.POST)
    public String getArticle(Model model,@RequestParam String userId,@RequestParam String title,@RequestParam String article) throws Exception {
        postService.creatPost(userId, title, article);
        model.addAttribute("content",article);
        return "Post";
    }

    @GetMapping(value = "/createArticle")
    public String createArticle(Model model){
        return "CreateArticle";
    }

}
