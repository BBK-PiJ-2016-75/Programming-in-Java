package day06.ex10;

/**
 * A node to be put into a list, containing an integer value as well as a
 * pointer to the next node in the list.
 */
public class SortedListNode {
  private int value = 0;
  private SortedListNode nextNode = null;

  public SortedListNode(int value) {
    this.value = value;
  }

  public int getValue() {
    return value;
  }

  public SortedListNode getNextNode() {
    return nextNode;
  }

  public void setNextNode(SortedListNode nextNode) {
    this.nextNode = nextNode;
  }
}
