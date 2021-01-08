package org.echocat.kata.java.part1.utils;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.csv.CSVRecord;
import org.echocat.kata.java.part1.model.Author;
import org.echocat.kata.java.part1.model.Book;
import org.echocat.kata.java.part1.model.Book.Headers;

public class CsvBookReader implements CsvReader {

  private static final String FILE_NAME = "/org/echocat/kata/java/part1/data/books.csv";

  @Override
  public List<Book> readFile() throws IOException {

    File file = new File(getClass().getClassLoader().getResource(FILE_NAME).getFile());
    Reader in = new FileReader(file);
    Iterable<CSVRecord> records = readRecord(in);

    List<Book> books = new ArrayList<>();

    for (CSVRecord record : records) {
      String title = record.get(Headers.title);
      String isbn = record.get(Headers.isbn);
      String email = record.get(Headers.authors);
      String description = record.get(Headers.description);

      books.add(new Book(title, isbn, new Author(email), description));
    }
    return books;
  }
}
