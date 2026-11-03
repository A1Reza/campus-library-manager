package com.library.mapper;

import com.library.dto.response.AuthorResponseDto;
import com.library.model.Author;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AuthorMapper {

    AuthorMapper INSTANCE = Mappers.getMapper(AuthorMapper.class);

    AuthorResponseDto toDto(Author author);
}