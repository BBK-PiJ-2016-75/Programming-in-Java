package com.github.bbkpij201675.programminginjava.day09.ex01;

/**
 * Compares two given objects and returns the one which has the highest value.
 * The objects must be the same Comparable type.
 */
public class Comparator {

  /**
   * Returns whichever given Comparable object has the highest value.
   *
   * @param comparableOne The first Comparable object.
   * @param comparableTwo The second Comparable object.
   * @param <T>           Ensures that the objects are Comparable.
   * @return The Comparable object with the highest value.
   */
  public <T extends Comparable<T>> T getMax(T comparableOne, T comparableTwo) {
    if (comparableOne.compareTo(comparableTwo) > 0) {
      return comparableOne;
    } else {
      return comparableTwo;
    }
  }
}
