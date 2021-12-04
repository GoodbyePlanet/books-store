package com.books.booksstore.book.application.service;

import static com.books.booksstore.book.domain.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.then;
import static org.mockito.BDDMockito.willDoNothing;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.books.booksstore.book.application.port.in.SaveBookRequest;
import com.books.booksstore.book.application.port.out.SaveBookPort;
import com.books.booksstore.book.domain.Book;

@ExtendWith(MockitoExtension.class)
class SaveBookServiceTest {

    @Mock
    private SaveBookPort saveBookPort;

    @InjectMocks
    private SaveBookService saveBookService;

    @Test
    void saveBook() {
        SaveBookRequest saveBookRequest = getSaveBookRequest();
        ArgumentCaptor<Book> bookArgumentCaptor = ArgumentCaptor.forClass(Book.class);

        saveBookService.saveBook(saveBookRequest);

        verify(saveBookPort).saveBook(bookArgumentCaptor.capture());

        Book book = bookArgumentCaptor.getValue();

        assertThat(book).hasIsbn(saveBookRequest.getIsbn()).hasAuthorName(saveBookRequest.getAuthorName())
            .hasTitle(saveBookRequest.getTitle()).hasPrice(saveBookRequest.getPrice());
    }

    @Test
    void saveBook_BDD_example() {
        SaveBookRequest saveBookRequest = getSaveBookRequest();

        willDoNothing().given(saveBookPort).saveBook(any(Book.class));

        saveBookService.saveBook(saveBookRequest);

        then(saveBookPort).should().saveBook(any(Book.class));
    }

    private SaveBookRequest getSaveBookRequest() {
        return SaveBookRequest.builder()
            .isbn("12345").authorName("Author").title("Book title").price(123.123)
            .build();
    }
}