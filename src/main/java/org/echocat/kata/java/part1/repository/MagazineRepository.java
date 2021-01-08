package org.echocat.kata.java.part1.repository;

import java.util.List;
import java.util.Optional;
import org.echocat.kata.java.part1.exceptions.PublicationNotFoundException;
import org.echocat.kata.java.part1.model.Magazine;
import org.echocat.kata.java.part1.model.Publication;

/**
 * Holds the contract for magazine repository
 *
 * @author cresende
 */
public interface MagazineRepository {

  List<Magazine> findAllMagazines();

}
