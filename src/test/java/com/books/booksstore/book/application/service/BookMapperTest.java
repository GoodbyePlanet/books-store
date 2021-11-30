package com.books.booksstore.book.application.service;

import com.books.booksstore.book.application.port.in.SaveBookRequest;
import com.books.booksstore.book.domain.Book;
import org.junit.jupiter.api.Test;

import static com.books.booksstore.book.domain.Assertions.assertThat;

class BookMapperTest {

    @Test
    void should_map_from_SaveBookRequest_to_Book() {
        SaveBookRequest saveBookRequest = SaveBookRequest.builder()
            .isbn("12345")
            .title("Book title")
            .authorName("Name of the author")
            .price(10.0)
            .build();

        Book book = BookMapper.from(saveBookRequest);

        assertThat(book).hasIsbn("12345").hasTitle("Book title").hasAuthorName("Name of the author").hasPrice(10.0);
    }
}