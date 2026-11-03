package com.library.controller;

import com.library.dto.response.BookResponseDto;
import com.library.dto.response.AuthorResponseDto;
import com.library.service.AuthorService;
import com.library.service.BookService;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class BookDetailController implements Controller {

    private final BookService bookService;
    private final AuthorService authorService;

    public BookDetailController(BookService bookService,
                                AuthorService authorService) {
        this.bookService = bookService;
        this.authorService = authorService;
    }

    @Override
    public ModelAndView handleRequest(
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {

        String idParameter = request.getParameter("id");

        Long id = Long.parseLong(idParameter);

        BookResponseDto book = bookService.findByIdDto(id);

        if (book == null) {
            return null;
        }

        AuthorResponseDto author =
                authorService.findByIdDto(book.getAuthorId());

        ModelAndView modelAndView =
                new ModelAndView("book-detail");

        modelAndView.addObject("book", book);
        modelAndView.addObject("author", author);

        return modelAndView;
    }
}
