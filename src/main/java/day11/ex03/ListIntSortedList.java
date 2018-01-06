package day11.ex03;

/**
 * An implementation of IntSortedList, as a singly-linked sorted list.
 */
public class ListIntSortedList implements IntSortedList {
  private int value;
  private ListIntSortedList next;

  /**
   * Constructs a new sorted list, starting with the given value as the head.
   *
   * @param value the value of the head
   */
  public ListIntSortedList(int value) {
    this.value = value;
    this.next = null;
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
      ListIntSortedList newNode = new ListIntSortedList(this.value);
      this.value = value;
      newNode.next = this.next;
      this.next = newNode;
    } else {
      ListIntSortedList currentNode = this;
      ListIntSortedList nextNode = currentNode.next;
      while (nextNode != null && nextNode.value <= value) {
        currentNode = nextNode;
        nextNode = currentNode.next;
      }
      ListIntSortedList newNode = new ListIntSortedList(value);
      newNode.next = nextNode;
      currentNode.next = newNode;
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
    if (this.value == value) {
      return true;
    } else if (this.next == null) {
      return false;
    } else {
      return this.next.contains(value);
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
    String listSortedList = "";
    if (this.next == null) {
      return listSortedList += value;
    } else {
      return listSortedList += value + ", " + next.toString();
    }
  }
}
