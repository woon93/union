package com.union.service;


import com.union.model.PostDto;
import com.union.model.UserDto;
import lombok.NonNull;

import java.util.List;

public interface PostService {

    /*
     *
     *  指定【用户】的帖子
     *  按【逆序】取帖子。
     *  要过滤，只要楼层等于【1】的。（楼层大于【1】的都属于跟帖）
     */
    public List<PostDto> getPostList(@NonNull UserDto users);

    /*
     * 按时间【逆序】取帖子。
     * 要过滤，只要楼层等于【1】的。（楼层大于【1】的都属于跟帖）
     */
    public List<PostDto> getPostsList();


}
