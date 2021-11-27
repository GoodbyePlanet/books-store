package com.books.booksstore.book.application.service;

import com.books.booksstore.book.application.port.in.SaveBookRequest;
import com.books.booksstore.book.domain.Book;

public final class BookMapper {

    private BookMapper() {}

    public static Book from(SaveBookRequest bookRequest) {
        return Book.builder()
            .isbn(bookRequest.getIsbn())
//            .title(bookRequest.getTitle())
//            .authorName(bookRequest.getAuthorName())
//            .price(bookRequest.getPrice())
            .build();
    }
}
