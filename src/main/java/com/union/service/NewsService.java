package com.union.service;

import com.union.dao.ArticleDtoMapper;
import com.union.dao.NewsDtoMapper;
import com.union.model.ArticleDto;
import com.union.model.NewsDto;
import com.union.model.NewsDtoExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "newsService")
public class NewsService {
    @Autowired
    NewsDtoMapper newsDtoMapper;

    public List<NewsDto> getNewsByclass(NewsDto newsDto){
        NewsDtoExample newsDtoExample = new NewsDtoExample();
        NewsDtoExample.Criteria criteria = newsDtoExample.createCriteria();

        criteria.andClassEqualTo(newsDto.getClass());

        StringBuilder sortKey = new StringBuilder();
        sortKey.append("PUBTIM  DESC");
        newsDtoExample.setOrderByClause(sortKey.toString());

        List<NewsDto> newsDtos = newsDtoMapper.selectByExample(newsDtoExample);
        return newsDtos;
    }
}
