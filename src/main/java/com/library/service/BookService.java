package com.library.service;

import com.library.dto.request.BookCreateRequestDto;
import com.library.dto.response.BookResponseDto;
import com.library.mapper.BookMapper;
import com.library.model.Book;
import com.library.repository.BookRepository;

import java.util.List;

public class BookService {

    private final BookRepository bookRepository;

    private final BookMapper bookMapper = BookMapper.INSTANCE;

    private String libraryName;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

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


    public List<BookResponseDto> findAllDto() {

        return bookRepository.findAll()
                .stream()
                .map(bookMapper::toDto)
                .toList();
    }

    public BookResponseDto findByIdDto(Long id) {

        Book book = bookRepository.findById(id);

        if (book == null) {
            return null;
        }

        return bookMapper.toDto(book);
    }

    public void add(BookCreateRequestDto requestDto) {

        Book book = bookMapper.toEntity(requestDto);

        bookRepository.add(book);
    }
}
