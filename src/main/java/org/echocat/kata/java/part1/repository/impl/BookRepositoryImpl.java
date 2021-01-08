package org.echocat.kata.java.part1.repository.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.echocat.kata.java.part1.model.Book;
import org.echocat.kata.java.part1.repository.BookRepository;
import org.echocat.kata.java.part1.utils.CsvReader;

/**
 * Holds the implementation for book repository
 *
 * @author cresende
 */
public class BookRepositoryImpl implements BookRepository {

  private final CsvReader<Book> reader;

  private List<Book> books;

  public BookRepositoryImpl(
      CsvReader<Book> reader) {
    this.reader = reader;
  }

  @Override
  public List<Book> findAllBooks() {
    List<Book> books = new ArrayList<>();
    try {
      books = reader.readFile();
    } catch (IOException e) {
      System.out.println("Error loading magazines");
    }

    return books;
  }


}
