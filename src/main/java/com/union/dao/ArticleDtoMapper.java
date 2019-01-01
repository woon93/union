package com.union.dao;

import com.union.model.ArticleDto;
import com.union.model.ArticleDtoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ArticleDtoMapper {
    int countByExample(ArticleDtoExample example);

    int deleteByExample(ArticleDtoExample example);

    int deleteByPrimaryKey(String articleId);

    int insert(ArticleDto record);

    int insertSelective(ArticleDto record);

    List<ArticleDto> selectByExampleWithBLOBs(ArticleDtoExample example);

    List<ArticleDto> selectByExample(ArticleDtoExample example);

    ArticleDto selectByPrimaryKey(String articleId);

    int updateByExampleSelective(@Param("record") ArticleDto record, @Param("example") ArticleDtoExample example);

    int updateByExampleWithBLOBs(@Param("record") ArticleDto record, @Param("example") ArticleDtoExample example);

    int updateByExample(@Param("record") ArticleDto record, @Param("example") ArticleDtoExample example);

    int updateByPrimaryKeySelective(ArticleDto record);

    int updateByPrimaryKeyWithBLOBs(ArticleDto record);

    int updateByPrimaryKey(ArticleDto record);
}