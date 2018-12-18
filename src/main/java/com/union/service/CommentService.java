package com.union.service;


import com.union.model.CommentDto;
import com.union.model.PostDto;
import com.union.model.UserDto;
import lombok.NonNull;

import java.util.List;

public interface CommentService {

    /*
     * 按时间【逆序】取对应userID的评论。
     */
    public List<CommentDto> getCommentList(@NonNull UserDto users);


}
