package com.books.booksstore.book.adapter.out.persistence;

import com.books.booksstore.book.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BookRepository extends JpaRepository<Book, Integer> {

    Optional<Book> findBookByIsbn(String isbn);
}
