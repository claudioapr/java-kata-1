package org.echocat.kata.java.part1.model;

/**
 * @author cresende
 */
public class Book extends Publication {

  private String description;

  public Book(String title, String isbn, Author author, String description) {
    super(title, isbn, author);
    this.description = description;
  }

  public String getDescription() {
    return description;
  }

  public enum Headers {
    title, isbn, authors, description
  }

}
