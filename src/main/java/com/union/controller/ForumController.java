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
public class ForumController {
    @Autowired
    private UserService userService;

    @Autowired
    private PostService postService;

    @Autowired
    private CommentService commentService;

    @GetMapping(value = "forum")
    public String getBBSInfo(Model model) {
        // 假装接收到了用户ID和密码
        UserDto thisUser = new UserDto();
        thisUser.setUserId("100001");
        thisUser.setUserPassword("100001");
        // 进行用户校验
        UserDto getUser = userService.getUserInfo(thisUser);
        if(getUser == null){
            // 用户和密码不匹配 TODO:
            model.addAttribute("name", "用户和密码不匹配!!!");
            return "demo/Test01";
        }
        // 往页面添加用户信息
        model.addAttribute("user", getUser);

        // 往页面添加该用户最近发表的帖子
        List<PostDto> userPostList = postService.getPostList(getUser);
        model.addAttribute("userPostList", userPostList);

        // 往页面添加该用户最近发表的评论
        List<CommentDto> userCommentList = commentService.getCommentList(getUser);
        model.addAttribute("userCommentList", userCommentList);

        // 在页面展示所有的最新的帖子列表
        List<PostDto> userPostsList = postService.getCurrentPostList(); //TODO:
        model.addAttribute("userPostsList", userPostsList);

        return "Forum";
    }

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
