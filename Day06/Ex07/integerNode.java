package ex07;

public class IntegerNode {
  
  private int value = 0;
  private integerNode nextNode = null;
  
  public IntegerNode(int value) {
    this.value = value;
  }
  
  public void addIntegerNode(integerNode newNode) {
    if (this.nextNode == null) {
      this.nextNode = newNode;
    } else {
      this.nextNode.addIntegerNode(newNode);
    }
  }
  
  public int getValue() {
    return this.value;
  }
  
  public integerNode getNextNode() {
    return this.nextNode;
  }
}