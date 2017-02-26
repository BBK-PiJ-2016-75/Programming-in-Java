package com.github.bbkpij201675.programminginjava.day07.ex01;

/**
 * Interface for managing a queue of person objects.
 */
public interface PersonQueue {

  /**
   * Adds another person to the queue.
   *
   * @param person the person object to add to the queue.
   */
  void insert(Person person);

  /**
   * Removes a person from the queue.
   *
   * @return the person object removed from the queue.
   */
  Person retrieve();
}
