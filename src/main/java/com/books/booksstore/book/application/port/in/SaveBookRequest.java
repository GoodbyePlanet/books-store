package com.books.booksstore.book.application.port.in;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SaveBookRequest {

    @NotBlank
    private String isbn;

    @NotBlank
    private String title;

    @NotBlank
    private String authorName;

    @Min(value = 0, message = "Book should cost more the 0")
    private double price;
}
