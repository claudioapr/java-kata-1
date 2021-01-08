package org.echocat.kata.java.part1.model;
/**
 * Abstraction for books and magazine holding the common data
 *
 * @author cresende
 */

public class Publication {

  private String title;

  private String isbn;

  private Author author;

  public Publication(String title, String isbn, Author author) {
    this.title = title;
    this.isbn = isbn;
    this.author = author;
  }

  public String getTitle() {
    return title;
  }

  public String getIsbn() {
    return isbn;
  }

  public Author getAuthor() {
    return author;
  }
}
