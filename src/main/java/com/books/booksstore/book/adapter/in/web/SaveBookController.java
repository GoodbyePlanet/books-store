package com.books.booksstore.book.adapter.in.web;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.books.booksstore.book.application.port.in.SaveBookRequest;
import com.books.booksstore.book.application.port.in.SaveBookUseCase;
import com.books.booksstore.common.WebAdapter;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@WebAdapter
class SaveBookController {

    private final SaveBookUseCase saveBookUseCase;

    @PostMapping("/api/books")
    ResponseEntity<Void> saveBook(@RequestBody @Valid SaveBookRequest saveBookRequest) {
        saveBookUseCase.saveBook(saveBookRequest);

        return ResponseEntity.accepted().build();
    }
}
