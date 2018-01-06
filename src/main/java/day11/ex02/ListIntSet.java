package day11.ex02;

/**
 * An implementation of IntSet, as a singly-linked list set.
 */
public class ListIntSet implements IntSet {
  private int value;
  private ListIntSet next;

  /**
   * Constructs a new list set, starting with the given value as the head node.
   *
   * @param value the value of the head
   */
  public ListIntSet(int value) {
    this.value = value;
    this.next = null;
  }

  /**
   * Adds a new int to the set; if it is there already, nothing happens.
   *
   * @param value the value to add to the set
   */
  @Override
  public void add(int value) {
    if (!contains(value)) {
      ListIntSet newNode = new ListIntSet(this.value);
      this.value = value;
      newNode.next = this.next;
      this.next = newNode;
    } else {
      System.out.println("The list set already contains " + value);
    }
  }

  /**
   * Returns true if the number is in the set, false otherwise.
   *
   * @param value the value to search the set for
   * @return whether or not the set contains the given value
   */
  @Override
  public boolean contains(int value) {
    if (this.value == value) {
      return true;
    } else if (this.next == null) {
      return false;
    } else {
      return next.contains(value);
    }
  }

  /**
   * Returns the same values as the former method, but for every element that
   * is checked prints its value on screen.
   *
   * @param value the value to search the set for
   * @return whether or not the set contains the given value
   */
  @Override
  public boolean containsVerbose(int value) {
    System.out.println("Searching for " + value + ": checking " + this.value);
    if (this.value == value) {
      return true;
    } else if (this.next == null) {
      return false;
    } else {
      return next.containsVerbose(value);
    }
  }

  /**
   * Returns a string with the values of the elements in the set separated by
   * commas.
   *
   * @return the string of all the current values in the set
   */
  @Override
  public String toString() {
    String listSet = "";
    if (this.next == null) {
      return listSet += value;
    } else {
      return listSet += value + ", " + next.toString();
    }
  }
}
