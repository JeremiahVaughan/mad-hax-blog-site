package com.madhax.blog.service;

import com.madhax.blog.domain.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ArticleService {

    @Autowired
    private ArticleRepository articleRepository;

    public List<Article> getAllArticles() {
        List<Article> articles = new ArrayList<>();
        articleRepository.findAll().forEach(articles::add);
        return articles;
    }

    public void addArticle(Article article) {
        articleRepository.save(article);
    }

}
