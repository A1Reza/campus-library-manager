package com.library.repository;

import com.library.model.Book;

import java.util.ArrayList;
import java.util.List;

public class BookRepository {

    private final List<Book> books = new ArrayList<>();

    /*Constructor - Seed Data*/
    public BookRepository() {

        books.add(new Book(1L, "Clean Code", 1L, 464));
        books.add(new Book(2L, "Effective Java", 2L, 416));
        books.add(new Book(3L, "Refactoring", 3L, 448));
    }

    public List<Book> findAll() {
        return books;
    }

    public Book findById(Long id) {

        return books.stream()
                .filter(book -> book.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public void add(Book book) {
        books.add(book);
    }
}
