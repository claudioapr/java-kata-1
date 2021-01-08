package org.echocat.kata.java.part1.repository;

import java.util.List;
import java.util.Optional;
import org.echocat.kata.java.part1.exceptions.PublicationNotFoundException;
import org.echocat.kata.java.part1.model.Publication;

/**
 * Holds the contract for publication repository
 * @author cresende
 */
public interface PublicationRepository {

  List<Publication> findAll();

  List<Publication> findPublicationByAuthorEmail(String email);

  Optional<Publication> findPublicationByIsbn(String isbn) throws PublicationNotFoundException;

}
