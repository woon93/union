package com.union.dao;

import com.union.model.PostDto;
import com.union.model.PostDtoExample;
import com.union.model.PostDtoKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PostDtoMapper {
    int countByExample(PostDtoExample example);

    int deleteByExample(PostDtoExample example);

    int deleteByPrimaryKey(PostDtoKey key);

    int insert(PostDto record);

    int insertSelective(PostDto record);

    List<PostDto> selectByExample(PostDtoExample example);

    PostDto selectByPrimaryKey(PostDtoKey key);

    int updateByExampleSelective(@Param("record") PostDto record, @Param("example") PostDtoExample example);

    int updateByExample(@Param("record") PostDto record, @Param("example") PostDtoExample example);

    int updateByPrimaryKeySelective(PostDto record);

    int updateByPrimaryKey(PostDto record);
}