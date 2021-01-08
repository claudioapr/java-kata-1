package org.echocat.kata.java.part1.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import javax.sound.sampled.spi.AudioFileReader;
import org.apache.commons.csv.CSVRecord;
import org.echocat.kata.java.part1.model.Author;
import org.echocat.kata.java.part1.model.Magazine;
import org.echocat.kata.java.part1.model.Magazine.Headers;

public class CsvMagazineReader implements CsvReader {

  private static final String FILE_NAME = "/org/echocat/kata/java/part1/data/magazines.csv";

  @Override
  public List<Magazine> readFile() throws IOException {

    File file = new File(getClass().getClassLoader().getResource(FILE_NAME).getFile());
    Reader in = new FileReader(file);
    Iterable<CSVRecord> records = readRecord(in);

    List<Magazine> magazines = new ArrayList<>();

    for (CSVRecord record : records) {
      String title = record.get(Headers.title);
      String isbn = record.get(Headers.isbn);
      String email = record.get(Headers.authors);
      String publishedAt = record.get(Headers.publishedAt);

      magazines.add(new Magazine(title, isbn, new Author(email), publishedAt));
    }
    return magazines;
  }
}
