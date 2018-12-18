package com.union.dao;

import com.union.model.CommentDto;
import com.union.model.CommentDtoExample;
import com.union.model.CommentDtoKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommentDtoMapper {
    int countByExample(CommentDtoExample example);

    int deleteByExample(CommentDtoExample example);

    int deleteByPrimaryKey(CommentDtoKey key);

    int insert(CommentDto record);

    int insertSelective(CommentDto record);

    List<CommentDto> selectByExample(CommentDtoExample example);

    CommentDto selectByPrimaryKey(CommentDtoKey key);

    int updateByExampleSelective(@Param("record") CommentDto record, @Param("example") CommentDtoExample example);

    int updateByExample(@Param("record") CommentDto record, @Param("example") CommentDtoExample example);

    int updateByPrimaryKeySelective(CommentDto record);

    int updateByPrimaryKey(CommentDto record);
}