package com.github.bbkpij201675.programminginjava.day11.ex02;

/**
 * An interface for creating sets.
 * A set cannot contain any duplicated values.
 */
public interface IntSet {

  /**
   * Adds a new int to the set; if it is there already, nothing happens.
   *
   * @param value the value to add to the set
   */
  void add(int value);

  /**
   * Returns true if the number is in the set, false otherwise.
   *
   * @param value the value to search the set for
   * @return whether or not the set contains the given value
   */
  boolean contains(int value);

  /**
   * Returns the same values as the former method, but for every element that
   * is checked prints its value on screen.
   *
   * @param value the value to search the set for
   * @return whether or not the set contains the given value
   */
  boolean containsVerbose(int value);

  /**
   * Returns a string with the values of the elements in the set separated by
   * commas.
   *
   * @return the string of all the current values in the set
   */
  @Override
  String toString();
}
