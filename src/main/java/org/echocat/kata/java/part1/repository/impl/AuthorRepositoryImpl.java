package org.echocat.kata.java.part1.repository.impl;

import java.io.IOException;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import org.echocat.kata.java.part1.exceptions.AuthorNotFoundException;
import org.echocat.kata.java.part1.model.Author;
import org.echocat.kata.java.part1.repository.AuthorRepository;
import org.echocat.kata.java.part1.utils.CsvReader;

/**
 * Holds the implementation for author repository
 *
 * @author cresende
 */
public class AuthorRepositoryImpl implements AuthorRepository {

  private final CsvReader<Author> reader;
  private List<Author> authors;

  // I dont like calling the methos for loading the data inside the constructor this is a violation
  // But for simplicity I will do it
  public AuthorRepositoryImpl(CsvReader reader) {
    this.reader = reader;
    loadAuthors();
  }

  private void loadAuthors() {
    try {
      authors = reader.readFile();
    } catch (IOException e) {
      System.out.println("Error loading authors");
    }
  }

  @Override
  public Optional<Author> findAuthorByEmail(String email) throws AuthorNotFoundException {

    List<Author> found = authors.stream().filter(x -> {
      if (Objects.nonNull(x)) {
        return x.getEmail().equals(email);
      }
      return false;
    }).collect(Collectors.toList());
    if (found.isEmpty()) {
      throw new AuthorNotFoundException("Author not found");
    }
    return Optional.ofNullable(found.get(0));
  }
}
