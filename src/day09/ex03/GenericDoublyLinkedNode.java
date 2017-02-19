package com.github.bbkpij201675.programminginjava.day09.ex03;

/**
 * Created by Dennis on 10/02/2017.
 */
public class GenericDoublyLinkedNode<T> {
  private GenericDoublyLinkedNode previousNode = null;
  private T data = null;
  private GenericDoublyLinkedNode nextNode = null;

  public GenericDoublyLinkedNode(T data) {
    this.data = data;
  }

  public void setPreviousNode(GenericDoublyLinkedNode previousNode) {
    this.previousNode = previousNode;
  }

  public GenericDoublyLinkedNode getPreviousNode() {
    return previousNode;
  }

  public void setData(T data) {
    this.data = data;
  }

  public T getData() {
    return data;
  }

  public void setNextNode(GenericDoublyLinkedNode nextNode) {
    this.nextNode = nextNode;
  }

  public GenericDoublyLinkedNode getNextNode() {
    return nextNode;
  }
}
