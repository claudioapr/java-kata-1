package org.echocat.kata.java.part1.exceptions;

/**
 * Exception when an author is not found
 *
 * @author cresende
 */

public class AuthorNotFoundException extends Exception {

  public AuthorNotFoundException(String message) {
    super(message);
  }
}
