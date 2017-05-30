package com.github.bbkpij201675.programminginjava.day11.ex03;

/**
 * An implementation of IntSortedList, as a binary search tree sorted list.
 */
public class TreeIntSortedList implements IntSortedList {
  private int value;
  private TreeIntSortedList left;
  private TreeIntSortedList right;

  /**
   * Constructs a new tree list, starting with the given value as the root node.
   *
   * @param value the value of the root
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
    if (value <= this.value) {
      if (this.left == null) {
        this.left = new TreeIntSortedList(value);
      } else {
        this.left.add(value);
      }
    } else {
      if (this.right == null) {
        this.right = new TreeIntSortedList(value);
      } else {
        this.right.add(value);
      }
    }
  }

  /**
   * Returns true if the number is in the list, false otherwise.
   *
   * @param value the value to search the sorted list for
   * @return whether or not the sorted list contains the given value
   */
  @Override
  public boolean contains(int value) {
    if (value == this.value) {
      return true;
    } else if (value < this.value) {
      if (this.left == null) {
        return false;
      } else {
        return this.left.contains(value);
      }
    } else {
      if (this.right == null) {
        return false;
      } else {
        return this.right.contains(value);
      }
    }
  }

  /**
   * Returns a string with the values of the elements in the list separated
   * by commas.
   *
   * @return the string of all the current values in the sorted list
   */
  @Override
  public String toString() {
    String treeSortedList = "";
    if (this.left != null) {
      treeSortedList += left.toString();
    }
    treeSortedList += this.value + ", ";
    if (this.right != null) {
      treeSortedList += right.toString();
    }
    return treeSortedList;
  }
}
