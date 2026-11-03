package com.library.controller;

import com.library.dto.request.BookCreateRequestDto;
import com.library.service.AuthorService;
import com.library.service.BookService;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AddBookController implements Controller {

    private final BookService bookService;
    private final AuthorService authorService;

    public AddBookController(BookService bookService,
                             AuthorService authorService) {
        this.bookService = bookService;
        this.authorService = authorService;
    }

    @Override
    public ModelAndView handleRequest(
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {

        if ("GET".equalsIgnoreCase(request.getMethod())) {

            ModelAndView modelAndView =
                    new ModelAndView("add-book");

            modelAndView.addObject(
                    "authors",
                    authorService.findAllDto()
            );

            return modelAndView;
        }

        if ("POST".equalsIgnoreCase(request.getMethod())) {

            String title = request.getParameter("title");

            int pages = Integer.parseInt(
                    request.getParameter("pages")
            );

            Long authorId = Long.parseLong(
                    request.getParameter("authorId")
            );

            BookCreateRequestDto requestDto =
                    new BookCreateRequestDto(
                            title,
                            pages,
                            authorId
                    );

            bookService.add(requestDto);

            response.sendRedirect(
                    request.getContextPath() + "/books"
            );

            return null;
        }

        response.sendError(
                HttpServletResponse.SC_METHOD_NOT_ALLOWED
        );

        return null;
    }
}
