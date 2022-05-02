package com.junfeng.mongo.controller;

import com.junfeng.mongo.model.Article;
import com.junfeng.mongo.service.IArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author junfeng
 * @Classname ArticleController
 * @Description 文章控制器
 * @Date 2022-05-02
 * @Version V1.0
 */
@RestController
@RequestMapping("v1/article")
public class ArticleController {

    @Autowired
    private IArticleService articleService;

    @GetMapping
    public String getAll() {
       List<Article> list = articleService.getAll();
        return list.toString();
    }

    @GetMapping("add")
    public String add() {
        Article article = new Article();
        article.setId(1l);
        article.setTitle("我是标题啦啦~");
        article.setContent("我是内容啊哈哈~");
        articleService.save(article);
        return "ok";
    }


}
