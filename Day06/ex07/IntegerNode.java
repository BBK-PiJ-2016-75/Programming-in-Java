package ex07;

/**
 * A node to be used as part of a list, containing an integer value as well
 * as a pointer to the next node in the list.
 */
public class IntegerNode {
  private int value = 0;
  private IntegerNode nextNode = null;

  public IntegerNode(int value) {
    this.value = value;
  }

  /**
   * Adds a new integer node to the end of the list.
   * @param newNode the node to be added to the list.
   */
  public void addIntegerNode(IntegerNode newNode) {
    if (this.nextNode == null) {
      this.nextNode = newNode;
    } else {
      this.nextNode.addIntegerNode(newNode);
    }
  }

  public int getValue() {
    return this.value;
  }

  public IntegerNode getNextNode() {
    return this.nextNode;
  }
}
