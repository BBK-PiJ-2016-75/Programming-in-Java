package com.github.bbkpij201675.programminginjava.day11.ex03;

/**
 * asa
 */
public class TreeIntSortedList implements IntSortedList {
  private int value;
  private TreeIntSortedList left;
  private TreeIntSortedList right;

  /**
   * asa
   * @param value
   */
  public TreeIntSortedList(int value) {
    this.value = value;
    this.left = null;
    this.right = null;
  }

  /**
   * Adds a new int to the list so that the list remains sorted; a list can
   * contain duplicates unlike a set.
   *
   * @param value the value to add to the sorted list
   */
  @Override
  public void add(int value) {

  }

  /**
   * Returns true if the number is in the list, false otherwise.
   *
   * @param value the value to search the sorted list for
   * @return whether or not the sorted list contains the given value
   */
  @Override
  public boolean contains(int value) {
    return false;
  }
}
