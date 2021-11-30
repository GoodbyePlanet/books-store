package com.books.booksstore.book.domain;

/**
 * Entry point for assertions of different data types. Each method in this class is a static factory for the
 * type-specific assertion objects.
 */
@javax.annotation.Generated(value="assertj-assertions-generator")
public class Assertions {

  /**
   * Creates a new instance of <code>{@link com.books.booksstore.book.domain.BookAssert}</code>.
   *
   * @param actual the actual value.
   * @return the created assertion object.
   */
//  @org.assertj.core.util.CheckReturnValue
  public static com.books.booksstore.book.domain.BookAssert assertThat(com.books.booksstore.book.domain.Book actual) {
    return new com.books.booksstore.book.domain.BookAssert(actual);
  }

  /**
   * Creates a new instance of <code>{@link com.books.booksstore.book.domain.BookBookBuilderAssert}</code>.
   *
   * @param actual the actual value.
   * @return the created assertion object.
   */
//  @org.assertj.core.util.CheckReturnValue
  public static com.books.booksstore.book.domain.BookBookBuilderAssert assertThat(com.books.booksstore.book.domain.Book.BookBuilder actual) {
    return new com.books.booksstore.book.domain.BookBookBuilderAssert(actual);
  }

  /**
   * Creates a new <code>{@link Assertions}</code>.
   */
  protected Assertions() {
    // empty
  }
}
