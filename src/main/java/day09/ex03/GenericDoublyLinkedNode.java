package day09.ex03;

/**
 * A generic node for a generic doubly-linked list.
 *
 * @param <T> the generic type for the node
 */
public class GenericDoublyLinkedNode<T> {
  private GenericDoublyLinkedNode previousNode = null;
  private T data = null;
  private GenericDoublyLinkedNode nextNode = null;

  public GenericDoublyLinkedNode(T data) {
    this.data = data;
  }

  public GenericDoublyLinkedNode getPreviousNode() {
    return previousNode;
  }

  public void setPreviousNode(GenericDoublyLinkedNode previousNode) {
    this.previousNode = previousNode;
  }

  public T getData() {
    return data;
  }

  public GenericDoublyLinkedNode getNextNode() {
    return nextNode;
  }

  public void setNextNode(GenericDoublyLinkedNode nextNode) {
    this.nextNode = nextNode;
  }
}
