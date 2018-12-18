package com.union.service;

import com.union.dao.PostDtoMapper;
import com.union.model.PostDto;
import com.union.model.PostDtoExample;
import com.union.model.UserDto;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service(value = "postService")
public class PostServiceImpl implements PostService{
    @Autowired
    private PostDtoMapper postDtoMapper;
    /*
     *
     *  指定【用户】的帖子
     *  按【逆序】取帖子。
     *  要过滤，只要楼层等于【1】的。（楼层大于【1】的都属于跟帖）
     */
    public List<PostDto> getPostList(@NonNull UserDto userDto){
        //  Mybatis Example Initial
        PostDtoExample postDtoExample = new PostDtoExample();
        PostDtoExample.Criteria criteria = postDtoExample.createCriteria();
        // 【KEY】
        criteria.andPostUserIdEqualTo(userDto.getUserId());
        criteria.andPostSeqEqualTo(1);
        // 【SORT】
        StringBuilder sortKey = new StringBuilder();
        sortKey.append("INSERT_TIME DESC");
        postDtoExample.setOrderByClause(sortKey.toString());
        //  excute Mapper
        List<PostDto> PostDtoList = postDtoMapper.selectByExample(postDtoExample);
        if(PostDtoList == null){
            PostDtoList = new ArrayList<>();
        }
        return PostDtoList;

    }

    /*
     * 按时间【逆序】取帖子。
     * 要过滤，只要楼层等于【1】的。（楼层大于【1】的都属于跟帖）
     */
    public List<PostDto> getPostsList(){

        return null; //TODO
    }
}
