package com.madhax.blog.domain;

import javax.persistence.*;

@Entity
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String title;
    private String body;
    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;

    public Article(String articleTitle, String articleBody, Author author) {
        this.title = articleTitle;
        this.body = articleBody;
        this.author = author;
    }

    public long getArticleId() {
        return id;
    }

    public String getArticleTitle() {
        return title;
    }

    public void setArticleTitle(String articleTitle) {
        this.title = articleTitle;
    }

    public String getArticleBody() {
        return body;
    }

    public void setArticleBody(String articleBody) {
        this.body = articleBody;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
