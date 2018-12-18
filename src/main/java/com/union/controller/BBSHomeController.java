package com.union.controller;

import com.union.model.CommentDto;
import com.union.model.PostDto;
import com.union.model.UserDto;
import com.union.service.CommentService;
import com.union.service.PostService;
import com.union.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
//@RestController
public class BBSHomeController {
    @Autowired
    private UserService userService;

    @Autowired
    private PostService postService;

    @Autowired
    private CommentService commentService;

    @GetMapping(value = "/bbs01")
    public String hello(Model model) {
        UserDto thisUser = new UserDto();
        thisUser.setUserId("100001");
        thisUser.setUserPassword("100001");
        UserDto getUser = userService.getUserInfo(thisUser);
        if(getUser == null){
            // 用户和密码不匹配 TODO:
            model.addAttribute("name", "用户和密码不匹配!!!");
            return "Test01";
        }
        // 用户信息
        model.addAttribute("user", getUser);
        // 最近发表的帖子
        List<PostDto> userPostList = postService.getPostList(getUser); //TODO:

//        // 只取前三条
//        for(int i = 0; i < userPostList.size(); i++){
//
//        }
//        userPostList= userPostList.subList(0, 2);
        model.addAttribute("userPostList", userPostList);
        // 最近发表的评论
        List<CommentDto> userCommentList = commentService.getCommentList(getUser); //TODO:
        model.addAttribute("userCommentList", userCommentList);

        // 最新的帖子列表
        List<PostDto> userPostsList = postService.getPostsList(); //TODO:
        model.addAttribute("userPostsList", userPostsList);

        return "BBSHome";
    }



}