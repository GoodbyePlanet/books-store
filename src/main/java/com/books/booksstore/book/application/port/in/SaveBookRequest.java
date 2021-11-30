package com.books.booksstore.book.application.port.in;

import lombok.*;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SaveBookRequest {

    @NotBlank
    private String isbn;

    @NotBlank
    private String title;

    @NotBlank
    private String authorName;

    @DecimalMin("1.0")
    private double price;
}
