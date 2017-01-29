package ex10;

public class SortedListNode {
  
  private int value = 0;
  private SortedListNode nextNode = null;
  
  public SortedListNode(int value) {
    this.value = value;
  }
  
  public void setNextNode(SortedListNode nextNode) {
    this.nextNode = nextNode;
  }
  
  public int getValue() {
    return value;
  }
  
  public SortedListNode getNextNode() {
    return nextNode;
  }
}