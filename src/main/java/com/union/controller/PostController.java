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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class PostController {
    @Autowired
    private UserService userService;

    @Autowired
    private PostService postService;

    @Autowired
    private CommentService commentService;

    @RequestMapping(value = "/posts", method = RequestMethod.GET)
    public String getPostInfo(Model model, HttpServletRequest request) {

        UserDto paramUser = new UserDto();
        // 用页面上传过来的userId进行不确认密码的查询
        UserDto getUser = userService.getUserInfoById(request.getParameter("userId"));

        // 往页面添加用户信息
        model.addAttribute("user", getUser);
        // 往页面添加该用户最近发表的帖子
        List<PostDto> userPostList = postService.getPostList(getUser);
        model.addAttribute("userPostList", userPostList);
        // 往页面添加该用户最近发表的评论
        List<CommentDto> userCommentList = commentService.getCommentList(getUser);
        model.addAttribute("userCommentList", userCommentList);



        // TODO 加载帖子内容
        model.addAttribute("post", "假装这是帖子!!!");
        return "Post";
    }


}
