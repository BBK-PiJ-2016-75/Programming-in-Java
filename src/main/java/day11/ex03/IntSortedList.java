package day11.ex03;

/**
 * An interface for creating sorted lists.
 * A sorted list can contain duplicated values.
 */
public interface IntSortedList {

  /**
   * Adds a new int to the list so that the list remains sorted; a list can
   * contain duplicates unlike a set.
   *
   * @param value the value to add to the sorted list
   */
  void add(int value);

  /**
   * Returns true if the number is in the list, false otherwise.
   *
   * @param value the value to search the sorted list for
   * @return whether or not the sorted list contains the given value
   */
  boolean contains(int value);

  /**
   * Returns a string with the values of the elements in the list separated
   * by commas.
   *
   * @return the string of all the current values in the sorted list
   */
  @Override
  String toString();
}
