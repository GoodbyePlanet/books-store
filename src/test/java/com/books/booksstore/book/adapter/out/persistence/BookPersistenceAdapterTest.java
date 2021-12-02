package com.books.booksstore.book.adapter.out.persistence;

import com.books.booksstore.book.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@Import({BookPersistenceAdapter.class, SqlConfig.class})
class BookPersistenceAdapterTest {

    @Autowired
    private BookPersistenceAdapter bookPersistenceAdapter;

    @Autowired
    private BookRepository bookRepository;

    @Test
    void saveBook() {
        Book book = createBook();
        bookPersistenceAdapter.saveBook(book);

        Optional<Book> savedBook = bookRepository.findBookByIsbn(book.getIsbn());

        assertThat(savedBook).contains(book);
    }

    private Book createBook() {
        return Book.builder()
            .isbn("isbn")
            .title("Test book")
            .authorName("Author name")
            .price(333.333)
            .build();
    }
}