package com.union.service;

import com.union.dao.UserDtoMapper;
import com.union.model.UserDto;
import com.union.model.UserDtoExample;
import lombok.NonNull;
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
    public UserDto getUserInfo(@NonNull UserDto thisUser) {
        String oldPwd = thisUser.getUserPassword();
        List<UserDto> userDtoList = this.selectUserDto(thisUser);
        if(userDtoList.isEmpty()){
            return null;
        }
        String newPwd = userDtoList.get(0).getUserPassword();
        if(StringUtils.equals(oldPwd, newPwd)){
            return userDtoList.get(0);
        }
        return null;
    }

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
}
