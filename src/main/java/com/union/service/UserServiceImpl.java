package com.union.service;

import com.union.dao.UserDtoMapper;
import com.union.model.UserDto;
import com.union.model.UserDtoExample;
import lombok.NonNull;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thymeleaf.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

@Service(value = "userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDtoMapper userDtoMapper;

    @Override
    // 根据UserId查询用户信息（要做密码验证）
    public UserDto getUserInfo(@NonNull UserDto thisUser) {
        // 页面传过来的密码
        String oldPwd = thisUser.getUserPassword();
        // 用页面传过来的用户ID去检索
        List<UserDto> userDtoList = this.selectUserDto(thisUser);
        // 如果没有检索到，那就是用户不存在
        if(userDtoList.isEmpty()){
            // 用户不存在  TODO
            return null;
        }
        // 根据用户ID查到的DB中该用户的密码，对比密码是否一致
        String newPwd = userDtoList.get(0).getUserPassword();
        if(StringUtils.equals(oldPwd, newPwd)){
            // 该用户存在，并且密码正确，则返回该用户的信息
            return userDtoList.get(0);
        }
        return null;
    }

    @Override
    // 根据UserId查询用户信息（不做密码验证）
    public UserDto getUserInfoById(@NonNull String userId) {
        return this.selectUserById(userId);
    }

    @Override
    // 增加一个新用户
    public int insertUserInfo(@NonNull UserDto users) {
        return userDtoMapper.insertSelective(users);
    }

    @Override
    public int deleteUserInfo(@NonNull UserDto targetUser, @NonNull UserDto controllerUser) {
        // 验证controllerUser的权限 TODO
        if(StringUtils.equals("管理员的ID是多少？", controllerUser.getUserIdentity())){
            return userDtoMapper.deleteByPrimaryKey(targetUser.getUserId());
        }
        return 0;
    }

    // Mybatis 的 SQL
    private List<UserDto> selectUserDto(@NonNull UserDto users) {
        //  Mybatis Example Initial
        UserDtoExample userDtoExample = new UserDtoExample();
        UserDtoExample.Criteria criteria = userDtoExample.createCriteria();
        // 【KEY】
        criteria.andUserIdEqualTo(users.getUserId());
        // 【SORT】
        StringBuilder sortKey = new StringBuilder();
        sortKey.append("USER_ID");
        userDtoExample.setOrderByClause(sortKey.toString());
        //  excute Mapper
        List<UserDto> UserDtoList = userDtoMapper.selectByExample(userDtoExample);
        if(UserDtoList == null){
            UserDtoList = new ArrayList<>();
        }
        return UserDtoList;
    }

    // Mybatis 的 SQL
    private UserDto selectUserById(@NonNull String userId){
        //  Mybatis Example Initial
        UserDtoExample userDtoExample = new UserDtoExample();
        UserDtoExample.Criteria criteria = userDtoExample.createCriteria();
        // 【KEY】
        criteria.andUserIdEqualTo(userId);
        // 【SORT】
        StringBuilder sortKey = new StringBuilder();
        sortKey.append("USER_ID");
        userDtoExample.setOrderByClause(sortKey.toString());
        //  excute Mapper
        List<UserDto> UserDtoList = userDtoMapper.selectByExample(userDtoExample);
        if(UserDtoList == null || UserDtoList.isEmpty()){
            return null;
        }
        return UserDtoList.get(0);
    }
}
