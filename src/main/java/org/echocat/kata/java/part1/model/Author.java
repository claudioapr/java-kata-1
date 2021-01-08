package org.echocat.kata.java.part1.model;

/**
 * @author cresende
 */
public class Author {

  private String email;
  private String firstName;
  private String lastName;

  public Author(String email, String firstName, String lastName) {
    this.email = email;
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public Author(String email) {
    this.email = email;
  }

  public String getEmail() {
    return email;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public enum Headers {
    email, firstname, lastname
  }
}
