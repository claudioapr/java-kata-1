package org.echocat.kata.java.part1.model;

/**
 * @author cresende
 */
public class Magazine extends Publication {

  private String publishedAt;

  public Magazine(String title, String isbn, Author author, String publishedAt) {
    super(title, isbn, author);
    this.publishedAt = publishedAt;
  }

  public String getPublishedAt() {
    return publishedAt;
  }

  public enum Headers {
    title, isbn, authors, publishedAt
  }

}
