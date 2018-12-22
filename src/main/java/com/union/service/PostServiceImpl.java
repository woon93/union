package com.union.service;

import com.union.dao.PostDtoMapper;
import com.union.model.PostDto;
import com.union.model.PostDtoExample;
import com.union.model.UserDto;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thymeleaf.util.StringUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service(value = "postService")
public class PostServiceImpl implements PostService{
    @Autowired
    private PostDtoMapper postDtoMapper;

    @Override
    /*
     * 新增帖子
     */
    public int creatPost(@NonNull PostDto newPostDto) {
        return postDtoMapper.insertSelective(newPostDto);
    }

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
    public List<PostDto> getCurrentPostList(){
        //  Mybatis Example Initial
        PostDtoExample postDtoExample = new PostDtoExample();
        PostDtoExample.Criteria criteria = postDtoExample.createCriteria();
        // 【KEY】
        criteria.andPostSeqGreaterThan(1);
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
     * 按【postId】删除帖子
     */
    @Override
    public int deletePostByPostId(@NonNull PostDto targetPostDto, @NonNull UserDto controllerUser) {
        // 验证controllerUser的权限 TODO
        if(StringUtils.equals("管理员的ID是多少？", controllerUser.getUserIdentity())){
            PostDtoExample deletePost = new PostDtoExample();
            PostDtoExample.Criteria criteria = deletePost.createCriteria();
            // 用postId作为检索条件
            criteria.andPostIdEqualTo(targetPostDto.getPostId());
            return postDtoMapper.deleteByExample(deletePost);
        }
        return 0;
    }

    /*
     * 按【userId】删除帖子
     */
    @Override
    public int deletePostByUserId(@NonNull PostDto targetPostDto, @NonNull UserDto controllerUser) {
        // 验证controllerUser的权限 TODO
        if(StringUtils.equals("管理员的ID是多少？", controllerUser.getUserIdentity())){
            // 先检索这个用户有发过哪些帖子
            UserDto paramDto = new UserDto();
            paramDto.setUserId(targetPostDto.getPostUserId());
            List<PostDto> getPostList = this.getPostList(paramDto);
            // 用stream流，把检索到的Bean List 里的postId拿出来，做成delete方法的List<String>型参数
            List<String> postIdList = getPostList.stream().map(p -> p.getPostId()).collect(Collectors.toList());
            PostDtoExample deletePost = new PostDtoExample();
            PostDtoExample.Criteria criteria = deletePost.createCriteria();
            // 用mybatis封装的【and*In】方法进行批量删除
            criteria.andPostIdIn(postIdList);
            return postDtoMapper.deleteByExample(deletePost);
        }
        return 0;
    }

    /*
     * 按【insertTime】(时间为闭区间)删除帖子
     */
    @Override
    public int deletePostByTime(@NonNull UserDto controllerUser, @NonNull Date fromTime, @NonNull Date toTime) {
        // 验证controllerUser的权限 TODO
        if(StringUtils.equals("管理员的ID是多少？", controllerUser.getUserIdentity())){
            // 先检索这个用户有发过哪些帖子
            PostDtoExample deletePost = new PostDtoExample();
            PostDtoExample.Criteria criteria = deletePost.createCriteria();
            // 用mybatis封装的【and*TimeBetween】方法进行批量删除
            criteria.andInsertTimeBetween(fromTime, toTime);
            return postDtoMapper.deleteByExample(deletePost);
        }
        return 0;
    }



}
