package org.echocat.kata.java.part1.exceptions;

/**
 * Exception when a publication is not found
 *
 * @author cresende
 */

public class PublicationNotFoundException extends Exception {

  public PublicationNotFoundException(String message) {
    super(message);
  }
}
