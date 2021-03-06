package com.books.booksstore.book.adapter.in.web;

import com.books.booksstore.book.application.port.in.SaveBookRequest;
import com.books.booksstore.book.application.port.in.SaveBookUseCase;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.hasItem;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doNothing;
import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(controllers = SaveBookController.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class SaveBookControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @MockBean
    private SaveBookUseCase saveBookUseCase;

    @Test
    @SneakyThrows
    void should_save_book() {
        doNothing().when(saveBookUseCase).saveBook(any(SaveBookRequest.class));

        String requestJson = objectMapper.writeValueAsString(SaveBookRequest.builder()
            .isbn("11111")
            .title("Some book")
            .authorName("Some author")
            .price(222.222)
            .build());

        mockMvc.perform(post("/api/books").contentType(APPLICATION_JSON).content(requestJson))
            .andExpect(status().isAccepted());
    }

    @Test
    @SneakyThrows
    void should_return_UNPROCESSABLE_ENTITY_when_given_invalid_request() {
        doNothing().when(saveBookUseCase).saveBook(any(SaveBookRequest.class));

        String requestJson = objectMapper.writeValueAsString(SaveBookRequest.builder()
            .authorName("Some author")
            .isbn("")
            .authorName("")
            .price(0)
            .build());

        mockMvc.perform(post("/api/books").contentType(APPLICATION_JSON).content(requestJson))
            .andExpect(status().isUnprocessableEntity())
            .andExpect(jsonPath("$.errors", hasItem("Violation for isbn: must not be blank")))
            .andExpect(jsonPath("$.errors", hasItem("Violation for title: must not be blank")))
            .andExpect(jsonPath("$.errors", hasItem("Violation for authorName: must not be blank")))
            .andExpect(jsonPath("$.errors", hasItem("Violation for price: must be greater than or equal to 1.0")));
    }

}