package com.union.service;

import com.union.model.CommentDto;
import com.union.model.PostDto;
import com.union.model.UserDto;
import lombok.NonNull;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "commentService")
public class CommentServiceImpl implements CommentService{
    /*
     * 按时间【逆序】取对应userID的评论。
     */
    public List<CommentDto> getCommentList(@NonNull UserDto users){

        return null; //TODO
    }

}
