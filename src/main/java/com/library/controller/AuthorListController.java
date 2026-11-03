package com.library.controller;

import com.library.service.AuthorService;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AuthorListController implements Controller {

    private final AuthorService authorService;

    public AuthorListController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @Override
    public ModelAndView handleRequest(
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {

        ModelAndView modelAndView =
                new ModelAndView("authors");

        modelAndView.addObject(
                "authors",
                authorService.findAllDto()
        );

        return modelAndView;
    }
}
