package com.books.booksstore.book.domain;

/**
 * Entry point for BDD assertions of different data types.
 */
@javax.annotation.Generated(value="assertj-assertions-generator")
public class BddAssertions {

  /**
   * Creates a new instance of <code>{@link com.books.booksstore.book.domain.BookAssert}</code>.
   *
   * @param actual the actual value.
   * @return the created assertion object.
   */
//  @org.assertj.core.util.CheckReturnValue
  public static com.books.booksstore.book.domain.BookAssert then(com.books.booksstore.book.domain.Book actual) {
    return new com.books.booksstore.book.domain.BookAssert(actual);
  }

  /**
   * Creates a new instance of <code>{@link com.books.booksstore.book.domain.BookBookBuilderAssert}</code>.
   *
   * @param actual the actual value.
   * @return the created assertion object.
   */
//  @org.assertj.core.util.CheckReturnValue
  public static com.books.booksstore.book.domain.BookBookBuilderAssert then(com.books.booksstore.book.domain.Book.BookBuilder actual) {
    return new com.books.booksstore.book.domain.BookBookBuilderAssert(actual);
  }

  /**
   * Creates a new <code>{@link BddAssertions}</code>.
   */
  protected BddAssertions() {
    // empty
  }
}
