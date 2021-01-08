package org.echocat.kata.java.part1.utils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.util.List;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public interface CsvReader<T> {

  List<T> readFile() throws IOException;

  default Iterable<CSVRecord> readRecord(Reader in) throws IOException {

    return CSVFormat.RFC4180.withFirstRecordAsHeader().parse(in);
  }
}
