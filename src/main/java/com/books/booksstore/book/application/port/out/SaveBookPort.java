package com.books.booksstore.book.application.port.out;

import com.books.booksstore.book.domain.Book;

public interface SaveBookPort {

    void saveBook(Book book);
}
