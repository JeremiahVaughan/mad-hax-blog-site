package com.madhax.blog.service;

import com.madhax.blog.domain.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AuthorService {

    @Autowired
    AuthorRespository authorRespository;

    public List<Author> getAllAuthors() {
        List<Author> authors = new ArrayList<>();
        authorRespository.findAll().forEach(authors::add);
        return authors;
    }

    public void addAuthor(Author author) {
        authorRespository.save(author);
    }
}
