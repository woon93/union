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

    /*
     * 按postId和postSeq生成commentId，并插入一条评论,并实现自增commentSeq
     */
    public int insertComment(@NonNull CommentDto commentDto);

}
