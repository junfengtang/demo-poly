package com.junfeng.mongo.service;

import com.junfeng.mongo.model.Article;

import java.util.List;

/**
 * @author junfeng
 * @Classname IArticleService
 * @Description TODO
 * @Date 2022-05-02
 * @Version V1.0
 */
public interface IArticleService {

    List<Article> getAll();

    void save(Article article);
}
