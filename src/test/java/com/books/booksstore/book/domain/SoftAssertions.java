package com.books.booksstore.book.domain;

/**
 * Entry point for soft assertions of different data types.
 */
@javax.annotation.Generated(value="assertj-assertions-generator")
public class SoftAssertions extends org.assertj.core.api.SoftAssertions {

  /**
   * Creates a new "soft" instance of <code>{@link com.books.booksstore.book.domain.BookAssert}</code>.
   *
   * @param actual the actual value.
   * @return the created "soft" assertion object.
   */
//  @org.assertj.core.util.CheckReturnValue
  public com.books.booksstore.book.domain.BookAssert assertThat(com.books.booksstore.book.domain.Book actual) {
    return proxy(com.books.booksstore.book.domain.BookAssert.class, com.books.booksstore.book.domain.Book.class, actual);
  }

  /**
   * Creates a new "soft" instance of <code>{@link com.books.booksstore.book.domain.BookBookBuilderAssert}</code>.
   *
   * @param actual the actual value.
   * @return the created "soft" assertion object.
   */
//  @org.assertj.core.util.CheckReturnValue
  public com.books.booksstore.book.domain.BookBookBuilderAssert assertThat(com.books.booksstore.book.domain.Book.BookBuilder actual) {
    return proxy(com.books.booksstore.book.domain.BookBookBuilderAssert.class, com.books.booksstore.book.domain.Book.BookBuilder.class, actual);
  }

}
