package com.books.booksstore.book.domain;

import org.assertj.core.api.AbstractObjectAssert;
import org.assertj.core.api.Assertions;
import org.assertj.core.util.Objects;

/**
 * Abstract base class for {@link Book} specific assertions - Generated by CustomAssertionGenerator.
 */
@javax.annotation.Generated(value="assertj-assertions-generator")
public abstract class AbstractBookAssert<S extends AbstractBookAssert<S, A>, A extends Book> extends AbstractObjectAssert<S, A> {

  /**
   * Creates a new <code>{@link AbstractBookAssert}</code> to make assertions on actual Book.
   * @param actual the Book we want to make assertions on.
   */
  protected AbstractBookAssert(A actual, Class<S> selfType) {
    super(actual, selfType);
  }

  /**
   * Verifies that the actual Book's authorName is equal to the given one.
   * @param authorName the given authorName to compare the actual Book's authorName to.
   * @return this assertion object.
   * @throws AssertionError - if the actual Book's authorName is not equal to the given one.
   */
  public S hasAuthorName(String authorName) {
    // check that actual Book we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting authorName of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    String actualAuthorName = actual.getAuthorName();
    if (!Objects.areEqual(actualAuthorName, authorName)) {
      failWithMessage(assertjErrorMessage, actual, authorName, actualAuthorName);
    }

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual Book's id is equal to the given one.
   * @param id the given id to compare the actual Book's id to.
   * @return this assertion object.
   * @throws AssertionError - if the actual Book's id is not equal to the given one.
   */
  public S hasId(Integer id) {
    // check that actual Book we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting id of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    Integer actualId = actual.getId();
    if (!Objects.areEqual(actualId, id)) {
      failWithMessage(assertjErrorMessage, actual, id, actualId);
    }

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual Book's isbn is equal to the given one.
   * @param isbn the given isbn to compare the actual Book's isbn to.
   * @return this assertion object.
   * @throws AssertionError - if the actual Book's isbn is not equal to the given one.
   */
  public S hasIsbn(String isbn) {
    // check that actual Book we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting isbn of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    String actualIsbn = actual.getIsbn();
    if (!Objects.areEqual(actualIsbn, isbn)) {
      failWithMessage(assertjErrorMessage, actual, isbn, actualIsbn);
    }

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual Book's price is equal to the given one.
   * @param price the given price to compare the actual Book's price to.
   * @return this assertion object.
   * @throws AssertionError - if the actual Book's price is not equal to the given one.
   */
  public S hasPrice(double price) {
    // check that actual Book we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting price of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // check value for price
    double actualPrice = actual.getPrice();
    if (actualPrice != price) {
      failWithMessage(assertjErrorMessage, actual, price, actualPrice);
    }

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual Book's price is close to the given value by less than the given offset.
   * <p>
   * If difference is equal to the offset value, assertion is considered successful.
   * @param price the value to compare the actual Book's price to.
   * @param assertjOffset the given offset.
   * @return this assertion object.
   * @throws AssertionError - if the actual Book's price is not close enough to the given value.
   */
  public S hasPriceCloseTo(double price, double assertjOffset) {
    // check that actual Book we want to make assertions on is not null.
    isNotNull();

    double actualPrice = actual.getPrice();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = String.format("\nExpecting price:\n  <%s>\nto be close to:\n  <%s>\nby less than <%s> but difference was <%s>",
                                               actualPrice, price, assertjOffset, Math.abs(price - actualPrice));

    // check
    Assertions.assertThat(actualPrice).overridingErrorMessage(assertjErrorMessage).isCloseTo(price, Assertions.within(assertjOffset));

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual Book's title is equal to the given one.
   * @param title the given title to compare the actual Book's title to.
   * @return this assertion object.
   * @throws AssertionError - if the actual Book's title is not equal to the given one.
   */
  public S hasTitle(String title) {
    // check that actual Book we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting title of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    String actualTitle = actual.getTitle();
    if (!Objects.areEqual(actualTitle, title)) {
      failWithMessage(assertjErrorMessage, actual, title, actualTitle);
    }

    // return the current assertion for method chaining
    return myself;
  }

}
