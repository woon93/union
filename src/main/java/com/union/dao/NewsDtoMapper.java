package com.union.dao;

import com.union.model.NewsDto;
import com.union.model.NewsDtoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NewsDtoMapper {
    int countByExample(NewsDtoExample example);

    int deleteByExample(NewsDtoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(NewsDto record);

    int insertSelective(NewsDto record);

    List<NewsDto> selectByExampleWithBLOBs(NewsDtoExample example);

    List<NewsDto> selectByExample(NewsDtoExample example);

    NewsDto selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") NewsDto record, @Param("example") NewsDtoExample example);

    int updateByExampleWithBLOBs(@Param("record") NewsDto record, @Param("example") NewsDtoExample example);

    int updateByExample(@Param("record") NewsDto record, @Param("example") NewsDtoExample example);

    int updateByPrimaryKeySelective(NewsDto record);

    int updateByPrimaryKeyWithBLOBs(NewsDto record);

    int updateByPrimaryKey(NewsDto record);
}