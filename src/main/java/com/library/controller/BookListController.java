package com.library.controller;

import com.library.service.AuthorService;
import com.library.service.BookService;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class BookListController implements Controller {

    private final BookService bookService;
    private final AuthorService authorService;

    public BookListController(BookService bookService,
                              AuthorService authorService) {
        this.bookService = bookService;
        this.authorService = authorService;
    }

    @Override
    public ModelAndView handleRequest(
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {

        ModelAndView modelAndView = new ModelAndView("books");

        modelAndView.addObject("books", bookService.findAll());

        modelAndView.addObject(
                "authorNames",
                authorService.getNameMap()
        );

        modelAndView.addObject(
                "libraryName",
                bookService.getLibraryName()
        );

        return modelAndView;
    }
}
