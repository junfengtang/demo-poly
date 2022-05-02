package com.junfeng.mongo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.Date;

/**
 * <p>
 * 文章实体类
 * </p>
 *
 * @author yangkai.shen
 * @date Created in 2018-12-28 16:21
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Article {
    /**
     * 文章id
     */
    @Id
    private Long id;

    /**
     * 文章标题
     */
    private String title;

    /**
     * 文章内容
     */
    private String content;



}
