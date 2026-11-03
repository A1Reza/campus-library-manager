package com.library.repository;

import com.library.model.Author;

import java.util.ArrayList;
import java.util.List;

public class AuthorRepository {

    private final List<Author> authors = new ArrayList<>();

    /*Constructor - Seed Data*/
    public AuthorRepository() {

        authors.add(new Author(1L, "Robert C. Martin"));
        authors.add(new Author(2L, "Joshua Bloch"));
        authors.add(new Author(3L, "Martin Fowler"));
    }

    public List<Author> findAll() {
        return authors;
    }

    public Author findById(Long id) {

        return authors.stream()
                .filter(author -> author.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
