package org.echocat.kata.java.part1.repository.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.echocat.kata.java.part1.model.Magazine;
import org.echocat.kata.java.part1.repository.MagazineRepository;
import org.echocat.kata.java.part1.utils.CsvReader;

/**
 * Holds the implementation for magazine repository
 *
 * @author cresende
 */
public class MagazineRepositoryImpl implements MagazineRepository {


  private final CsvReader<Magazine> reader;

  public MagazineRepositoryImpl(
      CsvReader<Magazine> reader) {
    this.reader = reader;
  }


  @Override
  public List<Magazine> findAllMagazines() {
    List<Magazine> magazines = new ArrayList<>();
    try {
      magazines = reader.readFile();
    } catch (IOException e) {
      System.out.println("Error loading magazines");
    }

    return magazines;
  }
}
