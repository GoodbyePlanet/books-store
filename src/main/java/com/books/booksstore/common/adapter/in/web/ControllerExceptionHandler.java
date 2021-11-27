package com.books.booksstore.common.adapter.in.web;

import static java.util.stream.Collectors.toList;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ResponseErrors> handleValidationExceptions(MethodArgumentNotValidException exception) {
        List<String> errors = exception.getBindingResult()
            .getFieldErrors()
            .stream()
            .map(fieldError -> String.format("Violation for %s: %s", fieldError.getField(), fieldError.getDefaultMessage()))
            .sorted()
            .collect(toList());

        return ResponseEntity.status(HttpStatus.UNPROCESSABLE_ENTITY)
            .header("Content-Type", MediaType.APPLICATION_JSON_VALUE)
            .body(new ResponseErrors(errors));
    }
}

