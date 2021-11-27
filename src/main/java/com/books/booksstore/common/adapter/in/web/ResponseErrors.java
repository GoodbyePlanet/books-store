package com.books.booksstore.common.adapter.in.web;

import java.util.List;

import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ResponseErrors {

    private List<String> errors;

    public ResponseErrors(@NotNull List<String> errorMessages) {
        errors = errorMessages;
    }
}