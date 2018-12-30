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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
//@RestController
public class PushTest2 {
    @Autowired
    private UserService userService;

    @Autowired
    private PostService postService;

    @Autowired
    private CommentService commentService;

    @RequestMapping(value = "/pushTest", method = RequestMethod.POST)
    public String getBBSInfo(Model model,@RequestParam String userId,@RequestParam String article) {
//        // 假装接收到了用户ID和密码
//        UserDto thisUser = new UserDto();
//        thisUser.setUserId("100001");
//        thisUser.setUserPassword("100001");
//        // 进行用户校验
//        UserDto getUser = userService.getUserInfo(thisUser);
//        if(getUser == null){
//            // 用户和密码不匹配 TODO:
//            model.addAttribute("name", "用户和密码不匹配!!!");
//            return "Test01";
//        }


        ////////////TODO///////////////////
        UserDto thisUser = new UserDto();
        thisUser.setUserId(userId);
        String articles = article;

        return "BBSHome";
    }

}
