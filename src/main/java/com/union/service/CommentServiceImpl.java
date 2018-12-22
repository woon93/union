package com.union.service;

import com.union.dao.CommentDtoMapper;
import com.union.dao.PostDtoMapper;
import com.union.model.*;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service(value = "commentService")
public class CommentServiceImpl implements CommentService {
    @Autowired
    private CommentDtoMapper commentDtoMapper;

    /*
     * 按时间【逆序】取对应userID的评论。
     */
    public List<CommentDto> getCommentList(@NonNull UserDto userDto) {
        //  Mybatis Example Initial
        CommentDtoExample commentDtoExample = new CommentDtoExample();
        CommentDtoExample.Criteria criteria = commentDtoExample.createCriteria();
        // 【KEY】
        criteria.andCommentUserIdEqualTo(userDto.getUserId());
        criteria.andCommentSeqEqualTo(1);
        // 【SORT】
        StringBuilder sortKey = new StringBuilder();
        sortKey.append("INSERT_TIME DESC");
        commentDtoExample.setOrderByClause(sortKey.toString());
        //  excute Mapper
        List<CommentDto> commentDtoList = commentDtoMapper.selectByExample(commentDtoExample);
        if (commentDtoList == null) {
            commentDtoList = new ArrayList<>();
        }
        return commentDtoList;
    }


}