package com.madhax.blog;

import com.madhax.blog.domain.Article;
import com.madhax.blog.domain.Author;
import com.madhax.blog.service.ArticleService;
import com.madhax.blog.service.AuthorRespository;
import com.madhax.blog.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BlogApplication {

    @Autowired
    private AuthorService authorService;

    @Autowired
    private ArticleService articleService;

    public static void main(String[] args) {
        SpringApplication.run(BlogApplication.class, args);
    }

    @Bean
    CommandLineRunner runner() {
        return args -> {
            Author author = new Author("John", "Smith");
            authorService.addAuthor(author);
            Article article1 = new Article(
                    "Article 1",
                    "Article 1 body text",
                    author);
            Article article2 = new Article(
                    "Article 2",
                    "Article 2 body text",
                    author);
            Article article3 = new Article(
                    "Article 3",
                    "Article 3 body text",
                    author);
            articleService.addArticle(article1);
            articleService.addArticle(article2);
            articleService.addArticle(article3);
        };
    }

}

