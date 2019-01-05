package com.madhax.blog.service;

import com.madhax.blog.domain.Article;
import org.springframework.data.repository.CrudRepository;

public interface ArticleRepository extends CrudRepository<Article, Long> {

}
