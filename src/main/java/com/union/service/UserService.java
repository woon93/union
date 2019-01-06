package com.union.service;


import com.union.model.UserDto;
import lombok.NonNull;

public interface UserService {
    // 根据UserId查询用户信息（要做密码验证）
    public UserDto getUserInfo(@NonNull UserDto users);
    // 根据UserId查询用户信息（不做密码验证）
    public UserDto getUserInfoById(@NonNull String userId);
    // 根据UserName查询用户信息（不做密码验证）
    public UserDto getUserInfoByName(@NonNull String userId);
    // 增加一个新用户
    public int insertUserInfo(@NonNull UserDto user);
    // 删除用户（要验证是否有删除权限）
    public int deleteUserInfo(@NonNull UserDto targetUser, @NonNull UserDto controllerUser);

}
