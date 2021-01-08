package org.echocat.kata.java.part1.repository.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import org.echocat.kata.java.part1.exceptions.PublicationNotFoundException;
import org.echocat.kata.java.part1.model.Publication;
import org.echocat.kata.java.part1.repository.BookRepository;
import org.echocat.kata.java.part1.repository.MagazineRepository;

/**
 * Holds the implementation for publication repository
 *
 * @author cresende
 */
public class PublicationRepositoryImpl {

  private MagazineRepository magazineRepository;
  private BookRepository bookRepository;

  public PublicationRepositoryImpl(
      MagazineRepository magazineRepository,
      BookRepository bookRepository) {

    this.magazineRepository = magazineRepository;
    this.bookRepository = bookRepository;
  }


  public List<Publication> findAll() {
    List<Publication> publications = new ArrayList<>();
    publications.addAll(magazineRepository.findAllMagazines());
    publications.addAll(magazineRepository.findAllMagazines());

    return publications;
  }

  List<Publication> findPublicationByAuthorEmail(String email) {
    List<Publication> found = findAll().stream().filter(x -> {
      if (Objects.nonNull(x)) {
        return x.getAuthor().equals(email);
      }
      return false;
    }).collect(Collectors.toList());

    return found;
  }

  Optional<Publication> findPublicationByIsbn(String isbn) throws PublicationNotFoundException {
    List<Publication> found = findAll().stream().filter(x -> {
      if (Objects.nonNull(x)) {
        return x.getIsbn().equals(isbn);
      }
      return false;
    }).collect(Collectors.toList());

    if (found.isEmpty()) {
      throw new PublicationNotFoundException("Publication not found");
    }
    return Optional.ofNullable(found.get(0));
  }

}