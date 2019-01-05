package com.madhax.blog.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String firstName;
    private String lastName;

    public Author(String authorFirstName, String authorLastName) {
        this.firstName = authorFirstName;
        this.lastName = authorLastName;
    }

    public long getAuthorId() {
        return id;
    }

    public String getAuthorFirstName() {
        return firstName;
    }

    public void setAuthorFirstName(String authorFirstName) {
        this.firstName = authorFirstName;
    }

    public String getAuthorLastName() {
        return lastName;
    }

    public void setAuthorLastName(String authorLastName) {
        this.lastName = authorLastName;
    }
}
