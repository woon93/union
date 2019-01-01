package com.union.service;

import com.union.dao.ArticleDtoMapper;
import com.union.model.ArticleDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "articleService")
public class ArticleService {
    @Autowired
    ArticleDtoMapper articleDtoMapper;

    public int createArticle(ArticleDto newArticle){
        return articleDtoMapper.insertSelective(newArticle);
    }
}
