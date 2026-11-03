
package com.library.service;

import com.library.dto.response.AuthorResponseDto;
import com.library.mapper.AuthorMapper;
import com.library.model.Author;
import com.library.repository.AuthorRepository;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AuthorService {

    private final AuthorRepository authorRepository;

    private final AuthorMapper authorMapper = AuthorMapper.INSTANCE;

    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }


    public List<Author> findAll() {
        return authorRepository.findAll();
    }

    public Author findById(Long id) {
        return authorRepository.findById(id);
    }

    public Map<Long, String> getNameMap() {

        return authorRepository.findAll()
                .stream()
                .collect(Collectors.toMap(
                        Author::getId,
                        Author::getName
                ));
    }


    public List<AuthorResponseDto> findAllDto() {

        return authorRepository.findAll()
                .stream()
                .map(authorMapper::toDto)
                .toList();
    }

    public AuthorResponseDto findByIdDto(Long id) {

        Author author = authorRepository.findById(id);

        if (author == null) {
            return null;
        }

        return authorMapper.toDto(author);
    }
}
