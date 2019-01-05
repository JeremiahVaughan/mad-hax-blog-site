package com.madhax.blog.service;

import com.madhax.blog.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRespository extends CrudRepository<Author, Long> {

}
