package org.echocat.kata.java.part1.repository;

import java.util.Optional;
import org.echocat.kata.java.part1.exceptions.AuthorNotFoundException;
import org.echocat.kata.java.part1.model.Author;

/**
 * Holds the contract for author repository
 * @author cresende
 */
public interface AuthorRepository {

    Optional<Author> findAuthorByEmail(String email) throws AuthorNotFoundException;

}
