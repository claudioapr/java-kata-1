package org.echocat.kata.java.part1.utils;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.csv.CSVRecord;
import org.echocat.kata.java.part1.model.Author;
import org.echocat.kata.java.part1.model.Author.Headers;

public class CsvAuthorReader implements CsvReader {

  private static final String FILE_NAME = "/org/echocat/kata/java/part1/data/books.csv";

  @Override
  public List<Author> readFile() throws IOException {

    File file = new File(getClass().getClassLoader().getResource(FILE_NAME).getFile());
    Reader in = new FileReader(file);
    Iterable<CSVRecord> records = readRecord(in);

    List<Author> authors = new ArrayList<>();

    for (CSVRecord record : records) {
      String firstname = record.get(Headers.firstname);
      String lastname = record.get(Headers.lastname);
      String email = record.get(Headers.email);

      authors.add(new Author(email, firstname, lastname));
    }
    return authors;
  }
}
