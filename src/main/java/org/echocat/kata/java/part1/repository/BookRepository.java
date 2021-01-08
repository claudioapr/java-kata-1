package org.echocat.kata.java.part1.repository;

import java.util.List;
import java.util.Optional;
import org.echocat.kata.java.part1.exceptions.PublicationNotFoundException;
import org.echocat.kata.java.part1.model.Book;
import org.echocat.kata.java.part1.model.Magazine;

/**
 * Holds the contract for book repository
 *
 * @author cresende
 */
public interface BookRepository {

  List<Book> findAllBooks();
}
