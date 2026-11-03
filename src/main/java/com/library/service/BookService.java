package com.library.service;

import com.library.model.Book;
import com.library.repository.BookRepository;

import java.util.List;

public class BookService {

    private final BookRepository bookRepository;

    private String libraryName;

    /*Constructor Injection*/
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    /*Setter Injection*/
    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }

    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    public Book findById(Long id) {
        return bookRepository.findById(id);
    }

    public void add(Book book) {
        bookRepository.add(book);
    }

    public String getLibraryName() {
        return libraryName;
    }
}
