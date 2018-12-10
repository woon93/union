package com.union.dao;

import com.union.model.Info;

public interface InfoMapper {
    int insert(Info record);

    int insertSelective(Info record);
}