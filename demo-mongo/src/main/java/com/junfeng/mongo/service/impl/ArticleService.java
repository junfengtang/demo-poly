package com.junfeng.mongo.service.impl;

import com.junfeng.mongo.model.Article;
import com.junfeng.mongo.repository.ArticleRepository;
import com.junfeng.mongo.service.IArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author junfeng
 * @Classname ArticleService
 * @Description todo
 * @Date 2022-05-02
 * @Version V1.0
 */
@Service
public class ArticleService implements IArticleService {

    @Autowired
    private ArticleRepository articleRepository;
    @Override
    public List<Article> getAll() {
        List<Article> list = articleRepository.findAll();
        return list;
    }

    @Override
    public void save(Article article) {
        articleRepository.save(article);
    }

}
