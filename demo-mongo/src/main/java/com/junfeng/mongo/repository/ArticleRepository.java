package com.junfeng.mongo.repository;

import com.junfeng.mongo.model.Article;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @author junfeng
 * @Classname ArticleRepository
 * @Description 文章
 * @Date 2022-05-02
 * @Version V1.0
 */
@Repository
public interface ArticleRepository extends MongoRepository<Article,Long> {



}
