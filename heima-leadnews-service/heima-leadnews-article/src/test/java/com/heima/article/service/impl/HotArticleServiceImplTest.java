package com.heima.article.service.impl;

import com.heima.article.ArticleApplication;
import com.heima.article.service.HotArticleService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest(classes = ArticleApplication.class)
class HotArticleServiceImplTest {
    @Autowired
    private HotArticleService hotArticleService;
    @Test
    void computeHotArticle() {
        hotArticleService.computeHotArticle();
    }
}