package com.union.service;


import com.union.model.UserDto;
import lombok.NonNull;

public interface UserService {
    public UserDto getUserInfo(@NonNull UserDto users);
}
