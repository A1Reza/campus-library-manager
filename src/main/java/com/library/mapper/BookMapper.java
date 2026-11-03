package com.library.mapper;

import com.library.dto.request.BookCreateRequestDto;
import com.library.dto.response.BookResponseDto;
import com.library.model.Book;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BookMapper {

    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

    BookResponseDto toDto(Book book);

    @Mapping(target = "id", ignore = true)
    Book toEntity(BookCreateRequestDto dto);
}
