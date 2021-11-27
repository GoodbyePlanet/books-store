package com.books.booksstore.book.application.service;

import org.springframework.stereotype.Service;

import com.books.booksstore.book.application.port.in.SaveBookRequest;
import com.books.booksstore.book.application.port.in.SaveBookUseCase;
import com.books.booksstore.book.application.port.out.SaveBookPort;
import com.books.booksstore.common.UseCase;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
@UseCase
public class SaveBookService implements SaveBookUseCase {

    private final SaveBookPort saveBookPort;

    @Override
    public void saveBook(SaveBookRequest saveBookRequest) {
        saveBookPort.saveBook(BookMapper.from(saveBookRequest));
    }
}
