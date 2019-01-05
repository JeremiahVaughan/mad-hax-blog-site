package com.madhax.blog.domain;

import org.hibernate.annotations.Type;

import javax.persistence.*;

@Entity
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String title;
    @Type(type = "text")
    private String body;
    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;

    public Article() { }

    public Article(String articleTitle, String articleBody, Author author) {
        this.title = articleTitle;
        this.body = articleBody;
        this.author = author;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
