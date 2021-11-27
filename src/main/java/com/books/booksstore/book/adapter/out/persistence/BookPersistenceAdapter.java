package com.books.booksstore.book.adapter.out.persistence;

import org.springframework.stereotype.Component;

import com.books.booksstore.book.application.port.out.SaveBookPort;
import com.books.booksstore.book.domain.Book;
import com.books.booksstore.common.PersistenceAdapter;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@PersistenceAdapter
@Component
class BookPersistenceAdapter implements SaveBookPort {

    private final BookRepository bookRepository;

    @Override
    public void saveBook(Book book) {
        bookRepository.save(book);
    }
}
