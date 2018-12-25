package com.union.service;

import com.union.dao.CommentDtoMapper;
import com.union.model.CommentDto;
import com.union.model.CommentDtoExample;
import com.union.model.UserDto;
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
    @Override
    public List<CommentDto> getCommentList(@NonNull UserDto userDto) {
        //  Mybatis Example Initial
        CommentDtoExample commentDtoExample = new CommentDtoExample();
        CommentDtoExample.Criteria criteria = commentDtoExample.createCriteria();
        // 【KEY】
        criteria.andCommentUserIdEqualTo(userDto.getUserId());
//        criteria.andCommentSeqGreaterThanOrEqualTo(1);
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


    /*
     * 按postId和postSeq生成commentId，并插入一条评论,并实现自增commentSeq
     */
    @Override
    public int insertComment(@NonNull CommentDto commentDto) {
        int maxIndex = this.getCommentSeq(commentDto);
        // 在原有基础上，评论数+1
        commentDto.setCommentSeq(maxIndex+1);
        // 生成评论ID(帖子ID和楼层数拼接)
        commentDto.setCommentId(commentDto.getPostId()
                + Utils.leftPadding(commentDto.getCommentSeq().toString(), 6,"0"));
        return commentDtoMapper.insertSelective(commentDto);
    }

    // 根据commentId找到某一层帖子的评论的数量
    private int getCommentSeq(@NonNull CommentDto commentDto) {
        //  Mybatis Example Initial
        CommentDtoExample commentDtoExample = new CommentDtoExample();
        CommentDtoExample.Criteria criteria = commentDtoExample.createCriteria();
        // 【KEY】
        criteria.andCommentIdEqualTo(commentDto.getCommentId());
        // 【SORT】
        StringBuilder sortKey = new StringBuilder();
        sortKey.append("COMMENT_SEQ DESC");
        commentDtoExample.setOrderByClause(sortKey.toString());
        //  excute Mapper
        List<CommentDto> commentDtoList = commentDtoMapper.selectByExample(commentDtoExample);
        if(commentDtoList != null && !commentDtoList.isEmpty()){
            return commentDtoList.get(0).getCommentSeq();
        }
        return 0;
    }

}