package com.union.service;


import com.union.model.PostDto;
import com.union.model.UserDto;
import lombok.NonNull;

import java.util.Date;
import java.util.List;

public interface PostService {
    /*
     * 新增帖子
     * 发帖时，新帖内容记录在贴表
     */
    public int creatPost(String userId, String title, String preview, String content) throws Exception;

    /*
     * 新增回复（作为新的楼层
     */
    public int addReplytoPost(UserDto userDto, String postId, String content) throws Exception;

    /*
     * 新增回复（作为新的楼层
     */
    public int addReplytoComment(UserDto userDto, String postCommentId, String content) throws Exception;

    /*
     *
     *  指定【用户】的帖子
     *  按【逆序】取帖子。
     *  要过滤，只要楼层等于【0】的。（楼层大于等于【1】的都属于跟帖）
     */
    public List<PostDto> getPostList(@NonNull UserDto user);

    /*
     * 按时间【逆序】取帖子。
     * 要过滤，只要楼层等于【0】的。（楼层大于等于【1】的都属于跟帖）
     */
    public List<PostDto> getCurrentPostList();

    /*
     * 按【postId】删除帖子
     */
    public int deletePostByPostId(@NonNull PostDto targetPostDto, @NonNull UserDto controllerUser);

    /*
     * 按【userId】删除帖子
     */
    public int deletePostByUserId(@NonNull PostDto targetPostDto, @NonNull UserDto controllerUser);

    /*
     * 按【insertTime】(时间为闭区间)删除帖子
     */
    public int deletePostByTime(@NonNull UserDto controllerUser, @NonNull Date fromTime, @NonNull Date toTime);

}
